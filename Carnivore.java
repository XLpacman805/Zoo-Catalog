import java.util.*;

public class Carnivore extends Animal
{
    //attributes share by all carnivores
    protected String preferredMeat;
    protected double dailyVolume;

    //blank constructor
    Carnivore()
    {
        super();
        setLocalAttributes("None", 0.0);
    }

    //overloaded constructor accepts all carnivore attributes
    Carnivore(String name, String location, int age, double weight, String health,
                boolean endangered, String preferredMeat, double dailyVolume)
    {
        
        super(name, location, age, weight, health, endangered);
        setLocalAttributes(preferredMeat, dailyVolume);
    }

    //passes animal attributes to base class, sets local attributes
    public void setAllAttributes(String name, String location, int age, 
                                    double weight, String health, boolean endangered, 
                                    String preferredMeat, double dailyVolume)
    {
        
        super.setAllAttributes(name, location, age, weight, health, endangered);
        setLocalAttributes(preferredMeat, dailyVolume);
    }

    //sets specifically herbivore attributes
    private void setLocalAttributes(String preferredMeat, double dailyVolume)
    {
        this.preferredMeat = preferredMeat;
        this.dailyVolume = dailyVolume;
    }

    //static function that prints header listing herbivore attribute categories
    public static void printCarnivoreHeader()
    {
        System.out.println("\nCARNIVORES\n");

        printAnimalHeader();

        System.out.printf("%-16s %-14s", "Preferred Meat", "Daily Volume"); 
    }

    //prints herbivore attributes
    public void printInfo()
    {
        super.printInfo();
        
        System.out.printf("%-16s %-14s", preferredMeat, dailyVolume);
    }
}