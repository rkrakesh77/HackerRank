package JavaLearning.BigNumber;

import java.math.BigInteger;
import java.util.*;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
        String no = scanner.nextLine();
       BigInteger b= BigInteger.valueOf(Integer.parseInt(no));
       if(b.isProbablePrime(10)){
           System.out.println("prime");
       }
       else
           System.out.println("Not prime");}
        catch (Exception e) {
            System.out.println("Enter valid input");
        }
    }
}
