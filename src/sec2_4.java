import java.util.Scanner;

public class sec2_4 {

    public void solution(int num) {

//        int[] answer = new int[num];
//        answer[0] = 1;
//        answer[1] = 1;
//
//        for (int i = 2; i <= num; i++) {
//            answer[i] = answer[i - 2] + answer[i - 1];
//        }
//        return answer;

        int a=1,b=1,c;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void sec2_4(String[] args) {
        sec2_4 sec2_4 = new sec2_4();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        for (int x : sec2_4.solution(num)) {
//            System.out.println(x+" ");
//        }
        sec2_4.solution(num);
    }
}