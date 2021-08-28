import java.util.Random;
import java.util.Scanner;

public class HangMan {
    public static void main(String args[]){
        int guessedRight = 0;
        int health = 5;
        boolean guessedRightboolean = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"cat","dog","car","truck","egg","dictionary"};
        String wordToGuess = words[random.nextInt(5)];
        for(int x = 0; x < wordToGuess.length(); x++){
            System.out.print("_ ");
        }
        System.out.println(System.lineSeparator());
        while(health > 0){
            if(guessedRight == wordToGuess.length()){
                System.out.println("You won!!!");
                break;
            }
            System.out.println("Guess a letter!");
            String guessFromString = scanner.next();
            char guess = guessFromString.charAt(0);
            for(int i = 0; i < wordToGuess.length(); i++){
                if(guess == (wordToGuess.charAt(i))){
                    System.out.println("Correct guess!");
                    guessedRight++;
                    guessedRightboolean = true;
                }
            }
            if(guessedRightboolean != true){
                System.out.println("Wrong.");
                health--;
            }
        }
        if(health <= 0){
            System.out.println("You lost. try again :-/");
        }
    }
}
