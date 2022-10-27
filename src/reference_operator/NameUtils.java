package reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 13/10/22
 * Time: 4:46 p. m.
 */

public class NameUtils {

  public static void main(String[] args) {
    List<String> teachers = getList("Thomas", "Jhon", "David");

    Consumer<String> printer = text -> System.out.println(text);
    teachers.forEach(printer);
    System.out.println("################################");

    teachers.forEach(System.out::println); // Similar to Consumer printer

  }

  public static <T> List<T> getList(T ... elements){
    return Arrays.asList(elements);
  }

}
