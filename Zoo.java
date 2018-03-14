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
        sortAnimalsAlphabeticallyBySpecies(zooList, definedElephant);
        sortAnimalsAlphabeticallyBySpecies(zooList, definedDeer);
        sortAnimalsAlphabeticallyBySpecies(zooList, definedLion);
        sortAnimalsAlphabeticallyBySpecies(zooList, definedTiger);
        sortAnimalsAlphabeticallyBySpecies(zooList, definedWolf);
        sortAnimalsAlphabeticallyBySpecies(zooList, definedBear);

        //add default animals to zooList vector
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultElephant);
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultDeer);
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultLion);
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultTiger);
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultWolf);
        sortAnimalsAlphabeticallyBySpecies(zooList, defaultBear);
        
        //print all animal info
        printZooInfo(zooList);
    }

    //alphabetizes animals by species
    public static void sortAnimalsAlphabeticallyBySpecies(Vector<Animal> zooList, Animal animal)
    {
        //adds animal to begining of list if list is empty
        if (zooList.size() == 0)
        {
            zooList.addElement(animal);
        }
        //inserts animal into list alphabetically
        else
        {
            String newAnimal = animal.getSpecies();
            String existingAnimal;
            
            //loops through zooList to find new animal's spot in list
            for (int i = 0; i < zooList.size(); i++)
            {                
                existingAnimal = zooList.elementAt(i).getSpecies();

                //if new animal is alphabetically higher, insert
                if (newAnimal.compareTo(existingAnimal) < 0)
                {
                    zooList.insertElementAt(animal, i);
                    break;
                }
                //if the end of the list is reached, add animal to end
                else if (i == zooList.size() - 1)
                {
                    zooList.addElement(animal);
                    break;
                }
            }
        }
    }

    //prints all animal attributes
    public static void printZooInfo(Vector<Animal> zooList)
    {
        String animalSpecies;
        
        //loops through vector to print animal attributes
        for (int i = 0; i < zooList.size(); i++)
        {
            animalSpecies = zooList.elementAt(i).getSpecies();

            if (i == zooList.size() - 1)
            {
                break;
            }

            System.out.println();
            zooList.elementAt(i).printHeader();
            System.out.println();
            zooList.elementAt(i).printInfo();
            System.out.println();

            String comparitiveSpecies;

            for (int j = i+1; j < zooList.size(); j++)
            {
                comparitiveSpecies = zooList.elementAt(j).getSpecies();
                
                if (animalSpecies == comparitiveSpecies)
                {
                    zooList.elementAt(j).printInfo();
                    System.out.println(); 
                }
                else
                {
                    i = j - 1;
                    break;
                }
            }
        }
        System.out.println();
    }
}
