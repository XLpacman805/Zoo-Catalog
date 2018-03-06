import java.util.*;

public class Animal
{
    //attributes shared by all animals
    protected String name;
    protected String location;
    protected int age;
    protected double weight;
    protected String health;
    protected boolean endangered;

    //blank constructor
    Animal()
    {
        setAllAttributes("None", "None", 0, 0.0, "None", false);
    }

    //overloaded constructor accepts animal attributes
    Animal(String name, String location, int age, double weight, String health, 
            boolean endangered)
    {
        setAllAttributes(name, location, age, weight, health, endangered);
    }

    //sets all animal attributes
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

    //static function that prints header listing animal attribute categories
    public static void printAnimalHeader()
    {
        System.out.printf("%-9s %-11s %-4s %-7s %-10s %-12s", "Name", "Location", 
                            "Age", "Weight", "Health", "Endangered");
    }

    //prints animal attributes
    public void printInfo()
    {
        System.out.printf("%-9s %-11s %-4s %-7s %-10s %-12s", 
                            name, location, age, weight, health, endangered);
    }
}