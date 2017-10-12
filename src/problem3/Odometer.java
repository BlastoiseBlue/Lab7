package problem3;

public class Odometer {
	private double traveled = 0;
	private double mpg = 1;
	private double usage;

	public void reset() {
		traveled = 0;
	}

	public void setMpg(double newMpg) {
		mpg = newMpg;
	}

	public void travel(double displacement) {
		traveled = traveled + displacement;
	}

	public void calculateUsage() {
		if (mpg > 0)
			usage = traveled / mpg;
	}

	public Odometer() {
		traveled = 0;
		mpg = 1;
		calculateUsage();
	}

	public Odometer(double distance, double mileage) {
		reset();
		travel(distance);
		setMpg(mileage);
		calculateUsage();
	}

	public void getFuelUsage() {
		calculateUsage();
		System.out.println("This vehicle has traveled " + traveled + " miles at a fuel efficiency of " + mpg
				+ " miles per gallon, consuming a total of " + usage + " gallons of fuel.");
	}
}
