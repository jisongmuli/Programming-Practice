package Day3;

/*
import java.util.Scanner;

public class First2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while (sc.hasNext()){
           String str= sc.nextLine();
           if(Matchstr(str)){
               System.out.println("true");
           }
           else {
               System.out.println("false");
           }
       }
        sc.close();
    }
   static boolean Matchstr(String str){
        String ma="[a-zA-Z_$][a-zA-Z0-9_$]*\\.java";
        return str.matches(ma);
    }
}
*/
import java.util.Scanner;

public class First2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String fileName = scanner.nextLine();
            boolean isValid = isValidJavaFileName(fileName);
            System.out.println(isValid);
        }

        scanner.close();
    }

    private static boolean isValidJavaFileName(String fileName) {
        // 正则表达式判断是否符合Java源文件命名规则
        String regex = "[a-zA-Z_$][a-zA-Z0-9_$]*\\.java";
        return fileName.matches(regex);
    }
}

