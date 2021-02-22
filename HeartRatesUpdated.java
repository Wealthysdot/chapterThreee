package chapterThree;

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
        if (day < 0) {
            isNegativeValueEntered = true;
        } else {
            this.day = day;
        }
    }


    public int getMonthOfBirth() {
        return month;
    }

    public void setMonthOfBirth(int month) {

        if (month < 0) {
            isNegativeValueEntered = true;
        } else {
            this.month = month;
        }
    }



    public int getYearOfBirth() {
        return year;
    }

    public void setYearOfBirth(int year) {
        if (day < 0) {
            isNegativeValueEntered = true;
        } else {
            this.year = year;
        }
    }


    public String toString() {
        String date = year + "/" + month + "/" + day;
        return date;

    }

    public boolean isNegativeValueEntered() {
        return isNegativeValueEntered;
    }


    public String getInputErrorMessage() {
        String messageToReturn = "";
        if (isNegativeValueEntered) {
            messageToReturn = "Please enter a positive number";
        }
        return messageToReturn;

    }

    public void setMonth(int newMonth) {
        if(newMonth > 0 && newMonth < 13){
            this.month = newMonth;}
        else {
            System.out.println("Invalid Month of Birth");
        }
    }
}





