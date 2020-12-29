package JavaLearning.BigNumber;

import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        String[] x = Arrays.copyOf(s, n);
        Arrays.sort(x, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                //convert to big decimal inside comparator
                //so permanent string values are never changed
                //aka you only use the BigDecimal values to
                //compare the strings!
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));
        s=Arrays.copyOf(x, n);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}