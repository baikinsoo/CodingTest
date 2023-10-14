import java.util.Scanner;

public class sec1_6 {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }

    public static void sec1_6(String[] args) {
        sec1_6 T = new sec1_6();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(T.solution(next));
    }
}