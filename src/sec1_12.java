import java.util.Scanner;

public class sec1_12 {

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

    public static void sec1_12(String[] args) {
        sec1_12 sec1_12 = new sec1_12();
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        String next1 = scanner.next();
        System.out.println(sec1_12.solution(next, next1));

    }
}