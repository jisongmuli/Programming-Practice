package Day4;

import java.util.Scanner;
/*一个名为symbol的字符串数据域表示股票代码。
        一个名为name的字符串数据域表示股票名称。
        一个名为previousClosingPrice的double数据域，
        它存储前一日的股票交易价格。一个名为currentPrice数据域，它存储当前的股票交易价格。
        创建一个有特定代码和名称的股票的构造方法。
        一个名为getChangePercent()方法返回从previousClosingPrice变化到currentPrice的百分比。*/
  class Stock{
      String symbol;
      String name;
      Double previousClosingPrice;
      Double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    double changePercent(){
        return (this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice;
    }
}
public class First1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();
        // Input current price
        stock.currentPrice = input.nextDouble();
        // Display stock info
        System.out.println(stock.name+" Price Changed: " + stock.changePercent() * 100 + "%");
        input.close();
    }
}
