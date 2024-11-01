import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年龄：");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("输入字符串：");
        String text = sc.nextLine();
        System.out.println(text);
    }
}
