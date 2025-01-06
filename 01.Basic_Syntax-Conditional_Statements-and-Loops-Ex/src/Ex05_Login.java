import java.util.Scanner;

public class Ex05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        int counter = 0;
        String input = scanner.nextLine();
        boolean isBlocked = false;

        String password = "";

        for (int i = user.length() - 1; i >= 0; i--) {
            password += user.charAt(i);
        }

        while (!input.equals(password)) {
            counter++;

            if (counter == 4) {
                isBlocked = true;
                System.out.printf("User %s blocked!", user);
                break;
            }

            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();
        }

        if (!isBlocked) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
