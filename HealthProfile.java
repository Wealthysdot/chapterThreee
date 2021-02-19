package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;
    private char gender;

//    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, int presentYear, double height, double weight) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.dayOfBirth = dayOfBirth;
//        this.monthOfBirth = monthOfBirth;
//        this.yearOfBirth = yearOfBirth;
//        this.height = height;
//        this.weight = weight;
//    }

    public HealthProfile() {

    }

//    public HealthProfile(String firstName) {
//    }


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

    public void getGender() {
    }

    public void setGender(char gender) {
        if (gender == 'F'){
            System.out.println("Female");
        }

        if (gender == 'M'){
            System.out.println("Male");
        }
    }

//    public int getDayOfBirth() {
//        return dayOfBirth;
//    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

//    public int getMonthOfBirth() {
//        return monthOfBirth;
//    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

//    public int getYearOfBirth() {
//        return yearOfBirth;
//    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String DisplayDateOfBirth(){
        return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    public int getAge() {
        int presentYear = 2020;
        return presentYear - yearOfBirth;
    }

    public int getMaximumHeartRate() {
        int maximumHeartRate;
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }

    public int upperBoundTargetHeartRate() {
        return (80 * getMaximumHeartRate()) / 100;
    }

    public int lowerBoundTargetHeartRate() {
        return (50 * getMaximumHeartRate()) / 100;
    }

    public void getBMI() {
        double BMI;
        BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.printf ("BMI is %.2f %s%n", BMI, "You are Underweight");

        }

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf ("BMI is %.2f %s%n", BMI, "You are Normal");
        }

        if (BMI > 25 && BMI <= 29.9) {
            System.out.printf ("BMI is %.2f %s%n", BMI, "You are Overweight");
        }

        if (BMI >= 30) {
            System.out.printf("BMI is %.2f %s%n", BMI, "You are Obese");
        }
    }
}
