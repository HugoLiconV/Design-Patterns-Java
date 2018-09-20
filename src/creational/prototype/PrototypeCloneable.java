package creational.prototype;

import java.util.ArrayList;
import java.util.List;


public class PrototypeCloneable {

  public static void main(String args[]) {
    Customers customers = new Customers();
    customers.loadDataFromDB();

    Customers customers1 = (Customers) customers.clone();
    Customers customers2 = (Customers) customers.clone();

    List<String> customersList1 = customers1.getCustomerList();
    customersList1.add("Vivek");

    List<String> customersList2 = customers2.getCustomerList();
    customersList2.remove("Deepika");

    System.out.println("customers List elements:\t" + customers.getCustomerList());
    System.out.println("customers1 List elements:\t" + customersList1);
    System.out.println("customers2 List elements:\t" + customersList2);

  }
}

class Customers implements Cloneable {

  private List<String> customerList;

  public Customers() {
    customerList = new ArrayList<>();
  }

  public Customers(List<String> list) {
    this.customerList = list;
  }

  public void loadDataFromDB() {
    //Read all customers from DB
    customerList.add("Bharat");
    customerList.add("Sahdev");
    customerList.add("Richi");
    customerList.add("Jai");
    customerList.add("Bharti");
    customerList.add("Saveta");
    customerList.add("Deepika");
  }

  public List<String> getCustomerList() {
    return customerList;
  }

  @Override
  public Object clone() {
    List<String> temp = new ArrayList<>();
    this.getCustomerList().forEach(customer -> temp.add(customer));
    return new Customers(temp);
  }
}
