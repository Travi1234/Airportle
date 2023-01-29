import javax.swing.*;
import java.awt.*;

public class Airport {

private Help help;
private TextBoxes textboxes;
private Header header;
private Buttons buttons;
private Labels labels;

   public Airport() {
   JFrame frame = new JFrame("Airportle");
   
   help = new Help();
   frame.add(help, BorderLayout.EAST);
   
   textboxes = new TextBoxes();
   frame.add(textboxes, BorderLayout.WEST);
   
   header = new Header();
   frame.add(header, BorderLayout.NORTH);
   
   buttons = new Buttons();
   frame.add(buttons, BorderLayout.PAGE_END);
   
   frame.pack();
   frame.setSize(frame.getWidth(), 400);
   frame.setVisible(true);
         
   }
   
   public static void main(String[] args) {
      new Airport();
   }
}