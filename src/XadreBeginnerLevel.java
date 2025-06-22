public class XadreBeginnerLevel {
    // Constants for basic directions
    public static final int RIGHT = 1;
    public static final int LEFT = 2;
    public static final int UP = 3;
    public static final int DOWN = 4;

    // Constants for movement squares
    public static final int BISHOP_MOVES = 5;
    public static final int ROOK_MOVES = 5;
    public static final int QUEEN_MOVES = 8;

    public static void main(String[] args) {
        System.out.println("=== Chess Piece Movement Simulation in MateCheck ===");

        // Bishop movement (diagonal up-right: UP + RIGHT)
        System.out.println("\nBishop Movement:");
        moveBishop();

        // Rook movement (to the right)
        System.out.println("\nRook Movement:");
        moveRook();

        // Queen movement (to the left)
        System.out.println("\nQueen Movement:");
        moveQueen();
    }

    /**
     * Simulates Bishop movement in the up-right diagonal
     * using a combination of basic directions
     */
    public static void moveBishop() {
        System.out.println("Bishop moving " + BISHOP_MOVES +
                " squares up-right diagonally:");

        // Using for loop to control movement
        for (int i = 1; i <= BISHOP_MOVES; i++) {
            System.out.println("Step " + i + ": Moving " +
                    interpretDirection(UP) + " and " +
                    interpretDirection(RIGHT));
        }
    }

    /**
     * Simulates Rook movement to the right
     */
    public static void moveRook() {
        System.out.println("Rook moving " + ROOK_MOVES +
                " squares to the right:");

        // Using while loop to control movement
        int i = 1;
        while (i <= ROOK_MOVES) {
            System.out.println("Step " + i + ": Moving " +
                    interpretDirection(RIGHT));
            i++;
        }
    }

    /**
     * Simulates Queen movement to the left
     */
    public static void moveQueen() {
        System.out.println("Queen moving " + QUEEN_MOVES +
                " squares to the left:");

        // Using do-while loop to control movement
        int i = 1;
        do {
            System.out.println("Step " + i + ": Moving " +
                    interpretDirection(LEFT));
            i++;
        } while (i <= QUEEN_MOVES);
    }

    /**
     * Converts numeric direction code to text
     * @param direction Numeric direction code
     * @return String with direction name
     */
    public static String interpretDirection(int direction) {
        switch (direction) {
            case RIGHT: return "RIGHT";
            case LEFT: return "LEFT";
            case UP: return "UP";
            case DOWN: return "DOWN";
            default: return "UNKNOWN";
        }
    }

}
