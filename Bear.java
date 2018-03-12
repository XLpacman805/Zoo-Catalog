import java.util.*;

public class Bear extends Canine
{
    //default constructor
    Bear()
    {
        super();
        species = "Bear";
    }
    
    //overloaded constructor accepts all canine attributes
    Bear(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        species = "Bear";
    }
}