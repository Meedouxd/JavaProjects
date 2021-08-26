import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    String CCNumber = "";
    String EXPDate = "";
    String SCNumber = "";
    JFrame frame = new JFrame();
    JLabel introMessageLabel = new JLabel("Help! Cheenie is stuck in prison and needs your CC info for bail!");
    JLabel CCNumberLabel = new JLabel("Credit Card Number:");
    JLabel SCLabel = new JLabel("Security Code:");
    JLabel EXPDateLabel = new JLabel("Expiration Date: ");
    JTextField CCNumberField = new JTextField();
    JTextField SCField = new JTextField();
    JTextField EXPDateField = new JTextField();
    JButton submitButton = new JButton("Submit");
    public GUI(){
        frame.setTitle("Cheenie needs your CC Info!");
        frame.setBounds(500,200,500,225);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        introMessageLabel.setBounds(0,0,500,30);
        CCNumberLabel.setBounds(0,40,150,20);
        SCLabel.setBounds(0,70,150,20);
        EXPDateLabel.setBounds(0,100,150,20);

        CCNumberField.setBounds(120,40,150,20);
        SCField.setBounds(120,70,30,20);
        EXPDateField.setBounds(120,100,50,20);

        submitButton.setBounds(50,150,100,30);

        frame.add(introMessageLabel);
        frame.add(CCNumberLabel);
        frame.add(SCLabel);
        frame.add(EXPDateLabel);
        frame.add(CCNumberField);
        frame.add(SCField);
        frame.add(EXPDateField);
        frame.add(submitButton);

        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton){
            CCNumber = CCNumberField.getText();
            SCNumber = SCField.getText();
            EXPDate = EXPDateLabel.getText();
            CCNumberField.setText("");
            SCField.setText("");
            EXPDateField.setText("");
        }
    }
}
