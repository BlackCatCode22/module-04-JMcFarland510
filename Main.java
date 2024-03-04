import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) {

// new arrival animal  + existingAnimals arraylist

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Hyena("Lily", 4, "hyena", "tan", 70, "female", "Friguia Park, Tunisia", "spring"));
        animals.add(new Hyena("Jacob", 12, "hyena", "brown", 150, "male", "Friguia Park, Tunisia", "fall"));
        animals.add(new Hyena("Hunter", 4, "hyena", "black", 120, "male", "Friguia Park, Tunisia", "spring"));
        animals.add(new Hyena("Nibbles", 8, "hyena", "black and tan striped", 105, "male", "Friguia Park, Tunisia", "unknown"));

        animals.add(new Lion("Ariya", 6, "lion", "tan", 300, "female", "Zanzibar, Tanzania", "spring"));
        animals.add(new Lion("Mum", 12, "lion", "dark tan", 375, "female", "Kopelion, Tanzania", "winter"));
        animals.add(new Lion("Osiris", 22, "lion", "golden", 450, "male", "Zanzibar, Tanzania", "fall"));
        animals.add(new Lion("Cruz", 4, "lion", "tan and brown", 275, "female", "Kopelion, Tanzania", "spring"));

        animals.add(new Tiger("Jason", 2, "tiger", "gold and tan", 270, "male", "Dhaka, Bangladesh", "spring"));
        animals.add(new Tiger("Rose", 4, "tiger", "black stripes", 400, "female", "Dhaka, Bangladesh", "spring"));
        animals.add(new Tiger("Jose", 18, "tiger", "gold and tan", 300, "male", "Bardia, Nepal", "fall"));
        animals.add(new Tiger("Mica", 3, "tiger", "black stripes", 285, "female", "Bardia, Nepal", "fall"));

        animals.add(new Bear("David", 7, "bear", "brown", 320, "male", "Alaska zoo, Alaska", "spring"));
        animals.add(new Bear("Joola", 25, "bear", "black", 425, "female", "Woodland park Zoo, Washington", "spring"));
        animals.add(new Bear("Garnet", 4, "bear", "black", 355, "female", "Woodland park Zoo, Washington", "fall"));
        animals.add(new Bear("Onyx", 4, "bear", "brown", 405, "male", "Alaska zoo, Alaska", "spring"));


// resident animal data (calls method in Animal.java)

        ArrayList<String> existingAnimalNames = new ArrayList<>();

        existingAnimalNames.addAll(Hyena.getHyenaNames());
        existingAnimalNames.addAll(Lion.getLionNames());
        existingAnimalNames.addAll(Tiger.getTigerNames());
        existingAnimalNames.addAll(Bear.getBearNames());

// Hashmap to store resident animal species counts

        HashMap<String, Integer> speciesCount = new HashMap<>();

// for loop to count occurrence of each species.

        for (String name : existingAnimalNames) {
            for (Animal animal : animals) {
                if (animal.getName().equals(name)) {
                    String species = animal.getSpecies();
                    speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
                    break;
                }
            }
        }
// loop output for existing animals

        for (String species : speciesCount.keySet()) {
            int count = speciesCount.get(species);
            System.out.println(species + ": " + count);
        }

// for loop to count occurrence of each species.
        speciesCount.clear();
        for (Animal animal : animals) {
            String species = animal.getSpecies();
            speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
        }
// output that displays the amount of new arrival animals

        for (String species : speciesCount.keySet()) {
            int count = speciesCount.get(species);
            System.out.println(species + ": " + count);
        }
    }
}

