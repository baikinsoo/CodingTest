import java.util.Scanner;

public class sec3_4 {

    public int solution(int n, int m, int[] arr) {

        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void sec3_4(String[] args) {
        sec3_4 sec3_4 = new sec3_4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sec3_4.solution(n,m,arr));
    }
}