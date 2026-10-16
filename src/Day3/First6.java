package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class First6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        for (int i = 0; i <k ; i++) {
            arr= Arrays.copyOf(Remove(arr),arr.length);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] Remove(int[] arr){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=arr[x-1];
        for (int i = 0; i < arr.length-x; i++) {
            arr[x-1+i]=arr[x+i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    
}
