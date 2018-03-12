import java.util.*;

public class Tiger extends Feline implements Endangered
{
    protected String healthCheckFreq;

    //default constructor
    Tiger()
    {
        super();
        healthCheckFreq = "3 Days";
        species = "Tiger";
    }

    //overloaded constructor accepts all feline attributes
    Tiger(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        healthCheckFreq = "3 Days";
        species = "Tiger";
    }

    //endangered function definitions
    public void setHealthCheckFreq(String x)
    {
        healthCheckFreq = x;
    }

    //endangered function definitions

    //function that prints header listing endangered attribute categories
    public void printHeader()
    {
        super.printHeader();
        System.out.printf("%-16s", "Health Check Frequency"); 
    }

    //prints endangered attributes
    public void printInfo()
    {
        super.printInfo();
        System.out.printf("%-16s", healthCheckFreq);
    }
}