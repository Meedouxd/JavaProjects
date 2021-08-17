import javax.swing.*;

public class SkinCreator {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        GraphicsHelper g = new GraphicsHelper();
        frame.setBounds(1024,1024,1024,1024);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(g);
    }
}
