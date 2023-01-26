import java.nio.file.ReadOnlyFileSystemException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача #1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача #2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName.toUpperCase());
    }
    public static void task3(){
        System.out.println("Задача #3");

        String fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace("ё", "e");
        System.out.println("ФИО сотрудника — " + fullName);
    }
}