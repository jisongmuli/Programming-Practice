package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class First4 {
    public static void main(String[] args) {
        BigInteger m=new BigInteger(String.valueOf(Long.MAX_VALUE));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=3;
        BigInteger m2=m.divide(new BigInteger(String.valueOf(n)));
        for (;i>0;){
            BigInteger m3=(m2.add(new BigInteger("1"))).multiply(new BigInteger(String.valueOf(n)));
            System.out.println(m3);
            m2=m2.add(new BigInteger("1"));
            i--;
        }
    }
}
