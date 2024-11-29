package game;

public class Board {
    String[][] board = {
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
        {"⬜", "⬜", "⬜", "⬛", "⬛", "⬛", "⬜", "⬜"},
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬛", "⬜"},
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬛", "⬜"},
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬛", "⬜", "⬜"},
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬛", "⬜"},
        {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬛", "⬜"},
        {"⬜", "⬜", "⬜", "⬛", "⬛", "⬛", "⬜", "⬜"}
    };

    public void setField(int x, int y, String value) {
        board[x][y] = value;
    }

    public String getField(int x, int y) {
        return board[x][y];
    }

    public void print() {
        for(String[] row : board) {
			for(String elem : row)
				System.out.print(" " + elem + " ");
			System.out.println("");
		}
    }

    private void resetLine(int line) {
        for(int i=0; i < board[line].length; i++) board[line][i] = "⬜";
    }

    public void reset() {
        for(int i = 0; i < board.length; i++) resetLine(i);
    }

    public void moveDown() {
        for(int i=0; i<7; i++) 
            board[7-i] = board[6-i];

        resetLine(0);
    }
}
