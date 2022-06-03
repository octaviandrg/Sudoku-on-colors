package View;

import Model.CellStatus;
import net.sds.mvvm.bindings.Bind;

import javax.swing.*;
import java.awt.*;

public class GameGUI5x5 extends JFrame {
    public JButton INSERTButton;

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextArea4Color(Color color) {
        this.textArea4.setBackground(color);
        ;
    }

    public void setTextArea3Color(Color color) {
        this.textArea3.setBackground(color);
    }

    public void setTextArea2Color(Color color) {
        this.textArea2.setBackground(color);
    }

    public void setTextArea1Color(Color color) {
        this.textArea1.setBackground(color);
    }

    public void setTextArea5Color(Color color) {
        this.textArea5.setBackground(color);
    }

    public void setTextArea13Color(Color color) {
        this.textArea13.setBackground(color);
        ;
    }

    public void setTextArea12Color(Color color) {
        this.textArea12.setBackground(color);
    }

    public void setTextArea11Color(Color color) {
        this.textArea11.setBackground(color);
    }

    public void setTextArea10Color(Color color) {
        this.textArea10.setBackground(color);
    }

    public void setTextArea9Color(Color color) {
        this.textArea9.setBackground(color);
    }

    public void setTextArea21Color(Color color) {
        this.textArea21.setBackground(color);
    }

    public void setTextArea20Color(Color color) {
        this.textArea20.setBackground(color);
        ;
    }

    public void setTextArea19Color(Color color) {
        this.textArea19.setBackground(color);
        ;
    }

    public void setTextArea18Color(Color color) {
        this.textArea18.setBackground(color);
    }

    public void setTextArea17Color(Color color) {
        this.textArea17.setBackground(color);
    }

    public void setTextArea29Color(Color color) {
        this.textArea29.setBackground(color);
        ;
    }

    public void setTextArea28Color(Color color) {
        this.textArea28.setBackground(color);
        ;
    }

    public void setTextArea27Color(Color color) {
        this.textArea27.setBackground(color);
        ;
    }

    public void setTextArea26Color(Color color) {
        this.textArea26.setBackground(color);
    }

    public void setTextArea25Color(Color color) {
        this.textArea25.setBackground(color);
    }

    public void setTextArea33Color(Color color) {
        this.textArea33.setBackground(color);
    }

    public void setTextArea34Color(Color color) {
        this.textArea34.setBackground(color);
    }

    public void setTextArea35Color(Color color) {
        this.textArea35.setBackground(color);
    }

    public void setTextArea36Color(Color color) {
        this.textArea36.setBackground(color);
    }

    public void setTextArea37Color(Color color) {
        this.textArea37.setBackground(color);
    }


    private JTextField textField1;
    private JTextField textField2;
    private JLabel LblRED;
    private JLabel LblGREEN;
    private JLabel LblBLUE;
    private JLabel LblYELLOW;
    private JLabel LblORANGE;
    public JPanel rootPanel;
    private JTextArea textArea4;
    private JTextArea textArea3;
    private JTextArea textArea2;

    public JTextArea getTextArea1() {
        return textArea1;
    }

    private JTextArea textArea1;
    private JTextArea textArea5;
    private JTextArea textArea13;
    private JTextArea textArea12;
    private JTextArea textArea11;
    private JTextArea textArea10;
    private JTextArea textArea9;
    private JTextArea textArea21;
    private JTextArea textArea20;
    private JTextArea textArea19;
    private JTextArea textArea18;
    private JTextArea textArea17;
    private JTextArea textArea29;
    private JTextArea textArea28;
    private JTextArea textArea27;
    private JTextArea textArea26;
    private JTextArea textArea25;
    private JTextArea textArea33;
    private JTextArea textArea34;
    private JTextArea textArea35;
    private JTextArea textArea36;
    private JTextArea textArea37;
    public JCheckBox REDcheckBox;
    public JCheckBox GREENcheckBox;
    public JCheckBox BLUEcheckBox;
    public JCheckBox YELLOWcheckBox;
    public JCheckBox ORANGEcheckBox;
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JLabel userLabel;
    public JLabel scoreLabel;


    public String getUserLabel() {
        return userLabel.getText();
    }

    public void setScoreLabel(int score){
        this.scoreLabel.setText(String.valueOf(score));
    }

    public int getScoreLabel(){
        return Integer.parseInt(scoreLabel.getText());
    }

    public void setUserLabel(String user) {
        this.userLabel.setText(user);
    }



    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public JComboBox getComboBox2() {
        return comboBox2;
    }

    public int row;
    public int col;
    public CellStatus color;
    public String interf;

    private static GameGUI5x5 gameGUI5x5 = new GameGUI5x5();

    private GameGUI5x5() {
        setContentPane(rootPanel);
        pack();
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static GameGUI5x5 getInstance(String user, int score) {
        gameGUI5x5.setUserLabel(user);
        gameGUI5x5.setScoreLabel(score);
        return gameGUI5x5;
    }


    public void setInterf(String interf) {
        this.interf = interf;
    }

    private void createUIComponents() {
       // if (interf.equals("DOTS")) {
            LblRED = new JLabel(new ImageIcon("images/RED_DOT_50.png"));
            LblGREEN = new JLabel(new ImageIcon("images/GREEN_DOT_50.png"));
            LblBLUE = new JLabel(new ImageIcon("images/BLUE_DOT_50.png"));
            LblORANGE = new JLabel(new ImageIcon("images/ORANGE_DOT_50.png"));
            LblYELLOW = new JLabel(new ImageIcon("images/YELLOW_DOT_50.png"));
//        }
//        else if(interf.equals("RECTANGLE"))
//
//        {
//        LblRED = new JLabel(new ImageIcon("images/RED_RECTANGLE_50.png"));
//        LblGREEN = new JLabel(new ImageIcon("images/GREEN_RECTANGLE_50.png"));
//        LblBLUE = new JLabel(new ImageIcon("images/BLUE_RECTANGLE_50.png"));
//        LblORANGE = new JLabel(new ImageIcon("images/ORANGE_RECTANGLE_50.png"));
//        LblYELLOW = new JLabel(new ImageIcon("images/YELLOW_RECTANGLE_50.png"));
//        }else if(interf.equals("TRIANGLE"))
//
//        {
//        LblRED = new JLabel(new ImageIcon("images/RED_TRIANGLE_50.png"));
//        LblGREEN = new JLabel(new ImageIcon("images/GREEN_TRIANGLE_50.png"));
//        LblBLUE = new JLabel(new ImageIcon("images/BLUE_TRIANGLE_50.png"));
//        LblORANGE = new JLabel(new ImageIcon("images/ORANGE_TRIANGLE_50.png"));
//        LblYELLOW = new JLabel(new ImageIcon("images/YELLOW_TRIANGLE_50.png"));
//        }


    }

    public String getInterf() {
        return interf;
    }
}

