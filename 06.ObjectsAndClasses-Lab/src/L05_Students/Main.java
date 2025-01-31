package L05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] info = input.split("\\s+");
            Student student = new Student(info[0], info[1], Integer.parseInt(info[2]), info[3]);

            students.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        students.forEach(s -> {
            if (s.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", s.getFirstName(), s.getLastName(), s.getAge());
            }
        });
    }
}
