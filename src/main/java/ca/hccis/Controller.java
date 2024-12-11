package ca.hccis;

import ca.hccis.santa.Kid;
import ca.hccis.util.CisUtility;


/**
 * Final practical
 *
 * @author BJM
 * @since 202412
 */

//********************************************************************************************
//TODO 0.  SAM/prior class examples can be used, Textbook can be used, IntelliJ basic IDE can be used.
//Any other resources not permitted.
//Questions encouraged
//********************************************************************************************

public class Controller {

    //******************************************************************************************************************
    //This is the accumulator attribute to the updated.
    //******************************************************************************************************************

    private static String allKidsNames = "Steve,Bill,Rhonda"; //Attribute to hold all the kids names that are added while the program runs.

    // private static String firstKid = "";
    private static String firstName = "";


    public static void main(String[] args) {

        System.out.println("Welcome to the CIS Final Practical Application");

        final String MENU = "\n----- Main Menu -----"
                + "\nA: Add a kid"
                + "\nB: Show all the kids names"
                + "\nD: Show the first name in the allKidsNames String"
                + "\nX: eXit";

        //**************************************************************************************************************
        //TODO 4 - Implement code for option A.
        //If the user enters option A, then create a new kid object and get the user to enter the kid's attribute values
        //using the get information method.  Show the kid object to the console once created and information is obtained
        // from the user for the kid's attribute values.
        //
        //**************************************************************************************************************
        //
        //TODO 5 - Update the accumulator attribute after creating a kid.
        //--> After the kid is created in code for option A, add the kid's name from the object to the allKidsNames String
        // which is a static attribute in this Controller class.
        //--> NOTE: There are already three test names added to the accumulator attribute.
        //
        //**************************************************************************************************************

        //**************************************************************************************************************
        //TODO 6 -->Don't add Rudolph
        //Sometimes Rudolph tries to get added to the program.  If the kid object that is just added has a name equal
        //to "Rodolph" then do not allow that name to be added to the accumulator attribute.  This will require you to
        //modify the code to only add if the kid's name is not equal to "Rudolph".
        //**************************************************************************************************************

        //**************************************************************************************************************
        //TODO 7 - Option D -->Show the user of the application the first kid in the allKidsNames attribute
        //Given that the allKidsNames is a String which will contain all of the kids names added since the program started
        //and that each kid's name is to be separated by a comma.  Use String methods and work with the allKidsNames String to
        //show the first kids name in the allKidsNames String.
        //**************************************************************************************************************

        //**************************************************************************************************************
        //TODO 8 - Modify option B
        //When showing the value of the accumulator allKidsNames, there is a comma at the end of the accumulator.  When showing
        //the value of the names for all kids, only show up to before the last comma.
        //Example:  "Steve,Bill,Rhonda," --> Only show to the console "Steve,Bill,Rhonda"
        //**************************************************************************************************************

        String option = "";
        do {
            option = CisUtility.getInputString(MENU);
            switch (option.toUpperCase()) {
                case "A":
                    addKid();
                    break;
                case "B":
                    showAllKidsNames();
                    break;
                case "C":
                    break;
                case "D":
                    showFirstKids();
                    break;
                case "X":
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (!option.equalsIgnoreCase("x"));
    }

    public static void addKid() {

        Kid kid = new Kid();
        kid.getInformation();
        kid.display();
        allKidsNames += ", " + kid.getName();
        int tempName = allKidsNames.indexOf(",");
        firstName = allKidsNames.substring(0, tempName);
    }

    public static void showAllKidsNames() {
        System.out.println(allKidsNames);
    }

    public static void showFirstKids() {
        //array solution
//       String[]  allKids = allKidsNames.split(",");
//       firstKids = allKids[0];
//        System.out.println(firstKid);

        System.out.println(firstName);
    }
}
