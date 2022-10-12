package Functions;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 12/10/22
 * Time: 2:39 p. m.
 */

public class Pkgpredicate {
  public static void main(String[] args) {

    Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
    System.out.println(isOdd.apply(5)); // Return True

    Predicate<Integer> isEven = x -> x % 2 == 0;
    System.out.println(isEven.test(5)); // Return False

    Predicate<Student> isApproved = student -> student.getGrades() >= 5.0;

    Student robert = new Student(6.0);
    System.out.println(isApproved.test(robert)); // return True

  }

  static class Student{
    private double grades;

    public Student(double grades){
      this.grades = grades;
    }

    public double getGrades() {
      return grades;
    }
  }

}
