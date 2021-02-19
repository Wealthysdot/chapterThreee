package chapterThree;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

//    public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, int presentYear) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dayOfBirth = dayOfBirth;
//        this.monthOfBirth = monthOfBirth;
//        this.yearOfBirth = yearOfBirth;
//
//    }

    public HeartRates (){

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

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    public String DisplayDateOfBirth(){
        return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    public int getAge() {
        int presentYear = 2020;
        return presentYear - yearOfBirth;
    }

    public int MaximumHeartRate(){
        return 220 - getAge();
    }

    public int targetHeartRate(){
        return 220 - ((50 * MaximumHeartRate()) / 100);
    }
    public int targetHeartRate1(){
        return 220 - ((80 * MaximumHeartRate()) / 100);
    }




}

