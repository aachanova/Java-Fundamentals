import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08_SantaSecretHelper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        List<String> output = new ArrayList<>();
        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                text.append(Character.valueOf((char) (input.charAt(i) - key)));
            }
            Pattern pattern = Pattern.compile("@([A-Za-z]+)[^-@:>!]+?!(G)!");
            Matcher matcher = pattern.matcher(String.valueOf(text));
            while (matcher.find()) {
                output.add(matcher.group(1));
            }
        }
        output.forEach(System.out::println);
    }
}
