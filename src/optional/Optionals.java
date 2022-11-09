package optional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Motto: Imagine - Model - Program
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 9/11/22
 * Time: 1:33 p. m.
 */

public class Optionals {

  public static void main(String[] args) {
    List<String> names = getNames();
    if(names != null){
      // Operar con nombres
    }

    Optional<List<String>> optionalsNames = getOptionalNames();
    if(optionalsNames.isPresent()){

    }

    // optionalsNames.isPresent(namesValue -> namesValue.forEach(System.out::println));

    Optional<String> valuablePlayer = optionalValuablePlayer();
    String valuablePlayerName  =valuablePlayer.orElseGet(() -> "No Player");

  }

  static List<String> getNames(){
    List<String> list = new LinkedList();
    return list;
  }

  static Optional<List<String>> getOptionalNames(){
    List<String> namesList = new LinkedList<>();
    return Optional.of(namesList);
  }

  static Optional<String> optionalValuablePlayer(){
    return Optional.ofNullable();
  }

}
