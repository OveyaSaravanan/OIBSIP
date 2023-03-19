import java.util.Scanner;
import java.util.Random;


class Game {
    private int cominput, userinput, noOfGuess = 0;
    public boolean over=false;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public Game() {
        // over = false;
        // noOfGuess = 0;
        cominput = rand.nextInt(100);
    }

    public void input() {
        System.out.print("Enter your choice between 0 to 100:");
        userinput = sc.nextInt();
        noOfGuess++;
    }

    public void isCorrectNumber() {
        if (cominput == userinput) {
            System.out.println("Congratuletions!!! You have entered the correct number in " + noOfGuess + "th attempt.");
            over = true;
        } else if (userinput < cominput)
            System.out.println("OOOPS!!! You have entered a samll number. Please chooes a larger number.");
        else
            System.out.println("OOOPS!!! You have entered a larg number. Please chooes a smaller number.");
    }
}

 class Game_guess_the_number {
    public static void main(String[] args) {
        Game G=new Game();
        while(G.over != true){
            G.input();
            G.isCorrectNumber();
        }
    }
}