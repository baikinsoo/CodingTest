import java.util.Scanner;

public class Main {

    public int[] quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return data;
        }

        int key = start;
        int i = start + 1, j = end, temp;

        while (i <= j) {
            while (i <= end && data[i] >= data[key]) {
                i++;
            }
            while (j > start && data[j] <= data[key]) {
                j--;
            }
            if (i > j) {
                // Swap data[key] and data[j] using temp variable
                temp = data[key];
                data[key] = data[j];
                data[j] = temp;
            } else {
                // Swap data[i] and data[j] using temp variable
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);

        return data;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        int[] ints = new int[iNum];
        for (int i = 0; i < iNum; i++) {
            ints[i] = scanner.nextInt();
        }
        int[] sortedArray = main.quickSort(ints, 0, iNum - 1);
        for (int x : sortedArray) {
            System.out.print(x + " ");
        }
    }
}
