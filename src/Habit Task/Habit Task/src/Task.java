//Wichayaporn Punnodaka[6530301003]

import java.awt.*;
import javax.swing.*;


public class Task extends JPanel{
	
	JLabel Order;
	JTextField InsertTask;
	JButton Done;
	
	 boolean checked;
	
	Task()
	{

		//set size
		this.setPreferredSize(new Dimension(400,20));

        //set color 
    	Color orderC = new Color(255, 132, 134);
        Color writinghereC = new Color(226,217,188);
        Color doneC = new Color(85, 242, 192);
		Color text = new Color(177, 143, 141);
		
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		//Order123
		Order = new JLabel();
		this.setBackground(orderC);
		Order.setPreferredSize(new Dimension(20, 20));
		Order.setHorizontalAlignment(JLabel.CENTER);
		this.add(Order,BorderLayout.WEST);

		//InsertTask
		InsertTask = new JTextField(" Writing here");
		InsertTask.setBorder(BorderFactory.createEmptyBorder());
		InsertTask.setFont(new Font("Monospaced",Font.BOLD,15));
		InsertTask.setBackground(writinghereC);
		InsertTask.setForeground(text);
		this.add(InsertTask,BorderLayout.CENTER);
		
		//Done
		Done = new JButton("Done");
		Done.setPreferredSize(new Dimension(40,20));
        Done.setBackground(doneC);
		Done.setBorder(BorderFactory.createEmptyBorder());
		Done.setFocusPainted(false);
		this.add(Done,BorderLayout.EAST);
		
	}
	
	

	public void changeIndex(int num)
	{
		this.Order.setText(num+"");
		this.revalidate();
	}
	
	
	public JButton getDone()
	{
		return Done;
	}
	
	public boolean getState()
	{
		return checked;
		
	}
	//Change color Border and Font after click Done Button
	public void changeState()
	{
		Color color3 = new Color(85, 242, 192);
		this.setBackground(color3);
		InsertTask.setForeground(Color.BLACK);
		InsertTask.setBackground(color3);
        Done.setBackground(color3);
		checked = true;
		revalidate();
	}
}
