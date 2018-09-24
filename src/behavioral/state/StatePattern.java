package behavioral.state;

public class StatePattern {

  public static void main(String args[]) {
    ACContext acContext = new ACContext();
    ACState acStartState = new ACStartState();
    ACState acStopState = new ACStopState();

    acContext.setState(acStartState);
    acContext.doAction();

    acContext.setState(acStopState);
    acContext.doAction();
//  Se crea un objeto para cada una de las acciones o estados
  }
}

interface ACState {

  void doAction();
}

class ACStartState implements ACState {

  @Override
  public void doAction() {
    System.out.println("AC is on.");
  }
}

class ACStopState implements ACState {

  @Override
  public void doAction() {
    System.out.println("AC is off.");
  }
}

class ACContext implements ACState {

  private ACState acState;

  public void setState(ACState state) {
    this.acState = state;
  }

  public ACState getState() {
    return this.acState;
  }

  @Override
  public void doAction() {
    this.acState.doAction();
  }
}