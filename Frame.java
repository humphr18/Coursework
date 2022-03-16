import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;


public class Frame{
	private JFrame frame = new JFrame("Code Breaker");

    private Icon icon1 = new ImageIcon("/Users/samhumphreys/Documents/Coursework/Empty.png");
    private ButtonPanel bp1 = new ButtonPanel();
    private ButtonPanel bp2 = new ButtonPanel();
    private ButtonPanel bp3 = new ButtonPanel();
	private JPanel leftPanel1 = new JPanel();
	private JPanel leftpanel2 = new JPanel();
	private GridLayout grid2 = new GridLayout(3,1);
	private BorderLayout flow1 = new BorderLayout();
	private JPanel mainPanel = new JPanel();

	public Frame(){
		frame.setContentPane(mainPanel);
		frame.setSize(1000,500);
		mainPanel.setLayout(grid2);
		mainPanel.add(bp1.getPanel());
		mainPanel.add(bp2.getPanel());
		mainPanel.add(bp3.getPanel());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}