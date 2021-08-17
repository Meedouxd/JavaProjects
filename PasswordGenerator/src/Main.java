import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] cap_letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S",
        "T", "U","V","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] low_letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
                "t", "u","v","w","x","y","z"};
        String[] special = {"!","@","#","$","%","^","&","*","(","{","[","]","}",")"};
        System.out.println("Number of characters: ");
        int num_of_chars = scanner.nextInt();
        System.out.println("Your password is:");
        String password = "";
        for(int x = 0; x < num_of_chars; x++){
           int ran_num = random.nextInt(3);
           if(ran_num == 0){
               password = password + cap_letters[random.nextInt(25)];
           }
            if(ran_num == 1){
                password = password + special[random.nextInt(13)];
            }
            if(ran_num == 2){
                password = password + low_letters[random.nextInt(25)];
            }
        }
        System.out.println(password);
    }
}
