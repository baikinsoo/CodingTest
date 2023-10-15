import java.util.Scanner;

public class Main {

    public String solution(int num, String str) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String substring = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int i1 = Integer.parseInt(substring, 2);
            answer += (char)i1;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        String next1 = scanner.next();
        System.out.println(main.solution(next, next1));

    }
}