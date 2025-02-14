import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex02_1_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        char[] first = input.getFirst().toCharArray();
        char[] second = input.getLast().toCharArray();
        int sum = 0;

        if (first.length < second.length) {
            sum = getSumOfBothStrings(first, sum, second);
            sum = getSumOfLongerString(input.getLast(), first.length, sum);
        } else {
            sum = getSumOfBothStrings(second, sum, first);
            sum = getSumOfLongerString(input.getFirst(), second.length, sum);
        }

        System.out.println(sum);
    }

    private static int getSumOfLongerString(String longer, int shorterLength, int sum) {
        String longerStr = longer.substring(shorterLength);
        for (char ch : longerStr.toCharArray()) {
            sum += ch;
        }

        return sum;
    }

    private static int getSumOfBothStrings(char[] shorter, int sum, char[] longer) {
        for (int i = 0; i < shorter.length; i++) {
            sum += shorter[i] * longer[i];
        }
        return sum;
    }
}
