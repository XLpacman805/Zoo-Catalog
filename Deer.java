import java.util.*;

public class Deer extends Herbivore
{
    //default constructor
    Deer()
    {
        super();
        species = "Deer";
    }

    //overloaded constructor accepts all attributes
    Deer(String name, String location, int age, double weight, Health health,
        String favoriteFeed, double dailyVolume, double proteinSupp)
    {
        super(name, location, age, weight, health, favoriteFeed,
            dailyVolume, proteinSupp);
        species = "Deer";
    }
}