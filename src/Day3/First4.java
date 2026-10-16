package Day3;

import java.util.Scanner;

public class First4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String res=Replace(str1);
        System.out.println(res);
    }
    public static String Replace(String str1){
        String [] arr=str1.split("_");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length()));
            }
        }
        return sb.toString();
    }
}
