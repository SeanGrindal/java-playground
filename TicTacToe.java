import java.util.ArrayList;

public class TicTacToe {
  int[] gameState = new int[3];
  boolean isX = true;

  public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<Integer>(0, 1, 2, 3, 4, 5, 6, 7, 8);
    System.out.println(x instanceof ArrayList<Integer>);
  }

  public resetGameState() {
    for (int i = 0; i < 9; i++) {
      gameState[i] = 0;
    }
  }

  public getGameOver() {
  }

  public switchPlayer() {
    isX = false;
  }
}

public class Square {
  public Square() {
    this.value = " ";
  }

  playMove(String move) {
    this.value = move;
  }
}

interface Player {
  public String getMove();

  default public String return3() {
    return "3";
  }
}