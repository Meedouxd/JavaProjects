import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GUI implements ActionListener {
    int names_found = 0;
    int names_searched = 0;
    Webscrape ws = new Webscrape();
    JFrame frame = new JFrame();
    JButton findButton = new JButton("Search Names");
    JButton openFileButton = new JButton("Open File");
    JLabel dirLabel = new JLabel();
    JLabel namesFoundLabel = new JLabel("Names Found: " + names_found);
    JLabel namesSearchedLabel = new JLabel("Names Searched: " + names_searched);
    JLabel statusLabel = new JLabel("Status: idle");
    String fileDir = "";
    public GUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(500,500,500,500);
        frame.setTitle("MCNameFinder");
        frame.getContentPane().setBackground(Color.WHITE);
        //ImageIcon img = new ImageIcon("C:\\Users\\jmorg\\Desktop\\icon.png");
        ImageIcon img = new ImageIcon("res\\icon.png");
        frame.setIconImage(img.getImage());
        frame.add(statusLabel);
        frame.add(findButton);
        frame.add(openFileButton);
        frame.add(namesFoundLabel);
        frame.add(namesSearchedLabel);
        frame.add(dirLabel);


        namesFoundLabel.setBounds(0,60,150,30);
        namesSearchedLabel.setBounds(0,30,150,30);
        statusLabel.setBounds(0,0,150,30);

        findButton.setBounds(0,200,150,30);
        openFileButton.setBounds(0,90,150,30);
        dirLabel.setBounds(0,0,300,30);

        findButton.addActionListener(this);
        openFileButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == findButton){
            if(!fileDir.equals("")){
                try {
                    statusLabel.setText("Status: Searching Names");
                    String ls = System.getProperty("line.separator");
                    File fileToRead = new File(fileDir);
                    File fileToWrite = new File("og_names.txt");
                    if (fileToWrite.createNewFile()) {
                        System.out.println("File created: " + fileToWrite.getName());
                    } else {
                        System.out.println("File already exists");
                    }
                    FileWriter fw = new FileWriter(fileToWrite);
                    Scanner scanner = new Scanner(fileToRead);
                    while(scanner.hasNextLine()){
                        String currentLine = scanner.nextLine();
                        if(!ws.isUsernameTaken(currentLine)){
                            names_found++;
                            namesFoundLabel.setText("Names Found: " + names_found);
                            System.out.println(currentLine + " IS NOT TAKEN!");
                            fw.write(currentLine);
                            fw.write(ls);
                        }else{
                            System.out.println(currentLine + " is taken");
                        }
                        names_searched++;
                        namesSearchedLabel.setText("Names Searched: " + names_searched);
                        Thread.sleep(1000);
                    }
                    fw.close();
                } catch (IOException | InterruptedException ex) {
                    ex.printStackTrace();
                }
                statusLabel.setText("Status: Done!");
            }
        }
        else if(e.getSource() == openFileButton){
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            chooser.setSelectedFile(new File(""));
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            // chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showOpenDialog(frame) == JFileChooser.OPEN_DIALOG) {
                fileDir = chooser.getSelectedFile().toString();
                dirLabel.setText("File directory: " + fileDir);
            }
        }
    }
}
