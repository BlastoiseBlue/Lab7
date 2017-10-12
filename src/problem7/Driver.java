package problem7;

public class Driver {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		temp1.printTemp();
		System.out.println(temp1.convert(temp1.temperatureC));
		Temperature temp2 = new Temperature(20);
		temp2.printTemp();
		Temperature temp3=new Temperature(50,"C");
		temp3.printTemp();
		
	}

}
