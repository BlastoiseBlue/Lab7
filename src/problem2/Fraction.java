package problem2;

public class Fraction {
	int x;
	int y;
	int GCD;

	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y = newY;
	}

	public double divide() {
		return (((double) x) / ((double) y));
	}

	public String ratio() {
		GCD = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0 && i > GCD) {
				GCD = i;
			}
		}
		return (x / GCD + "/" + y / GCD);
	}
}
