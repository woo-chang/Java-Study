package TheEssenceOfJava.Chapter08;

public class ExceptionExample {

  public static void main(String[] args) {
    boolean loopState = true;
    int count = 0;

    while (loopState) {
      try {
        count += 1;
        if (count == 5) {
          loopState = false;
          System.out.println("루프 종료");
        } else {
          throw new Exception("루프 테스트 에러");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
