import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx01_1_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scanner.nextLine();

        List<Character> textArr = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            int index = sumDigits(number) % textArr.size();
            System.out.print(textArr.remove(index));
        }
//        for (int i = 0; i < numbers.size(); i++) {
//            int index = sumDigits(numbers.get(i)) % textArr.size();
//            System.out.print(textArr.remove(index));
//        }
    }

    private static int sumDigits(Integer num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }
}
