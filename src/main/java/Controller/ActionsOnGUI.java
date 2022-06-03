package Controller;

import ConnectionPackage.ConnectionFactory;
import Model.SudokuBoard;
import View.GameGUI5x5;
import View.GameGUI6x6;
import View.GameGUI7x7;
import View.GameGUI8x8;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

public class ActionsOnGUI  {
    GameGUI8x8 gameGUI8x8;
    GameGUI6x6 gameGUI6x6;
    GameGUI5x5 gameGUI5x5;
    GameGUI7x7 gameGUI7x7;
    SudokuBoard sudokuBoard;
    String user;
    int score;
    ConnectionFactory connectionFactory = new ConnectionFactory("jdbc:postgresql://localhost/sudoku", "postgres", "admin");




    //verif
    public void colorTextArea5x5( int rowToColor, int colToColor, String color){
        Color c1 = new MyColor().getColor(color);

        if(rowToColor > 8 || colToColor > 8 || rowToColor < 1 || colToColor < 1){
            JOptionPane.showMessageDialog(gameGUI5x5.rootPanel,"Linia si coloana trebuie sa fie intre 1 si 8!");
        }

        if(rowToColor == 1 && colToColor == 1){
            gameGUI5x5.setTextArea1Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 2){
            gameGUI5x5.setTextArea2Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 3){
            gameGUI5x5.setTextArea3Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 4){
            gameGUI5x5.setTextArea4Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 5){
            gameGUI5x5.setTextArea5Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 1){
            gameGUI5x5.setTextArea9Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 2){
            gameGUI5x5.setTextArea10Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 3){
            gameGUI5x5.setTextArea11Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 4){
            gameGUI5x5.setTextArea12Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 5){
            gameGUI5x5.setTextArea13Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 1){
            gameGUI5x5.setTextArea17Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 2){
            gameGUI5x5.setTextArea18Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 3){
            gameGUI5x5.setTextArea19Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 4){
            gameGUI5x5.setTextArea20Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 5){
            gameGUI5x5.setTextArea21Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 1){
            gameGUI5x5.setTextArea25Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 2){
            gameGUI5x5.setTextArea26Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 3){
            gameGUI5x5.setTextArea27Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 4){
            gameGUI5x5.setTextArea28Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 5){
            gameGUI5x5.setTextArea29Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 1){
            gameGUI5x5.setTextArea33Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 2){
            gameGUI5x5.setTextArea34Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 3){
            gameGUI5x5.setTextArea35Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 4){
            gameGUI5x5.setTextArea36Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 5){
            gameGUI5x5.setTextArea37Color(c1);
        }

    }

    //verif
    public void colorTextArea6x6( int rowToColor, int colToColor, String color){
        Color c1 = new MyColor().getColor(color);

        if(rowToColor > 8 || colToColor > 8 || rowToColor < 1 || colToColor < 1){
            JOptionPane.showMessageDialog(gameGUI6x6.rootPanel,"Linia si coloana trebuie sa fie intre 1 si 8!");
        }

        if(rowToColor == 1 && colToColor == 1){
            gameGUI6x6.setTextArea1Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 2){
            gameGUI6x6.setTextArea2Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 3){
            gameGUI6x6.setTextArea3Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 4){
            gameGUI6x6.setTextArea4Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 5){
            gameGUI6x6.setTextArea5Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 1){
            gameGUI6x6.setTextArea9Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 2){
            gameGUI6x6.setTextArea10Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 3){
            gameGUI6x6.setTextArea11Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 4){
            gameGUI6x6.setTextArea12Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 5){
            gameGUI6x6.setTextArea13Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 1){
            gameGUI6x6.setTextArea17Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 2){
            gameGUI6x6.setTextArea18Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 3){
            gameGUI6x6.setTextArea19Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 4){
            gameGUI6x6.setTextArea20Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 5){
            gameGUI6x6.setTextArea21Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 1){
            gameGUI6x6.setTextArea25Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 2){
            gameGUI6x6.setTextArea26Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 3){
            gameGUI6x6.setTextArea27Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 4){
            gameGUI6x6.setTextArea28Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 5){
            gameGUI6x6.setTextArea29Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 1){
            gameGUI6x6.setTextArea33Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 2){
            gameGUI6x6.setTextArea34Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 3){
            gameGUI6x6.setTextArea35Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 4){
            gameGUI6x6.setTextArea36Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 5){
            gameGUI6x6.setTextArea37Color(c1);
        }

        ////////
        else
        if(rowToColor == 1 && colToColor == 6){
            gameGUI6x6.setTextArea6Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 6){
            gameGUI6x6.setTextArea14Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 6){
            gameGUI6x6.setTextArea22Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 6){
            gameGUI6x6.setTextArea30Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 6){
            gameGUI6x6.setTextArea38Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 1){
            gameGUI6x6.setTextArea41Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 2){
            gameGUI6x6.setTextArea42Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 3){
            gameGUI6x6.setTextArea43Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 4){
            gameGUI6x6.setTextArea44Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 5){
            gameGUI6x6.setTextArea45Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 6){
            gameGUI6x6.setTextArea46Color(c1);
        }



    }

