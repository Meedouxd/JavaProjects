import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Morse Code Translator");
	JPanel panel = new JPanel();
	JButton translateButton = new JButton("Translate");
	JButton clearButton = new JButton("Clear");
	JTextField textField = new JTextField(20);
	JTextField textFieldOutPut = new JTextField(20);
	Translator trsl = new Translator();
	String translatedText = "";
	public void init() {
		frame.setBounds(500, 500, 500, 500);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(textField);
		panel.add(textFieldOutPut);
		panel.add(translateButton);
		panel.add(clearButton);
		translateButton.addActionListener(this);
		clearButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
			if(event.getSource() == translateButton) {
				if(textField.getText() != "") {
					if(textField.getText().startsWith(".") || textField.getText().startsWith("-")) {
						textFieldOutPut.setText(trsl.translateMorseToLetter(textField.getText()));
						trsl.clearTranslation();
					}else {
						textFieldOutPut.setText(trsl.translateLetterToMorse(textField.getText()));
						trsl.clearTranslation();
					}
					
				}
			}
			if(event.getSource() == clearButton) {
				textField.setText("");
				textFieldOutPut.setText("");
			}
		}
}
