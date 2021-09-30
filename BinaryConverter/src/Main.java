import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String binary_number;
        int converted_number = 0;
        int[] binary_array = {0,0,0,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What binary sequence would you like to convert to decimal?");
        binary_number = scanner.next();
        for(int i = 0; i < 8; i++){
            binary_array[i] = binary_number.charAt(i) - 48;
        }

        for(int i = 0; i < 8; i++){
            if(binary_array[i] != 1){
                if(binary_array[i] != 0){
                    System.out.println("Error: Not a binary sequence");
                    return;
                }
            }
        }

        for(int i = 1; i < 8; i++){
            converted_number = converted_number + (int) Math.pow((binary_array[i] * 2), i);
        }

        converted_number = converted_number + binary_array[0];
        System.out.println("Converted number: " + converted_number);
    }
}
