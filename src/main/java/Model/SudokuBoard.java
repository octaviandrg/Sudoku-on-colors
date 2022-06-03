package Model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SudokuBoard {
    public int[][] board;

    public SudokuBoard(String difficulty) {
       if(difficulty.equals("5X5"))
           board = new int[5][5];
       if(difficulty.equals("6X6"))
           board = new int[6][6];
       if(difficulty.equals("7X7"))
           board = new int[7][7];
       if(difficulty.equals("8X8"))
           board = new int[8][8];
    }


    public boolean distinctValues(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == 0 || arr[j] == 0){
                    continue;
                }
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkBoard(){
        int k1;
        int[] arr1;
        //iau fiecare linie si o bag intr-un array
        for(int i = 0; i < board.length; i++){
            k1 = 0;
            arr1 = new int[board.length];
            for(int j = 0; j < board.length; j++){
                arr1[k1] = board[i][j];
                k1++;
            }
            if(distinctValues(arr1)){
            }else {
                return false;
            }
        }
        //iau fiecare col si o bag intr-un array
        int k2;
        int[] arr2;
        for(int j = 0; j < board.length; j++){
            k2 = 0;
            arr2 = new int[board.length];
            for(int i = 0; i < board.length; i++){
                arr2[k2] = board[i][j];
                k2++;
            }
            if(distinctValues(arr2)){
            }else {
                return false;
            }
        }

        return true;

    }

    public int getNumberFromColor(String value){
        if(value.equals("WHITE")){
            return 0;
        }
        if(value.equals("RED")){
            return 1;
        }
        if(value.equals("GREEN")){
            return 2;
        }
        if(value.equals("BLUE")){
            return 3;
        }if(value.equals("YELLOW")){
            return 4;
        }if(value.equals("ORANGE")){
            return 5;
        }if(value.equals("MAGENTA")){
            return 6;
        }
        if(value.equals("PURPLE")){
            return 7;
        }
        if(value.equals("AQUA")){
            return 8;
        }
        return 0;
    }

    public boolean makeMove(int row, int col, String value){
        board[row-1][col-1] = getNumberFromColor(value);
        if(checkBoard()){
            board[row-1][col-1] = getNumberFromColor(value);
            int r = row - 1, c = col - 1;
            System.out.println("board: "+r+" "+c+" "+value);
            return true;
        }else
        {
            board[row-1][col-1] = 0;
        }

        return false;
    }


    //parcurg toate celulele si verif daca s ocupate
    public boolean isGameDone(){
        for(int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }


}
