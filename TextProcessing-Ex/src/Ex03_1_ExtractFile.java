import java.util.Scanner;

public class Ex03_1_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        String fileName = path.substring(path.lastIndexOf('\\') + 1, path.lastIndexOf('.'));
        String extension = path.substring(path.lastIndexOf('.') + 1);

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
