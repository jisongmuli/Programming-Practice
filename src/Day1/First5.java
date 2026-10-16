package Day1;

import java.util.Scanner;

public class First5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                m++;
                System.out.print(m+"\t");
            }
            System.out.println();
        }
    }
}
