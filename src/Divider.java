import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
                break;
            }
        }
        int deposit = sc.nextInt();
        double persent = sc.nextDouble();
        int year = sc.nextInt();
        double n = (100 + persent) / 100;

        for (int i = 1; i <= year; i++){

            int res = (int)n;
            deposit = deposit + res;
        }
        System.out.println(deposit);
    }
}
