package problem7;

//import java.text.DecimalFormat;
public class Compare {
	// DecimalFormat pattern00dot00 = new DecimalFormat("00.00");
	Temperature temp1 = new Temperature();
	Temperature temp2 = new Temperature();

	Compare() {
		initialize();
	}

	Compare(float inputTemp1, String inputScale1, float inputTemp2, String inputScale2) {
		initialize(inputTemp1, inputScale1, inputTemp2, inputScale2);
	}

	Compare(float inputTemp1, char inputScale1, float inputTemp2, char inputScale2) {
		initialize(inputTemp1, inputScale1, inputTemp2, inputScale2);
	}

	public void initialize() {
		temp1.setTemp(0);
		temp1.setScale('C');
		temp2.setTemp(0);
		temp2.setScale('C');
	}

	public void initialize(float inputTemp1, String inputScale1, float inputTemp2, String inputScale2) {// Sets the
																										// parameters
																										// manually
		temp1.setTemp(inputTemp1);
		temp1.setScale(inputScale1);
		temp2.setTemp(inputTemp2);
		temp2.setScale(inputScale2);
	}

	public void initialize(float inputTemp1, char inputScale1, float inputTemp2, char inputScale2) {// Sets the
		// parameters
		// manually
		temp1.setTemp(inputTemp1);
		temp1.setScale(inputScale1);
		temp2.setTemp(inputTemp2);
		temp2.setScale(inputScale2);
	}

	public void compareTemp() {// Standalone output, for use with Initialize
		if (temp1.temperatureC > temp2.temperatureC) {
			System.out.println(temp1.outputTemp() + "" + temp1.scale + " is greater than " + temp2.outputTemp() + ""
					+ temp2.scale);
		} else if (temp1.temperatureC < temp2.temperatureC) {
			System.out.println(temp2.outputTemp() + "" + temp2.scale + " is greater than " + temp1.outputTemp() + ""
					+ temp1.scale);
		} else if (temp1.temperatureC == temp2.temperatureC) {
			System.out.println(temp1.outputTemp() + "" + temp1.scale + " is equivalent to " + temp2.outputTemp() + ""
					+ temp2.scale);
		} else {
			System.out.println("Error");
		}
	}

	public void compareTemp(float inputTemp1, String inputScale1, float inputTemp2, String inputScale2) {// Use when you
																											// already
																											// have
		// the variables you need
		initialize(inputTemp1, inputScale1, inputTemp2, inputScale2);
		compareTemp();
		/*
		 * if (temp1.temperatureC > temp2.temperatureC) {
		 * System.out.println(temp1.outputTemp() + "" + temp1.scale +
		 * " is greater than " + temp2.outputTemp() + "" + temp2.scale); } else if
		 * (temp1.temperatureC < temp2.temperatureC) {
		 * System.out.println(temp2.outputTemp() + "" + temp2.scale +
		 * " is greater than " + temp1.outputTemp() + "" + temp1.scale); } else if
		 * (temp1.temperatureC == temp2.temperatureC) {
		 * System.out.println(temp1.outputTemp() + "" + temp1.scale +
		 * " is equivalent to " + temp2.outputTemp() + "" + temp2.scale); } else {
		 * System.out.println("Error"); }
		 */
	}

	public void compareTemp(float inputTemp1, char inputScale1, float inputTemp2, char inputScale2) {// Use when you
		// already
		// have
		// the variables you need
		initialize(inputTemp1, inputScale1, inputTemp2, inputScale2);
		compareTemp();
	}
}
