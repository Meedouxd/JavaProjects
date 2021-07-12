import java.util.Scanner;

public class Yahtzee {

    public static void main(String args[]){
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        player.listAllDice();
        player.calculateScore();
        while(player.rolls < 3){
            System.out.println("Re-roll? (yes/no)");
            String answer = scanner.next();
            while(!answer.equals("yes") && !answer.equals("no")){
                System.out.println("Invalid character");
                System.out.println("Re-roll? (yes/no)");
                answer = scanner.next();
            }
            if(answer.equals("yes") && player.rolls < 3){
                System.out.println("How many would you like to re-roll?");
                int num_of_dice = scanner.nextInt();
                for(int i = 0; i < num_of_dice; i++){
                    System.out.println("Which dice? (0 - 4)");
                    int dice_number_to_reroll = scanner.nextInt();
                    player.dice[dice_number_to_reroll].roll();
                }
                player.listAllDice();
                player.calculateScore();
                player.rolls++;
            }
            if(answer.equals("no")){
                System.out.println("Thanks for playing!");
                return;
            }
        }
        }

}
