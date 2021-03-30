

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 세트를 추출하시겠습니까?\n>> ");
        int set = sc.nextInt();
        char cnt = 'A';

        while (set > 0) {

            int[] nums = new int[6];
            for (int i = 0; i < nums.length; i++) {
                int temp = (int) (Math.random() * 45) + 1;
                nums[i] = temp;

                // 중복제거

                for (int j = 0; j < i; j++) {
                    if (nums[j] == temp) {
                        i--;
                        break;
                    }
                }

            } // for end

            System.out.print("\n"+ cnt + " 자 동 " );
            for (int i = 0; i < nums.length; i++) {
                Arrays.sort(nums);
                System.out.print(nums[i] + " ");

            }
            set--;
            cnt++;

        } // while end

        sc.close();
    }

}
