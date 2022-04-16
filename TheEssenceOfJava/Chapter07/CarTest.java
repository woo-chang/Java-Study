package TheEssenceOfJava.Chapter07;

public class CarTest {

  public static void main(String[] args) {
    Car car = new Car("engine1");
    MyCar myCar = new MyCar("engine2", "car1");

    Car car2 = null;
    MyCar myCar2 = null;

    System.out.println(myCar.name);

    car2 = myCar;
    myCar2 = (MyCar)car2;

    System.out.println(myCar2.name);

    // 에러 발생. 타입을 변환하는 것이지 인스턴스를 변환하는 것이 아니기 때
    // instanceof의 사용 필요성
    myCar2 = (MyCar)car;

    System.out.println(myCar2.engine);
  }

}
