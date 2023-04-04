//Wichayaporn Punnodaka[6530301003]

import java.awt.*;
import javax.swing.*;

public class Rowbranch extends JPanel{
	private Component[] listItems;
	Rowbranch()
	{
		//set How much row
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(400,100));
	}
	public void updateNumbers()
	{
		listItems = this.getComponents();
		
		for(int i = 0;i < listItems.length; i++)
		{
			if(listItems[i] instanceof Task)
			{
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
	}
	public void removeCompletedTasks()
	{
		
		for(Component c : getComponents())
		{
			if(c instanceof Task)
			{
				if(((Task)c).getState())
				{
					remove(c);
					updateNumbers();
				}
			}
		}
		
	}


}