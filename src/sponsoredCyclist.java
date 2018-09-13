import javax.swing.*;

public class sponsoredCyclist {
    public static void main(String[] args)
    {
     String firstName, initial, lastName;
     float distance;

     firstName = firstName();

     initial = initial();

     lastName = lastName();

     distance = distance();

     displayDetails(firstName,lastName, distance, initial);
    }

    public static String firstName()
    {
        String firstName;

        firstName = JOptionPane.showInputDialog("Enter name");

        return firstName;

    }

    public static String initial()
    {
        String initial;

        initial = JOptionPane.showInputDialog("Enter middle name initial");

        return initial;
    }


    public static String lastName()
    {
        String lastName;

        lastName = JOptionPane.showInputDialog("Enter last name");

        return lastName;
    }

    public static float distance()
    {
        String distanceString;
        float distance;

        distanceString = JOptionPane.showInputDialog("Enter distance");
        distance = Float.parseFloat(distanceString);
        return distance;


    }

    public static void displayDetails(String firstName, String lastName, float distance, String initial)
    {
         float moneyOwed, distance2;

         if(distance<=10)
         {
             moneyOwed = distance * 10;
         }

         else
         {
             distance2 = distance - 10;
             moneyOwed = (distance2 * 7) + 100;
         }

         JOptionPane.showMessageDialog(null,"First Name: " + firstName +
                 "\nInitial: " + initial + "\nLast Name: " + lastName + "\nDistance: " + distance +
                 "\nMoney Owed: " + moneyOwed + " cent");
    }
}
