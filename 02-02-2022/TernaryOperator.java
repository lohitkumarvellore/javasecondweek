import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String msg = (num<10)? ((num>5)?"yes greater than 5":"less than 5"):"greater than 10";
        System.out.println(msg);
    }
}
