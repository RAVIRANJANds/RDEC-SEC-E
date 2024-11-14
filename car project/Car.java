import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Car extends JPanel {
    BufferedImage carImage;
    Random random = new Random();
    int carXaxis=random.nextInt(311)+90;
    int carYaxis = 0;
    Car(){
        try{
            carImage=ImageIO.read(Car.class.getResource("downCAR.jpg"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}