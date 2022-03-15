package TheEssenceOfJava.Chapter03;

public class OperatorExample {

  public static void main(String[] args) {
    byte a = 10;
    byte b = 20;
    
    // 아래의 코드는 에러 발생
    // int 보다 작은 타입의 계산이므로 결과는 자동으로 int로 변환되기 때문
    // 따라서 byte로 명시적인 형변환을 해주어야 에러가 발생하지 않는다
    // byte c = a + b;
    
    byte c = (byte)(a+b);
    System.out.println("c = " + c);

    int d;
    System.out.println(d = 3);
  }
}
