package Functions;

import java.util.function.Function;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 12/10/22
 * Time: 2:17 p. m.
 */

public class Main {

  public static void main(String[] args) {

    Function<Integer, Integer> square = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * x;
      }
    };

    System.out.println(square.apply(5));
    System.out.println(squareFunction(10));

  }

  static int squareFunction(int x){
    return x * x;
  }

}
