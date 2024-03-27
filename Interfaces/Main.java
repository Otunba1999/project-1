package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone tim = new DeskPhone(12345);
        tim.powerOn();
        tim.callPhone(12345);
        tim.answer();
        System.out.println();

        tim = new MobilePhone(123456);
        tim.powerOn();
        tim.callPhone(123456);
        tim.answer();
    }
}
