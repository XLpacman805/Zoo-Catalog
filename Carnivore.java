import java.util.*;

public class Carnivore extends Animal
{
    protected String preferredMeat;
    protected double dailyVolume;

    Carnivore()
    {
        super();
        setLocalAttributes("None", 0.0);
    }

    Carnivore(String name, String location, int age, double weight, String health,
                boolean endangered, String preferredMeat, double dailyVolume)
    {
        
        super(name, location, age, weight, health, endangered);
        setLocalAttributes(preferredMeat, dailyVolume);
    }

    public void setAllAttributes(String name, String location, int age, 
                                    double weight, String health, boolean endangered, 
                                    String preferredMeat, double dailyVolume)
    {
        
        super.setAllAttributes(name, location, age, weight, health, endangered);
        setLocalAttributes(preferredMeat, dailyVolume);
    }

    private void setLocalAttributes(String preferredMeat, double dailyVolume)
    {
        this.preferredMeat = preferredMeat;
        this.dailyVolume = dailyVolume;
    }

    public static void printCarnivoreHeader()
    {
        System.out.println("\nCARNIVORES\n");

        printAnimalHeader();

        System.out.printf("%-16s %-14s", "Preferred Meat", "Daily Volume"); 
    }

    public void printInfo()
    {
        super.printInfo();
        
        System.out.printf("%-16s %-14s", preferredMeat, dailyVolume);
    }
}