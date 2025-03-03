import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game. Guess the number between 1 to 100");
        int guess, result;
        do{
            System.out.println("Guess the number");
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("congrats, you guess the correct");
            } else if(result < 0){
                System.out.println("Please guess higher");
            }else{
                System.out.println("Please guess lower");
            }
        } while(result != 0);
    }
}
