package Ex03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            Person person = new Person(info[0], Integer.parseInt(info[1]));
            people.add(person);
        }

        people.stream()
                .filter(p -> p.getAge() > 30)
                .forEach(System.out::println);

    }
}
