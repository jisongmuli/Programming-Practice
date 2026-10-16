package Day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class First5 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        sb.append("");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            String s=sc.next();
            if(!sb.toString().contains(s)){
                if(i<n-1){
                    sb.append(s+" ");
                }
                else {
                    sb.append(s);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
