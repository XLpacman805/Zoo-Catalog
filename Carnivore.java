import java.util.*;

public class Carnivore extends Animal
{
    //attributes shared by all carnivores
    protected String preferredMeat;
    protected double dailyVolume;

    //default constructor
    Carnivore()
    {
        super();
        species = "Carnivore";

        //default attributes for carnivores
        setLocalAttributes("Beef", 3.0);
    }

    //overloaded constructor accepts all carnivore attributes
    Carnivore(String name, String location, int age, double weight, Health health,
        String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health);
        species = "Carnivore";

        setLocalAttributes(preferredMeat, dailyVolume);
    }

    //passes animal attributes to base class, sets local attributes
    public void setAllAttributes(String name, String location, int age, 
        double weight, Health health, String preferredMeat, double dailyVolume)
    {
        super.setAllAttributes(name, location, age, weight, health);
        setLocalAttributes(preferredMeat, dailyVolume);
    }

    //sets specifically herbivore attributes
    private void setLocalAttributes(String preferredMeat, double dailyVolume)
    {
        this.preferredMeat = preferredMeat;
        this.dailyVolume = dailyVolume;
    }

    //function that prints header listing herbivore attribute categories
    public void printHeader()
    {
        super.printHeader();
        System.out.printf("%-16s %-14s", "Preferred Meat", "Daily Volume"); 
    }

    //prints herbivore attributes
    public void printInfo()
    {
        super.printInfo();
        System.out.printf("%-16s %-14s", preferredMeat, dailyVolume);
    }
}
