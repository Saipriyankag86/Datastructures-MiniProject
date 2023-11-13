import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(191, 11, 169, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 57, 137, 15);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Tahoma", Font.BOLD, 11));
		length.setBounds(269, 55, 179, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//code for creating an array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length " +len+  " created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 11));
		create.setBounds(165, 97, 119, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 145, 172, 14);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.BOLD, 11));
		element.setBounds(184, 142, 100, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element "+elem+" inserted at position "+pos; 
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
				
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 11));
		insert.setBounds(464, 141, 75, 23);
		contentPane.add(insert);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(20, 212, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(191, 209, 96, 20);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(302, 145, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		insertposition = new JTextField();
		insertposition.setFont(new Font("Tahoma", Font.BOLD, 11));
		insertposition.setBounds(370, 142, 75, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 11));
		delete.setBounds(334, 208, 89, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<arr.length;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 11));
		display.setBounds(221, 280, 89, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 11));
		displaybox.setBounds(141, 345, 282, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
