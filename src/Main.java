import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

    public ArrayList<Integer> solution(int[] ints) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int x : ints) {
            int tmp = x;
            int newNum = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                newNum = newNum * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(newNum)) {
                answer.add(newNum);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int x : main.solution(ints)) {
            System.out.print(x + " ");
        }
    }
}