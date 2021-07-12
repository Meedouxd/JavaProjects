import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
	JFrame frame = new JFrame("CS:GO Case Simulator");  
    JPanel panel = new JPanel();    
    JLabel label = new JLabel("Number of cases: ");  
    JTextField textField = new JTextField(5);
    JButton button = new JButton("Enter");
    //Image = new ImageIcon(getClass().getClassLoader().getResource("csgo.png"));
    Roll roll = new Roll();
    public int numofcases = 0;
    FileHelper fh = new FileHelper();
	public void initGUI() {
	    panel.add(label);   
	    panel.add(textField);
	    panel.add(button);
	    frame.add(panel);  
	    frame.setSize(400, 80);
	    
	    label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("csgo.png")));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    frame.setVisible(true);
	    frame.setResizable(false);
	    button.addActionListener(this);
	}

@Override
public void actionPerformed(ActionEvent event) {
		if(event.getSource() == button) {
			numofcases = Integer.parseInt(textField.getText());
			if(numofcases < 9999) {
				fh.writeToFile(numofcases);
			}
			
		}
	}
}