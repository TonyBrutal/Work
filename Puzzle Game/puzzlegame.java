import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image; //this .image has a capital I 
import java.awt.image.CropImageFilter; //lowercase i
import java.awt.image.FilteredImageSource;


class FancyButton extends JButton
{
    public FancyButton()
    {addMouseListener
        (new MouseAdapter()
            {
                public void mouseEntered(MouseEvent e) 
                {
                    setBorder(BorderFactory.createLineBorder(Color.YELLOW));
                }
                public void mouseExited(MouseEvent e) 
                {
                    setBorder(BorderFactory.createLineBorder(Color.GRAY));
                }
                public void mouseClicked(MouseEvent e) 
                {
                    setBorder(BorderFactory.createLineBorder(Color.GREEN));
                }
            }
        ); 
    }
}        
    


public class puzzlegame extends JFrame
{
    JPanel panel;
    final int numrows = 4, numcols = 4;
    int height = 600;
    int width = 600;
    List<FancyButton> allButtons = new ArrayList<FancyButton>();
    List<FancyButton> solution = new ArrayList<FancyButton>();
    BufferedImage imgSrc; //original image
    BufferedImage scaledImg; //scaled image

    public puzzlegame() 
    {

        super("Puzzle Game");

        panel = new JPanel(); //creates instance of panel
        panel.setLayout(new GridLayout(numrows,numcols)); //visual layout for the game
        add(panel); //add panel to JFrame

        
        //Handles the exception for the image
        try
        {
            imgSrc = loadImage();

            //get scaled image
            int imgsrcWidth = imgSrc.getWidth();
            int imgsrcHeight = imgSrc.getHeight();
            //reset from original image width over original image height --> scale to the width of the frame
            height = (int)((double)imgsrcWidth/imgsrcWidth*height);

            if(imgsrcHeight < 700 && imgsrcWidth < 1000)
            {
                width = imgsrcWidth;
                height = imgsrcHeight;
            }

            //resize image
            scaledImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            var g = scaledImg.createGraphics();
            g.drawImage(imgSrc, 0,0, width, height, null);
            g.dispose();
        }
        catch(IOException e) 
        {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error Title", JOptionPane.ERROR_MESSAGE); //If it catches an exception it'll display this error message
        }

        //create buttons and add them to panel
        for(int i=0; i< numrows*numcols; i++) //repeats the number of buttons
        {
            //mapping the image to load on buttons, location of the rows and columns
            int row = i / numcols;
            int cols = i % numcols;

            FancyButton btn = new FancyButton(); //creating new button
            //panel.add(btn); //adds the button to the panel
            allButtons.add(btn); //adding arraylist of buttons
            btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            btn.addActionListener(e -> MyClickEventHandler(e)); //This calls the method that makes the buttons perform an action

            //get the correct slice from the image into the buttons
            Image imageSlice = createImage(new FilteredImageSource(scaledImg.getSource(), new CropImageFilter(cols*width/numcols,row*height/numrows, width/numcols, height/numrows)));

            //cuts out the space for an empty button area.
            if(i == numrows*numcols -1)
            {
                btn.setBorderPainted(false);
                btn.setContentAreaFilled(false);
            }
            else
            {
                btn.setIcon(new ImageIcon(imageSlice));
            }
        }
        solution = List.copyOf(allButtons);//save solution

        Collections.shuffle(allButtons);
        for(var btn : allButtons)
        {
            panel.add(btn); //adds buttons after shuffling the array list of buttons
        }

        setSize(width,height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void MyClickEventHandler(ActionEvent e) 
    {
        //find what button was clicked
        FancyButton btn = (FancyButton) e.getSource();
        int j = allButtons.indexOf(btn); //where is it in the array list
        int btnRow = j/numcols, btnCol = j % numcols; //where is it on the grid

        //where is the empty button
        int i = 1;
        for(i = 0; i < allButtons.size(); i++)
        {
            if(allButtons.get(i).getIcon()==null)
            {
                //found it
                break; //done with the loop after finding it
            }
        }

        int emptyRow = i / numcols, emptyCol = i % numcols;

        //adjacent, swap spots
        if((emptyRow == btnRow && Math.abs(emptyCol - btnCol) == 1) || (emptyCol == btnCol && Math.abs(emptyRow - btnRow) == 1))
        {
            Collections.swap(allButtons, i, j);

            //update grid
            panel.removeAll();
            for(var btn_ : allButtons)
            {
                panel.add(btn_);
            }
            panel.validate();
        }

        if(allButtons.equals(solution))
        {
            JOptionPane.showMessageDialog(null, "You Win!");
        }
    }

    BufferedImage loadImage() throws IOException
    {
        int a = (int)((Math.random()*2)+1);
        String b = a + "PuzzleImage.jpg";
        return ImageIO.read(new File(b)); //can use Try Catch or the throws IOException so you are aware of the exception
    }

}
