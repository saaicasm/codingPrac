public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private GameState gameState;

    public Game(int boardSize, Player player1, Player player2) {
        this.board = new Board(boardSize);
        this.players = new Player[2];
        this.players[0] = player1;
        this.players[1] = player2;
        this.currentPlayerIndex = 0; 
        this.gameState = GameState.IN_PROGRESS;
        System.out.println("Game initialized with " + player1 + " and " + player2 + " on a " + boardSize + "x" + boardSize + " board.");
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public GameState getGameState() {
        return gameState;
    }


    public boolean playTurn(int row, int col) {
        if (gameState != GameState.IN_PROGRESS) {
            System.out.println("Game is already over. Current state: " + gameState);
            return false;
        }

        Player currentPlayer = getCurrentPlayer();
        Mark currentMark = currentPlayer.getMark();

        if (board.makeMove(row, col, currentMark)) {
            board.printBoard(); 
            checkGameStatus(currentMark);
            if (gameState == GameState.IN_PROGRESS) {
                switchPlayer();
            }
            return true;
        }
        return false; 
    }

    private void checkGameStatus(Mark lastMark) {
        if (board.checkWin(lastMark)) {
            if (lastMark == players[0].getMark()) {
                gameState = GameState.PLAYER1_WON;
            } else {
                gameState = GameState.PLAYER2_WON;
            }
            System.out.println("Game Over! " + getCurrentPlayer().getName() + " Wins!");
        } else if (board.isBoardFull()) {
            gameState = GameState.DRAW;
            System.out.println("Game Over! It's a Draw!");
        }
    }

    private void switchPlayer() {
        currentPlayerIndex = 1 - currentPlayerIndex; 
    }

    
    public static void main(String[] args) {
        Player p1 = new Player("Alice", Mark.X);
        Player p2 = new Player("Bob", Mark.O);
        Game game = new Game(3, p1, p2); 

        
        game.playTurn(0, 0); 
        game.playTurn(1, 1); 
        game.playTurn(0, 1); 
        game.playTurn(2, 2); 
        game.playTurn(0, 2); 

        System.out.println("Final Game State: " + game.getGameState());

        
        System.out.println("\n--- Starting a new game for a draw scenario ---");
        game = new Game(3, p1, p2);
        game.playTurn(0, 0); 
        game.playTurn(1, 1); 
        game.playTurn(0, 1); 
        game.playTurn(0, 2); 
        game.playTurn(2, 0); 
        game.playTurn(1, 0); 
        game.playTurn(1, 2); 
        game.playTurn(2, 1); 
        game.playTurn(2, 2); 

        System.out.println("Final Game State: " + game.getGameState());
    }
}
