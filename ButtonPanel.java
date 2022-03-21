import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Icon;
import javax.swing.border.Border;


public class ButtonPanel{

//creating new panels
	private JPanel left = new JPanel();
	private JPanel left2 = new JPanel();
	private JPanel left3 = new JPanel();
//adding all the pictures using the picture() class
    private Picture icon1 = new Picture("Empty.png");
    private Picture orange_icon = new Picture("Colour_1.png");
    private Picture red_icon = new Picture("Colour_0.png");
    private Picture yellow_icon = new Picture("Colour_2.png");
    private Picture green_icon = new Picture("Colour_3.png");
    private Picture blue_icon = new Picture("Colour_4.png");
    private Picture indigo_icon = new Picture("Colour_5.png");
    private Picture violet_icon = new Picture("Colour_6.png");
    private Picture correct_picture = new Picture("Score_0.png");
    private Picture almost_picture = new Picture("Score_1.png");
//creating the layouts
	private GridLayout grid1 = new GridLayout(2,2);
	private GridLayout grid2 = new GridLayout(1,2);
	private GridLayout grid3 = new GridLayout(1,4);
// labels for the guessing 
	private JLabel lab1 = new JLabel(icon1);
	private JLabel lab2 = new JLabel(icon1);
	private JLabel lab3 = new JLabel(icon1); 
	private JLabel lab4 = new JLabel(icon1);
// labels for the hints 
	private JLabel lab5 = new JLabel(icon1);
	private JLabel lab6 = new JLabel(icon1);
	private JLabel lab7 = new JLabel(icon1);
	private JLabel lab8 = new JLabel(icon1);
// ---------------------

	private int counter = 0;
    private Border black_outline = BorderFactory.createLineBorder(Color.black); //outline for the panels

    private JLabel pass = new JLabel(); //label variable for changing
    private JLabel score_pass = new JLabel(); //label for changing the scores

	public ButtonPanel(){ 

		pass = lab1; //set default to lab1
		left.setLayout(grid3);

//adding labels
		left.add(lab1);
		left.add(lab2);
		left.add(lab3);
		left.add(lab4);
		left2.setLayout(grid1); //setting left2 layout
		left2.add(lab5);
		left2.add(lab6);
		left2.add(lab7);
		left2.add(lab8);
//adding the panels to panel 3
		left3.setLayout(grid2);
		left3.add(left);
		left3.add(left2);
		left3.setBorder(black_outline); //set border
	}

	public JPanel getPanel(){ //get method to return panel to the frame class
		return left3;
	}

	public void change(int the_count, int type){
//changing the icons to the selected colour
		if(type == 1){
			pass.setIcon(orange_icon);
			counter = counter +1;
		}
		if(type == 2){
			pass.setIcon(red_icon);
			counter = counter + 1;
		}
		if (type == 3){
			pass.setIcon(yellow_icon);
			counter = counter + 1;
		}
		if(type == 4){
			pass.setIcon(green_icon);
			counter = counter + 1;
		}
		if(type ==5){
			pass.setIcon(blue_icon);
			counter = counter + 1;
		}
		if(type == 6){
			pass.setIcon(indigo_icon);
			counter = counter + 1;
		}
		if(type == 7){
			pass.setIcon(violet_icon);
			counter = counter + 1;
		}
// setting it to the next label
		if(counter == 1){
    		pass = lab2;
    	}
    	if(counter == 1){
    		pass = lab2;
    	}
    	if(counter == 2){
    		pass = lab3;
    	}
    	if(counter == 3){
    		pass = lab4;
    	}
    	if(counter == 4){
    		pass = lab1;
    		counter = 0;
    	}

	}


	public int correctPosition(int counter_score){

//changing the label which will be changed
		if(counter_score == 0){
			score_pass = lab5;
		}
		if(counter_score == 1){
			score_pass = lab6;
		}
		if(counter_score == 2){
			score_pass =lab7;
		}
		if(counter_score == 3){
			score_pass = lab8;
		}
		if(counter_score == 4){
			counter_score = 0;
		}

		score_pass.setIcon(correct_picture); //setting to correct
		counter_score = counter_score + 1; 
		return counter_score;

	}
	public int almostCorrect(int counter_score){
//changing the label which will be changed
		if(counter_score == 0){
			score_pass = lab5;
		}
		if(counter_score == 1){
			score_pass = lab6;
		}
		if(counter_score == 2){
			score_pass =lab7;
		}
		if(counter_score == 3){
			score_pass = lab8;
		}
		if(counter_score == 4){
			counter_score = 0;
		}
		score_pass.setIcon(almost_picture); //setting to wrong position
		counter_score = counter_score + 1;
		return counter_score;

	}

	public int you_couldnt_be_any_more_wrong(int counter_score){
//this just increments the counter, if the guess was wrong
		counter_score = counter_score +1;
		return counter_score;

	}

}