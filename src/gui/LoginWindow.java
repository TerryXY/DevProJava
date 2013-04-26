package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import network.LoginRequest;
import network.ServerPackets;
import app.AppGlobals;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.UnsupportedEncodingException;

public class LoginWindow {

	public JFrame frmDevpro;
	private JTextField textField_userName;
	private JPasswordField textField_password;

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDevpro = new JFrame();
		frmDevpro.setTitle("DevPro");
		frmDevpro.setBounds(100, 100, 312, 223);
		frmDevpro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDevpro.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 28, 57, 14);
		frmDevpro.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 52, 57, 14);
		frmDevpro.getContentPane().add(lblPassword);
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setBounds(10, 77, 57, 14);
		frmDevpro.getContentPane().add(lblLanguage);
		
		JLabel lblServer = new JLabel("Server");
		lblServer.setBounds(10, 102, 57, 14);
		frmDevpro.getContentPane().add(lblServer);
		
		textField_userName = new JTextField();
		textField_userName.setBounds(77, 25, 207, 20);
		frmDevpro.getContentPane().add(textField_userName);
		textField_userName.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"English", "Deutsch"}));
		comboBox.setBounds(77, 74, 207, 20);
		frmDevpro.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Europe", "USA"}));
		comboBox_1.setBounds(77, 99, 207, 20);
		frmDevpro.getContentPane().add(comboBox_1);
		
		textField_password = new JPasswordField();
		textField_password.setBounds(77, 49, 207, 20);
		frmDevpro.getContentPane().add(textField_password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginRequest test = new LoginRequest();
				test.username = "Test";
				test.password = "Test";
				test.uid = "Test";
				try {
					AppGlobals.gameServer.sendPacket(ServerPackets.Login,AppGlobals.gson.toJson(test).getBytes("utf-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(10, 132, 82, 23);
		frmDevpro.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(97, 132, 82, 23);
		frmDevpro.getContentPane().add(btnRegister);
		
		JButton btnOfflineMode = new JButton("Offline Mode");
		btnOfflineMode.setBounds(185, 132, 99, 23);
		frmDevpro.getContentPane().add(btnOfflineMode);
		
		JCheckBox chckbxLogMeIn = new JCheckBox("Log me in automatically next time");
		chckbxLogMeIn.setBounds(10, 155, 196, 23);
		frmDevpro.getContentPane().add(chckbxLogMeIn);
	}
}
