package Day5;


import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

//创建一个直角三角形类（regular triangle）RTriangle类，实现下列接口IShape。两条直角边长作为RTriangle类的私有成员，类中包含参数为直角边的构造方法。
 class RTriangle implements IShape{
    private double a;
    private double b;
    RTriangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return 0.5*this.a*this.b;
    }

    @Override
    public double getPerimeter() {
        return this.b+this.b+Math.sqrt(this.a*this.a+this.b*this.b);
    }
}



public class First1 {
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
