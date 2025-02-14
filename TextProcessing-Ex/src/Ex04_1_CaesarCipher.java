import java.util.Scanner;

public class Ex04_1_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input
                .chars()
                .mapToObj(c -> (char) (c + 3))
                .forEach(System.out::print);

//        char[] input = scanner.nextLine().toCharArray();
//        StringBuilder output = new StringBuilder();
//
//        for (char ch : input) {
//            output.append((char) (ch + 3));
//        }
//
//        System.out.println(output);
    }
}
