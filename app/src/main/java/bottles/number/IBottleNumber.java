package bottles.number;

public interface IBottleNumber {

	default String action() {
		return  "Take " + pronoun() + " down and pass it around, ";
	}

	String numberString();

	default String pronoun() {
		return "one";
	}

	// 6: 1 six-pack
	// 1 : bottle
	// > 1: bottles
	default String plural() {
		return "bottles";
	}
}
