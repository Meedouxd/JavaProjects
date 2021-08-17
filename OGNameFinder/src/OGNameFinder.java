import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OGNameFinder {
    public static void main(String args[]) throws IOException {
        Scanner cmdScanner = new Scanner(System.in);
        System.out.println("What is the text file you would like to read from? (include full file path)");
        String txt_file = cmdScanner.nextLine();
        String ls = System.getProperty("line.separator");
        File fileToRead = new File(txt_file);
        File fileToWrite = new File("og_names.txt");
        if (fileToWrite.createNewFile()) {
            System.out.println("File created: " + fileToWrite.getName());
        } else {
            System.out.println("File already exists");
        }
        FileWriter fw = new FileWriter(fileToWrite);
        Scanner scanner = new Scanner(fileToRead);
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--window-size=1920,1200");
        while(scanner.hasNextLine()){
            WebDriver driver= new ChromeDriver(/*options*/);
            String currentLine = scanner.nextLine();
            driver.get("https://namemc.com/search?q=" + currentLine);
            char avaChar = driver.findElement(By.xpath("//*[@id=\"status-bar\"]")).getText().charAt(7);
            if(avaChar == 'A'){
                System.out.println("Name is available!: " + currentLine);
                fw.write(currentLine);
                fw.write(ls);
            }
            if(avaChar == 'U' || avaChar == 'T'){
                System.out.println("Name is not available: " + currentLine);
            }
            driver.close();
        }
        fw.close();
    }
}
