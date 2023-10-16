import java.util.ArrayList;
import java.util.Scanner;

public class sec2_1 {

    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                answer.add(arr[i + 1]);
            }
        }
        return answer;
    }

    public static void sec2_1(String[] args) {
        sec2_1 sec2_1 = new sec2_1();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] ints = new int[num];
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int x : sec2_1.solution(num, ints)) {
            System.out.print(x + " ");
        }
    }
}