import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();

        //포인터를 사용하여 푸는 알고리즘... 위치(포인터를 변수로 생성) 후 해당 위치 지정 후 비교
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
            } else {
                answer.add(arr2[p2]);
                p2++;
            }
        }
        while (p1 < n) {
            answer.add(arr1[p1]);
            p1++;
        }
        while (p2 < m) {
            answer.add(arr2[p2]);
            p2++;
        }
        return answer;
    }

    public static void Main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int x : main.solution(n, m, arr1, arr2)) {
            System.out.print(x+ " ");
        }
    }
}