package Day2;

/*import java.math.BigInteger;
import java.util.Scanner;
public class First2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger m = sc.nextBigInteger();
        int n = sc.nextInt();
        int p = 0;
        BigInteger nn=m;
        while (true) {
            if (nn.isProbablePrime(1000)) {
                System.out.println(nn);
               nn=nn.nextProbablePrime();
                p++;

            }
            if (p == n) {
                break;
            }
        }
    }
}*/
import java.math.BigInteger;
import java.util.Scanner;

public class First2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 对n进行输入验证
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("请输入正整数作为n。");
            return;
        }

        BigInteger startNumber = sc.nextBigInteger();
        int primeCount = 0;
        BigInteger currentPrime = startNumber;

        while (true) {
            if (currentPrime.isProbablePrime(1000)) {
                System.out.println(currentPrime);
                currentPrime = currentPrime.nextProbablePrime();
                primeCount++;
            }
            if (primeCount == n) {
                break;
            }
        }
    }
}

/*import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;
public class First2{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        BigInteger b=new BigInteger(in.next());
        int n;
        n=in.nextInt();
        if(!b.isProbablePrime(10000))
        {
            BigInteger tem=new BigInteger(b.nextProbablePrime().toString());
            while(n>0)
            {
                System.out.println(tem.toString());n--;
                tem=tem.nextProbablePrime();
            }
        }
        else
        {
            n--;
            System.out.println(b.toString());
            BigInteger tem=new BigInteger(b.nextProbablePrime().toString());
            while(n>0)
            {
                System.out.println(tem.toString());n--;
                tem=tem.nextProbablePrime();
            }
        }

        in.close();
    }
}*/
