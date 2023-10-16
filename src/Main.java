import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(main.solution(iNum, ints));
    }
}