import java.util.*;

public class Zoo
{
    public static void main(String[] args) 
    {
        //create list of zoo animals
        Vector<Animal> zooList = new Vector<Animal>();
        
        //create herbivores
        Elephant definedElephant = new Elephant("Dumbo", "Savannah", 15, 700, 
            Animal.Health.EXCELLENT, "Corn Meal", 4, 50);
        Elephant defaultElephant = new Elephant();

        Deer definedDeer = new Deer("Bambi", "Brushland", 1, 150, 
            Animal.Health.SICK, "Corn Meal", 4, 10);
        Deer defaultDeer = new Deer();

        //create carnivores

            //create felines
        Lion definedLion = new Lion("Mufasa", "Savannah", 3, 200, 
            Animal.Health.WELL, "Beef", 3);
        Lion defaultLion = new Lion();

        Tiger definedTiger = new Tiger("Tigger", "Jungle", 6, 250, 
            Animal.Health.SOSO, "Beef", 3);
        Tiger defaultTiger = new Tiger();

            //create canines
        Wolf definedWolf = new Wolf("Fang", "Mountains", 4, 100, 
            Animal.Health.WELL, "Mutton", 4);
        Wolf defaultWolf = new Wolf();

        Bear definedBear = new Bear("Blue", "Forest", 10, 400, 
            Animal.Health.EXCELLENT, "Beef", 3);
        Bear defaultBear = new Bear();

        //add defined animals to zooList vector
        zooList.addElement(definedElephant);
        zooList.addElement(definedDeer);
        zooList.addElement(definedLion);
        zooList.addElement(definedTiger);
        zooList.addElement(definedWolf);
        zooList.addElement(definedBear);

        //add default animals to zooList vector
        zooList.addElement(defaultElephant);
        zooList.addElement(defaultDeer);
        zooList.addElement(defaultDeer);
        zooList.addElement(defaultLion);
        zooList.addElement(defaultTiger);
        zooList.addElement(defaultWolf);
        zooList.addElement(defaultBear);

        //print all animal info
        printZooInfo(zooList);
    }

    //prints all animal attributes
    public static void printZooInfo(Vector<Animal> zooList)
    {
        //loops through vector to print animal attributes
        for (int i = 0; i < zooList.size(); i++)
        {
            System.out.println();
            zooList.elementAt(i).printHeader();
            System.out.println();
            zooList.elementAt(i).printInfo();
            System.out.println();
        }
        System.out.println();
    }
}
