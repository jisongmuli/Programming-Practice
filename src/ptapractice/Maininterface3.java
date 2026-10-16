package ptapractice;

import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape1 {// 接口

    double getArea(); // 求面积

    double getPerimeter();// 求周长

}
/* 这里有正n边形类RegularPolygon的实现*/

public class Maininterface3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        String q=sc.nextLine();
        int n=Integer.parseInt(p);
        double side=Double.parseDouble(q);
        RegularPolygon regularPolygon = new RegularPolygon(n, side);
        DecimalFormat h=new DecimalFormat("##.####");
        System.out.println(h.format(regularPolygon.getArea()));
        System.out.println((int)regularPolygon.getPerimeter());
    }
}
class RegularPolygon implements IShape1{
    private int a;
    private double b;
    public RegularPolygon(int a, double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public double getArea() {
        return (a*b*b)/(4*Math.tan(Math.PI/a));
    }

    @Override
    public double getPerimeter() {
        return a*b;
    }

}