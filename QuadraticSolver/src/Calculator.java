
public class Calculator {
	public void calculate(int a, int b, int c) {
		int neg_b = b * -1;;
		int bsqrd = b * b;
		int denominator = 2 * a;
		double radicand = bsqrd - (4*a*c);
		double plus_ans = (neg_b + Math.sqrt(radicand)) / denominator;
		double minus_ans = (neg_b - Math.sqrt(radicand)) / denominator;
		if(isAnInteger(Math.sqrt(radicand))) {
			if(isAnInteger(plus_ans) && isAnInteger(minus_ans)){
				System.out.println("x: " + plus_ans + "," + minus_ans);
				return;
			}
			if(isAnInteger(plus_ans) && isAnInteger(minus_ans) == false) {
				System.out.println("x = " + plus_ans + ", " + neg_b + " -" + Math.sqrt(radicand) + "/" + denominator);
				return;
			}
			if(isAnInteger(minus_ans) && isAnInteger(plus_ans) == false) {
				System.out.println("x = " + minus_ans + ", " + neg_b + " +" + Math.sqrt(radicand) + "/" + denominator);
				return;
			}
			else {
				System.out.println("x = " + neg_b + " (+/-) " + Math.sqrt(radicand) + "/" + denominator);
			}
			System.out.println("x = " + neg_b + " (+/-) " + Math.sqrt(radicand) + "/" + denominator);
		}else {
			System.out.println("x = " + neg_b + " (+/-) " + "sqrt(" + radicand + ")" + "/" + denominator);
		}
	}
	public boolean isAnInteger(double x) {
		if(Math.floor(x) == x) {
			return true;
		}else {
			return false;
		}
		
	}
}
