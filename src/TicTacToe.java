import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 * Play a Tic-tac-toe game in the console
 * positions are 1-9 from left to right, top to bottom
 * example:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();


    public static void main(String[] args) {

        // create the tictactoe board
        char[] [] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printGameBoard(gameBoard);

        while(true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerBoardPosition = scan.nextInt();
            while(playerPositions.contains(playerBoardPosition) || cpuPositions.contains(playerBoardPosition)) {
                System.out.println("Position already taken");
                playerBoardPosition = scan.nextInt();
            }

            System.out.println(playerBoardPosition);

            placePiece(gameBoard, playerBoardPosition, "player");

            String playerMoveResult = checkWinner();
            if(playerMoveResult.length() > 0) {
                System.out.println(playerMoveResult);
                break;
            }

            Random randomNumber = new Random();
            int cpuBoardPosition = randomNumber.nextInt(9) + 1;
            while(playerPositions.contains(cpuBoardPosition) || cpuPositions.contains(cpuBoardPosition)) {
                cpuBoardPosition = randomNumber.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuBoardPosition, "cpu");

            printGameBoard(gameBoard);

            String cpuMoveResult = checkWinner();
            if(cpuMoveResult.length() > 0) {
                System.out.println(cpuMoveResult);
                break;
            }
        }
    }

    private static void placePiece(char[][] gameBoard, int boardPosition, String user) {

        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
            playerPositions.add(boardPosition);
        } else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(boardPosition);
        }

        switch(boardPosition) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char symbol : row) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(7, 5, 3);

        List<List> winningCondition = new ArrayList<>();

        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(botRow);
        winningCondition.add(leftCol);
        winningCondition.add(midCol);
        winningCondition.add(rightCol);
        winningCondition.add(diagonal1);
        winningCondition.add(diagonal2);

        for(List l : winningCondition) {
            if(playerPositions.containsAll(l)) {
                return "Congratulations you won!";
            } else if(cpuPositions.containsAll(l)) {
                return "You lose!";
            } else if(playerPositions.size() + cpuPositions.size() == 9) {
                return "Tie game!";
            }
        }

        return "";
    }


}
