package com.lev;

public class Board {

  private static char[][] field = new char[3][3];

  public Board() {
    fillBoard(field);
  }

  private void fillBoard(char[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        field[i][j] = ' ';
      }
    }
  }

  public static boolean fillCell(int x, int y, char value) {
    if (field[x - 1][y - 1] == ' ') {
      field[--x][--y] = value;
      return true;
    }
    return false;
  }

  public void print() {
    System.out.println(
        String.valueOf(field[0][0]) + '|' + String.valueOf(field[0][1]) + '|' + String.valueOf(field[0][2]));
    System.out.println("-+-+-");
    System.out.println(
        String.valueOf(field[1][0]) + '|' + String.valueOf(field[1][1]) + '|' + String.valueOf(field[1][2]));
    System.out.println("-+-+-");
    System.out.println(
        String.valueOf(field[2][0]) + '|' + String.valueOf(field[2][1]) + '|' + String.valueOf(field[2][2]));
  }

  public boolean isWin() {
    if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[1][1] != ' ') {
      return true;
    }
    if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[1][1] != ' ') {
      return true;
    }
    for (int i = 0; i < field.length; i++) {
      if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[1][i] != ' ') {
        return true;
      }
      if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][1] != ' ') {
        return true;
      }
    }
    return false;
  }

  public boolean isFilled() {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        if (field[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }
}