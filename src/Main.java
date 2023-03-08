import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }
    public static void task1() {
        System.out.println("Task1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваше имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите ваше отчество");
        String middleName = scanner.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
    public static void task2() {
        System.out.println("Task2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваше имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите ваше отчество");
        String middleName = scanner.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника — " + fullName.toUpperCase());

    }
    public static void task3() {
        System.out.println("Task3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите ваше имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите ваше отчество");
        String middleName = scanner.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));

    }
}