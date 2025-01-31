package L04_Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songsCount = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < songsCount; i++) {
            String[] info = scanner.nextLine().split("_");

            String type = info[0];
            String name = info[1];
            String time = info[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            songs.forEach(s -> System.out.println(s.getName()));
        } else {
            songs.forEach(s -> {
                if (s.getTypeList().equals(command)) {
                    System.out.println(s.getName());
                }
            });
        }
    }
}
