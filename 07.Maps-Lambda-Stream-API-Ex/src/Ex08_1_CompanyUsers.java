import java.util.*;
import java.util.stream.Collectors;

public class Ex08_1_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] info = input.split(" -> ");
            String company = info[0];
            String employeeID = info[1];

            companies.putIfAbsent(company, new ArrayList<>());

            String searchID = companies.get(company).stream()
                    .filter(e -> e.equals(employeeID))
                    .findFirst()
                    .orElse(null);

            if (searchID == null)
                companies.get(company).add(employeeID);

            input = scanner.nextLine();
        }

        companies.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().forEach(empl -> System.out.printf("-- %s%n", empl));
                });
    }
}
