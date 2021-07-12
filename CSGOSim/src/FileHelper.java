import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelper {
String ls = System.getProperty("line.separator");
	public FileHelper() {
		try {
		     File file = new File("csgo_results.txt");
		      FileWriter fw = new FileWriter(file);
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      fw.write("TEST");
		      fw.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	public void writeToFile(int times) {
		File file = new File("csgo_results.txt");
		try {
			Roll roll = new Roll();
			FileWriter fw = new FileWriter(file);
			while(times > 0) {
				fw.write(roll.roll() + ls);
				times--;
			}
			fw.write(roll.bluestats() + ls);
			fw.write(roll.purplestats() + ls);
			fw.write(roll.pinkstats() + ls);
			fw.write(roll.redstats() + ls);
			fw.write(roll.yellowstats() + ls);
			fw.write(roll.statstats() + ls);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
