import java.util.Scanner;

public class RpsGame {
        private static final String EXIT = "x";
        private static final String NEW_GAME = "n";
        private int userScore;
        private int computerScore;

        public RpsGame() {
        }

        public void determineWinner(UserInterface userInterface, Shapes userShape, Shapes computerShape, String playerName) {
            if (!userShape.equals(computerShape)) {
                if ((!userShape.equals(Shapes.STONE) || !computerShape.equals(Shapes.SCISSORS)) && (!userShape.equals(Shapes.SCISSORS) || !computerShape.equals(Shapes.PAPER)) && (!userShape.equals(Shapes.PAPER) || !computerShape.equals(Shapes.STONE))) {
                    ++this.computerScore;
                    userInterface.computerWinsMessage(playerName, this.userScore, this.computerScore);
                } else {
                    ++this.userScore;
                    userInterface.userWinsMessage(playerName, this.userScore, this.computerScore);
                }
            } else {
                userInterface.drawMessage(playerName, this.userScore, this.computerScore);
            }

        }

        public boolean run( UserInterface userInterface, Scanner scanner, String playerName) {
            this.userScore = 0;
            this.computerScore = 0;
            userInterface.askForNumberOfRounds(playerName);
            CommandValidator commandValidator = new CommandValidator();

            int roundsPerGame;
            do {
                roundsPerGame = commandValidator.validateNumber(scanner.nextLine());
                if (roundsPerGame == 0) {
                    userInterface.incorrectRoundsInput();
                }
            } while(roundsPerGame == 0);

            userInterface.mainMenu();
            int roundCount = 0;
            boolean exit = false;
            ShapeGenerator shapeGenerator = new ShapeGenerator();

            String userInput;
            while(roundCount < roundsPerGame) {
                ++roundCount;
                userInput = commandValidator.validateGameInput(scanner.nextLine(), scanner, userInterface);
                byte e = -1;
                switch(userInput) {
                    case "n":
                        if (userInput.equals("n")) {
                            e = 1;
                        }
                        break;
                    case "x":
                        if (userInput.equals("x")) {
                            e = 0;
                        }
                }

                switch(e) {
                    case 0:
                        exit = true;
                        roundCount = roundsPerGame;
                        break;
                    case 1:
                        roundCount = roundsPerGame;
                        break;
                    default:
                        Shapes userShape = Shapes.valueOf(userInput.toUpperCase());
                        Shapes computerShape = shapeGenerator.generateShape(userShape);
                        userInterface.showRoundResult(userShape, computerShape);
                        this.determineWinner(userInterface, userShape, computerShape, playerName);
                }
            }

            userInterface.displayScores(this.userScore, this.computerScore);
            userInput = commandValidator.validateEndOfGameChoice(scanner.nextLine(), scanner, userInterface);
            if (userInput.equals("x")) {
                exit = true;
            }

            return exit;

        }
    }