    //verif
    public void colorTextArea7x7( int rowToColor, int colToColor, String color){
        Color c1 = new MyColor().getColor(color);

        if(rowToColor > 8 || colToColor > 8 || rowToColor < 1 || colToColor < 1){
            JOptionPane.showMessageDialog(gameGUI7x7.rootPanel,"Linia si coloana trebuie sa fie intre 1 si 8!");
        }

        if(rowToColor == 1 && colToColor == 1){
            gameGUI7x7.setTextArea1Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 2){
            gameGUI7x7.setTextArea2Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 3){
            gameGUI7x7.setTextArea3Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 4){
            gameGUI7x7.setTextArea4Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 5){
            gameGUI7x7.setTextArea5Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 1){
            gameGUI7x7.setTextArea9Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 2){
            gameGUI7x7.setTextArea10Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 3){
            gameGUI7x7.setTextArea11Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 4){
            gameGUI7x7.setTextArea12Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 5){
            gameGUI7x7.setTextArea13Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 1){
            gameGUI7x7.setTextArea17Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 2){
            gameGUI7x7.setTextArea18Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 3){
            gameGUI7x7.setTextArea19Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 4){
            gameGUI7x7.setTextArea20Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 5){
            gameGUI7x7.setTextArea21Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 1){
            gameGUI7x7.setTextArea25Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 2){
            gameGUI7x7.setTextArea26Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 3){
            gameGUI7x7.setTextArea27Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 4){
            gameGUI7x7.setTextArea28Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 5){
            gameGUI7x7.setTextArea29Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 1){
            gameGUI7x7.setTextArea33Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 2){
            gameGUI7x7.setTextArea34Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 3){
            gameGUI7x7.setTextArea35Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 4){
            gameGUI7x7.setTextArea36Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 5){
            gameGUI7x7.setTextArea37Color(c1);
        }

        ////////
        else
        if(rowToColor == 1 && colToColor == 6){
            gameGUI7x7.setTextArea6Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 6){
            gameGUI7x7.setTextArea14Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 6){
            gameGUI7x7.setTextArea22Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 6){
            gameGUI7x7.setTextArea30Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 6){
            gameGUI7x7.setTextArea38Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 1){
            gameGUI7x7.setTextArea41Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 2){
            gameGUI7x7.setTextArea42Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 3){
            gameGUI7x7.setTextArea43Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 4){
            gameGUI7x7.setTextArea44Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 5){
            gameGUI7x7.setTextArea45Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 6){
            gameGUI7x7.setTextArea46Color(c1);
        }

        ///////

        else
        if(rowToColor == 1 && colToColor == 7){
            gameGUI7x7.setTextArea7Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 7){
            gameGUI7x7.setTextArea15Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 7){
            gameGUI7x7.setTextArea23Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 7){
            gameGUI7x7.setTextArea31Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 7){
            gameGUI7x7.setTextArea39Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 7){
            gameGUI7x7.setTextArea47Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 7){
            gameGUI7x7.setTextArea55Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 1){
            gameGUI7x7.setTextArea49Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 2){
            gameGUI7x7.setTextArea50Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 3){
            gameGUI7x7.setTextArea51Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 4){
            gameGUI7x7.setTextArea52Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 5){
            gameGUI7x7.setTextArea53Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 6){
            gameGUI7x7.setTextArea54Color(c1);
        }


    }

