package app.model;

import java.util.UUID;

public class Registration {
    public String name;
    public String mobileNo;
    public String otp ;

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", otp='" + otp + '\'' +
                ", enterOtp='" + enterOtp + '\'' +
                '}';
    }

    public String enterOtp;

    public Registration() {

        this.otp = UUID.randomUUID().toString();
    }

    public boolean login(){
        if (this.enterOtp.equals(this.otp)) {
            System.out.println("SuccessFully Login");
         return true ;
        }
        System.out.println("LoginFailedPlease Try again");
        return false;
    }
}
