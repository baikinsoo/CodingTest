import java.util.ArrayList;
import java.util.Scanner;

public class sec1_8 {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String string = new StringBuilder(str).reverse().toString();
        if (str.equals(string)) {
            answer = "YES";
        }
        return answer;
    }

    public static void sec1_8(String[] args) {
        sec1_8 sec1_8 = new sec1_8();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        System.out.println(sec1_8.solution(next));
    }
}