    //verif
    public void colorTextArea8x8( int rowToColor, int colToColor, String color){
        Color c1 = new MyColor().getColor(color);

        if(rowToColor > 8 || colToColor > 8 || rowToColor < 1 || colToColor < 1){
            JOptionPane.showMessageDialog(gameGUI8x8.rootPanel,"Linia si coloana trebuie sa fie intre 1 si 8!");
        }

        if(rowToColor == 1 && colToColor == 1){
            gameGUI8x8.setTextArea1Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 2){
            gameGUI8x8.setTextArea2Color(c1);
        }else
        if(rowToColor == 1 && colToColor == 3){
            gameGUI8x8.setTextArea3Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 4){
            gameGUI8x8.setTextArea4Color(c1);
        }
        else
        if(rowToColor == 1 && colToColor == 5){
            gameGUI8x8.setTextArea5Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 1){
            gameGUI8x8.setTextArea9Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 2){
            gameGUI8x8.setTextArea10Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 3){
            gameGUI8x8.setTextArea11Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 4){
            gameGUI8x8.setTextArea12Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 5){
            gameGUI8x8.setTextArea13Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 1){
            gameGUI8x8.setTextArea17Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 2){
            gameGUI8x8.setTextArea18Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 3){
            gameGUI8x8.setTextArea19Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 4){
            gameGUI8x8.setTextArea20Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 5){
            gameGUI8x8.setTextArea21Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 1){
            gameGUI8x8.setTextArea25Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 2){
            gameGUI8x8.setTextArea26Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 3){
            gameGUI8x8.setTextArea27Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 4){
            gameGUI8x8.setTextArea28Color(c1);
        }
        else
        if(rowToColor == 4 && colToColor == 5){
            gameGUI8x8.setTextArea29Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 1){
            gameGUI8x8.setTextArea33Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 2){
            gameGUI8x8.setTextArea34Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 3){
            gameGUI8x8.setTextArea35Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 4){
            gameGUI8x8.setTextArea36Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 5){
            gameGUI8x8.setTextArea37Color(c1);
        }

        ////////
        else
        if(rowToColor == 1 && colToColor == 6){
            gameGUI8x8.setTextArea6Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 6){
            gameGUI8x8.setTextArea14Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 6){
            gameGUI8x8.setTextArea22Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 6){
            gameGUI8x8.setTextArea30Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 6){
            gameGUI8x8.setTextArea38Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 1){
            gameGUI8x8.setTextArea41Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 2){
            gameGUI8x8.setTextArea42Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 3){
            gameGUI8x8.setTextArea43Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 4){
            gameGUI8x8.setTextArea44Color(c1);
        }else
        if(rowToColor == 6 && colToColor == 5){
            gameGUI8x8.setTextArea45Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 6){
            gameGUI8x8.setTextArea46Color(c1);
        }

        ///////

        else
        if(rowToColor == 1 && colToColor == 7){
            gameGUI8x8.setTextArea7Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 7){
            gameGUI8x8.setTextArea15Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 7){
            gameGUI8x8.setTextArea23Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 7){
            gameGUI8x8.setTextArea31Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 7){
            gameGUI8x8.setTextArea39Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 7){
            gameGUI8x8.setTextArea47Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 7){
            gameGUI8x8.setTextArea55Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 1){
            gameGUI8x8.setTextArea49Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 2){
            gameGUI8x8.setTextArea50Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 3){
            gameGUI8x8.setTextArea51Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 4){
            gameGUI8x8.setTextArea52Color(c1);
        }
        else
        if(rowToColor == 7 && colToColor == 5){
            gameGUI8x8.setTextArea53Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 6){
            gameGUI8x8.setTextArea54Color(c1);
        }

        //////
        else
        if(rowToColor == 1 && colToColor == 8){
            gameGUI8x8.setTextArea8Color(c1);
        }
        else
        if(rowToColor == 2 && colToColor == 8){
            gameGUI8x8.setTextArea16Color(c1);
        }
        else
        if(rowToColor == 3 && colToColor == 8){
            gameGUI8x8.setTextArea24Color(c1);
        }else
        if(rowToColor == 4 && colToColor == 8){
            gameGUI8x8.setTextArea32Color(c1);
        }
        else
        if(rowToColor == 5 && colToColor == 8){
            gameGUI8x8.setTextArea40Color(c1);
        }
        else
        if(rowToColor == 6 && colToColor == 8){
            gameGUI8x8.setTextArea48Color(c1);
        }else
        if(rowToColor == 7 && colToColor == 8){
            gameGUI8x8.setTextArea56Color(c1);
        }else
        if(rowToColor == 8 && colToColor == 1){
            gameGUI8x8.setTextArea57Color(c1);
        }
        else
        if(rowToColor == 8 && colToColor == 2){
            gameGUI8x8.setTextArea58Color(c1);
        }
        else
        if(rowToColor == 8 && colToColor == 3){
            gameGUI8x8.setTextArea59Color(c1);
        }else
        if(rowToColor == 8 && colToColor == 4){
            gameGUI8x8.setTextArea60Color(c1);
        }
        else
        if(rowToColor == 8 && colToColor == 5){
            gameGUI8x8.setTextArea61Color(c1);
        }else
        if(rowToColor == 8 && colToColor == 6){
            gameGUI8x8.setTextArea62Color(c1);
        }else
        if(rowToColor == 8 && colToColor == 7){
            gameGUI8x8.setTextArea63Color(c1);
        }else
        if(rowToColor == 8 && colToColor == 8){
            gameGUI8x8.setTextArea64Color(c1);
        }


    }

