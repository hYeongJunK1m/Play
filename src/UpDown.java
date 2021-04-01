import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {

        System.out.println("1~100 범위 안의 랜덤 숫자를 20회 안에 맞추세요!");

        int q = 0;
        int chance = 5;

        int rNum = (int)(Math.random()*100) +1;

        Scanner scanner = new Scanner(System.in);

        while(true){

            q = scanner.nextInt();

            chance--;

            System.out.println("남은 횟수 " + chance + "회");

            if(q<rNum){
                System.out.println(q + "보다 UP");
            }
            else if(q>rNum){
                System.out.println(q + "보다 DOWN");
            }
            else if(chance == 0){
                System.out.println("     GAME OVER");
                System.out.println("기회를 모두 사용하였습니다.");
                break;
            }
            else {
                System.out.println("         WIN");
                System.out.println("정답입니다.");
                break;
            }
        }
        scanner.close();
    }
}
