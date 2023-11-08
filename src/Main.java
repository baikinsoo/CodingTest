import java.util.Arrays;
import java.util.Scanner;

class Main {

    public int count(int[] arr, int capacity) {

        int cnt = 1;
        int point = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - point >= capacity) {
                cnt++;
                point = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {

        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= m) {
                answer = mid;
                rt = mid - 1;

            } else {
                lt = mid + 1;

            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(main.solution(a, b, arr));
    }
}