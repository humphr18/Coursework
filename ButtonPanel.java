import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Icon;
import javax.swing.border.Border;

public class ButtonPanel{
	private JPanel left = new JPanel();
	private JPanel left2 = new JPanel();
	private JPanel left3 = new JPanel();

    private Picture icon1 = new Picture("/Users/samhumphreys/Documents/Coursework/Empty.png");
    private Picture orange_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_1.png");
    private Picture red_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_0.png");
    private Picture yellow_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_2.png");
    private Picture green_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_3.png");
    private Picture blue_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_4.png");
    private Picture indigo_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_5.png");
    private Picture violet_icon = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_6.png");

    private Picture correct_picture = new Picture("/Users/samhumphreys/Documents/Coursework/Score_0.png");
    private Picture almost_picture = new Picture("/Users/samhumphreys/Documents/Coursework/Score_1.png");

    private JLabel red_label = new JLabel(red_icon);
    private JLabel orange_label = new JLabel(orange_icon);
    private JLabel yellow_label = new JLabel(yellow_icon);
    private JLabel green_label = new JLabel(green_icon);
    private JLabel blue_label = new JLabel(blue_icon);
    private JLabel indigo_label = new JLabel(indigo_icon);
    private JLabel violet_label = new JLabel(violet_icon);


	private GridLayout grid1 = new GridLayout(2,2);
	private GridLayout grid2 = new GridLayout(1,2);
	private GridLayout grid3 = new GridLayout(1,4);
// labels for the guessing *******
	private JLabel lab1 = new JLabel(icon1);
	private JLabel lab2 = new JLabel(icon1);
	private JLabel lab3 = new JLabel(icon1); 
	private JLabel lab4 = new JLabel(icon1);
// labels for the hints ******
	private JLabel lab5 = new JLabel(icon1);
	private JLabel lab6 = new JLabel(icon1);
	private JLabel lab7 = new JLabel(icon1);
	private JLabel lab8 = new JLabel(icon1);
// **************************

	private int counter = 0;
    private Border black_outline = BorderFactory.createLineBorder(Color.black);

    private JLabel pass = new JLabel();
    private JLabel score_pass = new JLabel();


    private int correct_count = 0;

	public ButtonPanel(){ 

		pass = lab1;
		left.setLayout(grid3);

		left.add(lab1);
		left.add(lab2);
		left.add(lab3);
		left.add(lab4);

		left2.setLayout(grid1);
		left2.add(lab5);
		left2.add(lab6);
		left2.add(lab7);
		left2.add(lab8);

		left3.setLayout(grid2);
		left3.add(left);
		left3.add(left2);
		left3.setBorder(black_outline);


	}

	public JPanel getPanel(){
		return left3;
	}

	public void change(int the_count, int type){
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

		score_pass.setIcon(correct_picture);
		counter_score = counter_score + 1;
		return counter_score;
	}
	public int almostCorrect(int counter_score){

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
		score_pass.setIcon(almost_picture);
		counter_score = counter_score + 1;
		return counter_score;

	}
	public int you_couldnt_be_any_more_wrong(int counter_score){
		counter_score = counter_score +1;
		return counter_score;

	}

}