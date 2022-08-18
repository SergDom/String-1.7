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

        System.out.println("Задание 3");
        System.out.println();

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);


        System.out.println("Задание 4");
        System.out.println();

        String fullName3 = "Ivanov Ivan Ivanovich";

        String lastname3 = fullName3.substring (0, fullName3.indexOf(" "));
        System.out.print("Фамилия сотрудника — " + lastname3);
        System.out.println();
        String firstname3 = fullName3.substring (7, 11);
        System.out.print("Имя сотрудника — " + firstname3);
        System.out.println();
        String middleName3 = fullName3.substring (12, fullName3.lastIndexOf(""));
        System.out.print("Отчество сотрудника — " + middleName3);

//        StringBuilder lastName3 = new StringBuilder(fullName3)
//                int = sb.substring(0, sb.indexOf(" "));




    }
}