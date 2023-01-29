import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextBoxes extends JPanel{

   private String userInput;
   JTextField t1, t2, t3, t4, t5, t6;
   
   public TextBoxes() {
   
      setBackground(new Color(0,181,226));  // change the background color to what you want
      setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
      t1 = new JTextField("Enter Airport Code Here - 3 Letters");
      t1.setFont(new Font(t1.getFont().getName(), Font.PLAIN, 20));
         t1.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t1.selectAll();
            }
        });

      add(t1);

      t2 = new JTextField("Enter Airport Code Here - 3 Letters");
      t2.setFont(new Font(t2.getFont().getName(), Font.PLAIN, 20));
         t2.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t2.selectAll();
            }
        });

      add(t2);

      t3 = new JTextField("Enter Airport Code Here - 3 Letters");
      t3.setFont(new Font(t3.getFont().getName(), Font.PLAIN, 20));
         t3.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t3.selectAll();
            }
        });

      add(t3);

      t4 = new JTextField("Enter Airport Code Here - 3 Letters");
      t4.setFont(new Font(t4.getFont().getName(), Font.PLAIN, 20));
         t4.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t4.selectAll();
            }
        });

      add(t4);

      t5 = new JTextField("Enter Airport Code Here - 3 Letters");
      t5.setFont(new Font(t5.getFont().getName(), Font.PLAIN, 20));
         t5.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t5.selectAll();
            }
        });

      add(t5);

      t6 = new JTextField("Enter Airport Code Here - 3 Letters");
      t6.setFont(new Font(t6.getFont().getName(), Font.PLAIN, 20));
         t6.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t6.selectAll();
            }
        });

      add(t6);
   
   /*JTextField s;
      for(int i = 0; i < 5; i++) {
         s = new JTextField();
         add(s);
      }*/
   userInput = "";   
   switch (Buttons.count) {

      case 1:
         userInput = t1.getText();
         break;
      case 2:
         userInput = t2.getText();
         break;

      case 3:
         userInput = t3.getText();
         break;
      
      case 4:
         userInput = t4.getText();
         break;

      case 5:
         userInput = t5.getText();
         break;

      case 6:
         userInput = t6.getText();
         break;

      default:
         System.out.println("You are out of tries. Game over");
         t1.setEditable(false);
         t2.setEditable(false);
         t3.setEditable(false);
         t4.setEditable(false);
         t5.setEditable(false);
         t6.setEditable(false);
   }
}

public String getUserInput() {
   return userInput;
}

}