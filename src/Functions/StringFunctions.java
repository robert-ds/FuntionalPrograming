package Functions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 12/10/22
 * Time: 3:25 p. m.
 */

public class StringFunctions {

  public static void main(String[] args) {
    UnaryOperator<String> quote = text -> "\"" + text + "\"";

    System.out.println(quote.apply("The baby eat all"));

    BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;
    System.out.println(mult.apply(5, 10));

    BinaryOperator<Integer> multi = (x, y) -> x * y;
    System.out.println(multi.apply(5, 5));

    BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
    System.out.println(leftPad.apply("Java", 10));

  }

}
