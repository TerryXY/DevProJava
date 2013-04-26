package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

import room.Room;
import tournament.Tournament;
import tournament.TournamentSystem;

import javax.swing.UIManager;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JSeparator;

import app.AppGlobals;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class MainWindow {

	JFrame frame;
	private JTextField txtSearch;

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1012, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setUndecorated(true);
		
		MoveMouseListener mml = new MoveMouseListener(frame);
		frame.addMouseListener(mml);
		frame.addMouseMotionListener(mml);
		
		
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
		
		JList<Room> listboxUnraked = new JList<Room>();
		listboxUnraked.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
		listboxRanked.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tournaments", null, tabbedPane_4, null);
		
		JPanel panel_23 = new JPanel();
		tabbedPane_4.addTab("Open Tournaments", null, panel_23, null);
		panel_23.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new TitledBorder(null, "Open Tournaments", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_24.setBounds(10, 11, 426, 362);
		panel_23.add(panel_24);
		panel_24.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 21, 406, 330);
		panel_24.add(scrollPane_5);
		
		
		DefaultListModel<Tournament> tournListModel = new DefaultListModel<Tournament>();
		Tournament test = new Tournament();
		test.id = 1;
		test.name = "abc";
		test.currentBracket = 1;
		AppGlobals.tournamentList.add(test);
		tournListModel.copyInto(AppGlobals.tournamentList.toArray());
		JList<Tournament> listboxOpenTournaments = new JList<Tournament>(tournListModel);
	

		//listboxOpenTournaments.setListData(AppGlobals.tournamentList.toArray());
		
		
		listboxOpenTournaments.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_5.setViewportView(listboxOpenTournaments);
		GUIManager.listboxOpenTournament = listboxOpenTournaments;
			JButton btnNewButton_1 = new JButton("Join");
		btnNewButton_1.setBounds(347, 381, 89, 23);
		panel_23.add(btnNewButton_1);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_25.setBounds(451, 11, 223, 362);
		panel_23.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		tabbedPane_4.addTab("Current Tournament", null, panel_26, null);
		panel_26.setLayout(null);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Current Matches", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_27.setBounds(686, 11, 270, 183);
		panel_26.add(panel_27);
		panel_27.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 24, 250, 148);
		panel_27.add(scrollPane_6);
		
		JList listboxTournCompetitors = new JList();
		scrollPane_6.setViewportView(listboxTournCompetitors);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_28.setBounds(686, 203, 270, 167);
		panel_26.add(panel_28);
		panel_28.setLayout(null);
		
		JLabel lblNextDuelIn = new JLabel("Next Duels In:");
		lblNextDuelIn.setBounds(10, 25, 86, 14);
		panel_28.add(lblNextDuelIn);
		
		JLabel lblNextDuelTimer = new JLabel("0 sec");
		lblNextDuelTimer.setBounds(130, 25, 33, 14);
		panel_28.add(lblNextDuelTimer);
		
		JLabel lblNewLabel = new JLabel("Current Opponent:");
		lblNewLabel.setBounds(10, 50, 110, 14);
		panel_28.add(lblNewLabel);
		
		JLabel lblCurOpponent = new JLabel("Opponent");
		lblCurOpponent.setBounds(130, 50, 86, 14);
		panel_28.add(lblCurOpponent);
		
		JLabel lblOppentStatus = new JLabel("Opponent Status:");
		lblOppentStatus.setBounds(10, 75, 110, 14);
		panel_28.add(lblOppentStatus);
		
		JLabel lblNotReady = new JLabel("Not Ready");
		lblNotReady.setBounds(130, 75, 110, 14);
		panel_28.add(lblNotReady);
		
		JCheckBox chckbxAreYouReady = new JCheckBox("Are you Ready?");
		chckbxAreYouReady.setBounds(10, 96, 122, 23);
		panel_28.add(chckbxAreYouReady);
		
		JButton btnJoinMatch = new JButton("Join Match");
		btnJoinMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tournament tourn = new Tournament();
				tourn.initCompetitorBoard();
				tourn.setPositionLabel(1, 2, "Terry");
				TournamentSystem.updateTournamentListbox();
				
			}
		});
		btnJoinMatch.setBounds(171, 122, 89, 23);
		panel_28.add(btnJoinMatch);
		
		JLabel lblTimeLeft = new JLabel("Time left to join match:  ");
		lblTimeLeft.setBounds(10, 126, 122, 14);
		panel_28.add(lblTimeLeft);
		
		JLabel lblSec = new JLabel("0 sec");
		lblSec.setBounds(130, 126, 68, 14);
		panel_28.add(lblSec);
		
		JButton btnLeaveTournament = new JButton("Leave Tournament");
		btnLeaveTournament.setBounds(813, 381, 143, 23);
		panel_26.add(btnLeaveTournament);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.WHITE);
		panel_29.setBorder(new BevelBorder(BevelBorder.RAISED, null, Color.LIGHT_GRAY, null, null));
		panel_29.setBounds(10, 11, 663, 318);
		panel_26.add(panel_29);
		panel_29.setLayout(null);
		
		JLabel lblTournFirstCompetitor1 = new JLabel("Competitor1");
		lblTournFirstCompetitor1.setBounds(10, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor1);
		GUIManager.lblTournFirstCompetitor1 = lblTournFirstCompetitor1;
		
		JLabel lblTournFirstCompetitor2 = new JLabel("Competitor2");
		lblTournFirstCompetitor2.setBounds(90, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor2);
		GUIManager.lblTournFirstCompetitor2 = lblTournFirstCompetitor2;
		
		JLabel lblTournFirstCompetitor3 = new JLabel("Competitor3");
		lblTournFirstCompetitor3.setBounds(170, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor3);
		GUIManager.lblTournFirstCompetitor3 = lblTournFirstCompetitor3;
		
		JLabel lblTournFirstCompetitor4 = new JLabel("Competitor4");
		lblTournFirstCompetitor4.setBounds(250, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor4);
		GUIManager.lblTournFirstCompetitor4 = lblTournFirstCompetitor4;
		
		JLabel lblTournFirstCompetitor5 = new JLabel("Competitor5");
		lblTournFirstCompetitor5.setBounds(330, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor5);
		GUIManager.lblTournFirstCompetitor5 = lblTournFirstCompetitor5;
		
		JLabel lblTournFirstCompetitor6 = new JLabel("Competitor6");
		lblTournFirstCompetitor6.setBounds(410, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor6);
		GUIManager.lblTournFirstCompetitor6 = lblTournFirstCompetitor6;
		
		JLabel lblTournFirstCompetitor7 = new JLabel("Competitor7");
		lblTournFirstCompetitor7.setBounds(490, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor7);
		GUIManager.lblTournFirstCompetitor7 = lblTournFirstCompetitor7;
		
		JLabel lblTournFirstCompetitor8 = new JLabel("Competitor8");
		lblTournFirstCompetitor8.setBounds(570, 293, 70, 14);
		panel_29.add(lblTournFirstCompetitor8);
		GUIManager.lblTournFirstCompetitor8 = lblTournFirstCompetitor8;
		
		JLabel lblTournSecondCompetitor1 = new JLabel("Competitor1");
		lblTournSecondCompetitor1.setBounds(51, 200, 70, 14);
		panel_29.add(lblTournSecondCompetitor1);
		GUIManager.lblTournSecondCompetitor1 = lblTournSecondCompetitor1;
		
		JLabel lblTournSecondCompetitor2 = new JLabel("Competitor2");
		lblTournSecondCompetitor2.setBounds(206, 200, 70, 14);
		panel_29.add(lblTournSecondCompetitor2);
		GUIManager.lblTournSecondCompetitor2 = lblTournSecondCompetitor2;
		
		JLabel lblTournSecondCompetitor3 = new JLabel("Competitor3");
		lblTournSecondCompetitor3.setBounds(364, 200, 70, 14);
		panel_29.add(lblTournSecondCompetitor3);
		GUIManager.lblTournSecondCompetitor3 = lblTournSecondCompetitor3;
		
		JLabel lblTournSecondCompetitor4 = new JLabel("Competitor4");
		lblTournSecondCompetitor4.setBounds(525, 200, 70, 14);
		panel_29.add(lblTournSecondCompetitor4);
		GUIManager.lblTournSecondCompetitor4 = lblTournSecondCompetitor4;
		
		JLabel lblTournThirdCompetitor1 = new JLabel("Competitor1");
		lblTournThirdCompetitor1.setBounds(125, 115, 70, 14);
		panel_29.add(lblTournThirdCompetitor1);
		GUIManager.lblTournThirdCompetitor1 = lblTournThirdCompetitor1;
		
		JLabel lblTournThirdCompetitor2 = new JLabel("Competitor2");
		lblTournThirdCompetitor2.setBounds(444, 115, 70, 14);
		panel_29.add(lblTournThirdCompetitor2);
		GUIManager.lblTournThirdCompetitor2 = lblTournThirdCompetitor2;
		
		JLabel lblTournFinalCompetitor1 = new JLabel("Competitor1");
		lblTournFinalCompetitor1.setBounds(291, 24, 70, 14);
		panel_29.add(lblTournFinalCompetitor1);
		GUIManager.lblTournFinalCompetitor1 = lblTournFinalCompetitor1;
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(38, 250, 2, 32);
		panel_29.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(119, 250, 2, 32);
		panel_29.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(78, 214, 2, 38);
		panel_29.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(38, 250, 83, 32);
		panel_29.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(193, 250, 2, 32);
		panel_29.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(274, 250, 2, 32);
		panel_29.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.BLACK);
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(233, 214, 2, 38);
		panel_29.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(193, 250, 83, 32);
		panel_29.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(Color.BLACK);
		separator_8.setBackground(Color.BLACK);
		separator_8.setBounds(351, 250, 2, 32);
		panel_29.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(Color.BLACK);
		separator_9.setBackground(Color.BLACK);
		separator_9.setBounds(432, 250, 2, 32);
		panel_29.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setForeground(Color.BLACK);
		separator_10.setBackground(Color.BLACK);
		separator_10.setBounds(391, 214, 2, 38);
		panel_29.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBackground(Color.BLACK);
		separator_11.setBounds(351, 250, 83, 32);
		panel_29.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.BLACK);
		separator_12.setBackground(Color.BLACK);
		separator_12.setBounds(512, 250, 2, 32);
		panel_29.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setForeground(Color.BLACK);
		separator_13.setBackground(Color.BLACK);
		separator_13.setBounds(593, 250, 2, 32);
		panel_29.add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setOrientation(SwingConstants.VERTICAL);
		separator_14.setForeground(Color.BLACK);
		separator_14.setBackground(Color.BLACK);
		separator_14.setBounds(552, 214, 2, 38);
		panel_29.add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setForeground(Color.BLACK);
		separator_15.setBackground(Color.BLACK);
		separator_15.setBounds(512, 250, 83, 32);
		panel_29.add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setOrientation(SwingConstants.VERTICAL);
		separator_16.setForeground(Color.BLACK);
		separator_16.setBackground(Color.BLACK);
		separator_16.setBounds(78, 167, 2, 36);
		panel_29.add(separator_16);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setOrientation(SwingConstants.VERTICAL);
		separator_17.setForeground(Color.BLACK);
		separator_17.setBackground(Color.BLACK);
		separator_17.setBounds(233, 167, 7, 36);
		panel_29.add(separator_17);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setOrientation(SwingConstants.VERTICAL);
		separator_18.setForeground(Color.BLACK);
		separator_18.setBackground(Color.BLACK);
		separator_18.setBounds(152, 131, 2, 38);
		panel_29.add(separator_18);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setForeground(Color.BLACK);
		separator_19.setBackground(Color.BLACK);
		separator_19.setBounds(78, 167, 156, 32);
		panel_29.add(separator_19);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setOrientation(SwingConstants.VERTICAL);
		separator_20.setForeground(Color.BLACK);
		separator_20.setBackground(Color.BLACK);
		separator_20.setBounds(391, 167, 2, 36);
		panel_29.add(separator_20);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setOrientation(SwingConstants.VERTICAL);
		separator_21.setForeground(Color.BLACK);
		separator_21.setBackground(Color.BLACK);
		separator_21.setBounds(546, 167, 7, 36);
		panel_29.add(separator_21);
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setOrientation(SwingConstants.VERTICAL);
		separator_22.setForeground(Color.BLACK);
		separator_22.setBackground(Color.BLACK);
		separator_22.setBounds(465, 131, 2, 38);
		panel_29.add(separator_22);
		
		JSeparator separator_23 = new JSeparator();
		separator_23.setForeground(Color.BLACK);
		separator_23.setBackground(Color.BLACK);
		separator_23.setBounds(391, 167, 156, 32);
		panel_29.add(separator_23);
		
		JSeparator separator_24 = new JSeparator();
		separator_24.setOrientation(SwingConstants.VERTICAL);
		separator_24.setForeground(Color.BLACK);
		separator_24.setBackground(Color.BLACK);
		separator_24.setBounds(318, 39, 2, 38);
		panel_29.add(separator_24);
		
		JSeparator separator_25 = new JSeparator();
		separator_25.setForeground(Color.BLACK);
		separator_25.setBackground(Color.BLACK);
		separator_25.setBounds(152, 75, 315, 32);
		panel_29.add(separator_25);
		
		JSeparator separator_26 = new JSeparator();
		separator_26.setOrientation(SwingConstants.VERTICAL);
		separator_26.setForeground(Color.BLACK);
		separator_26.setBackground(Color.BLACK);
		separator_26.setBounds(465, 75, 2, 38);
		panel_29.add(separator_26);
		
		JSeparator separator_27 = new JSeparator();
		separator_27.setOrientation(SwingConstants.VERTICAL);
		separator_27.setForeground(Color.BLACK);
		separator_27.setBackground(Color.BLACK);
		separator_27.setBounds(152, 75, 2, 38);
		panel_29.add(separator_27);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Patch Notes", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextArea textAreaPatchNotes = new JTextArea();
		textAreaPatchNotes.setEditable(false);
		textAreaPatchNotes.setBounds(10, 0, 951, 432);
		panel_1.add(textAreaPatchNotes);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Chat", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_16.setBounds(10, 11, 748, 421);
		panel_3.add(panel_16);
		panel_16.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 748, 421);
		panel_16.add(scrollPane_4);
		
		JList chatListbox = new JList();
		scrollPane_4.setViewportView(chatListbox);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane_2.setBorder(null);
		tabbedPane_2.setBounds(768, 11, 193, 421);
		panel_3.add(tabbedPane_2);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(null);
		tabbedPane_2.addTab("Users", null, panel_17, null);
		panel_17.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBorder(null);
		tabbedPane_3.setBounds(0, 0, 188, 393);
		panel_17.add(tabbedPane_3);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(null);
		tabbedPane_3.addTab("Online", null, panel_20, null);
		panel_20.setLayout(null);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(null);
		tabbedPane_3.addTab("Team", null, panel_21, null);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(null);
		tabbedPane_3.addTab("Friends", null, panel_22, null);
		
		JPanel panel_18 = new JPanel();
		tabbedPane_2.addTab("Ignore", null, panel_18, null);
		
		JPanel panel_19 = new JPanel();
		tabbedPane_2.addTab("Friends", null, panel_19, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("File Manager", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 951, 421);
		panel_2.add(tabbedPane_1);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_1.addTab("Decks", null, panel_12, null);
		panel_12.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(10, 11, 539, 371);
		panel_12.add(panel_14);
		panel_14.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 519, 349);
		panel_14.add(scrollPane_2);
		
		JList list = new JList();
		scrollPane_2.setViewportView(list);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(559, 11, 377, 371);
		panel_12.add(panel_15);
		panel_15.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 250, 197);
		panel_15.add(scrollPane_3);
		
		JList list_1 = new JList();
		scrollPane_3.setViewportView(list_1);
		
		JPanel panel_13 = new JPanel();
		tabbedPane_1.addTab("Replays", null, panel_13, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Customize", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Shop", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("About", null, panel_6, null);
	}
}
