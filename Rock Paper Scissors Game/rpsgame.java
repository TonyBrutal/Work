import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class rpsgame extends JFrame implements ActionListener
{
    JButton RButton, PButton, SButton; //variables for the rock, paper, scissors buttons.
    JLabel playerScoreBoard, npcScoreBoard; //the label used to display the score count.
    JTextField tf, tf2; //variables for the textfield outputs.
    int playerScore = 0;
    int npcScore = 0;
    JMenuBar menubar = new JMenuBar(); //allows the creation of the menu bar in the gui.

    public rpsgame()
    {
        super("RPS Game"); //displays a title at the top of the gui.
        setVisible(true); //sets the display to visible.
        setSize(520,300); //sets the gui size.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //closes the gui on exit.
        setResizable(false); //prevents resizing of the gui screen. ## RIGHT NOW IF THIS IS ENABLED IT MESSES THE GUI UP. ##
        setLocationRelativeTo(null); //sets the gui to center of the screen.

        setJMenuBar(menubar); //adding a menu bar

        JMenu gameOptions = new JMenu("Game Options"); //adding options tab to menu bar
        menubar.add(gameOptions); //adds game options tab name

        JMenuItem resetGame = new JMenuItem("Reset the game"); //adding reset option in menu bar
        gameOptions.add(resetGame); //adds the reset function within the game options tab.
        resetGame.addActionListener(e -> resetGame()); //activates the reset game option.
        
        JPanel window = (JPanel) getContentPane(); //casts container to JPanel.
        window.setLayout(null); //sets the gui layout to null to utilize the bounds more.       

        tf = new JTextField(20); // Setting up the first text field display.
        window.add(tf); //adds the first text field to display.
        tf.setBounds(145, 85,200,20); //location appearance of the first text field.

        tf2 = new JTextField(20); //setting up the second text field display.
        window.add(tf2); //adds second text field to display.
        tf2.setBounds(145, 105,200,20); //location and appearance of second text field.

        RButton = new JButton("Rock"); //creates the Rock button
        window.add(RButton); //adds the Rock button to be displayed.
        RButton.addActionListener(this); //adds the ActionListener for this button enabling it to be used.
        RButton.setBounds(105,25,100,50); //sets appearance on display and location of this button.

        PButton = new JButton("Paper");
        window.add(PButton);
        PButton.addActionListener(this);
        PButton.setBounds(205,25,100,50);

        SButton = new JButton("Scissors");
        window.add(SButton);
        SButton.addActionListener(this);
        SButton.setBounds(305,25,100,50);

        playerScoreBoard = new JLabel("Player Score: " + playerScore);  //displays player score
        window.add(playerScoreBoard); //adds the score to the display.
        playerScoreBoard.setBounds(215, 120, 100,50); //sets the location of the score on the gui.
        playerScoreBoard.setVisible(true); //allows the score to be visible on the gui.

        npcScoreBoard = new JLabel("NPC Score: " + npcScore);  //displays npc score
        window.add(npcScoreBoard);
        npcScoreBoard.setBounds(220, 140, 100,50);
        npcScoreBoard.setVisible(true);

        
    }

    public void actionPerformed(ActionEvent event) 
    {
        Object source = event.getSource();  //returns object of the event that occurred.
        int player; 
        int npc;   
        String winner;
        Random random = new Random();  //creates a new 'random num' instance.
        if (source == RButton) 
        { 
            player = 0; //button 0 is Rock
        }
        else if (source == PButton)
        { 
            player = 1; //button 1 is Paper
        } 
        else 
        {
            player = 2; //button 2 is Scissors because its the only button left.
        }

        npc = random.nextInt(3); //rolls random num for npc
        winner = whoWins(player, npc); //used to determine the winner
        tf.setText("The winner is " + winner + "!"); //displays this result to first text field.
        if (npc == 0) //if npc rolls 0, displays the choice in the second text field.
        { 
            tf2.setText("NPC chooses rock");
        } 
        else if (npc == 1) //if npc rolls 1, displays the choice in the second text field.
        {
            tf2.setText("NPC chooses paper");
        } 
        else 
        {
            //if npc rolls anything other than 0 and 1 it chooses this, displays the choice in the second text field.
            tf2.setText("NPC chooses scissors"); 
        }
        playerScoreBoard.setText("Player Score: " + playerScore);
        npcScoreBoard.setText("NPC Score: " + npcScore);
    }
        String whoWins(int player, int npc) 
    {
        String winner; //displays the string value for the conditions that are met.
        if (player == npc) 
        { 
            winner = "no one, It's a tie"; //displays this in case of a tie.
        } 
        else if (player == 0 && npc == 1) //displays NPC is the winner.
        {
            winner = "NPC!";
            npcScore += 1;

        } 
        else if (player == 1 && npc == 2) //displays NPC is the winner.
        {
            winner = "NPC!";
            npcScore += 1;
 
        } 
        else if (player == 2 && npc == 0) //displays NPC is the winner.
        {
            winner = "NPC!";
            npcScore += 1;
        } 
        else 
        {
            winner = "the Player!"; //displays that the player has won.
            playerScore += 1;
        } 
        return winner;
        
    }

    public void resetGame()
    {
        //Reset the scores to zero.
        playerScore = 0;
        npcScore = 0;
        playerScoreBoard.setText("Player Score: " + playerScore); //resets the player scoreboard
        npcScoreBoard.setText("NPC Score: " + npcScore); //resets the npc scoreboard

    }

}
