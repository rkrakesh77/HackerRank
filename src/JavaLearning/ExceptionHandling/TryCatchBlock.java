package JavaLearning.ExceptionHandling;

import java.io.*;
import java.util.*;

public class TryCatchBlock {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        try{
            int first=sc.nextInt();
            int second=sc.nextInt();
            int x=first/second;
            System.out.print(x);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}