import java.util.Scanner;
public class factdowhile {
    public static void main(String[] args) {
        int num;
        String option = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the number");
            num = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= num; i++)
            {
                fact = fact * i;
            }
            System.out.println(fact);
            System.out.println("do u want to continue yes/no");
            option = sc.nextLine();

        } while (option!="yes");

    }
}
