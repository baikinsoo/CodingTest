import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        } //여기까지하면 answer를 위한 HM 완성

        int lt=0;

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int x : main.solution(n, k, ints)) {
            System.out.println(x + " ");

        }
    }
}