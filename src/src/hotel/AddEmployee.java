package src.hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField fnamefield;
	private JTextField lnamefield;
	private JTextField idfield;
	private JTextField salaryfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
				main_Window.start();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 548, 392);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null,
				null, null, null));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					test.AddEmployee(new Employee(fnamefield.getText(),
							lnamefield.getText(), Long.parseLong(idfield
									.getText()), Float.parseFloat(salaryfield
									.getText())));
					fnamefield.setText("");
					lnamefield.setText("");
					idfield.setText("");
					salaryfield.setText("");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Wrong Input Format");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton btnCancel = new JButton("Back");
		btnCancel.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		panel_1.add(btnCancel);
		FlowLayout fl_contentPane = new FlowLayout(FlowLayout.CENTER, 1200, 5);
		contentPane.setLayout(fl_contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		contentPane.add(panel);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		fnamefield = new JTextField();
		fnamefield.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		lnamefield = new JTextField();
		lnamefield.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		salaryfield = new JTextField();
		salaryfield.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		idfield = new JTextField();
		idfield.setColumns(10);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		panel.setLayout(gl_panel);
		gl_panel.setAutoCreateGaps(true);
		gl_panel.setHorizontalGroup(gl_panel
				.createSequentialGroup()
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.LEADING)
								.addComponent(lblFirstName)
								.addComponent(lblLastName)
								.addComponent(lblSalary)
								.addComponent(lblId))
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.LEADING)
								.addComponent(fnamefield)
								.addComponent(lnamefield)
								.addComponent(salaryfield)
								.addComponent(idfield)));

		// Vertically, we want to align each label with his textfield
		// on the baseline of the components
		gl_panel.setVerticalGroup(gl_panel
				.createSequentialGroup()
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.BASELINE)
								.addComponent(fnamefield)
								.addComponent(lblFirstName))
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.BASELINE)
								.addComponent(lnamefield)
								.addComponent(lblLastName))
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.BASELINE)
								.addComponent(lblSalary)
								.addComponent(salaryfield))
				.addGroup(
						gl_panel.createParallelGroup(
								GroupLayout.Alignment.BASELINE)
								.addComponent(lblId)
								.addComponent(idfield)));
		
		contentPane.add(panel_1);

		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				main_Window.start();
			}
		});
	}
}
