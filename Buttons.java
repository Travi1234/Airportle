import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttons extends JPanel {

private JButton b1;
public static int count = 1;
private Airport game;

   public Buttons(Airport game) {
      setBackground(new Color(0,181,226));
      b1 = new JButton("CHECK"); 
      b1.addActionListener(createListener());
      add(b1);
      this.game = game;
   }


   private ActionListener createListener() {
   
      ActionListener al = 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (e.getSource() == b1) {
                  System.out.println("Number of letters you have right: " + Integer.toString(GameRules.runComparisonTests(game.getTextBoxes().getUserInput(), game.getFileReader().getComputerString())));
                  Buttons.count ++;
               }
                                 
                  return;
               
            }
         };
      return al;
   }


}