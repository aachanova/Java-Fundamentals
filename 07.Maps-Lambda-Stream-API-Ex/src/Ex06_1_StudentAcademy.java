import java.util.*;

public class Ex06_1_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.entrySet().stream()
                .filter(e -> getAvgGrade(e.getValue()) >= 4.50)
                .forEach((s -> System.out.printf("%s -> %.2f%n", s.getKey(), getAvgGrade(s.getValue()))));

//        students.entrySet().stream()
//                .filter(e -> getAvgGrade(e.getValue()) >= 4.50)
//                .sorted((a, b) -> Double.compare(getAvgGrade(b.getValue()), getAvgGrade(a.getValue())))
//                .forEach((s -> System.out.printf("%s -> %.2f%n", s.getKey(), getAvgGrade(s.getValue()))));
    }

    private static double getAvgGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow();
    }
}

