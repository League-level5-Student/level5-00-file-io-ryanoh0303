package _03_To_Do_List;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements MouseListener, ActionListener {
	static  JFrame window;
	static JButton addTask;
	static JButton viewTask;
	static JButton removeTask;
	static JButton saveList;
	static JButton loadList;
	static JPanel jpanel;
	 ArrayList<String> tasks =  new ArrayList<>();
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	public static void main(String[] args) throws IOException {
		window =  new JFrame("To do List");
		jpanel = new JPanel();
		 addTask = new JButton("Add Task");
		 viewTask = new JButton("View Task");
		 removeTask = new JButton("Remove Task");
		 saveList = new JButton("Save List");
         loadList = new JButton("Load Task");          
         
         ToDoList td = new ToDoList();
         td.run();
		
	}
	public void run() {
		window.setSize(800, 800);
		addTask.setSize(new Dimension(200,200));
		viewTask.setSize(new Dimension(200,200));
		removeTask.setSize(new Dimension(200,200));
		saveList.setSize(new Dimension(200,200));
		loadList.setSize(new Dimension(200,200));
		jpanel.add(addTask);
		jpanel.add(viewTask);
		jpanel.add(removeTask);
		jpanel.add(saveList);
		jpanel.add(loadList);
		addTask.addActionListener(this);
		viewTask.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		window.add(jpanel);
		window.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 					//code over here
		if(e.getSource() == addTask) {
			String tasktoAdd = JOptionPane.showInputDialog("What task to add?");
			tasks.add(tasktoAdd);
		}
		if(e.getSource() == viewTask) {
			System.out.println(tasks);
		}
		if(e.getSource() ==removeTask) {
			String tasktoRemove = JOptionPane.showInputDialog("What task to remove?");
			tasks.remove(tasks.indexOf(tasktoRemove));
		}
		if(e.getSource() == saveList) {
			try {
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tasks.txt")));
				pw.write(""+tasks);
				pw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
