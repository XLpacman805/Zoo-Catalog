import java.util.*;

public class Lion extends Feline
{
    //default constructor
    Lion()
    {
        super();
        species = "Lion";
    }

    //overloaded constructor accepts all feline attributes
    Lion(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, preferredMeat, dailyVolume);
        species = "Lion";
    }
}