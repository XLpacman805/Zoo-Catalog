import java.util.*;

public class Zoo
{
    public static void main(String[] args) 
    {
        Vector<Animal> zooList = new Vector<Animal>();
        
        //create herbivores
        Herbivore elephant = new Herbivore("Elephant", "Savannah", 15, 700, 
                                            "Excellent", false, "Corn Meal", 4, 50);
        Herbivore deer = new Herbivore("Deer", "Brushland", 1, 150, "Excellent",
                                            false, "Corn Meal", 4, 10);


        //create carnivores
        Feline lion = new Feline("Lion", "Savannah", 3, 200, "Excellent", false,
                                    "Beef", 3);
        Feline tiger = new Feline("Tiger", "Jungle", 6, 250, "Excellent", true,
                                    "Beef", 3);

        Canine wolf = new Canine("Wolf", "Mountains", 4, 100, "Excellent", true,
                                    "Mutton", 4);
        Canine bear = new Canine("Bear", "Forest", 10, 400, "Excellent", false,
                                    "Beef", 3);

        //add animals to zooList vector
        zooList.addElement(elephant);
        zooList.addElement(deer);
        zooList.addElement(lion);
        zooList.addElement(tiger);
        zooList.addElement(wolf);
        zooList.addElement(bear);

        //print herbivores
        printHerbivores(zooList);
        System.out.println();
        
        //print carnivores
        printCarnivores(zooList);
        System.out.println('\n');
    }

    //prints the herbivore info under a herbivore header
    public static void printHerbivores(Vector<Animal> zooList)
    {
        Herbivore.printHerbivoreHeader();
        System.out.println();

        for (int i = 0; i < zooList.size(); i++)
        {
            if (zooList.elementAt(i) instanceof Herbivore)
            {
                printAnimalInfo(zooList, i);
            }
        }
    }

    //prints carnivore info under a carnivore header
    public static void printCarnivores(Vector<Animal> zooList)
    {
        Carnivore.printCarnivoreHeader();
        System.out.println();

        for (int i = 0; i < zooList.size(); i++)
        {
            if (zooList.elementAt(i) instanceof Carnivore)
            {
                printAnimalInfo(zooList, i);
            }
        }
    }

    //prints animal info
    public static void printAnimalInfo(Vector<Animal> zooList, int i)
    {
        System.out.println();
        zooList.elementAt(i).printInfo();
    }
}