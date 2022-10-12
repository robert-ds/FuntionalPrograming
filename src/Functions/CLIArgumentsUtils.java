package Functions;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 12/10/22
 * Time: 3:12 p. m.
 */

public class CLIArgumentsUtils {

  static void showHelp(CLIArguments cliArguments){

    Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
      if(cliArguments1.isHelp()){
        System.out.println("Saludos, soy el manual, que necesitas!");
      }
    };

    consumerHelper.accept(cliArguments);

  }

  static CLIArguments generateCLI(){
    Supplier<CLIArguments> generator = () -> new CLIArguments();
    return generator.get();
  }

}
