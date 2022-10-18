import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int a = 0;
        while (a < number) {
            a++;
            System.out.println("Я начинаю разбираться с циклами");
            if (a == number) {
                break;
            }
        }
        int numberOfSecond = sc.nextInt();
        int fact = 1;
        int i = 1;

        if (numberOfSecond == 0) {
            System.out.println("Факториал введенного числа равен 1");
        }

        else {

        while (i <= numberOfSecond) {
            fact = fact * i;
            i++;}
            System.out.println("Факториал введенного числа равен: " + fact);
            }
        }

        }



