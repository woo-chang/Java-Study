package Lab.RegEx;

public class RegexExample3 {

  public static void main(String[] args) {
    String text = "1-d2nk-df3";
    System.out.println(text.replaceAll("-[a-z]", "S"));
  }
}
