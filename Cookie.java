/*
Bag of cookie holds 40 cookies.
There are 10 servings in the bag and a serving is 300 calories.
Write a program that lets the user enter the number of cookies they ate and return the number of total calories consumed
*/

import javax.swing.JOptionPane;

public class Cookie {
  public static void main(String[] args) {
    String cookiesEaten = JOptionPane.showInputDialog("How many cookies did you eat?");
    double cookiesEatenDouble = Double.parseDouble(cookiesEaten);
    double userServings = cookiesEatenDouble / 4;
    double caloriesConsumed = userServings * 300;
    JOptionPane.showMessageDialog(null, "You consumed " + caloriesConsumed + " calories!");
  }
}
