import java.util.Scanner;
public class checkyearwithnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String msg = (num==1)?"JANUARY":(num==2?"FEBRUARY":(num==3?"MARCH":(num==4?"APRIL":(num==5?"MAY":(num==6?"JUNE":(num==7?"JULY":(num==8?"AUGUST":(num==9?"SEPTEMBER":(num==10?"OCTOBER":(num==11?"NOVEMBER":(num==12?"DECEMBER":"PLEASE ENTER VALID MONTH")))))))))));
        System.out.println(msg);
    }
}
