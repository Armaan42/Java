package OOPS;

class Player {
    String name;
    int guess;

    // Method to make a guess
    void makeGuess() {
        guess = (int)(Math.random() * 10); // Generate a random guess between 0 and 9
        System.out.println(name + " is guessing " + guess); // Print the player's guess
    }

    // Constructor to initialize the player's name
    Player(String n) {
        name = n;
    }
}

class Game {
    Player p1, p2, p3;
    private int expectedGuess; // The number to guess

    // Constructor to initialize the game with player names
    Game(String name1, String name2, String name3) {
        // Create player objects with provided names
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    // Method to check if any player has won
    private boolean checkWinner() {
        // Check if any player's guess matches the expected guess
        if (p1.guess == expectedGuess) {
            System.out.println(p1.name + " wins"); // Print the winner's name
            return true; // Return true if a winner is found
        } else if (p2.guess == expectedGuess) {
            System.out.println(p2.name + " wins"); // Print the winner's name
            return true; // Return true if a winner is found
        } else if (p3.guess == expectedGuess) {
            System.out.println(p3.name + " wins"); // Print the winner's name
            return true; // Return true if a winner is found
        }
        return false; // Return false if no winner is found
    }

    // Method to start the game
    void start() {
        // Print welcome message with player names
        System.out.println("Welcome to the Game! " + p1.name + " " + p2.name + " " + p3.name);
        // Generate the number to guess
        expectedGuess = (int)(Math.random() * 10);
        // Print the number to guess
        System.out.println("Number to guess is " + expectedGuess);

        // Run the game until a winner is found
        while (true) {
            // Each player makes a guess
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            // Check if any player has won
            boolean someoneWins = checkWinner();
            // If someone wins, print "Game over!" and end the game
            if (someoneWins) {
                System.out.println("Game over!");
                break; // Exit the loop
            } else {
                // If no one wins, generate a new number to guess
                expectedGuess = (int)(Math.random() * 10);
            }
        }
    }
}

public class TestGame {
    public static void main(String[] args) {
        // Creating a game with three players
        Game g1 = new Game("John", "Arti", "Riya");
        // Start the game
        g1.start();
    }
}
