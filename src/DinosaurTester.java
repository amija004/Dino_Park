/** Alejandro Mijares
 * March 26, 2023
 * Panther ID: 3145563
 * Program Version: 1.0
 * Java Version: 8
 */

import java.util.Scanner;

/**
 * Welcome to Dino Park, the non-time period specific park containing
 * several amazing dinosaurs! You will be able to see and learn about multiple
 * wonderful dinosaurs from several eras.
 *11
 *
 * ASCII Art from asciiart.eu
 * https://www.asciiart.eu/animals/reptiles/dinosaurs
 */
public class DinosaurTester {
    /**
     * Array containing all the Dinosaurs currently kept in Dino Park!
     */
    private static Dinosaur[] dinosaurs = new Dinosaur[10];

    /**
     * Main method that will guide you through the wonderful world
     * of DINO PARK!
     * Note: You only get 5 chances to make a mistake in the main menu.
     * More than that will kick you out of the park!
     */
    public static void main(String[] args) {
        int choice;
        int active = 5;
        populatePark();
        welcomeMessage();

        Scanner input = new Scanner(System.in);
        while (active > -1){
            generalMenuText();
            choice = input.nextInt();
            if (choice == 1){
                printAllDinos();
            }
            else if (choice == 2) {
                chooseDino(input);
            }
            else if (choice == 3) {
                compareTwoDinos(input);
            }
            else if (choice == 4) {
                active = -42;
            }
            else {
                System.out.println("Sorry, I didn't understand that. Please enter a number.");
                active -= 1;
            }
        }
        goodByeMessage();
    }

    /**
     * Function that will print the names of all the Dinos in the park
     */
    private static void printAllDinos(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + ". " + dinosaurs[i].getName());
        }
    }

    /**
     * Fills the park with all the relevant Dinos!
     */
    private static void populatePark(){
        dinosaurs[0] = new CP_Coloradisaurus();
        dinosaurs[1] = new CT_Archaeopteryx();
        dinosaurs[2] = new CT_Deinonychus();
        dinosaurs[3] = new CT_Tyrannosaurus();
        dinosaurs[4] = new CT_Velociraptor();
        dinosaurs[5] = new HO_Ankylosaurus();
        dinosaurs[6] = new HO_Parasaurolophus();
        dinosaurs[7] = new HO_Stegosaurus();
        dinosaurs[8] = new HS_Brachiosaurus();
        dinosaurs[9] = new HS_Dreadnoughtus();
    }

    /**
     * Prints out the greeting given to every guest
     */
    private static void welcomeMessage(){
        System.out.println("Welcome... to DINO PARK!!!");
        printDino();
        System.out.println("This is a wonderful place containing several amazing dinosaurs!");
        System.out.println("Unlike other parks, this one does not pretend to limit itself to a single era.");
        System.out.println("We will take you on a tour through the park, but you have some choices!");
    }

    /**
     * Prints out the general menu which gives the initial choices available to guests
     */
    private static void generalMenuText(){
        System.out.println("\n\tMain Menu");
        System.out.println("1. List all the dinosaurs");
        System.out.println("2. Select a dinosaur to get to know!");
        System.out.println("3. Compare the size of two dinos!");
        System.out.println("4. Exit Dino Park");
        System.out.println("Please enter 1, 2, 3, or 4.");
    }

    /**
     * Function which helps the user select a dinosaur from the park's selection.
     * @param input Scanner object that takes user input
     */
    private static void chooseDino(Scanner input){
        printAllDinos();
        System.out.println("Which dino would you like to learn more about?");
        System.out.println("Please enter the number by its name.");
        int currentDino = input.nextInt();
        exploreDino(currentDino - 1, input);
    }

    /**
     * Function that helps the user learn more about the dinosaur they selected.
     * @param i integer that holds which dinosaur the user selected
     * @param input Scanner object that takes user input
     */
    private static void exploreDino(int i, Scanner input){
        Dinosaur dino = dinosaurs[i];
        int choice = 0;
        System.out.println("You have selected " + dino.getName() + "!");
        System.out.println("Great choice! Now, we can learn more about it!");
        while (choice != 3){
            dinoMenuText();
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println(dino);
            } else if (choice == 2) {
                System.out.println(dino.moveInHerds());
            } else if (choice == 3) {
                System.out.println("Back to main menu \n");
            } else {
                System.out.println("Sorry, I didn't understand. Please enter a number from the choices provided.");
            }
        }
    }

    /**
     * Function containing the menu text for a selected dinosaur.
     */
    private static void dinoMenuText(){
        System.out.println("\n1. General Overview");
        System.out.println("2. Do they move in herds?");
        System.out.println("3. Return to the main menu.");
        System.out.println("Please enter 1, 2, or 3.");
    }

    /**
     * Function that allows a user to compare two dinosaurs found in the park
     * @param input Scanner object that takes user input
     */
    private static void compareTwoDinos(Scanner input){
        printAllDinos();
        System.out.println("Select the first dino you'd like to compare: ");
        int choice = input.nextInt();
        while (10 < choice || choice < 1) {
            System.out.println("Please enter a number 1-10");
            choice = input.nextInt();
        }
        Dinosaur dino1 = dinosaurs[choice - 1];
        System.out.println("Select the second dino you'd like to compare: ");
        choice = input.nextInt();
        while (10 < choice || choice < 1) {
            System.out.println("Please enter a number 1-10");
            choice = input.nextInt() - 1;
        }
        Dinosaur dino2 = dinosaurs[choice - 1];
        int size = dino1.compareTo(dino2);
        if (size == 1){
            System.out.println(dino1.getName() + " is bigger than " + dino2.getName());
        }
        else if (size == -1){
            System.out.println(dino1.getName() + " is smaller than " + dino2.getName());
        }
        else {
            System.out.println(dino1.getName() + " is the same size as " + dino2.getName());
        }
    }

    /**
     * Says goodbye to the user, and thanks them for coming.
     */
    private static void goodByeMessage(){
        System.out.println("Thanks for coming to Dino Park!");
        printDino();
    }

    /**
     * Prints a cute sauropod
     */
    private static void printDino(){
        System.out.println( "               __\n" +
                            "              / _)\n" +
                            "     _.----._/ /\n" +
                            "    /         /\n" +
                            " __/ (  | (  |\n" +
                            "/__.-'|_|--|_|\n");}
}