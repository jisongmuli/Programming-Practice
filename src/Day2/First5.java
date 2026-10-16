package Day2;

import java.math.BigInteger;
import java.util.Scanner;

public class First5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        System.out.println(Getresult(n));
    }
    public static BigInteger Getresult(BigInteger n){
        if(0==n.compareTo(new BigInteger("1"))||-1==n.compareTo(new BigInteger("1"))){
            return new BigInteger("1");
        }
        else {
            return Getresult(n.subtract(new BigInteger("1"))).multiply(n);
        }
    }
}
