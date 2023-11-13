import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField element;
	private JTextField result;
	private int size;
	private int front=0;
	private int rear=-1;
	private int q[];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(171, 11, 168, 16);
		contentPane.add(lblNewLabel);
		
		JLabel jlabel = new JLabel("ENTER QUEUE SIZE");
		jlabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlabel.setBounds(38, 78, 109, 14);
		contentPane.add(jlabel);
		
		queuesize = new JTextField();
		queuesize.setBounds(209, 75, 232, 20);
		contentPane.add(queuesize);
		queuesize.setColumns(10);
		
		JButton create = new JButton("CREATE  QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for queue creation
				size=Integer.valueOf(queuesize.getText());
				q=new int[size];
				String message="queue of length " +size+  " created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 11));
		create.setBounds(181, 130, 137, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(38, 204, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(191, 201, 178, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for insert 
				 if(rear==size-1)
				  {
					 JOptionPane.showMessageDialog(contentPane, "insertion not possible");
				  }
				  else
				  {
					  ++rear;
					  int elem=Integer.valueOf(element.getText());
					  q[rear]=elem;
					  JOptionPane.showMessageDialog(contentPane, "insertion successfull");
					element.setText("");

		
						

				  
				  }
				  }

			}
		);
		insert.setFont(new Font("Tahoma", Font.BOLD, 11));
		insert.setBounds(401, 200, 93, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for delete operation
				if(rear==-1 || front>rear)
				  {
					 JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				  }
					  				  
				  else
				  {
					  String message="The deleted element is" + q[front];
					  JOptionPane.showMessageDialog(contentPane, message);
					  ++front;
				  }

			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 11));
		delete.setBounds(219, 262, 99, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for display 
				String message="";
				if(rear==-1 || front>rear)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Display not possible");
				  }
				  else
				  {
					  for(int i=front;i<=rear;i++)
					  {
						  
						 message = message+ " " + q[i]; 
					  }
					  result.setText(message);
					  
				  }

			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 11));
		display.setBounds(219, 305, 99, 23);
		contentPane.add(display);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setBounds(141, 353, 282, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}
