//Wichayaporn Punnodaka[6530301003]

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Frame extends JFrame{
	
	private TitleBar title = new TitleBar();
	private Button btn = new Button();
	private Rowbranch row = new Rowbranch();
	private float roundA = 0;
	private float roundB = 0;
	private int a;
 	private JButton AddTask;
	private JButton clear;
	public  void addPre(){
		if(roundA==0){
			a = (int)((roundB/1)*100);
		}
		else{
			a = (int)((roundB/roundA)*100);
		}
		title.addProgressBar(a);
	}
	
	Frame()
	{
		this.setTitle("Welcome to Habit Task");
		this.setSize(600,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//set position
		this.add(title,BorderLayout.NORTH);
		this.add(btn,BorderLayout.SOUTH);
		this.add(row,BorderLayout.CENTER);
		
		AddTask = btn.getNewTask();
		clear = btn.getClear();
		
		addListeners();
	}
	
	
	public void addListeners()
	{
		AddTask.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent e)
			{
				Task task = new Task();
				row.add(task);
				row.updateNumbers();
				roundA++;

				//calculate 
				addPre();
				
				


				task.getDone().addMouseListener(new MouseAdapter()
				{
					@Override
					public void mousePressed(MouseEvent e)
					{
						task.changeState();
						roundB++;
						String text = task.InsertTask.getText();
						System.out.print(text);

						//calculate
						addPre();
						row.updateNumbers();
						revalidate();
						
					}
				});
			}
			
		});
		
		
		clear.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent e)
			{
				roundA-=roundB;
				roundB = 0;
				addPre();
				row.removeCompletedTasks();
				repaint();
			}
		});
	}	
	
}
