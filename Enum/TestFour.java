package Enum;

public class TestFour {

  private enum Card {
    HEART(1),
    DIAMOND(2),
    SPADE(3),
    CLOVER(4);

    Card(int value) {
      this.value = value;
    }

    private final int value;
    public int value() { return value; }

  }

  public static void main(String[] args) {
    System.out.println(Card.HEART);
    System.out.println(Card.HEART.value());
  }
}

