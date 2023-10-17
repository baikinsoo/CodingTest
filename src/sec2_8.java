import java.util.ArrayList;
import java.util.Scanner;

public class sec2_8 {

    public int[] solution(int iNum, int[] ints) {

        int[] answer = new int[iNum];
        int tmp = 1;

        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j < iNum; j++) {
                if (ints[i] < ints[j]) {
                    tmp++;
                }
            }
            answer[i] = tmp;
            tmp = 1;
        }

        return answer;

    }

    public static void sec2_8(String[] args) {
        sec2_8 sec2_8 = new sec2_8();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int x : sec2_8.solution(iNum, ints)) {
            System.out.print(x+" ");
        }

    }
}