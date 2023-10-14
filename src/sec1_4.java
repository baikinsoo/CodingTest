import java.util.ArrayList;
import java.util.Scanner;

public class sec1_4 {

    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            //String은 불변이기 때문에 값이 바뀌면 새 객체가 생성되는 것이기 때문에 메모리 낭비가 있다
//            //StringBuilder를 사용하면 같은 메모리를 사용한다.
//            answer.add(tmp);
//        }

        for (String x : str) {
            char[] charArray = x.toCharArray();
            int a = 0;
            int b = x.length()-1;
            while (a < b) {
                char tmp = charArray[a];
                charArray[a] = charArray[b];
                charArray[b] = tmp;
                a++;
                b--;
            }
            String s = String.valueOf(charArray);
            answer.add(s);
        }

        return answer;
    }

    public static void sec1_4(String[] args) {
        sec1_4 T = new sec1_4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
