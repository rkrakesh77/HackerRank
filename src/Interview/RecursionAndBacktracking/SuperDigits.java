package Interview.RecursionAndBacktracking;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperDigits {

    // Complete the superDigit function below.
    static int superDigit(String number, int k) {
        if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += Character.getNumericValue(number.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        }
        else
            return Character.getNumericValue(number.charAt(0));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
