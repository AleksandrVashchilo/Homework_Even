import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int second = 2;
        int remainder = number % second;

        if (remainder != 0) {
            number = number + 1;
            System.out.println("Следующее четное число: " + number);
        }
        else {
            number = number + 2;
            System.out.println("Следующее четное число: " + number);
        }

        int time = sc.nextInt();
        int speed = sc.nextInt();
        int length = sc.nextInt();

        int lengthOfFirst = speed * time;
        int lengthOfSecond = length - lengthOfFirst;

        if (lengthOfFirst < lengthOfSecond) {
            System.out.println("Шерлок Холмс");
        }
        else {
            System.out.println("Мэри");
        }

    }
}
