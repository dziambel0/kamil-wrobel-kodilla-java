package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
 private int wartosc = 0;
 private final List<Integer> listaMozliwychCyfr = new ArrayList<Integer>();

  public SudokuElement(){
      listaMozliwychCyfr.add(1);
      listaMozliwychCyfr.add(2);
      listaMozliwychCyfr.add(3);
      listaMozliwychCyfr.add(4);
      listaMozliwychCyfr.add(5);
      listaMozliwychCyfr.add(6);
      listaMozliwychCyfr.add(7);
      listaMozliwychCyfr.add(8);
      listaMozliwychCyfr.add(9);
  }
    public int getWartosc() {
        return wartosc;
    }

    public List<Integer> getListaMozliwychCyfr() {
        return listaMozliwychCyfr;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public void removeCyfra(int cyfra) {
      for (int i = 0; i<listaMozliwychCyfr.size(); i++){
          if(listaMozliwychCyfr.get(i) == cyfra){
              listaMozliwychCyfr.remove(i);
          }
      }
    }
}
