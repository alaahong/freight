package cn.ianzhang.sample;

import java.util.Arrays;

/**
 * Hello world!
 * @author Ian
 */
public class ResultHelper {

  public static void printResultInConsole(Object result) {
    String line1 = "******************************";
    String line2 = "**    Case: Calculator      **";
    String line3 = "**  Result: " + result + "           **";
    String line4 = "******************************";
    Arrays.asList(line1, line2, line3, line4)
            .forEach(System.out::println);
  }
}
