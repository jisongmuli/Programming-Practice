package Day3;

import java.util.Scanner;

public class First8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String []str=sc.nextLine().split(" ");
            String res=Comparestr(str);
            System.out.println(res);
        }
    }
    public static String Comparestr(String[] arr){
        int p=arr[0].length()>arr[1].length()?arr[0].length():arr[1].length();
        int m=arr[0].length()<arr[1].length()?arr[0].length():arr[1].length();
        int t=0;
        StringBuilder sb=new StringBuilder();
        for (int i =0 ; i <m ; i++) {
            if(!(arr[0].charAt(arr[0].length()-i-1)+"").equals(arr[1].charAt(arr[1].length()-1-i)+"")){
                break;
            }
            else {
                sb.append(arr[0].charAt(arr[0].length()-1-i));
                t++;
            }
        }
        if(t==0){
            return "No common suffix";
        }
        else {
            StringBuilder cb=new StringBuilder();
            for (int i=sb.toString().length()-1 ;i>=0; i--) {
                cb.append(sb.toString().charAt(i));
            }
            return "The common suffix is "+cb.toString();
        }
    }
}
