import java.util.Scanner;

public class Main {

    public int solution(int iNum, int[][] ints) {

        int answer = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j < iNum; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < iNum && ny >= 0 && ny < iNum && ints[nx][ny] >= ints[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[][] ints = new int[iNum][iNum];
        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j < iNum; j++) {
                ints[i][j] = scanner.nextInt();
            }
        }
        System.out.println(main.solution(iNum, ints));
    }
}