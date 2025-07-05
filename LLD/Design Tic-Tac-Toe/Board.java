public class Board {
    private Mark[][] cells;
    private int size;
    private int[] rowSums;   
    private int[] colSums;
    private int diagSum;
    private int antiDiagSum;
    private int movesMade; 

    public Board(int size) {
        this.size = size;
        this.cells = new Mark[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = Mark.EMPTY;
            }
        }
        this.rowSums = new int[size];
        this.colSums = new int[size];
        this.diagSum = 0;
        this.antiDiagSum = 0;
        this.movesMade = 0;
    }

    public boolean makeMove(int row, int col, Mark mark) {
        if (!isValidMove(row, col)) {
            System.out.println("Invalid move: Cell (" + row + ", " + col + ") is already occupied or out of bounds.");
            return false;
        }

        cells[row][col] = mark;
        movesMade++;

        int value = (mark == Mark.X) ? 1 : -1; 
        rowSums[row] += value;
        colSums[col] += value;

        if (row == col) {
            diagSum += value;
        }
        if (col == (size - 1 - row)) { 
            antiDiagSum += value;
        }
        return true;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && cells[row][col] == Mark.EMPTY;
    }

    public boolean isBoardFull() {
        return movesMade == size * size;
    }

    public Mark getCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IllegalArgumentException("Row or column out of bounds.");
        }
        return cells[row][col];
    }

  
    public boolean checkWin(Mark mark) {
        int targetSum = (mark == Mark.X) ? size : -size;

        
        for (int i = 0; i < size; i++) {
            if (rowSums[i] == targetSum || colSums[i] == targetSum) {
                return true;
            }
        }

        
        if (diagSum == targetSum || antiDiagSum == targetSum) {
            return true;
        }
        return false;
    }

    public void printBoard() {
        System.out.println("--- Current Board ---");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(cells[i][j] == Mark.EMPTY ? " " : cells[i][j]);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) System.out.print("-");
                }
                System.out.println();
            }
        }
        System.out.println("---------------------");
    }
}