import java.util.Arrays;
import java.util.Random;

public class Lt2 {
    public static void main(String[] args) {

        Random random = new Random();


        System.out.println("=======================");

        int[] num = new int[6];
        for (int k = 'A'; k <= 'E'; k++) {
            System.out.println((char) k + " 자 동 ");

            for (int i = 0; i < num.length; i++) {
                int temp = (int) (Math.random() * 45) + 1;
                num[i] = temp;


                for (int j = 0; j < i; j++) {
                    if (num[j] == temp) {
                        i--;
                        break;
                    }
                }
            }

            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }

        }
    }
}