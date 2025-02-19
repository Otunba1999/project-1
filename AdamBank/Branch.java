package AdamBank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {

        this.customers = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
       if (findCustomer(customerName) == null) {
           this.customers.add(new Customer(customerName, initialAmount));
           return true;
       }
       return false;

    }
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
           existingCustomer.addCustomerTransaction(amount);
           return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equalsIgnoreCase(customerName)) {
                return  this.customers.get(i);
            }
        }
        return null;
    }
}
