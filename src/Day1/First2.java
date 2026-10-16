package Day1;
import java.util.Scanner;
public class First2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextFloat()){
            double r=scanner.nextDouble();
            Circle c = new Circle(r);
            System.out.printf("%.2f %.2f\n",c.getArea(),c.getLength());
            c.radius = 2*r;
            System.out.printf("%.2f %.2f\n",c.getArea(),c.getLength());
        }
    }
}
class Circle{
    double radius;

    public Circle (double r){
        this.radius=r;
    }

    public double getArea() {
       return Math.PI*radius*radius;
    }
    public double getLength() {
        return  Math.PI*2*radius;
    }
}