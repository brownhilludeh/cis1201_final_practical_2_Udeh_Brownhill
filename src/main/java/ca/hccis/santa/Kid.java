package ca.hccis.santa;

import ca.hccis.util.CisUtility;

public class Kid {

    private String name;
    private int age;
    private String gifts; //String that contains the three gifts that the user wants.

    //******************************************************************************************************************
    //Todo 1 - get user to input validated name
    //Have the user enter a name using a loop until the length of the name is between 2 and 20.  So the name must have
    //at least two characters and be at most 20 in length.
    //******************************************************************************************************************

    //******************************************************************************************************************
    //Todo 2 - get user to input a validated age.
    //Have the user enter an age until the age is below 18.  So the oldest that a kid can be is 17.  It is ok if the kid
    //is anywhere between 0-17.
    //******************************************************************************************************************

    //******************************************************************************************************************
    //Todo 3 - Ask the user of the application to enter three gifts for the kid using a for loop.
    //The kid is to have exactly three gifts.  Use a for loop to ask for three gifts one at a time.  Add each gift to the
    //gifts String attribute of this object.
    //Example:  After adding three gifts by the user the gifts for this kid could be:  "bicycle, robot, video game,"
    //NOTE:  comma to be added after each gift is added.
    //******************************************************************************************************************

    public void getInformation() {
        this.name = CisUtility.getInputString("Name:");
        // Name validation
        while (name.equalsIgnoreCase("Rudolph")) {
            System.out.println("Rudolph can't be registered on this system");
            this.name = CisUtility.getInputString("Name:");

            while (name.length() < 2 || name.length() > 20) {
                System.out.println("Invalid Input. Name must be between 2 and 20 characters.");
                this.name = CisUtility.getInputString("Name:");
            }
        }

        this.age = CisUtility.getInputInt("Age:");
        //Age Validation
        while (this.age < 0 || this.age > 17) {
            System.out.println("Invalid Input. Age must be below 18.");
            this.age = CisUtility.getInputInt("Age:");
        }
        

        //also need to get the gifts using a for loop
        this.gifts = CisUtility.getInputString("Gifts:");
        for (int i = 1; i <= 3; i++) {
            while (i++ < 3) {
                this.gifts = CisUtility.getInputString("Gifts:");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGifts() {
        return gifts;
    }

    public void setGifts(String gifts) {
        this.gifts = gifts;
    }

    public void display() {
        System.out.println(this.toString());
    }

    public String toString() {
        String output = "\n----- Kid Details -----"
                + "\n- Name: " + this.name
                + "\n- Age: " + this.age
                + "\n- Gifts: " + this.gifts
                + "\n-----------------------";
        return output;
    }
}
