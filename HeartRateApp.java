package chapterThree;


import java.util.Scanner;
import java.util.Date;

public class HeartRateApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        System.out.println("Enter first name:");
        String firstName = input.nextLine();


        System.out.println("Enter last name:");
        String lastName = input.nextLine();


        System.out.println("Enter Day of Birth:");
        int day = input.nextInt();


        System.out.println("Enter month of Birth:");
        int month = input.nextInt();


        System.out.println("Enter year of Birth:");
        int year = input.nextInt();
        if (year >= 2020){
            System.out.println("Year of birth should be less than 2020, input correct year of birth");
        }



        HeartRatesUpdated heartRates = new HeartRatesUpdated(firstName, lastName, day, month,year);




        System.out.println("Name:"+" "+ heartRates.getFirstName() + " "+ heartRates.getLastName());
        System.out.println("Date of Birth:" + " " + heartRates.getDateOfBirth());
        System.out.println("Age:" + " " + heartRates.getAge()+ "years");
        System.out.println("Your Maximum Heart Rate is" + " " + heartRates.calcMaxHeartRate());
        System.out.println("Your Target Heart Rate is in a range of " +heartRates.calcLowerBoundHeartRate() + " and " + heartRates.calcUpperBoundHeartRate());


    }
}
