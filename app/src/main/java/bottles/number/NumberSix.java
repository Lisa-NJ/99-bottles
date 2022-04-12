package bottles.number;

public class NumberSix implements IBottleNumber {
	@Override
	public String numberString() {
		return "1";
	}

	@Override
	public String plural() {
		return "six-pack";
	}
}
