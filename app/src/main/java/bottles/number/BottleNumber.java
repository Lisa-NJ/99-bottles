package bottles.number;


public class BottleNumber implements IBottleNumber {
	private int i;

	public BottleNumber(int i) {
		this.i = i;
	}

	public String numberString() {
		return "" + i;
	}
}
