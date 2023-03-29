/** Alejandro Mijares
 * March 26, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

/**
 * Carnivore, an implementation of the Dinosaur interface.
 * Has all the classes within Dinosaur, with minor modifications
 * specific to the Carnivore type.
 */
public abstract class Carnivore implements Dinosaur{

    private String name;
    private int size;
    private String ascii;
    private String tidbit;
    private String timePeriod;

    public Carnivore(String setName, int setSize, String setAscii, String setTidbit, String setTimePeriod) {
        name = setName;
        size = setSize;
        ascii = setAscii;
        tidbit = setTidbit;
        timePeriod = setTimePeriod;
    }

    public String getTidbit() {
        return tidbit;
    }


    public int getSize() {
        return size;
    }


    public String getAscii() {
        return ascii;
    }


    @Override
    public String getName() {
        return name;
    }
    @Override
    public String moveInHerds() {
        return "They... don't move in herds.";
    }

    @Override
    public String getTimePeriod() {
        return timePeriod;
    }

    @Override
    public int compareTo(Object o) {
        Dinosaur other = (Dinosaur) o;
        if (other.getSize() > size){
            return -1;
        }
        else if (other.getSize() < size){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return  name + " was a Carnivore" +
                ", was " + size + " meters long" +
                ", and lived in the " + timePeriod + "!\n" +
                tidbit + "\n" +
                ascii;
    }
}
