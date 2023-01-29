import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class APimage extends JFrame {

   // Adding the custom icon
   private void setFrameOptions() {
      Image icon = Toolkit.getDefaultToolkit().getImage("resources/Airportle.png"); // The icon
      setIconImage(icon); // Setting the icon
   }

   public static void main(String[] args) {
      APimage gui = new APimage();
   }
}