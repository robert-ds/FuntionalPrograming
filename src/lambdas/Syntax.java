package lambdas;

import reference_operator.NameUtils;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/10/22
 * Time: 3:17 p. m.
 */

public class Syntax {

  public static void main(String[] args) {
    List<String> courses = NameUtils.getList("Java","Functional");
    courses.forEach(course -> System.out.println(course));

    useZero(() -> 3);

    usePredicate(text -> text.isEmpty());

    useBiFunction((x, y) -> x * y);

    useBiFunction((x, y) -> {
      System.out.println("X: " + x + ", Y: " + y);
      return x - y;
    });

  }

  static void useZero(ArgZero argZero){

  }

  static void usePredicate(Predicate<String> predicate){

  }

  static void useBiFunction(BiFunction<Integer, Integer, Integer> operation){

  }

  @FunctionalInterface
  interface ArgZero{
    int get();
  }

}
