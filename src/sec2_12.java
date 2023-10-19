import java.util.Scanner;

public class sec2_12 {

    public int solution(int stu, int test, int[][] arr) {

        int answer = 0;

        for (int i = 1; i <= stu; i++) {
            for (int j = 1; j <= stu; j++) {
                int cnt=0;
                for (int k = 0; k < test; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < stu; s++) {
                        if(arr[k][s]==i) pi = s;
                        if(arr[k][s]==j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if (cnt == test) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void sec2_12(String[] args) {
        sec2_12 sec2_12 = new sec2_12();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print(sec2_12.solution(n, m, arr));
    }
}