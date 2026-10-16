package Day4;
import java.text.DecimalFormat;
import java.util.Scanner;
//请从下列的抽象类shape类扩展出一个圆形类Circle,这个类圆形的半径radius作为私有成员，类中应包含初始化半径的构造方法。
//主类从键盘输入圆形的半径值，创建一个圆形对象，然后输出圆形的面积和周长。保留4位小数。
import java.util.Scanner;
abstract class shape {// 抽象类
    /* 抽象方法 求面积 */
    public abstract double getArea( );

    /* 抽象方法 求周长 */
    public abstract double getPerimeter( );
}
class Circle extends shape{// 抽象类
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        return  Math.PI*this.radius*this.radius;
    }// 求面积

    public  double getPerimeter(){
        return 2*Math.PI*this.radius;
    }// 求周长
}
public class First7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        double r = input.nextDouble( );
        shape c = new Circle(r);

        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    }
}
