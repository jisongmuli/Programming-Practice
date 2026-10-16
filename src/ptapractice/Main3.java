package ptapractice;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘输入公里数
        double a = sc.nextDouble();
        //转换为英里数并输出
        System.out.printf("%.2f ", Conversion.getMile(a));
        //键盘输入英里数
        double b = sc.nextDouble();
        //转换为公里数并输出
        System.out.printf("%.2f", Conversion.getKilometer(b));
        sc.close();
    }
}
/* 请在这里填写答案
* 创建 Java 类Conversion，实现两个静态方法，能进行公里、英里转换。
Conversion类包括：
1个私有静态常量 N=0.621
2个公有静态方法 getMile(double k)，getKilometer(double m),两个方法的返回值都是double型。
方法应实现如下功能：
getMile(double k)方法功能：将参数k保存的公里数转换成英里，并返回英里数。
getKilometer(double m)方法功能：将参数m保存的英里数转换成公里，并返回公里数。
转换规则：1 kilometre（公里） = 0.621 mile（英里） */
class Conversion{
     private static final double N=0.621;
    public  static double getMile(double a){
        return a*N;
    }
    public  static double getKilometer(double b){
        return b/N;
    }
}