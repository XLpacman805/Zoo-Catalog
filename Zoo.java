import java.util.*;

public class Zoo
{
    public static void main(String[] args) 
    {
        Vector<Animal> zooList = new Vector<Animal>();
        
        //create herbivores
        Elephant elephant = new Elephant("Dumbo", "Savannah", 15, 700, 
            Animal.Health.EXCELLENT, "Corn Meal", 4, 50);

        Deer deer = new Deer("Bambi", "Brushland", 1, 150, 
            Animal.Health.SICK, "Corn Meal", 4, 10);


        //create carnivores
        Lion lion = new Lion("Mufasa", "Savannah", 3, 200, 
            Animal.Health.WELL, "Beef", 3);

        Tiger tiger = new Tiger("Tigger", "Jungle", 6, 250, 
            Animal.Health.SOSO, "Beef", 3);

        Wolf wolf = new Wolf("Fang", "Mountains", 4, 100, 
            Animal.Health.WELL, "Mutton", 4);

        Bear bear = new Bear("Blue", "Forest", 10, 400, 
            Animal.Health.EXCELLENT, "Beef", 3);

        //add animals to zooList vector
        zooList.addElement(elephant);
        zooList.addElement(deer);
        zooList.addElement(lion);
        zooList.addElement(tiger);
        zooList.addElement(wolf);
        zooList.addElement(bear);
        
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
