public class TicTacToe {
  int[] gameState = new int[3];
  boolean isX = true;

  public static void main(String[] args) {
    System.out.println("Hello, World!");
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
