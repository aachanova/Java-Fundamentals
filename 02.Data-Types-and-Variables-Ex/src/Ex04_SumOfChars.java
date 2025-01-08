import java.util.Scanner;

public class Ex04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lettersCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < lettersCount; i++) {
            char currentLetter = scanner.next().charAt(0);
            sum += currentLetter;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
