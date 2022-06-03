package View;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Objects;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LanguageGUI extends JFrame{
    private JPanel rootPanel;
    private JButton continueButton;
    private JComboBox languageSelect;

    public LanguageGUI() {
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SudokuGUI(Objects.requireNonNull(languageSelect.getSelectedItem()).toString());
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
