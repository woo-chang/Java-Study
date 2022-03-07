package TheEssenceOfJava.Chapter02;

public class OverflowExample {

  public static void main(String[] args) {
    short sMin = -32768;
    short sMax = 32767;

    // default로 int
    System.out.println(sMax + 1);
    System.out.println(sMin - 1);

    System.out.println((short)(sMax + 1));
    System.out.println((short)(sMin - 1));
  }
}
