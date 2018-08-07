
public class VIPCustomer {
    private String name, email;
    private double creditLimit;


    public VIPCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(){
        this("Placeholder", "placerholder@email.com", 1000.0);
    }

    public VIPCustomer(String name, String email){
        this(name, email, 1000.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
