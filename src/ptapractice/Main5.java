package ptapractice;

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        double dd = RR.fun();
        System.out.printf("%.2f",dd);
    }
}
class RR{
    public static double fun(){
        Scanner sc=new Scanner(System.in);
        int []arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        return (double)arr[2];
    }

}
