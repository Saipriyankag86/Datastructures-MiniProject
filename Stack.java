import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaystack;
	private int s[];
	private int top=-1;
	private int size;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK  DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(179, 32, 195, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(41, 105, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 11));
		sizefield.setBounds(234, 102, 106, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton create = new JButton("CREATE  STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for stack creation
				 size=Integer.valueOf(sizefield.getText());
				 s=new int[size];
				 String message="Stack of size "+size+" created";
				 JOptionPane.showMessageDialog(contentPane, message);
				 
				 
				
				
				
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 11));
		create.setBounds(179, 165, 133, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(41, 238, 112, 14);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.BOLD, 11));
		element.setBounds(221, 235, 119, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successfull");
					element.setText("");

				}
				
				
			}
		});
		push.setFont(new Font("Tahoma", Font.BOLD, 11));
		push.setBounds(383, 234, 83, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"pop not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "The popped element is "+ s[top]);
					--top;
				}

				
			}
		});
		pop.setFont(new Font("Tahoma", Font.BOLD, 11));
		pop.setBounds(209, 285, 97, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String message="";

				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");

				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						message=message+" "+s[i];
					}
					displaystack.setText(message);

				}

				
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 11));
		display.setBounds(209, 340, 97, 23);
		contentPane.add(display);
		
		displaystack = new JTextField();
		displaystack.setBounds(138, 375, 236, 20);
		contentPane.add(displaystack);
		displaystack.setColumns(10);
	}
}
