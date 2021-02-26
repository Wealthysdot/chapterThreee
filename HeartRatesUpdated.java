package chapterThree;

import java.time.LocalDate;

public class HeartRatesUpdated {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private boolean isNegativeValueEntered;



    public HeartRatesUpdated(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {


        return day;
    }

    public void setDayOfBirth(int day) {
        if (day < 0 || day > 31) {
            isNegativeValueEntered = true;
        } else {
            this.day = day;
        }
    }


    public int getMonthOfBirth() {
        return month;
    }

    public void setMonthOfBirth(int month) {

        if (month < 0 || month > 12) {
            isNegativeValueEntered = true;

        } else {
            this.month = month;
        }
    }



    public int getYearOfBirth() {
        return year;
    }

    public void setYearOfBirth(int year) {
        if ( year < 1800) {
            isNegativeValueEntered = true;
        } else {
            this.year = year;
        }
    }


    public String getDateOfBirth() {
        String date = year + "/" + month + "/" + day;
        return date;

    }
    public boolean isNegativeValueEntered() {
        return isNegativeValueEntered;
    }
    public String getInputErrorMessage() {
        String messageToReturn = "";
        if (isNegativeValueEntered) {
            messageToReturn = "Invalid input";
        }
        return messageToReturn;

    }

//using import java.time.LocalDate; to get present year
    public int getAge() {
        int age = LocalDate.now().getYear() - getYearOfBirth();
        return age;
    }

    public double calcMaxHeartRate() {
        return 220 - (getAge());
    }
    public double calcLowerBoundHeartRate() {
        return (50 * calcMaxHeartRate()) /100;
    }

    public double calcUpperBoundHeartRate() {
        return (80 * calcMaxHeartRate())/100;
    }
}





