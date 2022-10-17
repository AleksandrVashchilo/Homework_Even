import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = sc.nextLine();

        int size = line.length();
        boolean answer = size > 10;
        System.out.println(answer);

        System.out.println("Введите строку");
        String lineOfTwo = sc.nextLine();

        char symbolOfFirst = lineOfTwo.charAt(0);
        char symbolOfLast = lineOfTwo.charAt(lineOfTwo.length() - 1);

        boolean answerOfTwo = symbolOfFirst == symbolOfLast;
        System.out.println(answerOfTwo);

        System.out.println("Введите строку из букв A и B");
        String lineOfThree = sc.nextLine();

        lineOfThree = lineOfThree.replace('A', 'C').replace('B', 'D');
        lineOfThree = lineOfThree.replace('C', 'B').replace('D', 'A');
        System.out.println(lineOfThree);
    }
}
