package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MainWindow {

	private JFrame frame;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1012, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 976, 471);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("DevPro", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Unranked", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 11, 352, 421);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 332, 346);
		panel_7.add(scrollPane);
		
		JList listboxUnraked = new JList();
		scrollPane.setViewportView(listboxUnraked);
		
		JButton btnNewButton = new JButton("Quick");
		btnNewButton.setBounds(196, 387, 73, 23);
		panel_7.add(btnNewButton);
		
		JButton button = new JButton("Host");
		button.setBounds(269, 387, 73, 23);
		panel_7.add(button);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Ranked", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(377, 11, 352, 421);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 332, 346);
		panel_8.add(scrollPane_1);
		
		JList listboxRanked = new JList();
		scrollPane_1.setViewportView(listboxRanked);
		
		JButton button_1 = new JButton("Host");
		button_1.setBounds(269, 387, 73, 23);
		panel_8.add(button_1);
		
		JButton button_2 = new JButton("Quick");
		button_2.setBounds(196, 387, 73, 23);
		panel_8.add(button_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(739, 11, 222, 421);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(10, 0, 202, 20);
		txtSearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch.setText("Search");
		panel_9.add(txtSearch);
		txtSearch.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "Server Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(10, 31, 202, 156);
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblOfRooms = new JLabel("# of Rooms");
		lblOfRooms.setBounds(10, 22, 86, 14);
		panel_10.add(lblOfRooms);
		
		JLabel lblOfUnranked = new JLabel("# of Unranked");
		lblOfUnranked.setBounds(10, 44, 86, 14);
		panel_10.add(lblOfUnranked);
		
		JLabel lblOfRanked = new JLabel("# of Ranked");
		lblOfRanked.setBounds(10, 69, 86, 14);
		panel_10.add(lblOfRanked);
		
		JLabel lblOfOpen = new JLabel("# of Open Rooms");
		lblOfOpen.setBounds(10, 94, 86, 14);
		panel_10.add(lblOfOpen);
		
		JLabel lblOfPlayers = new JLabel("# of Players");
		lblOfPlayers.setBounds(10, 119, 86, 14);
		panel_10.add(lblOfPlayers);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(106, 22, 86, 14);
		panel_10.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(106, 44, 86, 14);
		panel_10.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(106, 69, 86, 14);
		panel_10.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(106, 94, 86, 14);
		panel_10.add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(106, 119, 86, 14);
		panel_10.add(label_4);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(10, 237, 202, 173);
		panel_9.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(10, 139, 88, 23);
		panel_11.add(btnProfile);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(104, 139, 88, 23);
		panel_11.add(btnLogout);
		
		JButton btnReplays = new JButton("Replays");
		btnReplays.setBounds(10, 105, 88, 23);
		panel_11.add(btnReplays);
		
		JButton btnOffline = new JButton("Offline");
		btnOffline.setBounds(104, 105, 88, 23);
		panel_11.add(btnOffline);
		
		JButton btnDeckEdit = new JButton("Deck Edit");
		btnDeckEdit.setBounds(10, 71, 88, 23);
		panel_11.add(btnDeckEdit);
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setBounds(104, 71, 88, 23);
		panel_11.add(btnOptions);
		
		JCheckBox chckbxFilterActiveGames = new JCheckBox("Filter Active Games");
		chckbxFilterActiveGames.setBounds(10, 7, 186, 23);
		panel_11.add(chckbxFilterActiveGames);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 40, 182, 20);
		panel_11.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Patch Notes", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Chat", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("File Manager", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Customize", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Donation", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("About", null, panel_6, null);
	}
}
