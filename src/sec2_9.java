import java.util.Scanner;

public class sec2_9 {

    public int solution(int iNum, int[][] ints) {

        int answer = 0;
        int sum1, sum2;

        for (int i = 0; i < iNum; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < iNum; j++) {
                sum1 += ints[i][j];
                sum2 += ints[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        for (int i = 0; i < iNum; i++) {
            sum1 += ints[i][i];
            sum2 += ints[i][iNum - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void sec2_9(String[] args) {
        sec2_9 sec2_9 = new sec2_9();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[][] ints = new int[iNum][iNum];
        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j < iNum; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
        System.out.println(sec2_9.solution(iNum, ints));
    }
}