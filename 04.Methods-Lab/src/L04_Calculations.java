import java.util.Scanner;

public class L04_Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());

        switch (command){
            case"add" -> add(firstNum,secondNum);
            case"divide" -> divide(firstNum,secondNum);
            case"multiply" -> multiply(firstNum,secondNum);
            case"subtract" -> subtract(firstNum,secondNum);
        }
    }
    static void add(int firstNum,int secondNum){
        System.out.println(firstNum+secondNum);
    }
    static void divide(int firstNum,int secondNum){
        System.out.println(firstNum/secondNum);
    }
    static void multiply(int firstNum,int secondNum){
        System.out.println(firstNum*secondNum);
    }
    static void subtract(int firstNum,int secondNum){
        System.out.println(firstNum-secondNum);
    }
}
