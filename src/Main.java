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
        String firstname3 = fullName3.substring (fullName3.indexOf(" "), fullName3.lastIndexOf(" "));
        System.out.print("Имя сотрудника — " + firstname3);
        System.out.println();
        String middleName3 = fullName3.substring (fullName3.lastIndexOf(" "));
        System.out.print("Отчество сотрудника — " + middleName3);






        System.out.println();
        System.out.println("Задание 5");
        System.out.println();


        String oneThreeFive = "135";
        String twoFourSix = "246";

        char one = oneThreeFive.charAt(0);
        char three = oneThreeFive.charAt(1);
        char five= oneThreeFive.charAt(2);

        char two = twoFourSix.charAt(0);
        char four = twoFourSix.charAt(1);
        char six = twoFourSix.charAt(2);

//        String oneTwoThree = String.valueOf(one + two + three);
//        System.out.print(oneTwoThree);




    }
}