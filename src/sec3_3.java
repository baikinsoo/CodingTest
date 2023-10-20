import java.util.Scanner;

public class sec3_3 {

    public int solution(int n, int m, int[] arr) {

        int answer = 0;
        int sum = 0;
        //3개 크기의 window를 생성한다.
        for (int k = 0; k < m; k++) {
            sum += arr[k];
        }
        answer=sum;
        //3 크기의 window를 옮기면서 우측에 새롭게 포함된 값은 더하고, 왼쪽에 이탈된 값은 빼준다.
        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void sec3_3(String[] args) {
        sec3_3 sec3_3 = new sec3_3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sec3_3.solution(n,m,arr));
    }
}