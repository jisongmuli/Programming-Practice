package ptapractice;


/* 请在这里给出学生类Student的定义 */
public class Main4 {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Bill", 87);
        stu1.print();

        Student stu2 = new Student(2, "Adam", 91);
        stu2.print();

        Student stu3 = new Student(3, "David", 96);
        stu3.print();

        Student.average();
    }
}
  /*  本程序中学生Student类中有学号 number，姓名 name，成绩 score 等实例变量，另外有静态变量学生对象个数 count 和总分sum。类方法average( )用来计算学生的平均分。
        学生类的构造方法如下：
public Student(int number1, String name1, float score1);*/
class Student {
    int number;
    String name;
    float score;
    static int count = 0;
    static float sum = 0;
    public Student(int number, String name, float score) {
        this.number = number;
        this.name = name;
        this.score = score;
        count++;
        sum += score;
    }
    public void print() {
        System.out.println("number: " + this.number + " name: " + this.name + " score: " + this.score+ " count："+count);
    }

    public static void average() {
        System.out.println("sum is "+sum+"    "+"count is "+count);
        System.out.println("average is " + (sum / count));
    }
}
