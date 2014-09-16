package magicsquare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) throws FileNotFoundException {
        String filepath = args[0];
        
        MagicSquareSolver s = new MagicSquareSolver();
        s.solve(squareReader(filepath));
    }

    private static int[][] squareReader(String filepath) throws FileNotFoundException {
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        Scanner in = new Scanner(br);
        
        int squareSize = in.nextInt();
        int board[][] = new int[squareSize][squareSize];
        
        for (int i=0; i < squareSize; i++) {
            for (int k=0; k < squareSize; k++) {
                board[i][k] = in.nextInt();
            }
        }
        
         return board;
    }
}