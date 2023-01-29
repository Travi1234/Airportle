import javax.swing.*;
import java.awt.*;

public class Airport {

private Help help;
private TextBoxes textBoxes;
private Header header;
private Buttons buttons;
private GameRules gameLogic;
private FileReader fileReading;
private String computerInput;

   public Airport() {
      System.out.println("hi");
   JFrame frame = new JFrame("Airportle");
   
   help = new Help();
   frame.add(help, BorderLayout.EAST);
  
   textBoxes = new TextBoxes();
   frame.add(textBoxes, BorderLayout.CENTER);
   
   header = new Header();
   frame.add(header, BorderLayout.NORTH);
   
   buttons = new Buttons(this);
   frame.add(buttons, BorderLayout.PAGE_END);
   
   
   
   frame.pack();
   frame.setSize(frame.getWidth(), 400);
   frame.setVisible(true);
   
   gameLogic = new GameRules();
   fileReading = new FileReader();
   initializeGame();
   }

   
   public TextBoxes getTextBoxes() {
      return textBoxes;
  }

  public FileReader getFileReader() {
   return fileReading;
}

public GameRules getGameRules() {
   return gameLogic;
}
   
private void initializeGame() {

   
   computerInput = (fileReading.selectGameWord());
   System.out.println("Here is computer input" + computerInput);
   String[] linesFromWord = fileReading.splitIntoArray(computerInput);
   char[] airportTerminalCharacters = fileReading.splitWordIntoChars(linesFromWord[0]);

   


}
   
}