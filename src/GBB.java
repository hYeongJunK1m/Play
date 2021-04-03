import java.util.Scanner;

public class GBB {
    public static void main(String[] args) {

        System.out.println("=====가위 바위 보=====");
        System.out.println("    1.주먹 2.가위 3.보");

        int user = 0;
        int com = 0;

        int rd = (int) (Math.random() * 3) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {

            user = sc.nextInt();

            if (rd == 1 && user == 1) {
                System.out.println("무승부");
                continue;
            } else if (rd == 1 && user == 2) {
                System.out.println("User Win");
                continue;
            } else if (rd == 1 && user == 3) {
                System.out.println("Com Win");
                continue;
            }

            if (rd == 2 && user == 2) {
                System.out.println("무승부");
                continue;
            } else if (rd == 2 && user == 3) {
                System.out.println("User Win");
                continue;
            } else if (rd == 2 && user == 1) {
                System.out.println("Com Win");
                continue;
            }

            if (rd == 3 && user == 3) {
                System.out.println("무승부");
                continue;
            } else if (rd == 3 && user == 1) {
                System.out.println("User Win");
                continue;
            } else if (rd == 3 && user == 2) {
                System.out.println("Com Win");
                continue;
            } else {
                System.out.println("게임종료");
                break;
            }
        }
                sc.close();
    }
}
