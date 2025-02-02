package Ex04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] info = input.split("\\s+");
            String firstName = info[0];
            String lastName = info[1];
            double grade = Double.parseDouble(info[2]);

            students.add(new Student(firstName, lastName, grade));
        }

        students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .forEach(System.out::println);
    }
}
