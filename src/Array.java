import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] rocketTemp = new int[100];
        for (int i = 0; i <= 99; i++) {
            rocketTemp[i] = 10;
        }
        rocketTemp[1] = 0;
        rocketTemp[99] = 0;
        System.out.println(Arrays.toString(rocketTemp));

        int[] rocketSecond = new int[100];
        int sum = 0;

        for (int i = 0; i <= 99; i++) {

            if (i % 10 == 0){
                rocketSecond[i] = 111;
            }
            if (i % 10 == 1) {
                rocketSecond[i] = 222;
            }
            if (i % 10 == 2) {
                rocketSecond[i] = 333;
            }
            if (i % 10 == 3) {
                rocketSecond[i] = 444;
            }
            if (i % 10 == 4) {
                rocketSecond[i] = 555;
            }
            if (i % 10 == 5) {
                rocketSecond[i] = 666;
            }
            if (i % 10 == 6) {
                rocketSecond[i] = 777;
            }
            if (i % 10 == 7) {
                rocketSecond[i] = 888;
            }
            if (i % 10 == 8) {
                rocketSecond[i] = 999;
            }
            if (i % 10 == 9) {
                rocketSecond[i] = 1110;
            }
        }
        for (int i = 0; i <= 99; i++) {
            sum = sum + rocketSecond[i];
        }
        System.out.println(sum);
        }
    }

