import java.util.*;

public class Wolf extends Canine implements Endangered
{
    protected String healthCheckFreq;

    //default constructor
    Wolf()
    {
        super();
        healthCheckFreq = "3 Days";
        species = "Wolf";
        preferredMeat = "Mutton";
    }
    
    //overloaded constructor accepts all canine attributes
    Wolf(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        healthCheckFreq = "3 Days";
        species = "Wolf";
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