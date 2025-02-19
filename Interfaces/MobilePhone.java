package Interfaces;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + "do deskphone");
        } else {
            System.out.println("Mobile phone switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answer the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
