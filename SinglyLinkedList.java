import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SinglyLinkedList.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField frontelement;
	private JTextField rearelement;
	private JTextField result;
	class Node
	 {
		 int data;
		 Node link;
	 }
	 private Node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY  LINKED  LIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(173, 11, 149, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("ENTER  AN  ELEMENT");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(25, 73, 119, 14);
		contentPane.add(label);
		
		frontelement = new JTextField();
		frontelement.setFont(new Font("Tahoma", Font.BOLD, 11));
		frontelement.setBounds(187, 70, 119, 20);
		contentPane.add(frontelement);
		frontelement.setColumns(10);
		
		JButton insertfront = new JButton("INSERT  FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for insert front
				
				 int elem=Integer.valueOf(frontelement.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.link=null;
				if(first==null) 
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				String msg="Element "+ elem+" inserted at front position";
				JOptionPane.showMessageDialog(contentPane, msg);
				frontelement.setText("");

				
			}
		});
		insertfront.setFont(new Font("Tahoma", Font.BOLD, 11));
		insertfront.setBounds(350, 69, 138, 23);
		contentPane.add(insertfront);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER  AN  ELEMENT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(25, 130, 119, 14);
		contentPane.add(lblNewLabel_1);
		
		rearelement = new JTextField();
		rearelement.setFont(new Font("Tahoma", Font.BOLD, 11));
		rearelement.setBounds(187, 127, 119, 20);
		contentPane.add(rearelement);
		rearelement.setColumns(10);
		
		JButton insertrear = new JButton("INSERT  REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert rear
				
				 Node temp;
				 int elem=Integer.valueOf(rearelement.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.link=null;

				if(first==null) 
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element "+elem+" inserted at rear position");
				}
				rearelement.setText("");



				

			}
		});
		insertrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		insertrear.setBounds(350, 126, 138, 23);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("DELETE  FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				 if(first==null)
				 {
					 JOptionPane.showMessageDialog(contentPane,"Deletion at front not possible");
					 				 }
				 else if(first.link==null)
				 {
					 String msg="Deleted node is" + first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=null;
				 }
				 else
				 {
					 String msg="Deleted node is" + first.data;
					 JOptionPane.showMessageDialog(contentPane, msg);

					 first=first.link;
					 
				 }

			}
		});
		deletefront.setFont(new Font("Tahoma", Font.BOLD, 11));
		deletefront.setBounds(173, 185, 133, 23);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE  REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp;
				 if(first==null)
				 {
					 JOptionPane.showMessageDialog(contentPane,"Deletion at rear not possible");

				 }
				 else if(first.link==null)
				 {
					 String msg="Deleted node is "+first.data;
					first=null;
				 }
				 else
				 {
					 temp=first;
					 while(temp.link.link!=null)
					 {
						 temp=temp.link;
					 }
					 JOptionPane.showMessageDialog(contentPane, "Deleted node value is"+temp.link.data);
					 temp.link=null;
				 }

				
			}
		});
		deleterear.setFont(new Font("Tahoma", Font.BOLD, 11));
		deleterear.setBounds(173, 236, 133, 23);
		contentPane.add(deleterear);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				 String msg="";


				 Node temp;
				 if(first==null)
				 {
					 JOptionPane.showMessageDialog(contentPane, "Dispaly not possible");

				 }
				 else if(first.link==null)
				 {
					 msg=msg+first.data+"--->";
				 }
				 else
				 {
					temp= first;
					while(temp!=null)
					 {
						msg=msg+temp.data+"-->";
						 temp=temp.link;
					 }
				 }
				result.setText(msg);


			 
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 11));
		display.setBounds(173, 289, 133, 23);
		contentPane.add(display);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setBounds(103, 349, 287, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}
