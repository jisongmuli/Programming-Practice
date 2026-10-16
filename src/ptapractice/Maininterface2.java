package ptapractice;

import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// 抽象类
    /* 抽象方法 求面积 */
    public abstract double getArea( );

    /* 抽象方法 求周长 */
    public abstract double getPerimeter( );

}
public class Maininterface2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        double r = input.nextDouble( );
        shape c = new  Circle(r);

        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    }
}
class Circle extends shape{
    public double r;

     public Circle(double r) {
        this.r=r;
    }

     @Override
    public  double getArea(){
        return Math.PI*r*r;
    }
     @Override
    public  double getPerimeter(){
        return Math.PI*r*2;
    }

 }

