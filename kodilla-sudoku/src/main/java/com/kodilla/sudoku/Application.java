package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) {
        boolean gameFinished = false;
        int size = 9;

        SudokuGame sudokuGame = new SudokuGame();
        SudokuElement [][] board = new SudokuElement[size][size];
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuGame.uzupelnieniePlanszy(board);
        sudokuGame.planszaPrzykladowa(board);

        while (!gameFinished){
            sudokuGame.resolveSudokuRow(board);
            sudokuGame.resolveSudokuColumn(board);
            sudokuGame.resolveSudokuCube1(board);
            sudokuGame.resolveSudokuCube2(board);
            sudokuGame.resolveSudokuCube3(board);
            sudokuGame.resolveSudokuCube4(board);
            sudokuGame.resolveSudokuCube5(board);
            sudokuGame.resolveSudokuCube6(board);
            sudokuGame.resolveSudokuCube7(board);
            sudokuGame.resolveSudokuCube8(board);
            sudokuGame.resolveSudokuCube9(board);
            sudokuBoard.showBoard(board, size);
            sudokuGame.wpisanieDoPlanszy(board);
        }
    }
}
