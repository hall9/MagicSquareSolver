package magicsquare;

public class MagicSquare {

    private int size;
    private int board[][];
    private int sum = 0;

    public MagicSquare(int size, int[][] board) {
        this.size = size;
        this.board = board;
        calulateSum();
    }

    private void calulateSum() {
        int pow = (int) Math.pow(size, 2);
        sum = ( size * (pow + 1)) / 2;
    }
}
