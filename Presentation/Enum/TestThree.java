package Presentation.Enum;

public class TestThree {

  private enum Season {
    SPRING, SUMMER, FALL, WINTER
  }

  public static void main(String[] args) {

    for(Season s : Season.values()) {
      System.out.println(s.name() + " / " + s.ordinal());
    }
  }
}
