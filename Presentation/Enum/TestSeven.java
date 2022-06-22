package Presentation.Enum;

public class TestSeven {

  public enum Status {
    Y(true, 1),
    N(false, 0);

    Status(boolean boolStatus, int intStatus) {
      this.boolStatus = boolStatus;
      this.intStatus = intStatus;
    }

    private boolean boolStatus;
    private int intStatus;

    public int intValue() { return intStatus; }
    public boolean boolValue() { return boolStatus; }
  }

  public static void main(String[] args) {
    System.out.println(Status.Y.intValue());
    System.out.println(Status.Y.boolValue());
  }

}
