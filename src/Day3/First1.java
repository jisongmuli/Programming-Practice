package Day3;

import java.util.Scanner;

public class First1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()!=8||(str.substring(2,4).compareTo("01")!=0&&str.substring(2,4).compareTo("02")!=0&&str.substring(2,4).compareTo("03")!=0&&str.substring(2,4).compareTo("20")!=0)){
            System.out.println("Wrong Format");
        }
        else {
            System.out.println("入学年份：20"+str.substring(0,2)+"年");
            if(str.substring(2,4).compareTo("01")==0){
                System.out.println("学院：材料学院");
            }
            if(str.substring(2,4).compareTo("02")==0){
                System.out.println("学院：机械学院");
            }
            if(str.substring(2,4).compareTo("03")==0){
                System.out.println("学院：外语学院");
            }
            if(str.substring(2,4).compareTo("20")==0){
                System.out.println("学院：软件学院");
            }
            System.out.println("班级："+str.substring(4,6));
            System.out.println("学号："+str.substring(6,8));
        }
    }
}
