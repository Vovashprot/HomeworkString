import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    task1();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваше имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите ваше отчество");
        String middleName = scanner.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

    }
}