import java.util.*;

public class Canine extends Carnivore
{
    //default constructor
    Canine()
    {
        super();
        species = "Canine";
    }
    
    //overloaded constructor accepts all canine attributes
    Canine(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        species = "Canine";
    }

    //calls to print header listing carnivore attribute categories
    public void printHeader()
    {
        super.printHeader();
    }

    //calls to print carnivore attributes
    public void printInfo()
    {
        super.printInfo();
    }
}
