import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DoublyLinkedList.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField frontelement;
	private JTextField rearelement;
	private JTextField result;
	class Node
	 {
		 int data;
		 Node prelink;
		 Node nextlink;
	 }
	 private Node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY  LINKED  LIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(168, 11, 153, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER  AN  ELEMENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 81, 135, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER  AN  ELEMENT ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 127, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		frontelement = new JTextField();
		frontelement.setFont(new Font("Tahoma", Font.BOLD, 11));
		frontelement.setBounds(168, 78, 165, 20);
		contentPane.add(frontelement);
		frontelement.setColumns(10);
		
		rearelement = new JTextField();
		rearelement.setFont(new Font("Tahoma", Font.BOLD, 11));
		rearelement.setBounds(168, 124, 165, 20);
		contentPane.add(rearelement);
		rearelement.setColumns(10);
		
		JButton insertfront = new JButton("INSERT  FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insert front
				Node temp;
				 int elem=Integer.valueOf(frontelement.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.prelink=null;
				 newnode.nextlink=null;

				if(first==null) 
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				String message="Element "+ elem +" inserted at front position";
				JOptionPane.showMessageDialog(contentPane,message);
				frontelement.setText("");

			}
		});
		insertfront.setFont(new Font("Tahoma", Font.BOLD, 11));
		insertfront.setBounds(356, 77, 122, 23);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("INSERT  REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				Node temp;
				 int elem=Integer.valueOf(rearelement.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.prelink=null;
				 newnode.nextlink=null;

				if(first==null) 
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				String message="Element "+ elem +" inserted at rear position";

				JOptionPane.showMessageDialog(contentPane, message);
				rearelement.setText("");

			}
		});
		insertrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		insertrear.setBounds(356, 123, 122, 23);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("DELETE  FRONT ");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if(first==null)
				 {
					JOptionPane.showMessageDialog(contentPane, "Deletion at front not possible");

				 }
				 else if(first.nextlink==null)
				 {
				   JOptionPane.showMessageDialog(contentPane, "Deleted node is "+first.data);
				   first=null;
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(contentPane, "Deleted node is "+first.data);

					 first=first.nextlink;
					 first.prelink=null;
					 
				 }


			}
		});
		deletefront.setFont(new Font("Tahoma", Font.BOLD, 11));
		deletefront.setBounds(193, 182, 128, 23);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE  REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for delete rear
				Node temp;
				 if(first==null)
				 {
					JOptionPane.showMessageDialog(contentPane, "Deletion at rear not possible");

				 }
				 else if(first.nextlink==null)
				 {
					JOptionPane.showMessageDialog(contentPane, "Deleted node is "+first.data);

					first=null;
				 }
				 else
				 {
					 temp=first;
					 while(temp.nextlink.nextlink!=null)
					 {
						 temp=temp.nextlink;
					 }
					JOptionPane.showMessageDialog(contentPane, "Deleted node is "+temp.nextlink.data);

					 temp.nextlink=null;
				 }

			}
		});
		deleterear.setFont(new Font("Tahoma", Font.BOLD, 11));
		deleterear.setBounds(193, 238, 128, 23);
		contentPane.add(deleterear);
		
		JButton displayrear = new JButton("DISPLAY  REVERSE");
		displayrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display reverse
				Node temp;
				String msg="";
				 if(first==null)
				 {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");

				 }
				 
				 else if(first.nextlink==null)
				 {
					 msg=msg+first.data+"--->";

				 }
				 else
				 {
					temp= first;
					while(temp.nextlink!=null)
					 {
						 temp=temp.nextlink;
					 }
					while(temp!=null)
					{
						msg=msg+temp.data+"--->";

						temp=temp.prelink;


					}
					 result.setText(msg);

				 }
			}
			
		});
		displayrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		displayrear.setBounds(290, 285, 153, 23);
		contentPane.add(displayrear);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setBounds(79, 337, 376, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton displayreverse = new JButton("DISPLAY  FORWARD");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				Node temp;
				String msg="";
				 if(first==null)
				 {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");

				 }
				 else if(first.nextlink==null)
				 {
					 msg=msg+first.data+"--->";
				 }
				 else
				 {
					temp= first;
					while(temp!=null)
					 {
						msg=msg+temp.data+"--->";
						 temp=temp.nextlink;
					 }
				 }
				 result.setText(msg);


			}
		});
		displayreverse.setFont(new Font("Tahoma", Font.BOLD, 11));
		displayreverse.setBounds(79, 285, 153, 23);
		contentPane.add(displayreverse);
	}
}
