import java.util.*;
public class practice1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Attila's Practice Program!");
        System.out.println("Select options");
        System.out.println("Press 1 to Add");
        System.out.println("Press 5 to Exit");
        System.out.println("Waiting for your input..."); // Debug line
        int option = input.nextInt();
        System.out.println("You entered: " + option); // Debug line
        input.nextLine();

        if(option==1){
            System.out.println("Enter 2 numbers to add");
            System.out.println("Enter Number");
            System.out.println("Waiting for first number..."); // Debug line
            int number1 = input.nextInt();
            System.out.println("You entered: " + number1); // Debug line
            input.nextLine();
            System.out.println("Enter Number");
            System.out.println("Waiting for second number..."); // Debug line
            int number2 = input.nextInt();
            System.out.println("You entered: " + number2); // Debug line
            input.nextLine();
            int ans = number1 + number2;
            System.out.println("The answer is " + ans);
        }
        else {
            System.out.println("Exiting or invalid option selected.");
        }

        // Close the scanner
        input.close();
    }
}












    

