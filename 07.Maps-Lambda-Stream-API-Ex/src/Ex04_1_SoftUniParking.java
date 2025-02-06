import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04_1_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> users = new LinkedHashMap<>();

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] commandInfo = scanner.nextLine().split("\\s+");

            String command = commandInfo[0];
            String name = commandInfo[1];

            switch (command) {
                case "register" -> {
                    String licenseNum = commandInfo[2];

                    if (!users.containsKey(name)) {
                        users.put(name, licenseNum);
                        System.out.printf("%s registered %s successfully%n", name, licenseNum);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licenseNum);
                    }
                }
                case "unregister" -> {
                    if (users.containsKey(name)) {
                        users.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                }
            }
        }

        users.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
