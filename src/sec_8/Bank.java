import java.util.ArrayList;
import java.util.Arrays;

class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();


    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void addCustomer(Branch branch, Customer customer, double initial){
        if (branches.contains(branch)){
            branch.addCustomer(customer, initial);
        } else {
            System.out.println("Bank does not contains that branch");
        }
    }

    public void addTransaction(Branch branch, Customer customer, double amount){
        if (branches.contains(branch)){
            branch.addTransaction(customer, amount);
        } else {
            System.out.println("Bank does not contains that branch");
        }
    }

    public void printBranches(){
        for (Branch branch : branches){
            System.out.println(branch);
        }
    }

    public static void main(String args[]){
        Bank myBank = new Bank();
        Branch myBranch = new Branch();
        myBank.addBranch(myBranch);
        Customer larry = new Customer("Larry");
        Customer bob = new Customer("Bob");
        Customer michelle = new Customer("Michelle");
        myBranch.addCustomer(larry, 200.00);
        myBranch.addCustomer(michelle, 350.00);
        myBranch.addCustomer(bob, 1.00);
        bob.addTransaction(200.00);
        michelle.addTransaction(-200.00);
        myBank.printBranches();
    }


}

class Branch{
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch() {

    }

    public void addCustomer(Customer newCustomer, double initial){
        customers.add(newCustomer);
        newCustomer.addTransaction(initial);
    }

    public void addTransaction(Customer customer, double amount){
        if (customers.contains(customer)) {
            customer.addTransaction(amount);
        } else {
            System.out.println("Customer does not exist in branch!");
        }
    }

    public void printCustomers(){
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }

    @Override
    public String toString() {
        Customer output[] = new Customer[customers.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = customers.get(i);
        }
        return Arrays.toString(output);
    }
}

class Customer {

    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public double getNetworth(){
        double amount = 0;
        for (double transaction : transactions){
            amount += transaction;
        }
        return amount;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Net worth: " + this.getNetworth();
    }
}