    public void randomFillBoard5x5(){
        gameGUI5x5.setTextArea2Color(Color.RED);
        sudokuBoard.makeMove(1,2,"RED");
        gameGUI5x5.setTextArea4Color(Color.GREEN);
        sudokuBoard.makeMove(1, 4, "GREEN");
        gameGUI5x5.setTextArea9Color(Color.ORANGE);
        sudokuBoard.makeMove(2, 1, "ORANGE");
        gameGUI5x5.setTextArea13Color(Color.GREEN);
        sudokuBoard.makeMove(2, 5, "GREEN");
        gameGUI5x5.setTextArea19Color(Color.BLUE);
        sudokuBoard.makeMove(3, 3, "BLUE");
        gameGUI5x5.setTextArea26Color(Color.YELLOW);
        sudokuBoard.makeMove(4, 2, "YELLOW");
        gameGUI5x5.setTextArea28Color(Color.RED);
        sudokuBoard.makeMove(4, 4, "RED");
        gameGUI5x5.setTextArea35Color(Color.GREEN);
        sudokuBoard.makeMove(5, 3, "GREEN");
        gameGUI5x5.setTextArea36Color(Color.BLUE);
        sudokuBoard.makeMove(5, 4, "BLUE");
        gameGUI5x5.setTextArea37Color(Color.ORANGE);
        sudokuBoard.makeMove(5, 5, "ORANGE");
    }

    public void randomFillBoard6x6(){
        gameGUI6x6.setTextArea2Color(Color.RED);
        sudokuBoard.makeMove(1,2,"RED");
        gameGUI6x6.setTextArea4Color(Color.GREEN);
        sudokuBoard.makeMove(1, 4, "GREEN");
        gameGUI6x6.setTextArea9Color(Color.ORANGE);
        sudokuBoard.makeMove(2, 1, "ORANGE");
        gameGUI6x6.setTextArea13Color(Color.GREEN);
        sudokuBoard.makeMove(2, 5, "GREEN");
        gameGUI6x6.setTextArea19Color(Color.BLUE);
        sudokuBoard.makeMove(3, 3, "BLUE");
        gameGUI6x6.setTextArea26Color(Color.YELLOW);
        sudokuBoard.makeMove(4, 2, "YELLOW");
        gameGUI6x6.setTextArea28Color(Color.RED);
        sudokuBoard.makeMove(4, 4, "RED");
        gameGUI6x6.setTextArea35Color(Color.GREEN);
        sudokuBoard.makeMove(5, 3, "GREEN");
        gameGUI6x6.setTextArea36Color(Color.BLUE);
        sudokuBoard.makeMove(5, 4, "BLUE");
        gameGUI6x6.setTextArea37Color(Color.ORANGE);
        sudokuBoard.makeMove(5, 5, "ORANGE");
        //////////////
        gameGUI6x6.setTextArea6Color(Color.MAGENTA);
        sudokuBoard.makeMove(1, 6, "MAGENTA");
        gameGUI6x6.setTextArea14Color(Color.BLUE);
        sudokuBoard.makeMove(2, 6, "BLUE");
        gameGUI6x6.setTextArea41Color(Color.MAGENTA);
        sudokuBoard.makeMove(6, 1, "MAGENTA");
        gameGUI6x6.setTextArea43Color(Color.ORANGE);
        sudokuBoard.makeMove(6, 3, "ORANGE");
        gameGUI6x6.setTextArea45Color(Color.YELLOW);
        sudokuBoard.makeMove(6, 5, "YELLOW");


    }

