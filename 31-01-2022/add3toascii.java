import java.util.Scanner;
public class add3toascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = (int) c + 3;
        char cnew = (char) ascii;
        System.out.println(cnew);

    }
}
