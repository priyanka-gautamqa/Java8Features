package supplierInterface;

import java.util.function.Supplier;

public class RandomPassword {

    public static void main(String[] args){

       /* RULES:
        Length should be 8 characters
            2,4,6,8 places only digits
                1,3,5,7 places upper case alphabet symbols or characters - @,#,$
                */

        Supplier<String> pwdSupplier = ()->{

            String pwd ="";

            // to get digit for even places -2,4,6,8 places
            Supplier<Integer> digitSupplier = ()-> (int)(Math.random()*10);

            // 1,3,5,7 places upper case alphabet symbols or characters - @,#,$
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> characterSupplier = ()-> symbols.charAt((int)(Math.random()*29));

            //Create password using above two suppliers
            for(int i =1;i<=8;i++){
                if(i%2==0){
                    pwd = pwd+digitSupplier.get();
                }
                else{
                    pwd=pwd+characterSupplier.get();
                }
            }
            return pwd;
        };

        // GENERATE PASSWORD
        System.out.println("RANDOM PASSWORD 1: "+pwdSupplier.get());
        System.out.println("RANDOM PASSWORD 2: "+pwdSupplier.get());
        System.out.println("RANDOM PASSWORD 3: "+pwdSupplier.get());
    }
}
