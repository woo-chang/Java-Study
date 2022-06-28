package TheEssenceOfJava.Chapter13;

public class ThreadExample1 {

  public static void main(String[] args) {
    ThreadExample1_1 t1 = new ThreadExample1_1();

    // Runnable 인터페이스를 구현한 경우 구현한 클래스의 인스턴스 생성 후 Thread클래스 생성자의 매개변수로 전달
    Runnable r = new ThreadExample1_2();
    Thread t2 = new Thread(r);

    // start를 호출해야 쓰레드가 실행된다.
    // 실행대기 상태에 존재하다가 자기 순서가 되면 쓰레드를 실행
    // 한번 실행이 종료된 쓰레드는 다시 실행할 수 없다.
    t1.start();
    t2.start();
  }
}

class ThreadExample1_1 extends Thread {
  public void run() {
    // Thread클래스를 상속받으면 Thread 메서드 직접 호출이 가능
    for (int i = 0; i < 5; i++) {
      System.out.println(getName());
    }
  }
}

class ThreadExample1_2 implements Runnable {
  public void run() {
    // Runnable을 구현하면 Thread 클래스의 static 메서드인 currentThread()를 호출하여 참조를 얻어야한다.
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
