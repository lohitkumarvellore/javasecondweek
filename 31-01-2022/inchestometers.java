import java.util.Scanner;
public class inchestometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float inch = sc.nextFloat();
        float meter = inch/39.37f;
        System.out.println(meter + " meters");
    }
}
