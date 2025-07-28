
import java.util.Scanner;

// Person class
class Person {

    int height;
    boolean isEighteenAndOlder;
    String hairColour;

    public Person(int height, boolean isEighteenAndOlder, String hairColour) {
        this.height = height;
        this.isEighteenAndOlder = isEighteenAndOlder;
        this.hairColour = hairColour;
    }
}

// Subclass (Scientist) extending Person
class Scientist extends Person {

    String labCoatColour;
    String typeOfScientist;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Scientist(int height, boolean isEighteenAndOlder, String hairColour, String labCoatColour) {
        super(height, isEighteenAndOlder, hairColour);
        this.labCoatColour = labCoatColour;
        this.typeOfScientist = determineScientistType();
    }

    public String determineScientistType() {
        return switch (labCoatColour.toLowerCase()) {
            case "green" ->
                "Biologist";
            case "purple" ->
                "Physicist";
            case "white" ->
                "Pharmacist";
            case "blue" ->
                "Climatologist";
            case "yellow" ->
                "Geneticist";
            case "red" ->
                "Zoologist";
            default ->
                "Unknown Scientist";
        };
    }

    public void displayInfo() {
        System.out.println("Height: " + height);
        System.out.println("Is 18 or older: " + isEighteenAndOlder);
        System.out.println("Hair Colour: " + hairColour);
        System.out.println("Lab Coat Colour: " + labCoatColour);
        System.out.println("Type of Scientist: " + typeOfScientist);
    }

    public void describeScientist() {
        String description = String.format("""
                                           This scientist is %d cm tall, has %s hair, and is %s 18 years old or older.
                                           They wear a %s lab coat and are classified as a %s.""",
                height,
                hairColour,
                isEighteenAndOlder ? "at least" : "under",
                labCoatColour,
                typeOfScientist
        );
        System.out.println(description);
    }
}

// Subclass (Doctor) extending Person
class Doctor extends Person {

    String ranking;
    int yearsOfExperience;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Doctor(int height, boolean isEighteenAndOlder, String hairColour, int yearsOfExperience) {
        super(height, isEighteenAndOlder, hairColour);
        this.yearsOfExperience = yearsOfExperience;
        this.ranking = determineRanking();
    }

    public String determineRanking() {
        if (yearsOfExperience >= 0 && yearsOfExperience <= 6) {
            return "Medical Student";
        } else if (yearsOfExperience <= 8) {
            return "Intern";
        } else if (yearsOfExperience <= 16) {
            return "Resident";
        } else if (yearsOfExperience <= 20) {
            return "Fellow";
        } else if (yearsOfExperience >= 21) {
            return "Attending";
        } else {
            return "Unknown Ranking";
        }
    }

    public void displayInfo() {
        System.out.println("Height: " + height);
        System.out.println("Is 18 or older: " + isEighteenAndOlder);
        System.out.println("Hair Colour: " + hairColour);
        System.out.println("Ranking: " + ranking);
        System.out.println("Years of experience: " + yearsOfExperience);
    }

    public void describeDoctor() {
        String description = String.format("""
                                           This doctor is %d cm tall, has %s hair, and is %s 18 years old or older.
                                           They are a %s with %d years of experience.""",
                height,
                hairColour,
                isEighteenAndOlder ? "at least" : "under",
                ranking,
                yearsOfExperience
        );
        System.out.println(description);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {
        // === Scientist Input ===
        try (Scanner scanner = new Scanner(System.in)) {
            // === Scientist Input ===
            System.out.println("Enter Scientist's height (in cm): ");
            int scientistHeight = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Is the Scientist 18 or older? (true/false): ");
            boolean scientistIsAdult = scanner.nextBoolean();
            scanner.nextLine(); // consume newline

            System.out.println("Enter Scientist's hair colour: ");
            String scientistHair = scanner.nextLine();

            System.out.println("Enter Scientist's lab coat colour (e.g., Green, Purple, White): ");
            String labCoat = scanner.nextLine();

            Scientist scientist = new Scientist(scientistHeight, scientistIsAdult, scientistHair, labCoat);
            System.out.println("\nScientist Information:");
            scientist.displayInfo();
            scientist.describeScientist();

            // === Doctor Input ===
            System.out.println("\nEnter Doctor's height (in cm): ");
            int doctorHeight = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Is the Doctor 18 or older? (true/false): ");
            boolean doctorIsAdult = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Enter Doctor's hair colour: ");
            String doctorHair = scanner.nextLine();

            System.out.println("Enter Doctor's years of experience: ");
            int experience = scanner.nextInt();
            scanner.nextLine();

            Doctor doctor = new Doctor(doctorHeight, doctorIsAdult, doctorHair, experience);
            System.out.println("\nDoctor Information:");
            doctor.displayInfo();
            doctor.describeDoctor();
        }
    }
}
