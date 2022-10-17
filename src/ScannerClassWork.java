import java.util.Locale;
import java.util.Scanner;

public class ScannerClassWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        password = "D" + password;
        int size = password.length() - 5;
        password = password + size;
        password = password.replace('Z', '~');
        password = password.replace('A', 'Z');
        int sizeOfPassword = password.length();
        char center = password.charAt(sizeOfPassword / 2);

        String firstOfPart = password.substring(0, sizeOfPassword / 2);
        String secondOfPart = password.substring(sizeOfPassword / + 1);

        password = firstOfPart + secondOfPart + center;
        System.out.println(password);

        System.out.println(password);

    }
}
