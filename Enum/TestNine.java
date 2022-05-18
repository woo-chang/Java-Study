package Enum;

import java.util.function.Function;

public class TestNine {

  public enum Grade {
    NORMAR(value -> value * 0.02),
    VIP(value -> value * 0.05),
    VVIP(value -> value * 0.1);

    Grade(Function<Double, Double> expression) {
      this.expression = expression;
    }

    private Function<Double, Double> expression;
  }

  public static void main(String[] args) {
    Grade myGrade = Grade.NORMAR;
    double myMoney = 10000;

    System.out.println(myGrade.expression.apply(myMoney));
  }
}
