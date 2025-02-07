import java.util.*;

public class Ex05_1_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] info = input.split(" : ");

            String course = info[0];
            String student = info[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);

            input = scanner.nextLine();
        }

        courses.forEach((k, v) -> {
            System.out.printf("%s: %s%n", k, v.size());
            v.forEach(s -> System.out.printf("-- %s%n", s));
        });


//        courses.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(e -> {
//                    System.out.printf("%s: %s%n", e.getKey(), e.getValue().size());
//                    e.getValue().stream()
//                            .sorted()
//                            .forEach(s -> System.out.printf("-- %s%n", s));
//                });

//        courses.entrySet().stream()
//                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
//                .forEach(e -> {
//                    System.out.printf("%s: %s%n", e.getKey(), e.getValue().size());
//                    e.getValue().stream()
//                            .sorted()
//                            .forEach(s -> System.out.printf("-- %s%n", s));
//                });
    }
}
