import java.util.*;

public class Carnivore extends Animal
{
    protected String preferredMeat;
    protected double dailyVolume;

    Carnivore(String name, String location, int age, double weight, String health,
                boolean endangered, String preferredMeat, double dailyVolume)
    {
        super(name, location, age, weight, health, endangered);

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