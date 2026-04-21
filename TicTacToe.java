public class TicTacToe {

    // 3x3 board
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    // Initialize the board with '-'
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Print the board in proper format
    static void printBoard() {
        System.out.println("Tic-Tac-Toe Board:\n");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);

                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            if (row < 2) {
                System.out.println("---------");
            }
        }
    }
}
