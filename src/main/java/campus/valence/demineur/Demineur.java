package campus.valence.demineur;

import java.util.HashSet;
import java.util.Set;


public class Demineur {
    private Case[][] board;


    public static Demineur create(int bombCount, int boardSize) {

        Case[][] board = new Case[boardSize][boardSize];
        Set<Case.BombCase> bombes = new HashSet<>();

        while (bombes.size() < bombCount) {
            int x = (int) (Math.random() * boardSize);
            int y = (int) (Math.random() * boardSize);
            System.out.println("test" + x);
            System.out.println("test" + y);
            bombes.add(new Case.BombCase(x, y));
        }
        for (Case.BombCase bomb : bombes) {
            board[bomb.getX()][bomb.getY()] = bomb;
        }
        return new Demineur(board);
    }


    protected Demineur(Case[][] board) {
        this.board = board;
    }

    String boardAsString() {
        return "";
    }

    public Case[][] getBoard() {
        return board;
    }

    public int countBombsAround(int x, int y) {
        try {
            int count = 0;

            for (x = 0; x < board.length; x++) {
                for (y = 0; y < board.length; y++) {
                  if(board[x-1]== null){
                      count = count+1;
                  }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("To be implemented");

        }


        return x;
    }
}
