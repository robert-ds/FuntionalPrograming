package stream;

import java.util.stream.IntStream;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 10/11/22
 * Time: 2:21 p. m.
 */

public class TypeStream {
  public static void main(String[] args) {
    IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
    infiniteStream.limit(1000)
        .parallel()
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println);
  }
}