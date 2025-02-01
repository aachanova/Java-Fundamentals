package Ex02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {

            String[] commandLine = scanner.nextLine().split(": ");
            String command = commandLine[0];
            String info = commandLine[1];

            switch (command) {
                case "Edit" -> article.edit(info);
                case "ChangeAuthor" -> article.changeAuthor(info);
                case "Rename" -> article.rename(info);
            }
        }

        System.out.println(article);
    }
}
