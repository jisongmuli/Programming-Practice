package ptapractice;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().split(" ");
        Student2 st=new Student2(arr[0],Integer.parseInt(arr[1]),arr[2]);
        st.print();
    }
}
class Student2 {
    private String name;
    private String sex;
    private int age;

    public Student2(String name, int age, String sex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

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

    public void print() {
        System.out.println("Student [name='" + this.getName() + "', sex='" + this.getSex() + "', age=" + this.getAge() + "]");
    }
}