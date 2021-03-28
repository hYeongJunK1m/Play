import java.util.Arrays;
import java.util.Random;

public class Lt2 {
    public static void main(String[] args) {

        Random random =  new Random();

        int lotto [] = new int[6];
        int check [] = new int[45];
        System.out.println("=======================");
        for(int k = 'A'; k <= 'E'; k++) {
            System.out.println((char) k + " 자 동 ");
            for(int i = 0; i<lotto.length; i++){
                lotto[i] = (int)(Math.random()*45)+1;
                for(int j = 0; j<i; j++){
                    if(check[lotto[i]]==0){
                        check[lotto[i]]=1;
                    }
                    else
                        i--;
                }

            }

            }
            System.out.println("=======================");
        }
    }

