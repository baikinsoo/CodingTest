import java.util.ArrayList;
import java.util.Scanner;

public class sec2_6 {

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int num, int[] ints) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {

            int rNum=0;
            while (ints[i] != 0) {
                int tmp = ints[i]%10;
                rNum = rNum * 10 + tmp;
                ints[i] /= 10;
            }
            if (isPrime(rNum)) answer.add(rNum);
        }
        return answer;
    }

    public static void sec2_6(String[] args) {
        sec2_6 sec2_6 = new sec2_6();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int x : sec2_6.solution(iNum, ints)) {
            System.out.print(x + " ");
        }
    }
}