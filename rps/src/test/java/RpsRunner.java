import java.util.Scanner;

public class RpsRunner {
    public RpsRunner() {
    }

    public static void main( String[] args ) {
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        userInterface.welcomeMessage();

        RpsGame rpsGame;
        for (String playerName = scanner.nextLine(); !exit; exit = rpsGame.run(userInterface, scanner, playerName)) {
            rpsGame = new RpsGame();
        }

    }
}