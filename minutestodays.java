import java.util.Scanner;
public class minutestodays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int days = minutes/1440;
        System.out.println(days + " days");
        int years = minutes/525600;
        System.out.println(years+ " years");
    }
}
