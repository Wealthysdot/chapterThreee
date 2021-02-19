package chapterThree;


public class Employee {
    //instance variable
    private String firstName;
    private String lastName;
    private double monthlySalary;

    //constructor
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    //set and get
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    //create method
    private double yearlySalary;

    public double getYearlySalary() {
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    public void increaseSalary() {
        monthlySalary = monthlySalary * 1.1;
    }
}
