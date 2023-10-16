import java.util.Scanner;

public class sec2_7 {

    public int solution(int iNUm, int[] ints) {

        int answer = 0, cnt = 0;

        for (int i = 0; i < iNUm; i++) {
            if (ints[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void sec2_7(String[] args) {
        sec2_7 sec2_7 = new sec2_7();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(sec2_7.solution(iNum, ints));
    }
}