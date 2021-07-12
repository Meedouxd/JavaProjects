import java.util.Random;

public class Player {
    Dice[] dice = new Dice[5];
    private int pairs = 0;
    private int triples = 0;
    private int aces = 0;
    private int yahtzees = 0;
    private int fullhouses = 0;
    public int rolls = 0;
    public boolean reRoll = false;
    public Player(){
        for(int i = 0; i < 5; i++){
            dice[i] = new Dice();
        }
        rollAll();
    }
    public void rollAll(){
        for(int i = 0; i < 5; i++){
            dice[i].roll();
        }
        rolls++;
    }
    public void checkForPairs(){
        for(int i = 0; i < 4; i++){
            for(int e = i + 1; e < 5; e++){
                if(dice[i].getValue() == dice[e].getValue() && dice[i].hasAPartner != true && dice[e].hasAPartner != true){
                    dice[e].hasAPartner = true;
                    dice[i].hasAPartner = true;
                    pairs++;
                    System.out.println("Pair");
                }
            }
        }
    }
    public void checkForTriples(){
        for(int i = 0; i < 4; i++){
            for(int e = i + 1; e < 5; e++){
                if(dice[i].getValue() == dice[e].getValue()){
                    for(int a = e+1; a < 5; a++){
                        if(dice[a].getValue() == dice[e].getValue()){
                            triples++;
                            System.out.println("Triple");
                        }
                    }
                }
            }
        }
    }
    public void checkForAce() {
        for(int i = 0; i < 4; i++){
            for(int e = i + 1; e < 5; e++){
                if(dice[i].getValue() == dice[e].getValue()){
                    for(int a = e+1; a < 5; a++){
                        if(dice[a].getValue() == dice[e].getValue()){
                            for(int b = a+1; b < 5; b++){
                                if(dice[b].getValue() == dice[a].getValue()){
                                    aces++;
                                    System.out.println("Ace!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void checkForFullHouse(){
        if(triples == 1 && pairs == 2){
            fullhouses++;
            System.out.println("Full house!");
        }
    }
    public void checkForYahtzee(){
        int matching = 0;
        for(int i = 0; i < 5; i++){
            if(dice[0].getValue() == dice[i].getValue()){
                matching++;
            }
            if(matching == 5){
                System.out.println("YAHTZEE");
            }
        }
    }
    public void calculateScore(){
        int score = 0;
        checkForPairs();
        checkForTriples();
        checkForFullHouse();
        checkForAce();
        checkForYahtzee();
        score = (pairs * 5) + (triples * 20) + (fullhouses * 35) +  (aces * 50) + (yahtzees * 100);
        System.out.println("Your score is: " + score);
    }
    public void listAllDice(){
        for(int i = 0; i < 5; i++){
            System.out.print(dice[i].getValue() + ",");
        }
        System.out.println("");
    }
}
class Dice {
    Random random = new Random();
    private int value = 0;
    public boolean hasAPartner = false;
    public int getValue(){
        return value;
    }
    public void setValue(int x){
        value = x;
    }
    public void roll(){
        setValue((random.nextInt(5)) + 1);
    }
}