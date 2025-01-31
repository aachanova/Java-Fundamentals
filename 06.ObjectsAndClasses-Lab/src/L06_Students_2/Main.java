package L06_Students_2;

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

            String firstName = info[0];
            String lastName = info[1];
            int age = Integer.parseInt(info[2]);
            String town = info[3];

            if (students.isEmpty() || notExisting(firstName, lastName, students)) {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            } else {
                setAgeAndTown(firstName, lastName, age, town, students);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        students.forEach(s -> {
            if (s.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", s.getFirstName(), s.getLastName(), s.getAge());
            }
        });
    }

    private static void setAgeAndTown(String firstName, String lastName, int age, String town, List<Student> students) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                s.setAge(age);
                s.setHomeTown(town);
            }
        }
    }

    private static boolean notExisting(String firstName, String lastName, List<Student> students) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return false;
            }
        }

        return true;
    }
}
