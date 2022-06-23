package Lab.RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample1 {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("[\\d]+-[\\d]{4}-[\\d]{4}");
    Matcher matcher = pattern.matcher("010-1234-5678");

    while(matcher.find()) {
      System.out.println("전화번호 : " + matcher.group());
      System.out.println("start : " + matcher.start());
      System.out.println("end : " + matcher.end());
    }
  }
}
