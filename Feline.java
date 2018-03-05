import java.util.*;

public class Feline extends Carnivore
{
    Feline(String name, String location, int age, double weight, String health,
            boolean endangered, String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, endangered, 
                preferredMeat, dailyVolume);
    }
}