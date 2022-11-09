package stream;

import reference_operator.NameUtils;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 9/11/22
 * Time: 2:05 p. m.
 */

public class Streams {
  public static void main(String[] args) {

    List<String> courseList = NameUtils.getList(
        "java",
        "Frontend",
        "Backend",
        "FullStack"
    );

    for(String course: courseList){
      System.out.println("Course: " + course);
    }

    Stream<String> coursesStream = Stream.of("Java","Frontend","Backend","FullStack");

    // Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());
    // Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

    Stream<String> emphasisCourse = coursesStream.map(course -> course + "!");
    Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));

    emphasisCourse.forEach(System.out::println);

    Stream<String> coursesStream2 = courseList.stream();

    coursesStream2.map(course -> course + "!!")
        .filter(course -> course.contains("Java"))
        .forEach(System.out::println);

  }

}
