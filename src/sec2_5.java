import java.util.Scanner;

public class sec2_5 {

    public int solution(int num) {

//        int answer = 0;
//
//        for (int i = 2; i <= num; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                answer++;
//            }
//        }
//        return answer;

        //-------------------------------

        int answer =0;
        int[] ints = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            if (ints[i] == 0) {
                answer++;
                for (int j = i; j <= num; j = j + i) {
                    ints[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void sec2_5(String[] args) {
        sec2_5 sec2_5 = new sec2_5();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        System.out.println(sec2_5.solution(iNum));
    }
}