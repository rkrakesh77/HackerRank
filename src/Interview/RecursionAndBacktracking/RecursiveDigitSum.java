package Interview.RecursionAndBacktracking;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RecursiveDigitSum {

    // Complete the superDigit function below.
    static int superDigit(String number, int k) {
        if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += Character.getNumericValue(number.charAt(i));
            }
            System.out.println(sum);
            return superDigit(Long.toString(sum * k), 1);
        }
        else
            return Character.getNumericValue(number.charAt(0));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String n =scanner.next();
        int k = scanner.nextInt();
        int result = superDigit(n, k);
        System.out.println(result);
        scanner.close();
    }
}
