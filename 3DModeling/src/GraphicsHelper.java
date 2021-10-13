import javax.swing.*;
import java.awt.*;

public class GraphicsHelper extends JPanel {
    private int depth = 25;
    //depth is originally 25;
    private int fsX[] = {50,100};
    private int fsY[] = {50,100};
    private int bsX[] = {fsX[0] + depth, fsX[1] + depth};
    private int bsY[] = {fsY[0] + depth, fsY[1] + depth};

    public int getDepth(){
        return depth;
    }
    public void setDepth(int x){
        depth = x;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.RED);
        //draw first square
        g.drawLine(fsX[0],fsY[0],fsX[0],fsY[1]);
        g.drawLine(fsX[0],fsY[0],fsX[1],fsY[0]);
        g.drawLine(fsX[1],fsY[1],fsX[0],fsY[1]);
        g.drawLine(fsX[1],fsY[0],fsX[1],fsY[1]);
        //draw second square
        g.drawLine(bsX[0],bsY[0],bsX[0],bsY[1]);
        g.drawLine(bsX[0],bsY[0],bsX[1],bsY[0]);
        g.drawLine(bsX[1],bsY[1],bsX[0],bsY[1]);
        g.drawLine(bsX[1],bsY[0],bsX[1],bsY[1]);
        //connect the squares
        g.drawLine(fsX[0],fsY[0], bsX[0], bsY[0]);
        g.drawLine(fsX[0],fsY[1], bsX[0], bsY[1]);
        g.drawLine(fsX[1],fsY[0], bsX[1], bsY[0]);
        g.drawLine(fsX[1],fsY[1], bsX[1], bsY[1]);

    }

}