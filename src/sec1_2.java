import java.util.Scanner;

public class sec1_2 {

    public String solution(String str) {

        String answer = "";

        for(char x:str.toCharArray()){
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        sec1_2 T = new sec1_2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
