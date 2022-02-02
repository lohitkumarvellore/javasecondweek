import java.util.Scanner;
public class checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String msg = (num==10)?"yes 10":(num==20?"yes 20":(num==30?"yes 30":(num==40?"yes 40":(num==50?"yes 50":"no"))));
        System.out.println(msg);

    }
}
