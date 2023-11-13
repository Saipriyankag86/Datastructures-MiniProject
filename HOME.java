import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HOME extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOME frame = new HOME();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HOME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton heading = new JButton("CHOOSE A DATASTRUCTURE");
		heading.setFont(new Font("Tahoma", Font.BOLD, 15));
		heading.setBounds(110, 27, 270, 27);
		contentPane.add(heading);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place array window opening code here
//				Array a=new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Tahoma", Font.BOLD, 13));
		array.setBounds(194, 98, 94, 25);
		contentPane.add(array);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place queue window opening code here
				new Queue().setVisible(true);


			}
		});
		queue.setFont(new Font("Tahoma", Font.BOLD, 13));
		queue.setBounds(323, 126, 100, 25);
		contentPane.add(queue);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place stack window opening code here
				new Stack().setVisible(true);

				

			}
		});
		stack.setFont(new Font("Tahoma", Font.BOLD, 13));
		stack.setBounds(54, 126, 94, 25);
		contentPane.add(stack);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.setFont(new Font("Tahoma", Font.BOLD, 13));
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place singly linked list window opening code here
				new SinglyLinkedList().setVisible(true);

			}
		});
		sll.setBounds(280, 202, 201, 25);
		contentPane.add(sll);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place circular queue window opening code here
				new CircularQueue().setVisible(true);


			}
		});
		cqueue.setFont(new Font("Tahoma", Font.BOLD, 13));
		cqueue.setBounds(26, 202, 173, 25);
		contentPane.add(cqueue);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Place Doubly linked list window opening code here
				new DoublyLinkedList().setVisible(true);

			}
		});
		dll.setFont(new Font("Tahoma", Font.BOLD, 13));
		dll.setBounds(139, 260, 194, 25);
		contentPane.add(dll);
	}
}
