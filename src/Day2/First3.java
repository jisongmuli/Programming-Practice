package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class First3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] ob = str.split("\\D", 0);
        BigInteger m=new BigInteger(ob[0]);
        BigInteger n=new BigInteger(ob[1]);
        if(str.contains("/")){
            System.out.println(m.divide(n));
        }
        if(str.contains("*")){
            System.out.println(m.multiply(n));
        }
        if(str.contains("+")){
            System.out.println(m.add(n));
        }
        if(str.contains("-")){
            System.out.println(m.subtract(n));
        }
    }
}
