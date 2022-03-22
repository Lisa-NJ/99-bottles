package bottles;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottles {
  public String verse(int i) {
    switch (i) {
      case 0:
        return  "No more bottles of beer on the wall, " +
            "no more bottles of beer.\n" +
            "Go to the store and buy some more, " +
            "99 bottles of beer on the wall.";
      case 1:
        return "1 bottle of beer on the wall, " +
            "1 bottle of beer.\n" +
            "Take it down and pass it around, " +
            "no more bottles of beer on the wall.";
      case 2:
        return "2 bottles of beer on the wall, " +
            "2 bottles of beer.\n" +
            "Take one down and pass it around, " +
            "1 bottle of beer on the wall.";
      default:
        return i + " bottles of beer on the wall, " +
            i + " bottles of beer.\n" +
            "Take one down and pass it around, " +
            (i - 1) + " bottles of beer on the wall.";
    }
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
