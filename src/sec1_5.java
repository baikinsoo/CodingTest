import java.util.Scanner;

public class sec1_5 {

    public String solution(String str) {

        String answer = "";

        char[] charArray = str.toCharArray();

        int a = 0, b = charArray.length-1;
        while (a < b) {
            if (Character.isLetter(charArray[a])) {
                if (Character.isLetter(charArray[b])) {
                    char tmp = charArray[a];
                    charArray[a] = charArray[b];
                    charArray[b] = tmp;
                    a++;
                    b--;
                } else {
                    b--;
                }
            } else {
                a++;
            }
            String s = String.valueOf(charArray);
            answer = s;
        }
        return answer;
    }

    public static void sec1_5(String[] args) {
        sec1_5 sec1_5 = new sec1_5();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(sec1_5.solution(next));
    }
}