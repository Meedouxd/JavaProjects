import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicsHelper extends JPanel {
    Random random = new Random();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        for(int y = 0; y < 1024; y++){
            for(int x = 0; x < 1024; x++){
                g.fillRect(x,y,1,1);
                g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            }
        }

    }
}
