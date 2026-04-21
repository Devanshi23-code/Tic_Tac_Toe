import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // UC2: Toss and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();

        // 0 = Human starts, 1 = Computer starts
        int toss = rand.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result
    static void displayTossResult() {
        System.out.println("=== Toss Result ===");

        if (isHumanTurn) {
            System.out.println("Human won the toss and will play first.");
        } else {
            System.out.println("Computer won the toss and will play first.");
        }

        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }
}