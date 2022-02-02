import java.util.Scanner;
public class numberofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit = 0;
        while(a != 0)
        {
            a = a/10;
            digit++;
        }
        System.out.println(digit);
    }
}
