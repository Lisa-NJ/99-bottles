package bottles.number;

public class NumberZero implements IBottleNumber {
	@Override
	public String action() {
		return "Go to the store and buy some more, ";
	}

	@Override
	public String numberString() {
		return "no more";
	}
}
