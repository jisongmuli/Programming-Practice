package ptapractice;
import java.text.DecimalFormat;
import java.util.Scanner;
interface IShape {// 接口

    public abstract double getArea(); // 抽象方法 求面积

    public abstract double getPerimeter(); // 抽象方法 求周长

}
public class Maininterface {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
 class RTriangle implements IShape{
    private double a;
    private double b;
     public RTriangle(double a, double b) {
         this.a=a;
         this.b=b;
     }

     @Override
     public double getArea() {
         return a*b*0.5;
     }

     @Override
     public double getPerimeter() {
         return b+a+Math.sqrt(b*b+a*a);
     }

 }
