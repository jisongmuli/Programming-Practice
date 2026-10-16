package Day4;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shap1 {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}
class RegularPolygon extends shap1{
     private int n;
     private Double a;
    public RegularPolygon(int n, Double a) {
        this.n = n;
        this.a = a;
    }
   public double getArea(){
        return 0.25*this.n*this.a*this.a*(1.0/Math.tan(Math.PI/this.n));
    }
   public double getPerimeter(){
        return this.a*this.n;
    }
}

public class First2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        int n=input.nextInt();
        double side = input.nextDouble();

        shap1 rp = new  RegularPolygon(n,side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}