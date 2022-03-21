import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.util.*;



public class Frame implements ActionListener{
	private JFrame frame = new JFrame("Code Breaker"); //creating the frame

//creating instances of the button panels
    private ButtonPanel bp1 = new ButtonPanel();
    private ButtonPanel bp2 = new ButtonPanel();
    private ButtonPanel bp3 = new ButtonPanel();
    private ButtonPanel bp4 = new ButtonPanel();
    private ButtonPanel bp5 = new ButtonPanel();
    private ButtonPanel bp6 = new ButtonPanel();
    private ButtonPanel hidden_panel = new ButtonPanel();
// Layouts ----
	private GridLayout grid2 = new GridLayout(7,1); //layout for the full frame in grid
    private GridLayout grid1 = new GridLayout(1,7); //layout for the panel of buttons

	private JPanel mainPanel = new JPanel(); //creating main panel
    private JPanel button_panel = new JPanel(); //creating the button panel

    private Scanner newScanner= new Scanner(System.in); //scanner for user input


//Buttons for selecting the colours
    private Picture icon_orange = new Picture("Colour_1.png");
    private JButton button_orange = new JButton(icon_orange);

    private Picture icon_red = new Picture("Colour_0.png");
    private JButton button_red = new JButton(icon_red);

    private Picture icon_yellow = new Picture("Colour_2.png");
    private JButton button_yellow = new JButton(icon_yellow);

    private Picture icon_green = new Picture("Colour_3.png");
    private JButton button_green = new JButton(icon_green);

    private Picture icon_blue = new Picture("Colour_4.png");
    private JButton button_blue = new JButton(icon_blue);

    private Picture icon_indigo = new Picture("Colour_5.png");
    private JButton button_indigo = new JButton(icon_indigo);

    private Picture icon_violet = new Picture("Colour_6.png");
    private JButton button_violet = new JButton(icon_violet);
// ---------------------------------

    private int counter = 0; // counting through rows
    private int outer_counter = 0; // counting through the panels

	private ButtonPanel pass = new ButtonPanel(); //changable panel variable
	private GenerateNumbers gn1 = new GenerateNumbers(); //instance of number generation class

	private int[] array = {0,0,0,0}; //stores numbers 

    private int[] the_guess = {0,0,0,0}; //array to store guesses
    private int score_counter = 0;

    private int correct_count = 0;

	public Frame(){
		pass = bp1; //starts by passing first panel
		gn1.getRandom(array); //gets the random numbers in the array

/* array prints for testing
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);  */

//adding action listeners ---
        button_orange.addActionListener(this);
    	button_red.addActionListener(this);
    	button_yellow.addActionListener(this);
    	button_green.addActionListener(this);
    	button_blue.addActionListener(this);
    	button_indigo.addActionListener(this);
    	button_violet.addActionListener(this);
//Adding buttons to the button press panel
        button_panel.add(button_orange);
    	button_panel.add(button_red);
    	button_panel.add(button_yellow);
    	button_panel.add(button_green);
        button_panel.add(button_blue);
        button_panel.add(button_indigo);
        button_panel.add(button_violet);
        button_panel.setLayout(grid1); 

		frame.setContentPane(mainPanel); //main panel to content frame
		frame.setSize(300,590); //sets frame size
		mainPanel.setLayout(grid2); 
// adding to the panel (reverse order to start bottom up)
		mainPanel.add(bp6.getPanel());
		mainPanel.add(bp5.getPanel());
		mainPanel.add(bp4.getPanel());
		mainPanel.add(bp3.getPanel());
		mainPanel.add(bp2.getPanel());
		mainPanel.add(bp1.getPanel());
		mainPanel.add(button_panel);
//----------
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ends program on close


	}

    public void actionPerformed(ActionEvent e){

// operations to change to the colours on the board and make guesses
        if (e.getSource() == button_orange){
            pass.change(counter, 1); //pass to method in the ButtonPanel class
            the_guess[counter] = 1; //add to array for later comparison
            counter = counter + 1; //increment counter

        }
    	if(e.getSource() == button_red){
    		pass.change(counter, 2 );
            the_guess[counter] = 2;
    		counter = counter + 1;

    	}
    	if(e.getSource() == button_yellow){
    		pass.change(counter, 3);
            the_guess[counter] = 3;
            counter = counter + 1;

    	}
    	if(e.getSource() == button_green){
    		pass.change(counter, 4);
            the_guess[counter] = 4;
            counter = counter + 1;

    	}
    	if(e.getSource() == button_blue){
    		pass.change(counter, 5);
            the_guess[counter] = 5;
            counter = counter + 1;

    	}
    	if(e.getSource() == button_indigo){
    		pass.change(counter, 6);
            the_guess[counter] = 6;
            counter = counter + 1;

    	}
    	if(e.getSource() == button_violet){
    		pass.change(counter, 7);
            the_guess[counter] = 7;
            counter = counter + 1;
    	}
// --------------------------------------

// method for checking the score
        if(counter == 4){
            while(score_counter < 4 ){ //loops at the end of all the guess inputs
                //if correct:
                if(array[score_counter] == the_guess[score_counter]){
                    correct_count = correct_count + 1;
                    pass.correctPosition(score_counter); //calling buttonpanel method
                }
                //if in the wrong place:
                else if((array[0] == the_guess[score_counter] || array[1] == the_guess[score_counter] || array[2] == the_guess[score_counter] || array[3] == the_guess[score_counter]) && array[score_counter] != the_guess[score_counter]){
                    pass.almostCorrect(score_counter);
                    correct_count = 0;
                }
                //if incorrect:
                else{
                    pass.you_couldnt_be_any_more_wrong(score_counter);
                    correct_count = 0;
                }

                score_counter = score_counter + 1;

            }

        }
// ---------------------------------------

        score_counter = 0; // resets score counter at end of operation

// chnanging to the next panels
        if(counter == 4){
            counter= 0;
            if(correct_count == 4){
                System.out.println("You won!");
            }
            else{
                correct_count = 0;
            }
    		if(outer_counter == 0){
    			pass = bp2;
    		}
    		if(outer_counter == 1){
    			pass = bp3;
    		}
    		if(outer_counter == 2){
    			pass = bp4;
    		}
    		if(outer_counter == 3){
    			pass = bp5;
    		}
    		if(outer_counter == 4){
    			pass = bp6;
    		}
    		if(outer_counter == 5){
    			pass = hidden_panel;
                System.out.println("You lose! out of tries");
    		}

    	outer_counter = outer_counter + 1;


    	}

    }
        
}