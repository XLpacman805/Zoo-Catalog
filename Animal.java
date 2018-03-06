import java.util.*;

public class Animal
{
    protected String name;
    protected String location;
    protected int age;
    protected double weight;
    protected String health;
    protected boolean endangered;

    Animal()
    {
        setAllAttributes("None", "None", 0, 0.0, "None", false);
    }

    Animal(String name, String location, int age, double weight, String health, 
            boolean endangered)
    {
        setAllAttributes(name, location, age, weight, health, endangered);
    }

    public void setAllAttributes(String name, String location, int age, double weight, 
                                String health, boolean endangered)
    {
        this.name = name;
        this.location = location;
        this.age = age;
        this.weight = weight;
        this.health = health;
        this.endangered = endangered;
    }

    public static void printAnimalHeader()
    {
        System.out.printf("%-9s %-11s %-4s %-7s %-10s %-12s", "Name", "Location", 
                            "Age", "Weight", "Health", "Endangered");
    }

    public void printInfo()
    {
        System.out.printf("%-9s %-11s %-4s %-7s %-10s %-12s", 
                            name, location, age, weight, health, endangered);
    }
}