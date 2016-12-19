package src.hotel;

import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main_Window {

	private static JFrame frmOopHotel;

	/**
	 * Launch the application.
	 * 
	 * @throws Exception
	 */
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new main_Window().frmOopHotel.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOopHotel = new JFrame("OOP Hotel");
		frmOopHotel.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				String pass = JOptionPane.showInputDialog(null,
						"Please enter the password to close the program");
				if (pass.equals("1")) {
					frmOopHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					test.onExit();
					System.exit(0);
				} else
					JOptionPane
							.showMessageDialog(null,
									"The password you entered is incorrect you cannot exit the program");
			}
		});
		frmOopHotel.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammed\\Desktop\\hotel-icon-png.png"));
		frmOopHotel.setFont(new Font("Calibri", Font.PLAIN, 12));
		frmOopHotel.setVisible(true);
		frmOopHotel.setResizable(false);
		frmOopHotel.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmOopHotel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmOopHotel.getContentPane().setLayout(new GridLayout(1, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		frmOopHotel.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JButton reserv_btn = new JButton("Reserve a room");
		reserv_btn.setFont(new Font("Calibri", Font.BOLD, 30));
		reserv_btn.setForeground(Color.RED);
		reserv_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				reserveRooms f1 = new reserveRooms();
				f1.setVisible(true);
				frmOopHotel.dispose();
			}
		});
		reserv_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(reserv_btn);

		JButton add_emp_btn = new JButton("Add Employee");
		add_emp_btn.setFont(new Font("Calibri", Font.BOLD, 30));
		add_emp_btn.setForeground(Color.RED);
		add_emp_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/*
				 * Reservation_Window f1 = new Reservation_Window();
				 * f1.setVisible(true); frmOopHotel.dispose();
				 */
				AddEmployee f1 = new AddEmployee();
				f1.setVisible(true);
				frmOopHotel.dispose();
			}
		});
		panel.add(add_emp_btn);

		JButton addroom_btn = new JButton("Add Room");
		addroom_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Addrooms f1 = new Addrooms();
				f1.setVisible(true);
				frmOopHotel.dispose();
			}
		});
		addroom_btn.setFont(new Font("Calibri", Font.BOLD, 30));
		addroom_btn.setForeground(Color.RED);
		panel.add(addroom_btn);

		JButton getsalary_btn = new JButton("Get Total Employee salary");
		getsalary_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null,
						Employee.CalcSalary(test.getEmployeelist()));
			}
		});
		getsalary_btn.setFont(new Font("Calibri", Font.BOLD, 30));
		getsalary_btn.setForeground(Color.RED);
		panel.add(getsalary_btn);
	}

	public static JFrame getFrmOopHotel() {
		return frmOopHotel;
	}

	public static void setFrmOopHotel(JFrame frmOopHotel) {
		main_Window.frmOopHotel = frmOopHotel;
	}
}
