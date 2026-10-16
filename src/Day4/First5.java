package Day4;

//该类有 四个私有属性 分别是 书籍名称、 价格、 作者、 出版年份，以及相应的set 与get方法；该类有一个含有四个参数的构造方法，这四个参数依次是书籍名称、 价格、 作者、 出版年份 。
import java.util.*;
public class First5 {
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
class Book{
    String bookname;
    int price;
    String name;
    int year;

    public Book(String bookname, int price, String name, int year) {
        this.bookname = bookname;
        this.price = price;
        this.name = name;
        this.year = year;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}