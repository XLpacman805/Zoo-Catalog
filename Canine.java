import java.util.*;

public class Canine extends Carnivore
{
    Canine()
    {
        super();
    }
    
    Canine(String name, String location, int age, double weight, String health,
            boolean endangered, String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, endangered, 
                preferredMeat, dailyVolume);
    }
}