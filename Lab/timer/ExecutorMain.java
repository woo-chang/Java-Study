package Lab.timer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

    LocalDateTime now = LocalDateTime.now();
    LocalDateTime after = LocalDateTime.now().plusSeconds(10);
    long seconds = Duration.between(now, after).getSeconds();

    Runnable task = () -> {
      System.out.println(LocalDateTime.now() + " : Executing the task from Timer");
    };

    System.out.println(now + " : Scheduling....");
    System.out.println(after + " : Start Time");
    scheduledExecutorService.schedule(task, seconds, TimeUnit.SECONDS);
  }

}
