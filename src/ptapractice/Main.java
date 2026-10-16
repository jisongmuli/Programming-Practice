package ptapractice;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Book>books=new ArrayList<Book>();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {    String str=in.nextLine();
            String []data=str.split(",");
            Book book=new Book(data[0],Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]));
            books.add(book);
        }

        System.out.println(totalprice(books));
    }

    /*计算所有book的总价*/
    public static int totalprice(List <Book>books)
    {  int result=0;
        for(int i=0;i<books.size();i++){result+=books.get(i).getPrice();}
        return result;
    }
}

/* 请在这里填写答案 */

class Book {
    String name;
    int price;
    String people;
    int year;

    public Book(String name, int price, String people, int year) {
        this.name = name;
        this.price = price;
        this.people = people;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
