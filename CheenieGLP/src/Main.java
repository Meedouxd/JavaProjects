import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("  /$$$$$$  /$$                                     /$$            /$$$$$$  /$$       /$$$$$$$ \n" +
                " /$$__  $$| $$                                    |__/           /$$__  $$| $$      | $$__  $$\n" +
                "| $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$$  /$$  /$$$$$$ | $$  \\__/| $$      | $$  \\ $$\n" +
                "| $$      | $$__  $$ /$$__  $$ /$$__  $$| $$__  $$| $$ /$$__  $$| $$ /$$$$| $$      | $$$$$$$/\n" +
                "| $$      | $$  \\ $$| $$$$$$$$| $$$$$$$$| $$  \\ $$| $$| $$$$$$$$| $$|_  $$| $$      | $$____/ \n" +
                "| $$    $$| $$  | $$| $$_____/| $$_____/| $$  | $$| $$| $$_____/| $$  \\ $$| $$      | $$      \n" +
                "|  $$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$$| $$  | $$| $$|  $$$$$$$|  $$$$$$/| $$$$$$$$| $$      \n" +
                " \\______/ |__/  |__/ \\_______/ \\_______/|__/  |__/|__/ \\_______/ \\______/ |________/|__/      \n" +
                "                                                                                              \n" +
                "                                                                                              \n" +
                "                                                                                              ");
        Command cmd = new Command();
        System.out.println("Type cmd for a list of commands");
        String input = scanner.next();
        while(!input.equals(cmd.getList(1))){
            cmd.determineCommand(input);
            input = scanner.next();
        }
        System.out.println("Program ended");
    }

}
