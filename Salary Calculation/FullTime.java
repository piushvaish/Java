
/**
 * class FullTime for calculating the pay.
 * 
 * @author Piush Vaish
 * @version 2.0, January 2016
 */
public class FullTime extends Staff
{
    public double tax;
    
    /**
     * Create a customer
     */

    public FullTime(String ppsn, String name, double salary, double months, double tax) {
        super(ppsn, name, salary);
        this.tax = tax;
        this.months = 12;
    }
            
            /**
             * Setter for Tax
             */
    public void setTax(double newTaxRate) {
        newTaxRate = 40.0;
        tax = newTaxRate;
    }
    
    /**
     * Override the method
     */

    public double computePay(){
        //Calculate the annual salary
        double totalSalary = salary * months;
        //Net pay after tax
        double usc = 0.0;
        
        if(totalSalary <= 10000) {
            usc = totalSalary - (.02 * totalSalary);
        } else {
            usc = totalSalary - (((totalSalary - 10000) * .04) + (10000 * .02));
        }
        double permananentAnnualSalary = usc - (usc * tax/100);

        return permananentAnnualSalary;
    }
}
