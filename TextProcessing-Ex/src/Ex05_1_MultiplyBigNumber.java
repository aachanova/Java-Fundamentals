import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05_1_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (input.equals('0') || multiplier == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder output = new StringBuilder();
        int carry = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int digit = input.charAt(i) - '0';
            int product = digit * multiplier + carry;
            output.append(product % 10);
            carry = product / 10;
        }

        if (carry != 0) {
            output.append(carry);
        }

        String outputRes = output.reverse().toString().replaceAll("^0+", "");
        System.out.println(outputRes);

//        List<Integer> digits = input.chars()
//                .map(e -> e - '0')
//                .boxed()
//                .collect(Collectors.toList());
//
//        List<Integer> result = new ArrayList<>(Collections.nCopies(digits.size() + 1, 0));
//        int carry = 0;
//
//        for (int i = digits.size() - 1; i >= 0; i--) {
//            int product = digits.get(i) * multiplier + carry;
//            result.set(i + 1, product % 10);
//            carry = product / 10;
//        }
//
//        result.set(0, carry);
//
//        String output = result.stream()
//                .skip(result.get(0) == 0 ? 1 : 0)
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//
//        System.out.println(output);
    }
}
