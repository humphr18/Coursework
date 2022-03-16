import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Icon;

public class ButtonPanel{
	private JPanel left = new JPanel();
	private JPanel left2 = new JPanel();
	private JPanel left3 = new JPanel();

    private Picture icon1 = new Picture("/Users/samhumphreys/Documents/Coursework/Empty.png");
	private JButton b1 = new JButton(icon1);

	private JButton b2 = new JButton(icon1);
	private JButton b3 = new JButton(icon1);
	private JButton b4 = new JButton(icon1);
	private GridLayout grid1 = new GridLayout(2,2);
	private GridLayout grid2 = new GridLayout(1,2);
	private FlowLayout flow1 = new FlowLayout();

	private JButton b5 = new JButton(icon1);
	private JButton b6 = new JButton(icon1);
	private JButton b7 = new JButton(icon1);
	private JButton b8 = new JButton(icon1);

	public ButtonPanel(){ 

		left.add(b1); 
		left.add(b2);
		left.add(b3);
		left.add(b4);
		left.setLayout(flow1);
		left2.setLayout(grid1);
		left2.add(b5);
		left2.add(b6);
		left2.add(b7);
		left2.add(b8);
		left2.setSize(50,50);
		left3.setLayout(grid2);
		left3.add(left);
		left3.add(left2);
	}

	public JPanel getPanel(){
		return left3;
	}

}