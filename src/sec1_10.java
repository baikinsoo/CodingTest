import java.util.Scanner;

public class sec1_10 {

    public int[] solution(String s,char c) {
        int[] answer=new int[s.length()];
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==c) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void sec1_10(String[] args) {
        sec1_10 sec1_10 = new sec1_10();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = scanner.next().charAt(0);
        for (int x : sec1_10.solution(s, c)) {
            System.out.print(x+" ");
        }
    }
}