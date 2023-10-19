import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sec3_2 {

    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0,p2=0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void sec3_2(String[] args) {
        sec3_2 sec3_2 = new sec3_2();
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
        for (int x : sec3_2.solution(n, m, arr1, arr2)) {
            System.out.print(x+ " ");
        }
    }
}