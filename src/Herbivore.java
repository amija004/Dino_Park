/** Alejandro Mijares
 * March 26, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

/**
 * Herbivore, an implementation of the Dinosaur interface.
 * Has all the classes within Dinosaur, with minor modifications
 * specific to the Herbivore type.
 */
public abstract class Herbivore implements Dinosaur {

    private String name;
    private int size;
    private String ascii;
    private String tidbit;
    private String timePeriod;

    public Herbivore(String setName, int setSize, String setAscii, String setTidbit, String setTimePeriod) {
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

        /**
         * Relevant YouTube link (LOUD)
         * Jurassic Park Theme Song (Melodica Cover)
         * https://www.youtube.com/watch?v=-w-58hQ9dLk
          */
        return "They DO move in herds! *cue Theme music*";
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
        return  name + " was an Herbivore" +
                ", was " + size + " meters long" +
                ", and lived in the " + timePeriod + "!\n" +
                tidbit + "\n" +
                ascii;
    }
}
