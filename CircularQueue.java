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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
	private int len;
	private int front=0;
	private int rear=-1;
	private int count=0;
	private int cq[];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR  QUEUE  DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(118, 11, 251, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER  QUEUE  SIZE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(38, 64, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		size = new JTextField();
		size.setFont(new Font("Tahoma", Font.BOLD, 11));
		size.setBounds(201, 61, 226, 20);
		contentPane.add(size);
		size.setColumns(10);
		
		JButton createqueue = new JButton("CREATE  QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create circular queue
				len=Integer.valueOf(size.getText());
				cq=new int[len];
				String message="circular queue created of length "+len;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setFont(new Font("Tahoma", Font.BOLD, 11));
		createqueue.setBounds(162, 109, 138, 23);
		contentPane.add(createqueue);
		
		JLabel jlabel = new JLabel("ENTER  AN  ELEMENT");
		jlabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlabel.setBounds(16, 170, 138, 14);
		contentPane.add(jlabel);
		
		element = new JTextField();
		element.setBounds(143, 167, 185, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert
				if(count==len)
				  {
					  JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
				  }
				  else
				  {
					  
					  int elem=Integer.valueOf(element.getText());
					  rear=(rear+1)%len;
					  cq[rear]=elem;
					  count++;
					  JOptionPane.showMessageDialog(contentPane, "Insertion successfull");
					  element.setText("");

				  }

			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 11));
		insert.setBounds(370, 166, 99, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				if(count==0)
				  {
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				  }
				  else
				  {
					  
					  String message="The deleted element is" + cq[front];
					  JOptionPane.showMessageDialog(contentPane, message);
					  front=(front+1)%len;

					  count--;
				  }

			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 11));
		delete.setBounds(211, 231, 89, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				String message="";
				int front1=front;
				  if(count==0)
				  {
					  JOptionPane.showMessageDialog(contentPane, "Display not possible");
				  }
				  else
				  {
					  for(int i=1;i<=count;i++)
					  {
						  message=message+cq[front1]+" ";
						  front1=(front1+1)%len;

					  }
					  result.setText(message);
				  }

			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 11));
		display.setBounds(211, 276, 89, 23);
		contentPane.add(display);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setBounds(143, 329, 261, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}
