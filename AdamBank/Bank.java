package AdamBank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> myBranches;

    public Bank(String name) {
        this.name = name;
        this.myBranches = new ArrayList<>();

    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.myBranches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initailAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initailAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < myBranches.size(); i++) {
            Branch checkedBranch = this.myBranches.get(i);
            if (checkedBranch.getName().equalsIgnoreCase(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

                if(showTransaction) {
                    System.out.println("Transaction");
                    ArrayList<Double> transaction = branchCustomer.getTransaction();
                    for (int j = 0; j < transaction.size(); j++) {
                        System.out.println("[" +(j+1) + "] Amount " + transaction.get(j));

                    }
                }
            }
            return  true;
        } else {
            return false;
        }
    }
}

