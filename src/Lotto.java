import java.util.Random;


public class Lotto {
    public static void main(String[] args) {

        Random r = new Random();

        int lotto[] = new int[6];
        int check[] = new int[45];
        System.out.println("==================");

        for (int k = 'A'; k <='E'; k++) {
            System.out.println((char) k + " 자 동 ");
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45)+1;

            if(check[lotto[i]]==0){
                check[lotto[i]]=i;
            }
            else
                i--;
        }
    }
    }
}