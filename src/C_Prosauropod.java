/**
 * Alejandro Mijares
 * Month Day, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

/**
 * Special case within the carnivore class.
 * The Prosauropod family contain omnivorous dinosaurs.
 * In order to maintain the established system, the Prosauropod
 * was grouped together with Carnivores in order to not upset the
 * Herbivores, as they got skittish at the last reunion.
 */
public class C_Prosauropod extends Carnivore {
    public C_Prosauropod(String setName, int setSize, String setAscii, String setTidbit, String setTimePeriod) {
        super(setName, setSize, setAscii, setTidbit, setTimePeriod);
    }

    @Override
    public String moveInHerds() {
        return "They DO move in herds! *cue Theme music*";
    }
}
