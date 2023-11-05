package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    Scanner scanner = new Scanner(System.in);
    public void uzupelnieniePlanszy(SudokuElement[][] plansza){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j<9; j++){
                plansza[i][j] = new SudokuElement();
            }
        }
    }
    public void planszaPrzykladowa(SudokuElement[][] plansza){
        plansza[0][0].setWartosc(9);
        plansza[0][2].setWartosc(2);
        plansza[0][4].setWartosc(7);
        plansza[0][5].setWartosc(8);
        plansza[1][0].setWartosc(1);
        plansza[1][1].setWartosc(8);
        plansza[1][6].setWartosc(7);
        plansza[1][7].setWartosc(6);
        plansza[2][1].setWartosc(7);
        plansza[2][3].setWartosc(5);
        plansza[3][0].setWartosc(7);
        plansza[3][1].setWartosc(5);
        plansza[3][5].setWartosc(6);
        plansza[3][7].setWartosc(8);
        plansza[3][8].setWartosc(4);
        plansza[4][0].setWartosc(4);
        plansza[4][2].setWartosc(6);
        plansza[4][6].setWartosc(1);
        plansza[4][7].setWartosc(5);
        plansza[4][8].setWartosc(7);
        plansza[5][1].setWartosc(1);
        plansza[5][4].setWartosc(4);
        plansza[5][5].setWartosc(5);
        plansza[5][6].setWartosc(3);
        plansza[5][7].setWartosc(9);
        plansza[5][8].setWartosc(6);
        plansza[6][1].setWartosc(2);
        plansza[6][6].setWartosc(5);
        plansza[6][8].setWartosc(9);
        plansza[7][0].setWartosc(6);
        plansza[7][2].setWartosc(9);
        plansza[7][5].setWartosc(7);
        plansza[7][6].setWartosc(8);
        plansza[7][7].setWartosc(3);
        plansza[8][3].setWartosc(9);
        plansza[8][4].setWartosc(8);
        plansza[8][5].setWartosc(4);
        plansza[8][7].setWartosc(7);
    }
    public void planszaPrzykladowaTrudna(SudokuElement[][] plansza) {
        plansza[0][4].setWartosc(6);
        plansza[0][5].setWartosc(8);
        plansza[0][7].setWartosc(3);
        plansza[1][0].setWartosc(1);
        plansza[1][1].setWartosc(9);
        plansza[2][0].setWartosc(8);
        plansza[2][2].setWartosc(3);
        plansza[2][3].setWartosc(1);
        plansza[2][6].setWartosc(2);
        plansza[3][0].setWartosc(4);
        plansza[3][4].setWartosc(5);
        plansza[3][5].setWartosc(1);
        plansza[3][7].setWartosc(6);
        plansza[4][0].setWartosc(7);
        plansza[4][4].setWartosc(2);
        plansza[4][8].setWartosc(4);
        plansza[5][4].setWartosc(7);
        plansza[5][6].setWartosc(8);
        plansza[6][1].setWartosc(1);
        plansza[6][5].setWartosc(5);
        plansza[6][8].setWartosc(7);
        plansza[7][2].setWartosc(4);
        plansza[8][1].setWartosc(5);
        plansza[8][4].setWartosc(3);
        plansza[8][6].setWartosc(1);
    }
    public void resolveSudokuRow(SudokuElement[][] board){
        for(int i = 0; i<9; i++){
            for (int j = 0; j<9; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[i][0].getWartosc() || x == board[i][1].getWartosc() || x == board[i][2].getWartosc() || x == board[i][3].getWartosc() || x == board[i][4].getWartosc() || x == board[i][5].getWartosc() || x == board[i][6].getWartosc() || x == board[i][7].getWartosc() || x == board[i][8].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuColumn(SudokuElement[][] board){
        for(int j = 0; j<9; j++){
            for (int i = 0; i<9; i++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[0][j].getWartosc() || x == board[1][j].getWartosc() || x == board[2][j].getWartosc() || x == board[3][j].getWartosc() || x == board[4][j].getWartosc() || x == board[5][j].getWartosc() || x == board[6][j].getWartosc() || x == board[7][j].getWartosc() || x == board[8][j].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube1(SudokuElement[][] board){
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[0][0].getWartosc() || x == board[0][1].getWartosc() || x == board[0][2].getWartosc() || x == board[1][0].getWartosc() || x == board[1][1].getWartosc() || x == board[1][2].getWartosc() || x == board[2][0].getWartosc() || x == board[2][1].getWartosc() || x == board[2][2].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube2(SudokuElement[][] board){
        for(int i = 0; i<3; i++){
            for (int j = 3; j<6; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[0][3].getWartosc() || x == board[0][4].getWartosc() || x == board[0][5].getWartosc() || x == board[1][3].getWartosc() || x == board[1][4].getWartosc() || x == board[1][5].getWartosc() || x == board[2][3].getWartosc() || x == board[2][4].getWartosc() || x == board[2][5].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube3(SudokuElement[][] board){
        for(int i = 0; i<3; i++){
            for (int j = 6; j<9; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[0][6].getWartosc() || x == board[0][7].getWartosc() || x == board[0][8].getWartosc() || x == board[1][6].getWartosc() || x == board[1][7].getWartosc() || x == board[1][8].getWartosc() || x == board[2][6].getWartosc() || x == board[2][7].getWartosc() || x == board[2][8].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube4(SudokuElement[][] board){
        for(int i = 3; i<6; i++){
            for (int j = 0; j<3; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[3][0].getWartosc() || x == board[3][1].getWartosc() || x == board[3][2].getWartosc() || x == board[4][0].getWartosc() || x == board[4][1].getWartosc() || x == board[4][2].getWartosc() || x == board[5][0].getWartosc() || x == board[5][1].getWartosc() || x == board[5][2].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube5(SudokuElement[][] board){
        for(int i = 3; i<6; i++){
            for (int j = 3; j<6; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[3][3].getWartosc() || x == board[3][4].getWartosc() || x == board[3][5].getWartosc() || x == board[4][3].getWartosc() || x == board[4][4].getWartosc() || x == board[4][5].getWartosc() || x == board[5][3].getWartosc() || x == board[5][4].getWartosc() || x == board[5][5].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube6(SudokuElement[][] board){
        for(int i = 3; i<6; i++){
            for (int j = 6; j<9; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[3][6].getWartosc() || x == board[3][7].getWartosc() || x == board[3][8].getWartosc() || x == board[4][6].getWartosc() || x == board[4][7].getWartosc() || x == board[4][8].getWartosc() || x == board[5][6].getWartosc() || x == board[5][7].getWartosc() || x == board[5][8].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube7(SudokuElement[][] board){
        for(int i = 6; i<9; i++){
            for (int j = 0; j<3; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[6][0].getWartosc() || x == board[6][1].getWartosc() || x == board[6][2].getWartosc() || x == board[7][0].getWartosc() || x == board[7][1].getWartosc() || x == board[7][2].getWartosc() || x == board[8][0].getWartosc() || x == board[8][1].getWartosc() || x == board[8][2].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube8(SudokuElement[][] board){
        for(int i = 6; i<9; i++){
            for (int j = 3; j<6; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[6][3].getWartosc() || x == board[6][4].getWartosc() || x == board[6][5].getWartosc() || x == board[7][3].getWartosc() || x == board[7][4].getWartosc() || x == board[7][5].getWartosc() || x == board[8][3].getWartosc() || x == board[8][4].getWartosc() || x == board[8][5].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }
    public void resolveSudokuCube9(SudokuElement[][] board){
        for(int i = 6; i<9; i++){
            for (int j = 6; j<9; j++){
                if(board[i][j].getWartosc() == 0){
                    for (int x = board[i][j].getListaMozliwychCyfr().get(0); x<10; x++){
                        if (x == board[6][6].getWartosc() || x == board[6][7].getWartosc() || x == board[6][8].getWartosc() || x == board[7][6].getWartosc() || x == board[7][7].getWartosc() || x == board[7][8].getWartosc() || x == board[8][6].getWartosc() || x == board[8][7].getWartosc() || x == board[8][8].getWartosc()){
                            board[i][j].removeCyfra(x);
                        }
                    }
                }
            }
        }
    }

    public void wpisanieDoPlanszy(SudokuElement[][] plansza){
        for (int i = 0; i<9; i++){
            for (int j = 0; j<9; j++){
                if(plansza[i][j].getListaMozliwychCyfr().size() == 1){
                    plansza[i][j].setWartosc(plansza[i][j].getListaMozliwychCyfr().get(0));
                }
            }
        }
    }
}
