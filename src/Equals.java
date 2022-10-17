import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int length = line.length();
        String last = line.substring(length - 1);

        if (!last.equals("!") || length < 6) {
            System.out.println("Ваш пароль неверный");
        }
        else {
            System.out.println("пароль принят");
        }

        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
    }
}
