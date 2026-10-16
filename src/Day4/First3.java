package Day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First3 {
    public static void main(String[] args) {
        Map<String,String> namenode=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String t=sc.nextLine();
            if(t.equals("noname")){
                break;
            }
            else{
                String []str=t.split(" ");
                namenode.put(str[0],str[1]);
            }
        }
        String s2=sc.next();
        if(namenode.containsKey(s2)){
            System.out.println(namenode.get(s2));
        }
        else {
            System.out.println("Not found.");
        }
    }
}
