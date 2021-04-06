import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        System.out.println("ZERO GAME");

        int us = 0;
        int cp = 0;

        Scanner scn = new Scanner(System.in);

        while (true) {

            us = scn.nextInt();

            int ran = (int)(Math.random()*4);

            if (us == 0 && ran == 0){
                System.out.println("0 맞췄습니다.");
                break;
            }
            else if( us == 1 && ran == 1){
                System.out.println("1 맞췄습니다.");
                break;
            }
            else if( us == 2 && ran == 2){
                System.out.println("2 맞췄습니다.");
                break;
            }
            else if( us == 3 && ran == 3){
                System.out.println("3 맞췄습니다.");
                break;
            }
            else{
                System.out.println("다시");
            }
            //휴...과제 뒤지게 많네 진짜 졸업 과제는 할 수 있으려나
        }
    }
}
