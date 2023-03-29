/** Alejandro Mijares
 * March 26, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

/**
 * The Dinosaur interface creates a template for the creatures in Dino Park
 */
public interface Dinosaur extends Comparable<Object>{
    /**
     * Gives you the name of the Dino.
     * @return String name of Dino
     */
    String getName();

    /**
     * Gives you the length of the Dino in meters.
     * @return
     */
    int getSize();

    /**
     * They do move in herds! Or they don't. This function lets you know.
     *
     * @return boolean
     */
    String moveInHerds();

    /**
     * Returns what time period the dinosaur was found in.
     * @return string (i.e. Late Triassic, Early Jurassic, etc.)
     */
    String getTimePeriod();

    /**
     * Returns short fact about the dino!
     * @return String containing the fact
     */
    String getTidbit();

    /**
     * Get an artists rendering of what the dinosaur looked like!
     * Not likely to be accurate.
     * @return String (ASCII)
     */
    String getAscii();

    /**
     * Compares sizes between dinosaurs!
     * 1 means other dino is smaller
     * 0 means same size
     * -1 means other dino is bigger
     * @param o the object to be compared.
     * @return int [-1,0,1]
     */
    @Override
    int compareTo(Object o);
}
