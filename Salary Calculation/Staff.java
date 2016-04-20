
/**
 * Abstract class Staff - Inherits from person
 * 
 * @author Piush
 * @version 2.0, January 2016
 */
public abstract class Staff extends Person {
    public double salary, tax, months, calculatedPay;
    public String name;    
     /*
      * Create a Staff with given data.

    Staff(Double salary, String name, Double tax, Double months, Double calculatedPay)
    {
        this.salary = salary;
        this.salary = salary;
        this.tax = tax;
        this.months = months;
        this.calculatedPay = calculatedPay;
    }

    public void listAll ()    // redefined from "Object"
    {
        System.out.println("Monthly Salary: " + salary + "\n" +
        "Name: " + name + "\n" +
        "Tax Rate: " + tax + "\n" +
        "Months Worked: " + months + "\n" +
        "Calculated Pay: " + calculatedPay);
        
    }
    
    //--------------------------------------//
    
    /**
     * Constructor for staff
     */

    public Staff(String ppsn, String name, double salary) {
        super(ppsn, name);
        this.salary = salary;
    }
    
    /**
     * Setter or Mutator for salary
     */
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    
    /**
     * Method to compute the pay
     */
      public abstract double computePay();

    /**
    * Getter for Salary
    */
    public double getSalary() {
        return salary;
    }
}
