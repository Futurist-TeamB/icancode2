package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class textcan {

	private JFrame frmPasswordEncoder;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					textcan window = new textcan();
					window.frmPasswordEncoder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public textcan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String fileID;
		
		frmPasswordEncoder = new JFrame();
		frmPasswordEncoder.setTitle("Password Encoder");
		frmPasswordEncoder.setBounds(100, 100, 952, 514);
		frmPasswordEncoder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordEncoder.getContentPane().setLayout(null);
		
		//Submit button
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(398, 278, 144, 45);
		frmPasswordEncoder.getContentPane().add(btnNewButton);
		
		
		//Text radio button
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Text");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(172, 78, 79, 39);
		frmPasswordEncoder.getContentPane().add(rdbtnNewRadioButton);
		textField = new JTextField();
		textField.setBounds(255, 86, 302, 26);
		frmPasswordEncoder.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		//File radio button
		JRadioButton rdbtnFile = new JRadioButton("File");
		rdbtnFile.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFile.setBounds(172, 168, 79, 39);
		frmPasswordEncoder.getContentPane().add(rdbtnFile);
		
		//Browser button
		JButton btnNewButton_1 = new JButton("Browser");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				
				//for directory
				//fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setAcceptAllFileFilterUsed(false);
				
				//for files
				fileChooser.setAcceptAllFileFilterUsed(false);

				int rVal = fileChooser.showOpenDialog(null);
				if (rVal == JFileChooser.APPROVE_OPTION) {
					textField.setText(fileChooser.getSelectedFile().toString());
				}
				
				
			}
			});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(257, 177, 119, 21);
		frmPasswordEncoder.getContentPane().add(btnNewButton_1);
		
		
		//Status Label
		JLabel lblStatusLabel = new JLabel();
		lblStatusLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatusLabel.setBounds(383, 365, 246, 45);
		frmPasswordEncoder.getContentPane().add(lblStatusLabel);
		
		JLabel lblNewLabel = new JLabel("Password Encoder");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(322, 10, 221, 48);
		frmPasswordEncoder.getContentPane().add(lblNewLabel);
	

	btnNewButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			String texttoencrypt = textField.getText();
			
			testcest fuctioncall = new testcest();
			
			 String value = fuctioncall.encryption(texttoencrypt);
			
			
			lblStatusLabel.setText(value);
			
			
		}
	});
	}
}