package Lab.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("[\\d]*S[\\d]*B");
    Matcher matcher = pattern.matcher("1S2B3S4B5S6B10S9B7S6BSB");

    int count = 0;
    while(matcher.find()) {
      count += 1;
      System.out.println(count + "회 : " + matcher.group());
      System.out.println("start : " + matcher.start());
      System.out.println("end : " + matcher.end());
    }
  }

}
