import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;

public class GuessGame extends JFrame 
{
    // fields
    private int hiddenValue;
    private int countGuesses = 0;
    int MaxTries = 10;
    int guessCount = MaxTries-1;
    JPanel contents = new JPanel();
    JPanel contents2 = new JPanel();
    JPanel contents3 = new JPanel();
    JLabel label = new JLabel("Enter a guess between 1 and 100: ");
    JLabel guessLabel = new JLabel();
    JButton submitButton = new JButton("Submit");
    JButton btnReset = new JButton("Reset Game");
    JTextField tfUserGuess = new JTextField(25);
    ArrayList<Color> colors;

    // method
    private void checkAnswer(ActionEvent e) 
    {
        int userGuess = 0;

        try {
            userGuess = Integer.parseInt(tfUserGuess.getText());
        }

        catch (Exception exc) {
            JOptionPane.showMessageDialog(rootPane, "Unexpected Input, Try using numbers between 1 and 100.");
            return;
        }

        countGuesses++; // just used a guess, counter.

        // give appropriate feedback
        if (userGuess == hiddenValue) {
            JOptionPane.showMessageDialog(rootPane, "You Won!");
            submitButton.setEnabled(false);

        } else if (userGuess < hiddenValue) {
            JOptionPane.showMessageDialog(rootPane, "Too Low! You have " + guessCount-- + " chances.");
            

        } else {
            JOptionPane.showMessageDialog(rootPane, "Too High! You have " + guessCount-- + " chances.");
            
        }
        if (countGuesses >= MaxTries) {
            JOptionPane.showMessageDialog(rootPane, "You ran out of guesses.");
            submitButton.setEnabled(false);
            tfUserGuess.setEnabled(false);
        }

        // update the background color
        contents3.setBackground(colors.get((int) ((countGuesses - 1.0) / MaxTries * colors.size())));

    }

    // constructor
    public GuessGame() {
        super("Guessing Game");

        //contents.setLayout(new BoxLayout(contents, BoxLayout.Y_AXIS));

        colors = new ArrayList<Color>();
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.PINK);
        colors.add(Color.ORANGE);
        colors.add(Color.RED);

        // randomly choose number between 1 and 100 (inclusive)
        // this will be computer's hidden value.
        hiddenValue = (int) (Math.random() * 100) + 1;

        // GUI
        add(contents); // add panel to JFrame
        // add button and text fields to the panel
        contents.add(contents2);
        contents2.add(label);
        contents.add(contents3);
        contents3.setBackground(colors.get(0));
        contents.add(tfUserGuess);
        contents.add(submitButton);
        contents.add(btnReset);

        // add action listener to button
        submitButton.addActionListener(e -> checkAnswer(e));
        btnReset.addActionListener(e -> resetGame(e));

        // contents.setBackground(Color.GREEN);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(500, 150);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    void resetGame(ActionEvent e) {
        resetCounter();
    }

    private void resetCounter() {
        countGuesses = 0;
        hiddenValue = (int) (Math.random() * 100) + 1;
        submitButton.setEnabled(true);
        tfUserGuess.setText("");
        contents3.setBackground(colors.get(0));
    }



}
