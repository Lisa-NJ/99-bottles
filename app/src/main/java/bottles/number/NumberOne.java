package bottles.number;

public class NumberOne implements IBottleNumber {
	@Override
	public String action() {
		return  "Take " + pronoun() + " down and pass it around, ";
	}

	@Override
	public String numberString() {
		return "" + 1;
	}

	@Override
	public String pronoun() {
		return "it";
	}

	@Override
	public String plural() {
		return "bottle";
	}
}
