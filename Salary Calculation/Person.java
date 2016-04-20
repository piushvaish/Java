
/**
 * A person class for the assignment
 * 
 * @author Piush
 * @version 2.0, January 2016
 */
public abstract class Person
{
    public String ppsn;//PPS NUmber
    public String name;//Name

    /**
     * Create a customer /Constructor with given values
     */
    public Person(String ppsn, String name) {
        this.ppsn = ppsn;
        this.name = name;
    }

    /**
     * Access the PPS Number
     */
    public String getPpsn() {
        return ppsn;
    }

    /**
     * Access the name
     */
    public String getName() {
        return name;
    }
}
