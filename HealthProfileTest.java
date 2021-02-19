package chapterThree;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HealthProfile myProfile = new HealthProfile();


        System.out.println("Enter first name");
        String theFirstName = input.next();
        myProfile.setFirstName(theFirstName);

        System.out.println("Enter last name");
        String theLastName  = input.next();
        myProfile.setLastName(theLastName);

        System.out.println("Indicate gender (M - Male, F - Female");
        char theGender  = input.next().charAt(0);
        myProfile.setGender(theGender);

        System.out.println("Enter Day of Birth");
        int theBirth  = input.nextInt();
        myProfile.setDayOfBirth(theBirth);

        System.out.println("Enter month of Birth");
        int theMonth  = input.nextInt();
        myProfile.setMonthOfBirth(theMonth);

        System.out.println("Enter Year of Birth");
        int theYear  = input.nextInt();
        myProfile.setYearOfBirth(theYear);

        System.out.println("Enter Height in meters");
        double theHeight  = input.nextDouble();
        myProfile.setHeight(theHeight);

        System.out.println("Enter Weight in kilogram");
        double theWeight  = input.nextDouble();
        myProfile.setWeight(theWeight);


        System.out.println("Name -" + myProfile.getFirstName() +" "+ myProfile.getLastName());
        myProfile.getGender();
        System.out.println("Date of Birth -" + myProfile.DisplayDateOfBirth());
        System.out.println("Age -" + myProfile.getAge());
        System.out.println("Height -" + myProfile.getHeight());
        System.out.println("Weight -" + myProfile.getWeight());
        myProfile.getBMI();
        System.out.println("Your Maximum Heart rate is" +" "+ myProfile.getMaximumHeartRate());
        System.out.println("Your Target heart rate is in the range of" +" "+ myProfile.lowerBoundTargetHeartRate() +" "+ " and " + myProfile.upperBoundTargetHeartRate());

    }
}
