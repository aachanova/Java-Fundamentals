import java.util.Scanner;

public class Ex03_ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String file = input.substring(input.lastIndexOf("\\") + 1);

        System.out.printf("File name: %s%nFile extension: %s", file.substring(0, file.indexOf(".")), file.substring(file.indexOf(".") + 1));
    }
}
