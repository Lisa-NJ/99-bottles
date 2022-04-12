package bottles;

import bottles.number.BottleNumberFactory;
import bottles.number.IBottleNumber;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottles {
  BottleNumberFactory factory = new BottleNumberFactory();
  
  public String verse(int i) {
    IBottleNumber number = factory.createNumber(i);
    IBottleNumber decNumber = factory.createNumber(i - 1);

    return StringUtils.capitalize(number.numberString()) + " " + number.plural() + " of beer on the wall, " +
        number.numberString() + " " + number.plural() + " of beer.\n" +
        number.action() +
        decNumber.numberString() + " " + decNumber.plural() + " of beer on the wall.";
  }

  public String verses(int high, int low) {
    return IntStream.rangeClosed(low, high)
        .mapToObj(i -> verse(high - i + low))
        .collect(Collectors.joining("\n\n"));
  }

  public String song() {
    return verses(99, 0);
  }
}
