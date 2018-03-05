import java.util.*;

public class Herbivore extends Animal
{
    protected String favoriteFeed;
    protected double dailyVolume;
    protected double proteinSupp;

    Herbivore(String name, String location, int age, double weight, String health,
                boolean endangered, String favoriteFeed, double dailyVolume, 
                double proteinSupp)
    {
        super(name, location, age, weight, health, endangered);

        this.favoriteFeed = favoriteFeed;
        this.dailyVolume = dailyVolume;
        this.proteinSupp = proteinSupp;
    }

    public static void printHerbivoreHeader()
    {
        System.out.println("\nHERBIVORES\n");

        printAnimalHeader();

        System.out.printf("%-15s %-14s %-6s", "Favorite Feed",
                            "Daily Volume", "Weekly Protein Supplement"); 
    }

    public void printInfo()
    {   
        super.printInfo();

        System.out.printf("%-15s %-14.1f %-6.1f", favoriteFeed, dailyVolume, 
                            proteinSupp);
    }
}