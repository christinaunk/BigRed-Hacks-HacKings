package sustainable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName= myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        user u= new user(userName);

        System.out.println(
            "What would you like to do next? \n See my points: p \n Add friends: f \n Log a task: t \n See opportunities near me: o \n Quit: q");
        Scanner s2= new Scanner(System.in);
        String c= s2.nextLine();
        int i= 0;
        while (!c.equals("q")) {
            if (i != 0) {
                System.out.println(
                    "What would you like to do next? \n See my points: p \n Add friends: f \n Log a task: t \n See opportunities near me: o \n Quit: q");
                c= s2.nextLine();
            }
            if (c.equals("p")) {
                System.out.println("You have " + u.score() + " points! \n");
            } else if (c.equals("f")) {
                System.out.println(
                    "Enter your friends' usernames (separated by spaces)");
                String friends= s2.nextLine();
                System.out.print("Your friends are: ");
                u.addFriends(friends + "\n");
            } else if (c.equals("t")) {
                System.out.println(
                    "Which task did you complete? \n 1: Recycle! \n 2: Short Shower! \n 3: Carpool! \n 4: Turn off the lights! \n 5: Turn off water while you brush your teeth! \n 6: Use a recyclable/reusable water bottle! \n 7: Finish food on your plate or compost leftovers! \n 8: Use a drying rack to dry your laundry!");
                c= s2.nextLine();
                System.out.println("You have " + u.addPoints(c) + " points! \n");
            } else if (c.equals("o")) {
                System.out.println("Sustainable opportunities near you: ");
                System.out.println(u.opportunities() + "\n");
            }
            i++ ;
        }
    }
}
