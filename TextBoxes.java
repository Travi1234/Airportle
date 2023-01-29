import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextBoxes extends JPanel{

   JTextField t;
   
   public TextBoxes() {
   
      setBackground(new Color(0,181,226));  // change the background color to what you want
      setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
      t = new JTextField("Enter Airport Code Here - 3 Letters");
      t.setFont(new Font(t.getFont().getName(), Font.PLAIN, 20));
         t.addFocusListener(new FocusListener() {
            @Override public void focusLost(final FocusEvent pE) {}
            @Override public void focusGained(final FocusEvent pE) {
                t.selectAll();
            }
        });

      add(t);
   
   JTextField s;
      for(int i = 0; i < 5; i++) {
         s = new JTextField();
         add(s);
      }
      
}
}