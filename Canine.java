import java.util.*;

public class Canine extends Carnivore
{
    //blank constructor
    Canine()
    {
        super();
    }
    
    //overloaded constructor accepts all canine attributes
    Canine(String name, String location, int age, double weight, Health health,
        boolean endangered, String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, endangered, preferredMeat, 
            dailyVolume);
    }
}