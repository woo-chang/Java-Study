package Lab.regEx;

import java.util.regex.Pattern;

public class RegexExample2 {

  public static void main(String[] args) {
    Pattern pattern1 = Pattern.compile("[\\s]");
    String[] array1 = pattern1.split("cat dog pig");
    for (String s : array1) {
      System.out.println(s);
    }
    System.out.println("----------");
    Pattern pattern2 = Pattern.compile("[\\W]");
    String[] array2 = pattern2.split("o_o&v_v#u_uㄱ");
    for (String s : array2) {
      System.out.println(s);
    }
  }
}
