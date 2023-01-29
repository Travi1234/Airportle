import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Image;

public class Myframe extends JFrame {

   Myframe(String title) {
      setTitle(title);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // HIDE_ON_CLOSE, DO_NOHING_ON_CLOSE
     // setSize(500, 400); // width, height
      setLocationRelativeTo(null); // CENTER YOUR WINDOW
      Image icon = Toolkit.getDefaultToolkit().getImage("resources/Airportle.png"); // The icon picture
      setIconImage(icon); // Setting the icon
         
   }
}