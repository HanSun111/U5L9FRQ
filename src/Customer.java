/**
 * The following class represents a customer. The variable name represents the name of the customer, and
 * the variable currAccNum represents the customer’s account number. Each time a Customer object
 * is created, the static variable nextAccNum is used to assign the customer’s account number.
 */
public class Customer
{
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n)
    {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String toString(double amountDue){
        return name + ", account number " + currAccNum + ", please play $" + amountDue;
    }
}