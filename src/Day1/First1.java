package Day1;

import java.util.Scanner;
public class First1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String sex = scan.next();
        int age = scan.nextInt();
        Person p = new Person();
        p.setName(name);
        p.setSex(sex);
        p.setAge(age);
        p.print();
        scan.close();
    }
}

/* 你的代码被嵌在这里 */
class Person{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println("name:"+this.name);
        System.out.println("sex:"+this.sex);
        System.out.println("age:"+this.age);
    }
}