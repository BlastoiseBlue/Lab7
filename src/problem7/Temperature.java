package problem7;

import java.text.DecimalFormat;

public class Temperature {
	float temperature;
	float temperatureC;
	float temperatureF;
	char scale = 'C';
	char invScale = 'F';
	DecimalFormat pattern00dot00 = new DecimalFormat("00.00");

	public float convert(float inputTemp) {
		float newTemp = inputTemp;
		switch (scale) {
		case 'C':
			newTemp = (9 * inputTemp / 5 + 32);
			invScale = 'F';
			break;
		case 'F':
			newTemp = (5 * (inputTemp - 32) / 9);
			invScale = 'C';
			break;
		default:
			System.out.println("ERROR: Invalid scale");
			break;
		}
		return newTemp;
	}

	public void calibrateScale() {
		switch (scale) {
		case 'C':
			temperatureC = temperature;
			temperatureF = convert(temperature);
			break;
		case 'F':
			temperatureF = temperature;
			temperatureC = convert(temperature);
			break;
		}
	}

	public void setScale(String inputScale) {
		inputScale = inputScale.toUpperCase();
		scale = inputScale.charAt(0);
		calibrateScale();
	}

	public void setScale(char inputScale) {
		scale = Character.toUpperCase(inputScale);
		calibrateScale();
	}

	public void setTemp(float inputTemp) {
		temperature = inputTemp;
		calibrateScale();
	}

	Temperature() {
		scale = 'C';
		temperature = 0;
		calibrateScale();
	}

	Temperature(String inputScale) {
		setScale(inputScale);
		temperature = 0;
		calibrateScale();
	}

	Temperature(float inputTemp) {
		scale = 'C';
		temperature = inputTemp;
		calibrateScale();
	}

	Temperature(float inputTemp, String inputScale) {
		temperature = inputTemp;
		setScale(inputScale);
		calibrateScale();
	}

	private float trueTemp() {
		calibrateScale();
		return convert(temperatureF);
	}

	public void compareTemp() {
		if (temperatureC > convert(temperatureF)) {
			System.out.println(outputTemp(temperatureC) + "C is hotter than " + outputTemp(temperatureF) + "F");
		} else if (temperatureC < trueTemp()) {
			System.out.println(outputTemp(temperatureF) + "F is hotter than " + outputTemp(temperatureC) + "C");
		} else if (temperatureC == trueTemp()) {
			System.out.println(outputTemp(temperatureC) + "C is equal to " + outputTemp(temperatureF) + "F");
		}
	}

	public String outputTemp(float inputTemp) {
		return pattern00dot00.format(inputTemp);
	}

	public String outputTemp() {
		return pattern00dot00.format(temperature);
	}

	public void printTemp() {
		System.out.println(outputTemp(temperature) + "" + scale);
	}
}
