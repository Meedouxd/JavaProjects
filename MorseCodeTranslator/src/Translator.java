
public class Translator {
	String translation = "";
	int cheenie = 0;
	private String am = ".- ";
	private String bm = "-... ";
	private String cm = "-.-. ";
	private String dm = "-.. ";
	private String em = ". ";
	private String fm = "..-. ";
	private String gm = "..-. ";
	private String hm = ".... ";
	private String im = ".. ";
	private String jm = ".--- ";
	private String km = "-.- ";
	private String lm = ".-.. ";
	private String mm = "-- ";
	private String nm = "-. ";
	private String om = "-. ";
	private String pm = "-. ";
	private String qm = "--.- ";
	private String rm = ".-. ";
	private String sm = "... ";
	private String tm = "- ";
	private String um = "..- ";
	private String vm = "...- ";
	private String wm = ".-- ";
	private String xm = "-..- ";
	private String ym = "-.-- ";
	private String zm = "--.. ";
	private String spacem = "/ ";
	private char[] some_chars =  {'a','b','c'};
	private String[] letters = {"a","b","c","d","e","f"
			,"g","h","i","j","k","l","m"
			,"n","o","p","q","r","s","t"
			,"u","v","w","x","y","z",};
	private String[] letters_to_morse = {".- ","-... ","-.-. ","-.. ",". ","..-. ","..-. ",".... ",".. ",".--- "
			,"-.- ",".-.. ","-- ","-. ","-. ","-. "
			,"--.- ",".-. ","... ","- ","..- "
			,"...- ",".-- ","-..- ","-.-- ","--.. "};
	public String betterTranslate(String text) {
		String translation = "";
		int tl = text.length();
		char next_char = text.charAt(0);
		return translation;
	}
	public String translateLetterToMorse(String text) {
		int tl = text.length();
		while(tl > 0) {
			switch(text.charAt(cheenie)){
			case 'a':
				translation = translation + am;
				cheenie++;
				break;
			case 'b':
				translation = translation + bm;
				cheenie++;
				break;
			case 'c':
				translation = translation + cm;
				cheenie++;
				break;
			case 'd':
				translation = translation + dm;
				cheenie++;
				break;
			case 'e':
				translation = translation + em;
				cheenie++;
				break;
			case 'f':
				translation = translation + fm;
				cheenie++;
				break;
			case 'g':
				translation = translation + gm;
				cheenie++;
				break;
			case 'h':
				translation = translation + hm;
				cheenie++;
				break;
			case 'i':
				translation = translation + im;
				cheenie++;
				break;
			case 'j':
				translation = translation + jm;
				cheenie++;
				break;
			case 'k':
				translation = translation + km;
				cheenie++;
				break;
			case 'l':
				translation = translation + lm;
				cheenie++;
				break;
			case 'm':
				translation = translation + mm;
				cheenie++;
				break;
			case 'n':
				translation = translation + nm;
				cheenie++;
				break;
			case 'o':
				translation = translation + om;
				cheenie++;
				break;
			case 'p':
				translation = translation + pm;
				cheenie++;
				break;
			case 'q':
				translation = translation + qm;
				cheenie++;
				break;
			case 'r':
				translation = translation + rm;
				cheenie++;
				break;
			case 's':
				translation = translation + sm;
				cheenie++;
				break;
			case 't':
				translation = translation + tm;
				cheenie++;
				break;
			case 'u':
				translation = translation + um;
				cheenie++;
				break;
			case 'v':
				translation = translation + vm;
				cheenie++;
				break;
			case 'w':
				translation = translation + wm;
				cheenie++;
				break;
			case 'x':
				translation = translation + xm;
				cheenie++;
				break;
			case 'y':
				translation = translation + ym;
				cheenie++;
				break;
			case 'z':
				translation = translation + zm;
				cheenie++;
				break;
			case ' ':
				translation = translation + spacem;
				cheenie++;
				break;
			}
			tl--;
		}
		cheenie = 0;
		tl = 0;
		
		return translation;
	}
	public String translateMorseToLetter(String text) {
		return text;
		
	}
	public void clearTranslation() {
		translation = "";
	}
}
