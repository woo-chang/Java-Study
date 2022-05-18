package Enum;

public class TestEight {

  public static void main(String args[]) {
    String myGrade = "NORMAL";
    double myMoney = 10000;

    // 이자로 책정된 값을 반환
    if ("NORMAL".equals(myGrade)) {
      System.out.println(myMoney * 0.02);
    } else if ("VIP".equals(myGrade)) {
      System.out.println(myMoney * 0.05);
    } else if ("VVIP".equals(myGrade)) {
      System.out.println(myMoney * 0.1);
    } else {
      System.out.println("None");
    }
  }

}
