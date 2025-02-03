package Ex06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] info = input.split("\\s+");
            people.add(new Person(info[0], info[1], Integer.parseInt(info[2])));

            input = scanner.nextLine();
        }

        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }
}
