import java.util.Scanner;

public class sec3_5 {

    public int solution(int n) {

        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }

    public static void sec3_5(String[] args) {
        sec3_5 sec3_5 = new sec3_5();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sec3_5.solution(n));
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//    public int solution(int n) {
//
//        int answer = 0, cnt = 1;
//
//        n--;
//        while (n > 0) {
//            cnt++;
//            n = n - cnt;
//            if (n % cnt == 0) {
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(main.solution(n));
//    }
//}