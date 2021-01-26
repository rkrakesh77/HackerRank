package ProblemSolving;
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a=new int[x];
        for (int i = 1; i <=x ; i++) {
            a[i-1]=i;
        }
        for (int i = 0; i < x; i++) {
            int k=i;
            for (int j = 0; j < x; j++) {
                if(k>=x){
                    k=0;
                }
                System.out.print(a[k]);
                k++;
            }
            System.out.println();
        }
    }
}
