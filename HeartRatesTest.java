package chapterThree;


import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HeartRates myRates = new HeartRates();



        System.out.println("Enter first name");
        String name = input.nextLine();
        myRates.setFirstName(name);

        System.out.println("Enter last name");
        String surname = input.nextLine();
        myRates.setLastName(surname);

        System.out.println("Enter Day of Birth");
        int ojo = input.nextInt();
        myRates.setDayOfBirth(ojo);

        System.out.println("Enter month of Birth");
        int osu = input.nextInt();
        myRates.setMonthOfBirth(osu);

        System.out.println("Enter year of Birth");
        int odun = input.nextInt();
        if (odun >= 2020){
            System.out.println("Year of birth should be less than 2020, input correct year of birth");
        }
        myRates.setYearOfBirth(odun);






        System.out.println(myRates.getFirstName() + " "+ myRates.getLastName());
        System.out.println(myRates.DisplayDateOfBirth());
        System.out.println(myRates.getAge());
        System.out.println("Your target heart rate is a range " +myRates.targetHeartRate1() + " and " + myRates.targetHeartRate());


    }
}
