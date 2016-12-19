package src.hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JTable;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow();
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
	public LoginWindow() {
		setTitle("Login Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton button = new JButton("Clear");
		panel.add(button);
		
		JButton button_1 = new JButton("Confirm");
		sl_panel.putConstraint(SpringLayout.WEST, button_1, 201, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, button, -6, SpringLayout.WEST, button_1);
		sl_panel.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button);
		panel.add(button_1);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panel);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label = new JLabel("Password");
		sl_panel.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, label);
		sl_panel.putConstraint(SpringLayout.NORTH, button, 18, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.NORTH, label, 3, SpringLayout.NORTH, textField);
		sl_panel.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, button);
		panel.add(label);
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
	}
}
