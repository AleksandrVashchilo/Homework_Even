import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double sum = 0;

        for (double i = 1.0; i <= number; i++){
            sum = sum + 1 / i;
        }
        System.out.println(sum);

        int n = sc.nextInt();
        int ante = 0;
        while (n != 0){
           ante += (n % 10);
           n/=10;
        }
        System.out.println(ante);

    }
}
