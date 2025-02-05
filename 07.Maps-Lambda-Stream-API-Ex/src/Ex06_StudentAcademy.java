import java.util.*;

public class Ex06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentInformation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentsName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentInformation.putIfAbsent(studentsName, new ArrayList<>());
            studentInformation.get(studentsName).add(grade);
        }
        studentInformation.entrySet().stream().filter(e -> getAverage(e.getValue()) >= 4.50)
                .sorted((a, b) -> Double.compare(getAverage(b.getValue()), getAverage(a.getValue())))
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), getAverage(e.getValue())));
    }

    static double getAverage(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
    }
}
