import java.util.Random;

public class Roll {
	double blue = 0.7992;
	double purple = 0.1598;
	double pink = 0.032;
	double red = 0.0064;
	double yellow = 0.0026;
	double statrack = 0.1;
	Random random = new Random();
	int numofblues = 0;
	int numofpurples = 0;
	int numofpinks = 0;
	int numofreds = 0;
	int numofyellows = 0;
	int numofstats = 0;
public String roll(){
	int statrackprob = random.nextInt(10);
	int colorprob = random.nextInt(10000);
	String color = null;
	if(colorprob <= 26) {
		color = "YELLOW!";
		numofyellows++;
	}
	if(colorprob > 26 && colorprob <= 64) {
		color = "Red!";
		numofreds++;
	}
	if(colorprob > 64 && colorprob <= 320) {
		color = "Pink";
		numofpinks++;
	}
	if(colorprob > 320 && colorprob <= 1598) {
		color = "Purple";
		numofpurples++;
	}
	if(colorprob > 1598) {
		color = "Blue";
		numofblues++;
	}
	if(statrackprob == 1) {
		numofstats++;
		return("Stat-track " + color);
		}
	return(color);
	}
public String bluestats() {
	return("# of blues: " + numofblues);
}
public String purplestats() {
	return("# of purples: " + numofpurples);
}
public String pinkstats() {
	return("# of pinks: " + numofpinks);
}
public String redstats() {
	return("# of reds: " + numofreds);
}
public String yellowstats() {
	return("# of yellows: " + numofyellows);
}
public String statstats() {
	return("# of Stat-tracks: " + numofstats);
}
}
