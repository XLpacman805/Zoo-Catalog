import java.util.*;

public class Elephant extends Herbivore
{
    //default constructor
    Elephant()
    {
        super();
        species = "Elephant";

        //elephant protein supplement defaults to 50
        proteinSupp = 50.0;
    }
    
    //overloaded constructor accepts all attributes
    Elephant(String name, String location, int age, double weight, Health health,
        String favoriteFeed, double dailyVolume, double proteinSupp)
    {
        super(name, location, age, weight, health, favoriteFeed, dailyVolume, 
            proteinSupp);
        species = "Elephant";
    }
}