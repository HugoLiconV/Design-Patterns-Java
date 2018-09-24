package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

  public static void main(String args[]) {
    Subject subject = new Subject();

    new StringObserver(subject);
    new OctalObserver(subject);

    System.out.println("State change: 45");
    subject.setState(45);
    System.out.println("State change: 150");
    subject.setState(150);
  }
}

// A Subject is simply an Observer and Observable
class Subject {

  private List<Observador> observers = new ArrayList<>();
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyAllObservers();
  }

  public void attach(Observador observer) {
    observers.add(observer);
  }

  public void notifyAllObservers() {
    for (Observador observer : observers) {
      observer.update();
    }
  }
}

abstract class Observador {

  protected Subject subject;

  public abstract void update();
}

class StringObserver extends Observador {

  public StringObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("String value: " + Integer.toString(subject.getState()));
  }
}


class OctalObserver extends Observador {

  public OctalObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Octal value: " + Integer.toOctalString(subject.getState()));
  }
}