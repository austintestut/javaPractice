import javax.swing.JOptionPane;
import java.io.*;

public class FileCreation {
  public static void main(String[] args) throws IOException {
    String fileName = JOptionPane.showInputDialog("Please enter a file name (program will add .txt)");
    String word = JOptionPane.showInputDialog("Please enter a word to put in the file");
    PrintWriter file = new PrintWriter(fileName + ".txt");
    file.println(word);
    file.close();
    JOptionPane.showMessageDialog(null, "Added " + word + " to " + fileName);
  }
}
