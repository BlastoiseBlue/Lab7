package problem3;

public class Driver {

	public static void main(String[] args) {
		Odometer trip1 = new Odometer(10, 10);
		trip1.getFuelUsage();
		Odometer trip2 = new Odometer(70, 6);
		trip2.getFuelUsage();
		Odometer trip3 = new Odometer(67, 44);
		trip3.getFuelUsage();
	}

}
