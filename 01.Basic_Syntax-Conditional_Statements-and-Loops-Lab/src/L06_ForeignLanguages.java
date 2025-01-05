import java.util.Scanner;

public class L06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String output = "";

        switch (country) {
            case "England", "USA" -> output = "English";
            case "Spain", "Argentina", "Mexico" -> output = "Spanish";
            default -> output = "unknown";
        }

        System.out.println(output);
    }
}
