package structural.decorator;

// TODO: 23/09/18 Explicar 
public class Decorator { 

  public static void main(String[] args) {
    System.out.println("Test 1\n");
    Phone phone = new AndroidPhone(new BasicPhone());
    phone.printModel();
    System.out.println("\nTest 2\n");
    Phone iPhone = new IPhone(phone);
    iPhone.printModel();
  }
}

interface Phone {
  void printModel();
}

class BasicPhone implements Phone {

  @Override
  public void printModel() {
    System.out.println("Basic Phone");
  }
}

class PhoneDecorator implements Phone {

  public Phone phone;

  public PhoneDecorator(Phone phone) {
    this.phone = phone;
  }

  @Override
  public void printModel() {
    this.phone.printModel();
  }
}

class AndroidPhone extends PhoneDecorator {

  public AndroidPhone(Phone phone) {
    super(phone);
  }

  @Override
  public void printModel() {
    super.printModel();
    System.out.println("Adding Features of Android");
  }

}

class IPhone extends PhoneDecorator {

  public IPhone(Phone phone) {
    super(phone);
  }

  @Override
  public void printModel() {
    super.printModel();
    System.out.println("Adding Features of iPhone");
  }

  // TODO: 20/09/18 how to Add new methods? 
}