import java.util.Scanner;

public class sec2_2 {

    public int solution(int num, int[] ints) {

//        int answer = 0;
//        int count = 0;
//        int canSee = 1;
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (ints[i] <= ints[j]) {
//                    count = 0;
//                    break;
//                }
//                count = 1;
//            }
//            if (count == 1) {
//                canSee++;
//            }
//            answer = canSee;
//        }
//        return answer;

        //--------------------------------------

        int answer = 0;
        int max = ints[0];
        int count = 1;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                count++;
            }
            answer = count;
        }

        return answer;
    }

    public static void sec2_2(String[] args) {
        sec2_2 sec2_2 = new sec2_2();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] ints = new int[num];
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.print(sec2_2.solution(num, ints));
    }
}