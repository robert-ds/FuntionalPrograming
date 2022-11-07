package chaining;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/11/22
 * Time: 4:05 p. m.
 */

public class Chaining {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hello")
        .append(" my")
        .append(" Friends");

    Chainer chainer = new Chainer();
    chainer.sayHi().sayBye();

  }

  static class Chainer{

    public Chainer sayHi(){
      System.out.println("Hola");
      return this;
    }

    public Chainer sayBye(){
      System.out.println("Bye");
      return this;
    }

  }

}
