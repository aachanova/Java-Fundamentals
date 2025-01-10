import java.util.Arrays;
import java.util.Scanner;

public class MoreEx01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] outputArr = new int[n];

        for (int i = 0; i < n; i++) {
            char[] str = scanner.nextLine().toCharArray(); // vowels: a, e, i, o, u
            int sum = 0;

            for (char ch : str) {
                switch (ch) {
                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> sum += ch * str.length;
                    default -> sum += ch / str.length;
                }
            }

            outputArr[i] = sum;        }

        Arrays.sort(outputArr);
        for (int item : outputArr) {
            System.out.println(item);
        }
    }
}
