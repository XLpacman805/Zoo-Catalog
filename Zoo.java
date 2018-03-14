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
        insertAnimalIntoZooList(zooList, definedElephant);
        insertAnimalIntoZooList(zooList, definedDeer);
        insertAnimalIntoZooList(zooList, definedLion);
        insertAnimalIntoZooList(zooList, definedTiger);
        insertAnimalIntoZooList(zooList, definedWolf);
        insertAnimalIntoZooList(zooList, definedBear);

        //add default animals to zooList vector
        insertAnimalIntoZooList(zooList, defaultElephant);
        insertAnimalIntoZooList(zooList, defaultDeer);
        insertAnimalIntoZooList(zooList, defaultLion);
        insertAnimalIntoZooList(zooList, defaultTiger);
        insertAnimalIntoZooList(zooList, defaultWolf);
        insertAnimalIntoZooList(zooList, defaultBear);
        
        //print all animal info
        printZooInfo(zooList);
    }

    //begins process of adding animals to zooList
    public static void insertAnimalIntoZooList(Vector<Animal> zooList, Animal animal)
    {
        //adds animal to begining of list if list is empty
        if (zooList.size() == 0)
        {
            zooList.addElement(animal);
        }
        //inserts animal into list alphabetically
        else
        {
            insertAnimalIntoListAlphabeticallyBySpecies(zooList, animal);
        }
    }

    //inserts new animal into list alphabetically by species
    public static void insertAnimalIntoListAlphabeticallyBySpecies(
        Vector<Animal> zooList, Animal animal)
    {
        String newAnimal = animal.getSpecies(); //species of added animal
        String existingAnimal;                  //species of animal in list
        
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
            //if the end of the list is reached, add new animal to end
            else if (i == zooList.size() - 1)
            {
                zooList.addElement(animal);
                break;
            }
        }
    }

    //prints all animal attributes
    public static void printZooInfo(Vector<Animal> zooList)
    {
        //loops through vector to print animal attributes
        for (int i = 0; i < zooList.size();)
        {
            //prints a header and lists all animals of same species beneath
            printAnimalHeader(zooList, i);
            printAnimalInfo(zooList, i);
            i = printInfoForEveryAnimalOfSameSpecies(zooList, i);
        }
        System.out.println();
    }

    //prints info for animals of same species under one header
    public static int printInfoForEveryAnimalOfSameSpecies(
        Vector<Animal> zooList, int i)
    {
        //species of animal at index i
        String animalSpecies = zooList.elementAt(i).getSpecies(); 
        //species of animal at j + n
        String comparativeSpecies;
        
        for (int j = i + 1; j < zooList.size(); j++)
        {
            comparativeSpecies = zooList.elementAt(j).getSpecies();
            
            //if they are the same species, print animal info
            if (animalSpecies == comparativeSpecies)
            {
                printAnimalInfo(zooList, j); 
                
                //if end of list is reached, return size of list for i
                if (j == zooList.size() - 1)
                {
                    return zooList.size();
                }
            }
            //when a different species is hit in zoolist, move i
            //to that location in the list
            else
            {
                i = j;
                break;
            }
        }
        return i;
    }

    //prints animal header
    public static void printAnimalHeader(Vector<Animal> zooList, int i)
    {
        System.out.println();
        zooList.elementAt(i).printHeader();
        System.out.println();
    }

    //prints animal attributes
    public static void printAnimalInfo(Vector<Animal> zooList, int i)
    {
        zooList.elementAt(i).printInfo();
        System.out.println();
    }
}
