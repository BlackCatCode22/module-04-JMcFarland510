import java.util.ArrayList;

// superclass
public class Animal {

// variables
private String name;
    private int age;
    private String species;
    private String color;
    private int weight;
    private String gender;
    private String birthLocation;
    private String birthSeason;

// constructor initializes these variables as current instances (defaults)
public Animal(String name, int age, String species, String color, int weight, String gender, String birthLocation, String birthSeason) {
    this.name = name;
    this.age = age;
    this.species = species;
    this.color = color;
    this.weight = weight;
    this.gender = gender;
    this.birthLocation = birthLocation;
    this.birthSeason = birthSeason;
}

// getters to retrieve values + setters to modify values

    public String getName() {
    return name;
    }
    public int getAge() {
    return age;
    }
    public String getSpecies() {
    return species;
    }
    public String getColor() {
    return color;
    }
    public int getWeight() {
    return weight;
    }

    public String getGender(){
    return gender;
    }
    public String getBirthLocation(){
    return birthLocation;
    }
    public String getBirthSeason(){
    return birthSeason;
    }

    public void setName(String name) {
    this.name = name;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public void setSpecies(String species) {
    this.species = species;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }
    public void setBirthSeason(String birthSeason) {
        this.birthSeason = birthSeason;
    }

    }

// subclasses for each species of animal

class Hyena extends Animal {
    private static ArrayList<String> hyenaNames = new ArrayList<>();
    public Hyena(String name, int age, String species, String color, int weight, String gender, String birthLocation, String birthSeason) {
        super(name, age, species, color, weight, gender, birthLocation, birthSeason);

        hyenaNames.add("Shenzi");
        hyenaNames.add("Banzai");
        hyenaNames.add("Ed");
        hyenaNames.add("Zig");
        hyenaNames.add("Bud");
        hyenaNames.add("Lou");
        hyenaNames.add("Kamari");
        hyenaNames.add("Wema");
        hyenaNames.add("Ned");
        hyenaNames.add("Madoa");
        hyenaNames.add("Prince Nevarah");

    }

    // method to return the list of Hyena names

    public static ArrayList<String> getHyenaNames() {
        return hyenaNames;
    }
}

class Lion extends Animal {
    private static ArrayList<String> lionNames = new ArrayList<>();

    public Lion(String name, int age, String species, String color, int weight, String gender, String birthLocation, String birthSeason) {
        super(name, age, species, color, weight, gender, birthLocation, birthSeason);

        lionNames.add("Scar");
        lionNames.add("Mufasa");
        lionNames.add("Simba");
        lionNames.add("Kiara");
        lionNames.add("King");
        lionNames.add("Drooper");
        lionNames.add("Kimba");
        lionNames.add("Nala");
        lionNames.add("Leo");
        lionNames.add("Samson");
        lionNames.add("Elsa");
        lionNames.add("Cecil");

    }
    // method to return the list of Lion names

    public static ArrayList<String> getLionNames() {
        return lionNames;
    }
}
class Bear extends Animal {
    private static ArrayList<String> bearNames = new ArrayList<>();

    public Bear(String name, int age, String species, String color, int weight, String gender, String birthLocation, String birthSeason) {
        super(name, age, species, color, weight, gender, birthLocation, birthSeason);

        bearNames.add("Yogi");
        bearNames.add("Smokey");
        bearNames.add("Paddington");
        bearNames.add("Lippy");
        bearNames.add("Bungle");
        bearNames.add("Baloo");
        bearNames.add("Rupert");
        bearNames.add("Winnie the Pooh");
        bearNames.add("Snuggles");
        bearNames.add("Bert");

    }
    // method to return the list of Bear names

    public static ArrayList<String> getBearNames() {
        return bearNames;
    }
}
class Tiger extends Animal {
            private static ArrayList<String> tigerNames = new ArrayList<>();

            public Tiger(String name, int age, String species, String color, int weight, String gender, String birthLocation, String birthSeason) {
                super(name, age, species, color, weight, gender, birthLocation, birthSeason);

                tigerNames.add("Tony");
                tigerNames.add("Tigger");
                tigerNames.add("Amber");
                tigerNames.add("Cosimia");
                tigerNames.add("Cuddles");
                tigerNames.add("Dave");
                tigerNames.add("Jiba");
                tigerNames.add("Rajah");
                tigerNames.add("Rayas");
                tigerNames.add("Ryker");
            }
            // method to return the list of Tiger names

            public static ArrayList<String> getTigerNames() {
                return tigerNames;
            }
        }