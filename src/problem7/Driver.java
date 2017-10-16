/*
 * Emmet Stanevich
 * 10/16/17
 * Problem 7
 */
package problem7;

public class Driver {

	public static void main(String[] args) {
		Compare comparer = new Compare();
		Temperature temp1 = new Temperature();
		temp1.printTemp();
		// System.out.println(temp1.temperatureF + "" + temp1.invScale);
		Temperature temp2 = new Temperature(32, "f");
		temp2.printTemp();
		Temperature temp3 = new Temperature(-40, "C");
		temp3.printTemp();
		Temperature temp4 = new Temperature(-40, "f");
		temp4.printTemp();
		Temperature temp5 = new Temperature(100);
		temp5.printTemp();
		Temperature temp6 = new Temperature(212, "f");
		System.out.println("Comparing the first two temperatures:");
		comparer.initialize(temp1.temperature, temp1.scale, temp2.temperature, temp2.scale);
		comparer.compareTemp();
		System.out.println("Comparing the third and fourth temperatures:");
		comparer.compareTemp(temp3.temperature, temp3.scale, temp4.temperature, temp4.scale);
		System.out.println("Comparing the fifth and sixth temperatures:");
		comparer.compareTemp(temp5.temperature, temp5.scale, temp6.temperature, temp6.scale);
		System.out.println("Comparing 220F with 130C:");
		comparer.compareTemp(220, 'f', 130, 'C');
	}

}
