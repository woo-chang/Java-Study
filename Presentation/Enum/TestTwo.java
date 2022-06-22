package Presentation.Enum;

public class TestTwo {

  public enum Basic {
    ONE, TWO
  }

  public enum Hard {
    ONE, TWO
  }

  public static void checkHardLevel(Hard hard) {

  }

  public static void main(String[] args) {
    checkHardLevel(Hard.ONE);
    //checkHardLevel(Basic.ONE);
  }

}
