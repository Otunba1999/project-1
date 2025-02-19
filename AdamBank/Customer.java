package AdamBank;

import java.util.ArrayList;

public class Customer {
    private  String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<>();
        addCustomerTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }


    public  void addCustomerTransaction(double amount){
        this.transaction.add(amount);
    }
}
