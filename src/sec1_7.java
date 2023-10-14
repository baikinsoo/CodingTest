import java.util.Scanner;

public class sec1_7 {

    public String solution(String str) {
//        String answer = "";
//
//        String lowerNext = next.toLowerCase();
//        char[] charArray = lowerNext.toCharArray();
//        int startNum = 0;
//        int endNum = lowerNext.length() - 1;
//        while (startNum < endNum) {
//            if (charArray[startNum] == charArray[endNum]) {
//                startNum++;
//                endNum--;
//            } else {
//                answer = "NO";
//                break;
//            }
//            answer = "YES";
//        }
//        return answer;

        //------------------------------------------

//        String answer = "YES";
//
//        String lowerStr = str.toLowerCase();
//        int len = lowerStr.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (lowerStr.charAt(i) != lowerStr.charAt(len)) {
//                answer = "NO";
//                break;
//            }
//        }
//
//        return answer;

        //---------------------------------------
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;

    }

    public static void sec1_7(String[] args) {
        sec1_7 sec1_7 = new sec1_7();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(sec1_7.solution(next));
    }
}