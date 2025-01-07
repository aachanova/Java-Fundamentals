import java.util.Scanner;

public class MoreEx02_EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String name = "";

        switch (lastDigit) {
            case 0 -> name = "zero";
            case 1 -> name = "one";
            case 2 -> name = "two";
            case 3 -> name = "three";
            case 4 -> name = "four";
            case 5 -> name = "five";
            case 6 -> name = "six";
            case 7 -> name = "seven";
            case 8 -> name = "eight";
            case 9 -> name = "nine";
        }

        System.out.println(name);
    }
}
