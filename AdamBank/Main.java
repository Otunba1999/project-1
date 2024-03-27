package AdamBank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Wema Bank");
        bank.addBranch("Agbara branch");
        bank.addCustomer("Agbara branch", "Adam", 90.00);
        bank.addCustomer("Agbara branch", "Adamson", 50.00);
        bank.addCustomer("Agbara branch", "yuken", 69.78);
        bank.addCustomer("Agbara branch", "Basit", 509.87);

        bank.addBranch("Badagry");
        bank.addCustomer("Badagry", "Ola", 89.65);
        bank.addCustomer("Badagry", "Olam", 65.54);
        bank.addCustomer("Badagry", "Olada", 646.89);
        bank.addCustomerTransaction("Agbara branch", "Adam", 90.65);
        bank.addCustomerTransaction("Agbara branch", "Basit", 90.65);
        bank.addCustomerTransaction("Agbara branch", "yuken", 90.65);

        bank.addCustomerTransaction("Badagry", "Olam", 900.65);
        bank.addCustomerTransaction("Badagry", "Olada", 190.65);
        bank.addCustomerTransaction("Badagry", "Ola", 96.65);
        System.out.println(bank.listCustomers("Agbara branch", true));
        bank.listCustomers("Badagry", true);
    }
}
