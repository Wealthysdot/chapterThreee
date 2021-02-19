package chapterThree;

import java.util.Scanner;

public class DateeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Datee dateTest = new Datee(31, 5,1993);

        System.out.println("input month");
        int month = input.nextInt();

        System.out.println("input day");
        int day = input.nextInt();

        System.out.println("input year");
        int year = input.nextInt();



        dateTest.getDisplayDate();

    }
}
