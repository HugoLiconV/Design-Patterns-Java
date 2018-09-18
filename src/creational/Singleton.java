package creational;

public class Singleton {

  private static Singleton instance;
  public String value;

  private Singleton(String value) {
    this.value = value;
  }

  public static Singleton getInstance(String value) {
    if (instance == null) {
      instance = new Singleton(value);
    }
    return instance;
  }
}

class DemoSingleThread {

  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        "RESULT:" + "\n");
    Singleton singleton = Singleton.getInstance("BAR");
    Singleton anotherSingleton = Singleton.getInstance("FOO");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
  }
}