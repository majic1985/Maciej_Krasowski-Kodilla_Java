import java.util.Scanner;

public class CommandValidator {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private static final String YES = "Y";
    private static final String NO = "N";
    private static final String MENU_CHOICE_1 = "1";
    private static final String MENU_CHOICE_2 = "2";
    private static final String MENU_CHOICE_3 = "3";

    public CommandValidator() {
    }

    public int validateNumber(String roundsNumber) {
        if (roundsNumber.isEmpty()) {
            return 0;
        } else {
            roundsNumber = roundsNumber.replaceAll(" ", "");
            char[] charNumber = roundsNumber.toCharArray();

            for(int i = 0; i < charNumber.length; ++i) {
                if (!Character.isDigit(charNumber[i])) {
                    return 0;
                }
            }

            return Integer.parseInt(roundsNumber);
        }
    }

    public String validateGameInput( String input, Scanner scanner, UserInterface userInterface) {
        while(true) {
            byte e = -1;
            switch(input.hashCode()) {
                case 49:
                    if (input.equals("1")) {
                        e = 0;
                    }
                    break;
                case 50:
                    if (input.equals("2")) {
                        e = 1;
                    }
                    break;
                case 51:
                    if (input.equals("3")) {
                        e = 2;
                    }
                    break;
                case 110:
                    if (input.equals("n")) {
                        e = 4;
                    }
                    break;
                case 120:
                    if (input.equals("x")) {
                        e = 3;
                    }
            }

            switch(e) {
                case 0:
                    return Shapes.STONE.getText();
                case 1:
                    return Shapes.PAPER.getText();
                case 2:
                    return Shapes.SCISSORS.getText();
                case 3:
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (!input.toUpperCase().equals("Y")) {
                        break;
                    }

                    return "x";
                case 4:
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (!input.toUpperCase().equals("Y")) {
                        break;
                    }

                    return "n";
                default:
                    userInterface.incorrectGameInput();
                    input = scanner.nextLine();
            }
        }
    }

    public String validateEndOfGameChoice(String input, Scanner scanner, UserInterface userInterface) {
        while(true) {
            byte e = -1;
            switch(input.hashCode()) {
                case 110:
                    if (input.equals("N")) {
                        e = 1;
                    }
                    break;
                case 120:
                    if (input.equals("x")) {
                        e = 0;
                    }
            }

            switch(e) {
                case 0:
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (!input.toUpperCase().equals("Y")) {
                        break;
                    }

                    return "x";
                case 1:
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (!input.toUpperCase().equals("Y")) {
                        break;
                    }

                    return "N";
                default:
                    userInterface.incorrectEndOfGameInput();
                    input = scanner.nextLine();
            }
        }
    }
}


