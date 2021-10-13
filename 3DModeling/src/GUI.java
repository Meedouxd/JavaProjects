import javax.swing.*;
import java.util.Scanner;

public class GUI {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        GraphicsHelper g = new GraphicsHelper();
        frame.setBounds(0,0,500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("3D Shape Demo");
        frame.add(g);
    }
}
