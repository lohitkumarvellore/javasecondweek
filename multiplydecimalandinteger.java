import java.util.Scanner;
public class multiplydecimalandinteger {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number");
        double decimal = sc.nextDouble();
        System.out.println("enter integer number");
        int integer = sc.nextInt();
        System.out.println(decimal*integer);
    }
}
