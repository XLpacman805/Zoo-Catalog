import java.util.*;

public class Animal
{
    //possible health status for animals
    public static enum Health {
        EXCELLENT, WELL, SOSO, SICK, NONE
    }
    
    //attributes shared by all animals
    protected String species;
    protected String name;
    protected String location;
    protected int age;
    protected double weight;
    protected Health health;

    //default constructor
    Animal()
    {
        setAllAttributes("None", "None", 0, 0.0, Health.NONE);
        species = "Animal";
    }

    //overloaded constructor accepts animal attributes
    Animal(String name, String location, int age, double weight, Health health)
    {
        setAllAttributes(name, location, age, weight, health);
        this.species = "Animal";
    }

    //sets all animal attributes
    public void setAllAttributes(String name, String location, 
        int age, double weight, Health health)
    {
        this.name = name;
        this.location = location;
        this.age = age;
        this.weight = weight;
        this.health = health;
    }

    //prints header listing animal attribute categories
    public void printHeader()
    {
        System.out.printf("%-10s %-8s %-11s %-5s %-8s %-11s", "Species", "Name", 
            "Location", "Age", "Weight", "Health");
    }

    //prints animal attributes
    public void printInfo()
    {
        System.out.printf("%-10s %-8s %-11s %-5d %-8.1f %-11s", species,
            name, location, age, weight, health);
    }
}
