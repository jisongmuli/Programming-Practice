package Day3;

import java.util.Scanner;

public class First7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String []str=sc.nextLine().split(" ");
            String res=Comparestr(str);
            System.out.println(res);
        }
    }
    public static String Comparestr(String[] arr){
        int p=arr[0].length()<arr[1].length()?arr[0].length():arr[1].length();
        int t=0;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <p ; i++) {
            if(!(arr[0].charAt(i)+"").equals(arr[1].charAt(i)+"")){
                break;
            }
            else {
                sb.append(arr[0].charAt(i));
                t++;
            }
        }
        if(t==0){
            return "No common prefix";
        }
        else {
            return "The common prefix is "+sb.toString();
        }
    }
}
