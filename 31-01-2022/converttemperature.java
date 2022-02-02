import java.util.Scanner;
public class converttemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit = sc.nextFloat();
        float celsius = ((fahrenheit-32)*5)/9;
        System.out.println(celsius +" celsius");
    }
}
