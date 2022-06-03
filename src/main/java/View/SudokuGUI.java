package View;

import ConnectionPackage.ConnectionFactory;
import Controller.ActionsOnGUI;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class SudokuGUI extends JFrame{
    private JPanel MainPanel;
    private JComboBox comboBox1;
    private JComboBox selectInterfCombo;
    public JButton STARTNEWGAMEButton;
    private JTextField PassTextField;
    private JTextField UserTextField;
    private JButton LoginButton;
    private JButton CreateBbutton;
    private JButton GENEREAZARAPORTButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel selectInterfLabel;
    private JLabel selectDiffLabel;
    public String difficulty;
    public String gameInterface;
    public ActionsOnGUI actionsOnGUI;
    ConnectionFactory connectionFactory = new ConnectionFactory("jdbc:postgresql://localhost/sudoku", "postgres", "admin");
    Connection conn;
    boolean flag = false;


    public SudokuGUI(String language) throws SQLException {
        if(language.equals("ENGLISH")){
            usernameLabel.setText("USERNAME");
            passwordLabel.setText("PASSWORD");
            LoginButton.setText("LOGIN");
            CreateBbutton.setText("CREATE ACCOUNT");
            selectDiffLabel.setText("SELECT DIFFICULTY");
            selectInterfLabel.setText("SELECT INTERFACE");
            STARTNEWGAMEButton.setText("START NEW GAME");
            GENEREAZARAPORTButton.setText("GENERATE REPORT");
            String[] interf = {"DOTS", "TRIANGLES", "RECTANGLES"};
            selectInterfCombo = new JComboBox(interf);
        }else if(language.equals("ROMANA")){
            usernameLabel.setText("UTILIZATOR");
            passwordLabel.setText("PAROLA");
            LoginButton.setText("ACCESEAZA");
            CreateBbutton.setText("CREEAZA CONT");
            selectDiffLabel.setText("SELECTEAZA DIFICULTATEA");
            selectInterfLabel.setText("SELECTEAZA INTERFATA");
            STARTNEWGAMEButton.setText("INCEPE UN NOU JOC");
            GENEREAZARAPORTButton.setText("GENEREAZA RAPORT");
            String[] interf = {"PUNCTE", "TRIUNGHIURI", "PATRATE"};
            selectInterfCombo = new JComboBox(interf);
        }else if(language.equals("ESPANA")){
            usernameLabel.setText("USUARIO");
            passwordLabel.setText("CLAVE");
            LoginButton.setText("ACCESO");
            CreateBbutton.setText("CREAR UNA CUENTA");
            selectDiffLabel.setText("SELECCIONE DIFICULTAD");
            selectInterfLabel.setText("SELECCIONAR INTERFAZ");
            STARTNEWGAMEButton.setText("NUEVO JUEGO");
            GENEREAZARAPORTButton.setText("GENERAR INFORME");
            String[] interf = {"PUNTOS", "TRIÁNGULOS", "RECTÁNGULOS"};
            selectInterfCombo = new JComboBox(interf);
        }

        setContentPane(MainPanel);
        pack();
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        conn = connectionFactory.createConnection();

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ArrayList<String> users = connectionFactory.executeSelectAll(conn);
                    for (String user : users) {
                        if (user.equals(UserTextField.getText())) {
                            flag = true;
                            System.out.println("AM GASIT USER-ul");
                            break;
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });

        CreateBbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    connectionFactory.executeInsert(conn,UserTextField.getText(), PassTextField.getText(), 0);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        STARTNEWGAMEButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getDifficulty();
                gameInterface = getInterface();

                try {
                    if(flag) {
                        actionsOnGUI = new ActionsOnGUI(difficulty, gameInterface, UserTextField.getText(), connectionFactory.getScore(conn, UserTextField.getText()));
                        try {
                            connectionFactory.closeConnection(conn);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }else
                        System.out.println("Introdu un user existent si apasa LOGIN");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        GENEREAZARAPORTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    connectionFactory.writeScoreRaport(conn);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


    }

    //@Override
    public void getDifficulty() {
        difficulty =  comboBox1.getSelectedItem().toString();
    }

    //@Override
    public String getInterface() {
        return selectInterfCombo.getSelectedItem().toString();
    }

}
