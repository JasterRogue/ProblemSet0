import javax.swing.*;

public class SnackDeal {
    public static void main(String args[])
    {
        String name, className;
        float numberOfSnacks;

        name = enterName();

        className = enterClassName();

        numberOfSnacks = snackCount();

        finalPrice(name, className, numberOfSnacks);

    }

    public static String enterName()
    {
        String nameMethod;

        nameMethod = JOptionPane.showInputDialog("Please enter your name");

        return nameMethod;
    }

    public static String enterClassName()
    {
        String classNameMethod;

        classNameMethod = JOptionPane.showInputDialog("Please enter your class name");

        return classNameMethod;
    }

    public static float snackCount()
    {
          String snacksNoMethodString;
          float snacksNumber;

          snacksNoMethodString = JOptionPane.showInputDialog("Number of snacks ?");
          snacksNumber = Integer.parseInt(snacksNoMethodString);

          return snacksNumber;
    }

    public static void finalPrice(String name, String className, float numberOfSnacks)
    {
          float price;

          price = numberOfSnacks * 2;

          JOptionPane.showMessageDialog(null, "Name: " +
                  name + "\nClass: " + className + "\nNumber of Snacks: " + numberOfSnacks +
                  "\nPrice: " + price,"Details",JOptionPane.WARNING_MESSAGE);
    }



}
