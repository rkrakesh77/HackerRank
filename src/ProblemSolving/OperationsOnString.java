package ProblemSolving;

import java.util.Scanner;

public class OperationsOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
//       A=And Operation B=OR Operation C=XOR Operation
        //1A2B3C5A8
        System.out.println(new OperationsOnString().BitOperationOnString(input));
    }

    public int BitOperationOnString(String s) {
        int r = 0;
        String sign = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                r = Integer.parseInt(String.valueOf(s.charAt(i)));
            } else if (String.valueOf(s.charAt(i)).matches("[0-9]")) {
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (sign.equals("A")) {
                    r = r & x;
                } else if (sign.equals("B")) {
                    r = r | x;
                } else if (sign.equals("C")) {
                    r = r ^ x;
                }
            } else {
                sign = String.valueOf(s.charAt(i));
            }
        }
        return r;
    }
}
