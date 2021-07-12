import java.io.IOException;

public class Paint {
public static void main(String args[]) {
	Runtime runtime = Runtime.getRuntime();
	while(true) {
		try {
			runtime.exec("mspaint.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
