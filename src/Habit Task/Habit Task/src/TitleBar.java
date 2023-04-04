//Wichayaporn Punnodaka[6530301003]

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class TitleBar extends JPanel{

	private JProgressBar progressBar;

	TitleBar()
	{
		this.setPreferredSize(new Dimension(400,120));
		JPanel titlePanel = new JPanel();
		JLabel titleText = new JLabel("Habit Task");
		titleText.setPreferredSize(new Dimension(200,60));
		titleText.setFont(new Font("Georgia", Font.ITALIC + Font.BOLD, 30));
		titleText.setHorizontalAlignment(JLabel.CENTER);

		//make edge bar border
		titleText.setBorder(new EmptyBorder(50,50,50,0));

		//make bar
		progressBar = new JProgressBar();

		titlePanel.setLayout(new BoxLayout(titlePanel,BoxLayout.Y_AXIS));
		titlePanel.add(titleText);
		titlePanel.add(progressBar);
		progressBar.setForeground(Color.red);



		this.add(titlePanel);
	}
	public void addProgressBar(int a){
		progressBar.setValue(a);
	}
}