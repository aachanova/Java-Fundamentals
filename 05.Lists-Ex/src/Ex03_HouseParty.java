import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];

            if (!input[2].equals("not")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                    continue;
                }

                guests.add(name);
            } else {
                if (!guests.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                    continue;
                }

                guests.removeIf(guest -> guest.equals(name));
            }
        }

        guests.forEach(System.out::println);
    }
}