    public void randomFillBoard7x7(){
        gameGUI7x7.setTextArea2Color(Color.RED);
        sudokuBoard.makeMove(1,2,"RED");
        gameGUI7x7.setTextArea4Color(Color.GREEN);
        sudokuBoard.makeMove(1, 4, "GREEN");
        gameGUI7x7.setTextArea9Color(Color.ORANGE);
        sudokuBoard.makeMove(2, 1, "ORANGE");
        gameGUI7x7.setTextArea13Color(Color.GREEN);
        sudokuBoard.makeMove(2, 5, "GREEN");
        gameGUI7x7.setTextArea19Color(Color.BLUE);
        sudokuBoard.makeMove(3, 3, "BLUE");
        gameGUI7x7.setTextArea26Color(Color.YELLOW);
        sudokuBoard.makeMove(4, 2, "YELLOW");
        gameGUI7x7.setTextArea28Color(Color.RED);
        sudokuBoard.makeMove(4, 4, "RED");
        gameGUI7x7.setTextArea35Color(Color.GREEN);
        sudokuBoard.makeMove(5, 3, "GREEN");
        gameGUI7x7.setTextArea36Color(Color.BLUE);
        sudokuBoard.makeMove(5, 4, "BLUE");
        gameGUI7x7.setTextArea37Color(Color.ORANGE);
        sudokuBoard.makeMove(5, 5, "ORANGE");
        //////////////
        gameGUI7x7.setTextArea6Color(Color.MAGENTA);
        sudokuBoard.makeMove(1, 6, "MAGENTA");
        gameGUI7x7.setTextArea14Color(Color.BLUE);
        sudokuBoard.makeMove(2, 6, "BLUE");
        gameGUI7x7.setTextArea41Color(Color.MAGENTA);
        sudokuBoard.makeMove(6, 1, "MAGENTA");
        gameGUI7x7.setTextArea43Color(Color.ORANGE);
        sudokuBoard.makeMove(6, 3, "ORANGE");
        gameGUI7x7.setTextArea45Color(Color.YELLOW);
        sudokuBoard.makeMove(6, 5, "YELLOW");
        /////////////
        gameGUI7x7.setTextArea23Color(new MyColor().getColor("PURPLE"));
        sudokuBoard.makeMove(3, 7, "PURPLE");
        gameGUI7x7.setTextArea31Color(Color.BLUE);
        sudokuBoard.makeMove(4, 7, "BLUE");
        gameGUI7x7.setTextArea47Color(Color.RED);
        sudokuBoard.makeMove(6, 7, "RED");
        gameGUI7x7.setTextArea50Color(new MyColor().getColor("PURPLE"));
        sudokuBoard.makeMove(7, 2, "PURPLE");
        gameGUI7x7.setTextArea53Color(Color.RED);
        sudokuBoard.makeMove(7, 5, "RED");
        gameGUI7x7.setTextArea55Color(Color.ORANGE);
        sudokuBoard.makeMove(7, 7, "ORANGE");


    }

