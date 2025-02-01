package Ex01AdvertisementMessage_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counts = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        Message message = new Message();

        for (int i = 0; i < counts; i++) {
            System.out.printf("%s %s %s - %s\n",
                    message.getPhrases()[random.nextInt(message.getPhrases().length)],
                    message.getEvents()[random.nextInt(message.getEvents().length)],
                    message.getAuthors()[random.nextInt(message.getAuthors().length)],
                    message.getCities()[random.nextInt(message.getCities().length)]);
        }
    }
}
