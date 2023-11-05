package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuBoard {

    Scanner scanner = new Scanner(System.in);
public void showBoard(SudokuElement[][] board, int size){
    for (int i = 0; i<size; i++){
        System.out.print("|");
        for (int j = 0; j<size; j++){
            if(board[i][j].getWartosc() != 0){
                System.out.print(board [i][j].getWartosc() + "|");
            }else {
                System.out.print(" |");
            }
        }
        System.out.println();
    }
    System.out.println("--------------------------------");
}
}
