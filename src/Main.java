import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName + " " + firstName + " " + middleName);
        System.out.println(fullName);

        System.out.println("Задание 2");
        System.out.println();

        String upperCase = fullName.toUpperCase();
        System.out.println(upperCase);
    }
}