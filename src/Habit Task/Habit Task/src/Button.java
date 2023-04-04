//Wichayaporn Punnodaka[6530301003]

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Button extends JPanel{
	
	private JButton addTask;
	private JButton clear;
	
	Color color1 = new Color (222, 186, 255);
	Color color2 = new Color (255, 132, 134);

	
	Button()
	{
		this.setPreferredSize(new Dimension(600,90));

		//Add Button
		addTask = new JButton("Add");
		addTask.setFont(new Font("Georgia",Font.PLAIN, 30));
		addTask.setBackground(color1);
		this.add(addTask);
		
		//Space between Button
		this.add(Box.createHorizontalStrut(20));


		//ClearButton
		clear = new JButton("Clear");
		clear.setFont(new Font("Georgia",Font.PLAIN, 25));
		clear.setBackground(color2);

		this.add(clear);
		
		
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
} 
