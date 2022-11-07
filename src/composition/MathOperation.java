package composition;

import java.util.function.Function;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/11/22
 * Time: 4:20 p. m.
 */

public class MathOperation {
  public static void main(String[] args) {
    Function<Integer, Integer> multiplyBy3 = x -> {
      System.out.println("Multiply x: " + x + " By 3");
      return x * 3;
    };


    Function<Integer, Integer> add1MultiplyBy3 =
        multiplyBy3.compose(y -> {
          System.out.println("Add 1 to: " + y);
          return y + 1;
        });

    Function<Integer, Integer> square =
        add1MultiplyBy3.andThen(x -> {
          System.out.println("Elevate: " + x + " to square");
          return x * x;
        });

    System.out.println(add1MultiplyBy3.apply(5));
    System.out.println(square.apply(3));

  }
}
