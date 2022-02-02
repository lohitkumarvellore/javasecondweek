import java.util.Scanner;
public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String msg = (c.equalsIgnoreCase("a"))?"vowel":(c.equalsIgnoreCase("e")?"vowel":(c.equalsIgnoreCase("i")?"vowel":(c.equalsIgnoreCase("o")?"vowel":(c.equalsIgnoreCase("u")?"vowel":"Consonant"))));
        System.out.println(msg);
    }
}
