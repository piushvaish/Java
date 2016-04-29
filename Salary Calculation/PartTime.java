
/**
 * Class PartTime for computing the pay
 * 
 * @author Piush 
 * @version 2.0, January 2016
 */
public class PartTime extends Staff
{
    public double months;//months worked
    public double tax;//tax paid
    public double expenses;//expenses spent
    
    /**
     * Constructor for Partime Staff / Create with given values
     */
    public PartTime(String ppsn, String name, double salary, double months, double expenses, double tax) {
        super(ppsn, name, salary);
        this.months = months;
        this.expenses = expenses;
        this.tax = tax;
    }
    
    /**
     * Setter
     */
    public void setTax(double newTaxRate){
        newTaxRate = 25.0;
        tax = newTaxRate;
    }

    /**
     * Accessor
     */
    public double getMonths() {
        return months;
    }
    
    /**
     * Override the method
     */
    public double computePay(){
        //calculate the gross pay
        double totalPay = (salary * months) + expenses;
        //net pay after tax
        double partTimeAnnualSalary = (totalPay) - ((tax /100) * totalPay);
        return partTimeAnnualSalary;
    }
}
