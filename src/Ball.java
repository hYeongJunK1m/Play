import java.util.Random;
import java.util.Scanner;

public class Ball {

    public static void main(String[] args) {

        //랜덤의 술3개를 생성 후 변수에 저장
        int randomA = (int) (Math.random() * 9);
        int randomB = (int) (Math.random() * 9);
        int randomC = (int) (Math.random() * 9);

        //중복을 피하기 위하여 중복되면 다시 랜덤한 숫자를 부여하는 조건문
        while (randomA == randomB || randomB == randomC || randomA == randomC){
            //↑↑ A와 B가 같거나 B와 C가 같으면 부여 프로세스 반복
            randomA = (int) (Math.random() * 9);
            randomB = (int) (Math.random() * 9);
            randomC = (int) (Math.random() * 9);
        }

        System.out.println(randomA + "" + randomB + "" + randomC + "");

        //스트라이크, 볼, 아웃 변수 생성
        int strike = 0;
        int ball = 0;
        int out = 0;

        //입력 메소드 임포트
        Scanner sc = new Scanner(System.in);

        //do{}while문을 사용하여 정답을 맞추지 못할 시 변수의 숫자를 초기화하고, 다시 시도하는 조건 생성
        do {
            //숫자 3개를 입력받는 프로세스
            System.out.print("첫번째 숫자>");
            double num1 = Double.parseDouble(sc.nextLine());
            System.out.print("두번째 숫자>");
            double num2 = Double.parseDouble(sc.nextLine());
            System.out.print("세번째 숫자>");
            double num3 = Double.parseDouble(sc.nextLine());

            //숫자를 초기화
            strike = 0;
            ball = 0;
            out = 0;

            //첫번째 자리의 숫자에 대한 결과를 반영하는 조건 입력
            if (num1 == randomA) {
                strike += 1;
            } else if (num1 == randomB) {
                ball += 1;
            } else if (num1 == randomC) {
                ball += 1;
            } else {
                out += 1;
            }
            //두번쨰 자리
            if (num2 == randomA) {
                ball += 1;
            } else if (num2 == randomB) {
                strike += 1;
            } else if (num2 == randomC) {
                ball += 1;
            } else {
                out += 1;
            }

            //세번째 자리
            if (num3 == randomA) {
                ball += 1;
            } else if (num3 == randomB) {
                ball += 1;
            } else if (num3 == randomC) {
                strike += 1;
            } else {
                out += 1;
            }

            //게임결과 및 초기화, 3스트라이크 시 게임종료 문구 출력
            System.out.println(strike + "스트라이크" + ball + "볼" + out + "아웃");
        } while (strike != 3);

        if (strike == 3) {
            System.out.println("게임 종료");
        }
    }
}