import java.util.Scanner;

public class sec1_9 {

    public int solution(String s) {

//        int answer = 0;
//        String s1 = s.replaceAll("[^0-9]", "");
//        if (s1.charAt(0) == '0') {
//            answer = s1.substring(1);
//        } else {
//            answer = s1;
//        }
//        return answer;
        // 이건 숫자를 뽑은게 아니라 문자열을 뽑은거다...

//        char[] charArray = s.toCharArray();
//        for (char x : charArray) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }
//        return answer;

        //---------------

        String s1 = s.replaceAll("[^0-9]", "");

        return Integer.parseInt(s1);
    }

    public static void sec1_9(String[] args) {
        sec1_9 sec1_9 = new sec1_9();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sec1_9.solution(s));
    }
}