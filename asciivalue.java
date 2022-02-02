import java.util.Scanner;
public class asciivalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        int ascii = (int) character;
        System.out.println(ascii);
    }
}
