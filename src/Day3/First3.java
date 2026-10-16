package Day3;

import java.util.Scanner;

public class First3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        String res=Replace(str1,str2,str3);
        System.out.println(res);
    }
    public  static String Replace(String str1,String str2,String str3){
        String []arr=str1.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(str2)){
                arr[i]=str3;
            }
            if(i< arr.length-1){
                sb.append(arr[i]+" ");
            }
            else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
