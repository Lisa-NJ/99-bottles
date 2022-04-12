package bottles.number;

public class BottleNumberFactory {
	public IBottleNumber createNumber(int i) {
		switch (i) {
			case -1:
				return new NumberMinusOne();
			case 0:
				return new NumberZero();
			case 1:
				return new NumberOne();
			case 6:
				return new NumberSix();
			default:
				return new BottleNumber(i);
		}
	}
}
