class ThreadOne extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Good Morning");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class ThreadTwo extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class ThreadThree extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Welcome");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class A5 {
  public static void main(String[] args) {
    Thread t1 = new ThreadOne();
    Thread t2 = new ThreadTwo();
    Thread t3 = new ThreadThree();

    t1.start();
    t2.start();
    t3.start();
  }
}
