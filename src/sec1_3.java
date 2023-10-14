import java.util.Scanner;

public class sec1_3 {

    public String solution(String str) {

        String answer = "";

        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
            //마지막 문자이기 때문에 마지막 단어에 대해선 체크를 하지 않기 때문
        }
        return answer;
    }

    public static void main(String[] args) {
        sec1_3 T = new sec1_3();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(T.solution(str));
    }
}