    public void randomFillBoard8x8(){
        gameGUI8x8.setTextArea2Color(Color.RED);
        sudokuBoard.makeMove(1,2,"RED");
        gameGUI8x8.setTextArea4Color(Color.GREEN);
        sudokuBoard.makeMove(1, 4, "GREEN");
        gameGUI8x8.setTextArea9Color(Color.ORANGE);
        sudokuBoard.makeMove(2, 1, "ORANGE");
        gameGUI8x8.setTextArea13Color(Color.GREEN);
        sudokuBoard.makeMove(2, 5, "GREEN");
        gameGUI8x8.setTextArea19Color(Color.BLUE);
        sudokuBoard.makeMove(3, 3, "BLUE");
        gameGUI8x8.setTextArea26Color(Color.YELLOW);
        sudokuBoard.makeMove(4, 2, "YELLOW");
        gameGUI8x8.setTextArea28Color(Color.RED);
        sudokuBoard.makeMove(4, 4, "RED");
        gameGUI8x8.setTextArea35Color(Color.GREEN);
        sudokuBoard.makeMove(5, 3, "GREEN");
        gameGUI8x8.setTextArea36Color(Color.BLUE);
        sudokuBoard.makeMove(5, 4, "BLUE");
        gameGUI8x8.setTextArea37Color(Color.ORANGE);
        sudokuBoard.makeMove(5, 5, "ORANGE");
        //////////////
        gameGUI8x8.setTextArea6Color(Color.MAGENTA);
        sudokuBoard.makeMove(1, 6, "MAGENTA");
        gameGUI8x8.setTextArea14Color(Color.BLUE);
        sudokuBoard.makeMove(2, 6, "BLUE");
        gameGUI8x8.setTextArea41Color(Color.MAGENTA);
        sudokuBoard.makeMove(6, 1, "MAGENTA");
        gameGUI8x8.setTextArea43Color(Color.ORANGE);
        sudokuBoard.makeMove(6, 3, "ORANGE");
        gameGUI8x8.setTextArea45Color(Color.YELLOW);
        sudokuBoard.makeMove(6, 5, "YELLOW");
        /////////////
        gameGUI8x8.setTextArea23Color(new MyColor().getColor("PURPLE"));
        sudokuBoard.makeMove(3, 7, "PURPLE");
        gameGUI8x8.setTextArea31Color(Color.BLUE);
        sudokuBoard.makeMove(4, 7, "BLUE");
        gameGUI8x8.setTextArea47Color(Color.RED);
        sudokuBoard.makeMove(6, 7, "RED");
        gameGUI8x8.setTextArea50Color(new MyColor().getColor("PURPLE"));
        sudokuBoard.makeMove(7, 2, "PURPLE");
        gameGUI8x8.setTextArea53Color(Color.RED);
        sudokuBoard.makeMove(7, 5, "RED");
        gameGUI8x8.setTextArea55Color(Color.ORANGE);
        sudokuBoard.makeMove(7, 7, "ORANGE");
        //////////////
        gameGUI8x8.setTextArea8Color(new MyColor().getColor("AQUA"));
        sudokuBoard.makeMove(1, 8, "AQUA");
        gameGUI8x8.setTextArea48Color(Color.GREEN);
        sudokuBoard.makeMove(6, 8, "GREEN");
        gameGUI8x8.setTextArea56Color(Color.BLUE);
        sudokuBoard.makeMove(7, 8, "BLUE");
        gameGUI8x8.setTextArea59Color(Color.MAGENTA);
        sudokuBoard.makeMove(8, 3, "MAGENTA");
        gameGUI8x8.setTextArea60Color(Color.YELLOW);
        sudokuBoard.makeMove(8, 4, "YELLOW");
        gameGUI8x8.setTextArea62Color(new MyColor().getColor("AQUA"));
        sudokuBoard.makeMove(8, 6, "AQUA");
        gameGUI8x8.setTextArea63Color(new MyColor().getColor("PURPLE"));
        sudokuBoard.makeMove(8, 7, "PURPLE");


    }

