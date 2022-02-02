import java.util.Scanner;
public class oddorevenmethod {
    public static String oddoreven(int num)
    {
        String value = "";
        if(num%2 == 0)
        {
            value = "even number";
        }
        else
        {
            value = "odd number";
        }
        return value;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(oddoreven(num));
    }
}
