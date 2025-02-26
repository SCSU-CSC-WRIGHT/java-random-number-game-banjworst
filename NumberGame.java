import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(50) + 1;
        int randomNumber2 = random.nextInt(100) + 1;
        int randoomNumber3 = random.nextInt(500) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("What difficulty level would you like to play?");
        
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-500)");
       
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();
        if (choice > 3){
            System.out.println("Invalid choice. Please select a valid difficulty level.");
        }
       
        int randomNumber = 0;
        if (choice == 1) {
            randomNumber = randomNumber1;
            System.out.println("You have chosen Easy mode. The number is between 1 and 50.");
        } else if (choice == 2) {
            randomNumber = randomNumber2;
            System.out.println("You have chosen Medium mode. The number is between 1 and 100.");
        } else if (choice == 3) {
            randomNumber = randoomNumber3;
            System.out.println("You have chosen Hard mode. The number is between 1 and 500.");
        } 
    
        while (guess != randomNumber && attempts < 10) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }

            

        scanner.close();
    }
}
}