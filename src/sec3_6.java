import java.util.Scanner;

public class sec3_6 {

    public int solution(int n, int m, int[] arr) {

        int answer = 0, lt = 0, cnt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > m) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void sec3_6(String[] args) {
        sec3_6 sec3_6 = new sec3_6();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sec3_6.solution(n, m, arr));
    }
}