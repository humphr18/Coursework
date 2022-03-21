import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import java.awt.event.*;



public class Frame implements ActionListener{
	private JFrame frame = new JFrame("Code Breaker");

    private ButtonPanel bp1 = new ButtonPanel();
    private ButtonPanel bp2 = new ButtonPanel();
    private ButtonPanel bp3 = new ButtonPanel();
    private ButtonPanel bp4 = new ButtonPanel();
    private ButtonPanel bp5 = new ButtonPanel();
    private ButtonPanel bp6 = new ButtonPanel();
    private ButtonPanel hidden_panel = new ButtonPanel();

    private JPanel build_panel1 = new JPanel();
    private JPanel build_panel2 = new JPanel();
    private JPanel build_panel3 = new JPanel();
    private JPanel build_panel4 = new JPanel();
    private JPanel build_panel5 = new JPanel();
    private JPanel build_panel6 = new JPanel();


	private JPanel leftPanel1 = new JPanel();
	private JPanel leftpanel2 = new JPanel();
	private GridLayout grid2 = new GridLayout(7,1);
	private BorderLayout flow1 = new BorderLayout();
	private JPanel mainPanel = new JPanel();


//Buttons for selecting the colours
    private Picture icon_orange = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_1.png");
    private JButton button_orange = new JButton(icon_orange);

    private Picture icon_red = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_0.png");
    private JButton button_red = new JButton(icon_red);

    private Picture icon_yellow = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_2.png");
    private JButton button_yellow = new JButton(icon_yellow);

    private Picture icon_green = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_3.png");
    private JButton button_green = new JButton(icon_green);

    private Picture icon_blue = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_4.png");
    private JButton button_blue = new JButton(icon_blue);

    private Picture icon_indigo = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_5.png");
    private JButton button_indigo = new JButton(icon_indigo);

    private Picture icon_violet = new Picture("/Users/samhumphreys/Documents/Coursework/Colour_6.png");
    private JButton button_violet = new JButton(icon_violet);
// ---------------------------------

    private JPanel button_panel = new JPanel();

    private GridLayout grid1 = new GridLayout(1,7);

    private int counter = 0;
    private int outer_counter = 0;

    private JPanel emptypanel = new JPanel();

	private GridLayout panelgrids = new GridLayout(1,2);

	private ButtonPanel pass = new ButtonPanel();

	private GenerateNumbers gn1 = new GenerateNumbers();

	private int[] array = {0,0,0,0};

//    private int[] the_guess = {0,0,0,0};
    private int[] the_guess = {0,0,0,0};
    private int score_counter = 0;


	public Frame(){
		pass = bp1;
		gn1.getRandom(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        button_orange.addActionListener(this);
    	button_red.addActionListener(this);
    	button_yellow.addActionListener(this);
    	button_green.addActionListener(this);
    	button_blue.addActionListener(this);
    	button_indigo.addActionListener(this);
    	button_violet.addActionListener(this);

        button_panel.add(button_orange);
    	button_panel.add(button_red);
    	button_panel.add(button_yellow);
    	button_panel.add(button_green);
        button_panel.add(button_blue);
        button_panel.add(button_indigo);
        button_panel.add(button_violet);
        button_panel.setLayout(grid1); 

		frame.setContentPane(mainPanel);
		frame.setSize(300,590);
		mainPanel.setLayout(grid2);

		mainPanel.add(bp6.getPanel());
		mainPanel.add(bp5.getPanel());
		mainPanel.add(bp4.getPanel());
		mainPanel.add(bp3.getPanel());
		mainPanel.add(bp2.getPanel());
		mainPanel.add(bp1.getPanel());
		mainPanel.add(button_panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == button_orange){
            pass.change(counter, 1);
            the_guess[counter] = 1;
            counter = counter + 1;
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
        if(counter == 4){
            while(score_counter < 4 ){


                if(array[score_counter] == the_guess[score_counter]){
                    pass.correctPosition(score_counter);
                }
                else if((array[0] == the_guess[score_counter] || array[1] == the_guess[score_counter] || array[2] == the_guess[score_counter] || array[3] == the_guess[score_counter]) && array[score_counter] != the_guess[score_counter]){
                    pass.almostCorrect(score_counter);
                }
                else{
                    pass.you_couldnt_be_any_more_wrong(score_counter);
                }

                score_counter = score_counter + 1;
            }
        }
        score_counter = 0;
    	if(counter == 4){
            counter= 0;

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
    		}
    	outer_counter = outer_counter + 1;
    	}
    }
}