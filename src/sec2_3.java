import java.util.ArrayList;
import java.util.Scanner;

public class sec2_3 {

    public ArrayList<String> solution(int num, int[] ints, int[] ints2) {

        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (ints[i] == ints2[i]) {
                answer.add("D");
            } else if (ints[i] == 1 && ints2[i] == 3) {
                answer.add("A");
            } else if (ints[i] == 2 && ints2[i] == 1) {
                answer.add("A");
            } else if (ints[i] == 3 && ints2[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }

        }
        return answer;
    }

    public static void sec2_3(String[] args) {
        sec2_3 sec2_3 = new sec2_3();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] ints = new int[num];
        int[] ints2 = new int[num];
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            ints2[i] = scanner.nextInt();
        }
        for (String x : sec2_3.solution(num,ints,ints2)) {
            System.out.println(x);
        }
    }
}