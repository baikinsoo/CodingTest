import java.util.Scanner;

public class sec1_11 {

    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void sec1_11(String[] args) {
        sec1_11 sec1_11 = new sec1_11();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(sec1_11.solution(next));
    }
}