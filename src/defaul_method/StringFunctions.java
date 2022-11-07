package defaul_method;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/11/22
 * Time: 3:42 p. m.
 */

public class StringFunctions {
  @FunctionalInterface
  interface StringOperation{
    int getAmount();

    default void operate(String text){
      int x = getAmount();
      while(x-- > 0){
        System.out.println(text);
      }
    }
  }

  @FunctionalInterface
  interface DoOperation{
    void take(String text);
    default void execute(int x, String text){
      while(x-- > 0){
        take(text);
      }
    }
  }

  public static void main(String[] args) {
    StringOperation six = () -> 6;
    six.operate("Learn");

    DoOperation operateFive = text -> System.out.println(text);
    operateFive.execute(5, "Functional Programing");
  }

}