    public  ActionsOnGUI(String diff, String interf, String user, int score) throws SQLException {
        this.user = user;
        this.score = score;
        if(diff.equals("5X5")){
            sudokuBoard = new SudokuBoard("5X5");
            gameGUI5x5 = GameGUI5x5.getInstance(this.user, this.score);
            randomFillBoard5x5();


            gameGUI5x5.INSERTButton.addActionListener(e -> {

                int row, col;
                String color = "WHITE";
                row = gameGUI5x5.getComboBox1().getSelectedIndex()+1;
                col = gameGUI5x5.getComboBox2().getSelectedIndex()+1;
                boolean verif = true;

                    if(gameGUI5x5.REDcheckBox.isSelected())
                        color = "RED";
                    else if(gameGUI5x5.GREENcheckBox.isSelected())
                        color = "GREEN";
                    else if(gameGUI5x5.BLUEcheckBox.isSelected())
                        color = "BLUE";
                    else if(gameGUI5x5.YELLOWcheckBox.isSelected())
                        color = "YELLOW";
                    else if(gameGUI5x5.ORANGEcheckBox.isSelected())
                        color = "ORANGE";

                if(row <= 5 && col <= 5 && row >= 1 && col >= 1) {
                    if (sudokuBoard.makeMove(row, col, color)) {
                        colorTextArea5x5(row, col, color);
                        for(int i = 0 ; i < sudokuBoard.board.length; i++){
                            for(int j = 0; j < sudokuBoard.board.length; j++) {
                                System.out.print(sudokuBoard.board[i][j]+" ");
                                }
                            System.out.print("\n");
                            }
                        if(sudokuBoard.isGameDone()){
                            JOptionPane.showMessageDialog(gameGUI5x5.rootPanel,"Felicitari! Ai terminat jocul.");
                            verif = false;
                            try {
                                Connection conn = connectionFactory.createConnection();
                                connectionFactory.modifyScore(conn, this.user);
                                connectionFactory.closeConnection(conn);
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameGUI5x5.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                    }
                }else {
                    JOptionPane.showMessageDialog(gameGUI5x5.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                }

                if(sudokuBoard.isGameDone() && verif){
                    JOptionPane.showMessageDialog(gameGUI5x5.rootPanel,"Felicitari! Ai terminat jocul.");
                    try {
                        Connection conn = connectionFactory.createConnection();
                        connectionFactory.modifyScore(conn, this.user);
                        connectionFactory.closeConnection(conn);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
        if(diff.equals("6X6")){
            sudokuBoard = new SudokuBoard("6X6");
            gameGUI6x6 = GameGUI6x6.getInstance(this.user, this.score);
            randomFillBoard6x6();
            gameGUI6x6.INSERTButton.addActionListener(e -> {
                int row, col;
                String color = "WHITE";
                row = gameGUI6x6.getComboBox1().getSelectedIndex()+1;
                col = gameGUI6x6.getComboBox2().getSelectedIndex()+1;
                boolean verif = true;

                if(gameGUI6x6.REDcheckBox.isSelected())
                    color = "RED";
                else if(gameGUI6x6.GREENcheckBox.isSelected())
                    color = "GREEN";
                else if(gameGUI6x6.BLUEcheckBox.isSelected())
                    color = "BLUE";
                else if(gameGUI6x6.YELLOWcheckBox.isSelected())
                    color = "YELLOW";
                else if(gameGUI6x6.ORANGEcheckBox.isSelected())
                    color = "ORANGE";
                else if(gameGUI6x6.MAGENTAcheckBox.isSelected())
                    color = "MAGENTA";


                if(row <= 6 && col <= 6 && row >= 1 && col >= 1) {
                    if (sudokuBoard.makeMove(row, col, color)) {
                        colorTextArea6x6(row, col, color);
                        for(int i = 0 ; i < sudokuBoard.board.length; i++){
                            for(int j = 0; j < sudokuBoard.board.length; j++) {
                                System.out.print(sudokuBoard.board[i][j]+" ");
                            }
                            System.out.print("\n");
                        }
                        if(sudokuBoard.isGameDone()) {
                            JOptionPane.showMessageDialog(gameGUI6x6.rootPanel, "Felicitari! Ai terminat jocul.");
                            verif = false;
                            try {
                                Connection conn = connectionFactory.createConnection();
                                connectionFactory.modifyScore(conn, this.user);
                                connectionFactory.closeConnection(conn);
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameGUI6x6.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                    }
                }else {
                    JOptionPane.showMessageDialog(gameGUI6x6.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                }


                if(sudokuBoard.isGameDone() && verif){
                    JOptionPane.showMessageDialog(gameGUI6x6.rootPanel,"Felicitari! Ai terminat jocul.");
                    try {
                        Connection conn = connectionFactory.createConnection();
                        connectionFactory.modifyScore(conn, this.user);
                        connectionFactory.closeConnection(conn);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
        if(diff.equals("7X7")){
            sudokuBoard = new SudokuBoard("7X7");
            gameGUI7x7 = GameGUI7x7.getInstance(this.user, this.score);
            randomFillBoard7x7();
            gameGUI7x7.INSERTButton.addActionListener(e -> {
                int row, col;
                String color = "WHITE";
                row = gameGUI7x7.getComboBox1().getSelectedIndex()+1;
                col = gameGUI7x7.getComboBox2().getSelectedIndex()+1;
                boolean verif = true;

                if(gameGUI7x7.REDcheckBox.isSelected())
                    color = "RED";
                else if(gameGUI7x7.GREENcheckBox.isSelected())
                    color = "GREEN";
                else if(gameGUI7x7.BLUEcheckBox.isSelected())
                    color = "BLUE";
                else if(gameGUI7x7.YELLOWcheckBox.isSelected())
                    color = "YELLOW";
                else if(gameGUI7x7.ORANGEcheckBox.isSelected())
                    color = "ORANGE";
                else if(gameGUI7x7.MAGENTAcheckBox.isSelected())
                    color = "MAGENTA";
                else if(gameGUI7x7.PURPLEcheckBox.isSelected())
                    color = "PURPLE";

                if(row <= 7 && col <= 7 && row >= 1 && col >= 1) {
                    if (sudokuBoard.makeMove(row, col, color)) {
                        colorTextArea7x7(row, col, color);
                        for(int i = 0 ; i < sudokuBoard.board.length; i++){
                            for(int j = 0; j < sudokuBoard.board.length; j++) {
                                System.out.print(sudokuBoard.board[i][j]+" ");
                            }
                            System.out.print("\n");
                        }
                        if(sudokuBoard.isGameDone()){
                            JOptionPane.showMessageDialog(gameGUI7x7.rootPanel,"Felicitari! Ai terminat jocul.");
                            verif = false;
                            try {
                                Connection conn = connectionFactory.createConnection();
                                connectionFactory.modifyScore(conn, this.user);
                                connectionFactory.closeConnection(conn);
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameGUI7x7.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                    }
                }else {
                    JOptionPane.showMessageDialog(gameGUI7x7.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                }
                if(sudokuBoard.isGameDone()){
                    JOptionPane.showMessageDialog(gameGUI7x7.rootPanel,"Felicitari! Ai terminat jocul.");
                }
                if(sudokuBoard.isGameDone() && verif){
                    JOptionPane.showMessageDialog(gameGUI7x7.rootPanel,"Felicitari! Ai terminat jocul.");
                    try {
                        Connection conn = connectionFactory.createConnection();
                        connectionFactory.modifyScore(conn, this.user);
                        connectionFactory.closeConnection(conn);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }

            });
        }
        if(diff.equals("8X8")) {
            sudokuBoard = new SudokuBoard("8X8");
            gameGUI8x8 = GameGUI8x8.getInstance(this.user);
            randomFillBoard8x8();
            gameGUI8x8.INSERTButton.addActionListener(e -> {
                int row, col;
                String color = "WHITE";
                row = gameGUI8x8.getComboBox1().getSelectedIndex()+1;
                col = gameGUI8x8.getComboBox2().getSelectedIndex()+1;
                boolean verif = true;

                if(gameGUI8x8.REDcheckBox.isSelected())
                    color = "RED";
                else if(gameGUI8x8.GREENcheckBox.isSelected())
                    color = "GREEN";
                else if(gameGUI8x8.BLUEcheckBox.isSelected())
                    color = "BLUE";
                else if(gameGUI8x8.YELLOWcheckBox.isSelected())
                    color = "YELLOW";
                else if(gameGUI8x8.ORANGEcheckBox.isSelected())
                    color = "ORANGE";
                else if(gameGUI8x8.MAGENTAcheckBox.isSelected())
                    color = "MAGENTA";
                else if(gameGUI8x8.PURPLEcheckBox.isSelected())
                    color = "PURPLE";
                else if(gameGUI8x8.AQUAcheckBox.isSelected())
                    color = "AQUA";

                if(row <= 8 && col <= 8 && row >= 1 && col >= 1) {
                    if (sudokuBoard.makeMove(row, col, color)) {
                        colorTextArea8x8(row, col, color);
                        for(int i = 0 ; i < sudokuBoard.board.length; i++){
                            for(int j = 0; j < sudokuBoard.board.length; j++) {
                                System.out.print(sudokuBoard.board[i][j]+" ");
                            }
                            System.out.print("\n");
                        }
                        if(sudokuBoard.isGameDone()){
                            JOptionPane.showMessageDialog(gameGUI8x8.rootPanel,"Felicitari! Ai terminat jocul.");
                            verif = false;
                            try {
                                Connection conn = connectionFactory.createConnection();
                                connectionFactory.modifyScore(conn, this.user);
                                connectionFactory.closeConnection(conn);
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameGUI8x8.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                    }
                }else {
                    JOptionPane.showMessageDialog(gameGUI8x8.rootPanel, "(" + row + ", " + col + ") " + color + " invalid!");
                }
                if(sudokuBoard.isGameDone() && verif){
                    JOptionPane.showMessageDialog(gameGUI8x8.rootPanel,"Felicitari! Ai terminat jocul.");
                    try {
                        Connection conn = connectionFactory.createConnection();
                        connectionFactory.modifyScore(conn, this.user);
                        connectionFactory.closeConnection(conn);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }

    }
}
