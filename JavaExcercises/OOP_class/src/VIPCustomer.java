/**
 * Created by piush on 12/03/2017.
 */
public class VIPCustomer {

    private String name;
    private Double creditLimit;
    private String emailAddress;

    public VIPCustomer(){
        this("DefaultName",0.0,"DefaultEmailAddress");

    }

    public VIPCustomer(String name, String emailAddress) {
        this(name,0.0,emailAddress);

    }

    public VIPCustomer(String name, Double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
