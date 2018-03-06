import java.util.*;

public class Herbivore extends Animal
{
    //attributes shared by all herbivores
    protected String favoriteFeed;
    protected double dailyVolume;
    protected double proteinSupp;

    //blank constructor
    Herbivore()
    {
        super();
        setLocalAttributes("None", 0.0, 0.0);
    }

    //overloaded constructor accepts all herbivore attributes
    Herbivore(String name, String location, int age, double weight, String health,
                boolean endangered, String favoriteFeed, double dailyVolume, 
                double proteinSupp)
    {
        
        super(name, location, age, weight, health, endangered);
        setLocalAttributes(favoriteFeed, dailyVolume, proteinSupp);
    }

    //passes animal attributes to base class, sets local attributes
    public void setAllAttributes(String name, String location, int age, double weight, 
                                String health, boolean endangered, String favoriteFeed, 
                                double dailyVolume, double proteinSupp)
    {
        
        super.setAllAttributes(name, location, age, weight, health, endangered);
        setLocalAttributes(favoriteFeed, dailyVolume, proteinSupp);
    }

    //sets specifically herbivore attributes
    private void setLocalAttributes(String favoriteFeed, double dailyVolume, double proteinSupp)
    {
        this.favoriteFeed = favoriteFeed;
        this.dailyVolume = dailyVolume;
        this.proteinSupp = proteinSupp;
    }

    //static function that prints header listing herbivore attribute categories
    public static void printHerbivoreHeader()
    {
        System.out.println("\nHERBIVORES\n");

        printAnimalHeader();

        System.out.printf("%-15s %-14s %-6s", "Favorite Feed",
                            "Daily Volume", "Weekly Protein Supplement"); 
    }

    //prints herbivore attributes
    public void printInfo()
    {   
        super.printInfo();
        System.out.printf("%-15s %-14.1f %-6.1f", favoriteFeed, dailyVolume, 
                            proteinSupp);
    }
}