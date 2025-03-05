package supplierInterface;

import java.util.function.Supplier;

public class RandomOTP {

    public static void main(String[] args){

        //Return 6 digits OTP as a string

        Supplier<String> OTP = ()->{
          String otp = "";
          for(int i=0;i<6;i++){
              otp = otp+(int)( Math.random()*10);
          }
          return otp;
        };

        System.out.println("OTP 1 : "+OTP.get());
        System.out.println("OTP 2 : "+OTP.get());
        System.out.println("OTP 3 : "+OTP.get());
        System.out.println("OTP 4 : "+OTP.get());

    }
}
