package Day4;

import java.util.Scanner;

public class First6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1= sc.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <st1.length() ; i++) {
            if(st1.charAt(i)>='a'&&st1.charAt(i)<='z'){
                sb.append(st1.charAt(i));
            }
            else {
                sb.append("_"+(""+st1.charAt(i)).toLowerCase());
            }
        }
        System.out.println(sb.toString());
    }
}
