import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		SystemStuff s = new SystemStuff();
		Calculator calc = new Calculator();
		s.sysOut("What is the a value?");
		a = scanner.nextInt();
		s.sysOut("What is the b value?");
		b = scanner.nextInt();
		s.sysOut("What is the c value?");
		c = scanner.nextInt();
		calc.calculate(a, b, c);
		scanner.close();
	}
}
