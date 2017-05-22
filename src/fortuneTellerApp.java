import java.util.Scanner;

public class fortuneTellerApp {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        int age = 0;
        int siblings = 0;
        String birthMonth = "October";
        String color = "Blue";
        int retireYears = 0;
        double retirementFund = 0.0d;
        String vacationHome = "Michigan";
        String transportation = "SUV";
        String playAgain = " ";


        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("What is your first name?");
            firstName = scanner.next();

            System.out.println("What is your last name?");
            lastName = scanner.next();

            System.out.println("How old are you?");
            age = scanner.nextInt();

            System.out.println("How many siblings do you have?");
            int numberSiblings = scanner.nextInt();

            System.out.println("In what month you were born?\n\n"
                    + "Please enter your full birth month"
                    + "\n January/February/March"
                    + "\n April/May/June"
                    + "\n July/August/September"
                    + "\n October/November/December");
            birthMonth = scanner.next().toLowerCase();

            System.out.println("Which of the ROYGBIV color is your favourite?\n "
                            + "if you dont know what ROYGBIV is, enter \"Help\"");
            color = scanner.next().toUpperCase();


            //if users age is even or odd
            if (age % 2 == 0) {
                retireYears = 25;
            }else {
                retireYears = 15;
            }

            // users siblings
            if(siblings == 0) {
                vacationHome = "Boca Raton, Fl";
            }else if (siblings == 1) {
                vacationHome = "Nassau, Bahamas";
            }else if (siblings == 2) {
                vacationHome = "Ponta Negra, Brazil";
            }else if (siblings == 3) {
                vacationHome = "Portland, Oregon";
            }else if (siblings > 3) {
                vacationHome = "Baton Rouge, LA";
            }   else if (siblings > 0) {
                    vacationHome = "Chernobyl, Ukraine";
            }

            // users favorite color
            switch (color) {
            case "HELP":
                System.out.println("\n Please enter a letter of your Favorite Color"
                        + " \nR for Red \nO for Orange \nY for Yellow"
                        + "\nG for Green \nB for Blue \nI for Indigo \nV for Violet");
                color = scanner.next().toUpperCase();

                //compares the color user choose on a help menu.
                 if (color.equals("R")) {
                     transportation = "Maserati";
                 }else if (color.equals("O")) {
                     transportation = "stallion";
                 }else if (color.equals("Y")) {
                     transportation = "chariot";
                 }else if (color.equals("G")) {
                     transportation = "taxi";
                 }else if (color.equals("B")) {
                     transportation = "rickshaw";
                 }else if (color.equals("I")) {
                     transportation = "motor scooter";
                 }else if (color.equals("V")) {
                     transportation = "flying saucer";
                 }else{
                     transportation = "SUV";
                 }

                break;

            case "R": transportation = "Maserati";
            break;

            case "O": transportation = "Stallion";
            break;

            case "Y": transportation = "Chariot";
            break;

            case "G": transportation = "taxi";
            break;

            case "B": transportation = "rickshaw";
            break;

            case "I": transportation = "motor scooter";
            break;

            case "V": transportation = "flying saucer";
            break;

            default: transportation = "SUV";
                break;
            }

            //if first, second or third letter 
            //of a birth month is contained in either first name or last name

            String fullName = firstName + lastName;

            if(fullName.contains(birthMonth.substring(1,4))) {
                retirementFund = 256000.79;
            }else if(fullName.contains(birthMonth.substring(5,8))){
                retirementFund = 3687105.42;
            }else if(fullName.contains(birthMonth.substring(9,12))){
                retirementFund = 86.23;
            }else{
                retirementFund = 0.00;
            }



            System.out.println("\n\n" + firstName + " " + lastName
                    + " will retire in " + retireYears + " Years\n"
                    + "with $ " +  retirementFund + " in the bank\n"
                    + "A vacation home in " + vacationHome + " and travel by " + transportation + ".\n\n");

            System.out.println("Would you like to play again? "
                    + "Enter Yes to continue or enter any Key to quit.");
            playAgain = scanner.next();


        }while(playAgain.equalsIgnoreCase("Yes"));
        System.out.println("Goodbye");

        scanner.close();

    

    }    
}