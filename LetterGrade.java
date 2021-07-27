import javax.swing.JOptionPane;

public class LetterGrade {
  public static void main(String[] args) {

    String letter = JOptionPane.showInputDialog("Please enter your letter grade");

    switch(letter) {

      case "A":
      {
      JOptionPane.showMessageDialog(null, "Your grade is between 90-100");
      break;
      }

      case "B":
      {
      JOptionPane.showMessageDialog(null, "Your grade is between 80-90");
      break;
      }

      case "C":
      {
      JOptionPane.showMessageDialog(null, "Your grade is between 70-80");
      break;
      }

      case "D":
      {
      JOptionPane.showMessageDialog(null, "Your grade is between 60-70");
      break;
      }

      case "F":
      {
      JOptionPane.showMessageDialog(null, "Your grade is less than 60.  Oof.");
      break;
      }
    }
  }
}
