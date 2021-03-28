import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        int Lotto[] = new int[6];

        System.out.println("==================");

        for (int i = 0; i < Lotto.length; i++) {
            Lotto[i] = (int) (Math.random() * 45) + 1;

        }
        for (int i = 0; i < Lotto.length; i++) {
            System.out.println(Lotto[i]);
        }
        Arrays.sort(Lotto);
        System.out.println(" 입니다.");
    }
}