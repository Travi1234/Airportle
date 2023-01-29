// Travis Mulder
// Final Project TicTacToe

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Font;

// Class Header
public class Header extends JPanel {

// Field
   private JLabel txtTTT; // field for adding text to the JPanel
   
   public Header() {
      //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      createHeader();
   }
    
   public static JLabel createField(String text) {
      JLabel label = new JLabel(text, SwingConstants.CENTER); 
      return label;
   }

   private void createHeader() {
   
      setBackground(new Color(0,181,226)); // set the background color
   
      txtTTT = new JLabel("Airportle");
      add(txtTTT); // add label to the header panel
      add(Box.createHorizontalGlue()); // Helps center the components on the panel
   }
}