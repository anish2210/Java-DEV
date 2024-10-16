import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myNum = (int) (Math.random() * 100)+1;
        Scanner guess = new Scanner(System.in);
        int userGuess = -1, count = 0;
        while (myNum != userGuess) {
            count++;
        System.out.print("Enter a Number: ");
            userGuess = guess.nextInt();
            if (myNum == userGuess) {
                System.out.println("Congratulations you guessed it right :)");
                System.out.println("You guessed it in " + count + " chances.");
                break;
            } else if (userGuess == -1) {
                System.out.println("You quit the game");
                break;
            } else if (myNum > userGuess) {
                System.out.println("Guess a Higher number :(");
            } else {
                System.out.println("Guess a lower number");
            }
        }
    }
}