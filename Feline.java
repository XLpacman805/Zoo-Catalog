import java.util.*;

public class Feline extends Carnivore
{
    //default constructor
    Feline()
    {
        super();
        species = "Feline";
    }

    //overloaded constructor accepts all feline attributes
    Feline(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        species = "Feline";
    }
}
