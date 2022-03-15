import javax.swing.*;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Frame{
	private JFrame frame = new JFrame("Code Breaker");
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel label = new JLabel("");
	private GridLayout layout = new GridLayout(4, 1);
	private JButton b1 = new JButton();
    private Icon icon = new ImageIcon("/Users/samhumphreys/Documents/Coursework/Empty.png");
    private JButton button7 = new JButton(icon);

	public Frame(){
		frame.setSize(500,500);
		frame.add(panel1);
		frame.add(panel2);
		panel1.add(b1);
		panel2.add(button7);

		frame.setLayout(layout);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}