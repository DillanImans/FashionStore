package onides;

import java.awt.BorderLayout;
import java.io.BufferedWriter;

import java.awt.EventQueue;

import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Panel;

import com.formdev.flatlaf.*;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;

public class Main extends JFrame {
	
	/*
	 * UI STARTS HERE
	 */	

	// Global Variables
	public Shirt chosenShirt;
	public Trousers chosenTrouser;
	public Outerwear chosenOuterwear;
	public Hats chosenHat;
	public int numberOnlyForPrice;
	
	// UI Components
	private JPanel backgroundPane;
	private JTabbedPane tabPanel;
	private JPanel landingPanel;
	private JPanel categoriesPanel;
	private JPanel productViewPanel;
	private JPanel specificCategoryPanel;
	private JPanel shoppingCartPanel;
	private JPanel managerTab;
	private JPanel managerLoginPanel;
	private JPanel managerEditProductPanel;
	private JPanel managerSalesHistoryPanel;
	private JLabel landingTitle;
	private JLabel landingDesc;
	private JButton shopAsGuestBtn;
	private JButton loginAsManagerBtn;
	private JPanel landingHeaderPanel;
	private JPanel categoriesHeaderPanel;
	private JPanel categoriesMainPanel;
	private JLabel title5;
	private JButton categoriesBackBtn;
	private JLabel edgeicon3;
	private JButton categoriesHatsBtn;
	private JButton categoriesShirtsBtn;
	private JButton categoriesTrousersBtn;
	private JButton categoriesOutwearBtn;
	private JPanel categoriesHeaderPanel_1;
	private JLabel title2;
	private JButton viewingProductBackBtn;
	private JLabel edgeicon2;
	private JTextField viewingProductImage;
	private JPanel productViewLeft;
	private JLabel viewingProductName;
	private JLabel viewingProductStock;
	private JPanel productViewRight;
	private JLabel viewingProductPrice;
	private JPanel viewingProductType;
	private JButton productViewCartBtn;
	private JLabel productViewTypeTitle;
	private JPanel ranpan;
	private JPanel ranpan2;
	private JPanel shoppingCartHeader;
	private JLabel shoppingCartHeaderTitle;
	private JButton shoppingCartBackBtn;
	private JLabel edgeicon;
	private JPanel shoppingCartMain;
	private JPanel shoppingCartUnderPanel;
	private JLabel shoppingCartTotal;
	private JButton shoppingCartConfirmBtn;
	private JRadioButton viewingProductType1;
	private JRadioButton viewingProductType2;
	private JRadioButton viewingProductType3;
	private JPanel managerHeader;
	private JLabel lblHiManager;
	private JButton managerIntroBackBtn;
	private JButton managerEditSalesBtn;
	private JButton managerCheckSalesBtn;
	private JPanel managerHeader_1;
	private JLabel managerLoginTitle;
	private JButton managerLoginBackBtn;
	private JPanel managerLoginPanelBottom;
	private JPanel managerLoginTopPanel;
	private JButton managerLoginBtn;
	private JLabel managerLoginTitle2;
	private JLabel managerLoginTitle1;
	private JTextField managerLoginUserIdTF;
	private JTextField managerLoginPasswordTF;
	private JPanel managerHeader_2;
	private JLabel lblEditAProduct;
	private JButton managerEditAProductBackBtn;
	private JPanel managerEditAProductMainPanel;
	private JPanel managerEditBottomPanel;
	private JPanel managerEditTopPanel;
	private JLabel managerEditNameTitle;
	private JLabel managerEditCategoryTitle;
	private JComboBox editAProductCategoryCombo;
	private JComboBox editAProductNameCombo;
	private JLabel currentStockManagerEdit;
	private JLabel addStockManagerEdit;
	private JLabel changePriceManagerEditTitle;
	private JButton addStockManagerEditBtn;
	private JButton changePriceManagerEditBtn;
	private JTextField changePriceTF;
	private JPanel managerHeader_3;
	private JLabel managerSalesHistoryTitle;
	private JButton managerSalesHistoryBackBtn;
	private Panel bigPanel;
	private JPanel underPanel;
	private JLabel managerSalesHistoryBottomRevenue;
	private JButton managerSalesHistoryExportBtn;
	private JButton shoppingCartBtn;
	private JPanel categoriesHeaderPanel_2;
	private JLabel specificCategoryTitle;
	private JButton specificCategoryBackBtn;
	private JLabel edgeicon2_1;
	private JPanel specificCategoryMain;
	private JButton shoppingCartBtn_1;
	private JButton shoppingCartBtn_2;
	private JScrollPane scrollPane;
	private JPanel specificCategoryMainPanel;
	private JPanel scPanel;
	private JLabel scPanelImage;
	private JLabel scName;
	private JLabel lblNewLabel;
	private JTextArea viewingProductDesc;
	private JPanel blockPanel;
	private JButton shoppingCartClearBtn;
	private JTable shoppingCartTable;
	private JScrollPane managerSalesHistoryScrollPane;
	private JTable managerSalesHistoryTable;

	public Main() {	
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);
				
		FlatLightLaf.setup();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("onides");
		setSize(1000, 700);
		backgroundPane = new JPanel();
		backgroundPane.setBackground(new Color(255, 255, 255));
		backgroundPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backgroundPane);
		backgroundPane.setLayout(null);
		
		blockPanel = new JPanel();
		blockPanel.setBackground(new Color(255, 255, 255));
		blockPanel.setBounds(0, 0, 981, 41);
		backgroundPane.add(blockPanel);
		
		tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setBackground(new Color(255, 255, 255));
		tabPanel.setBounds(5, 5, 976, 658);
		backgroundPane.add(tabPanel);
		
		landingPanel = new JPanel();
		landingPanel.setBackground(new Color(255, 255, 255));
		landingPanel.setBorder(null);
		tabPanel.addTab("New tab", null, landingPanel, null);
		tabPanel.setEnabledAt(0, true);
		landingPanel.setLayout(null);
		
		shopAsGuestBtn = new JButton("shop as guest");
		shopAsGuestBtn.setFont(new Font("Microsoft New Tai Lue", shopAsGuestBtn.getFont().getStyle(), 14));
		shopAsGuestBtn.setBounds(74, 145, 312, 430);
		shopAsGuestBtn.setFocusable(false);
		landingPanel.add(shopAsGuestBtn);
		
		loginAsManagerBtn = new JButton("login as manager");
		loginAsManagerBtn.setFont(new Font("Microsoft New Tai Lue", loginAsManagerBtn.getFont().getStyle(), 14));
		loginAsManagerBtn.setBounds(580, 145, 312, 430);
		loginAsManagerBtn.setFocusable(false);
		landingPanel.add(loginAsManagerBtn);
		
		landingHeaderPanel = new JPanel();
		landingHeaderPanel.setBackground(new Color(255, 255, 255));
		landingHeaderPanel.setBounds(360, 12, 244, 121);
		landingPanel.add(landingHeaderPanel);
		
		landingTitle = new JLabel("onides");
		landingHeaderPanel.add(landingTitle);
		landingTitle.setFont(new Font("Microsoft New Tai Lue", landingTitle.getFont().getStyle(), 50));
		
		landingDesc = new JLabel("unique styles for men");
		landingHeaderPanel.add(landingDesc);
		landingDesc.setFont(new Font("Microsoft New Tai Lue", landingDesc.getFont().getStyle(), 14));
		
		categoriesPanel = new JPanel();
		categoriesPanel.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, categoriesPanel, null);
		categoriesPanel.setLayout(null);
		
		categoriesHeaderPanel = new JPanel();
		categoriesHeaderPanel.setBackground(new Color(255, 255, 255));
		categoriesHeaderPanel.setBounds(0, 0, 971, 154);
		categoriesPanel.add(categoriesHeaderPanel);
		categoriesHeaderPanel.setLayout(null);
		
		title5 = new JLabel("Categories");
		title5.setBounds(390, 63, 198, 54);
		title5.setFont(new Font("Microsoft New Tai Lue", title5.getFont().getStyle(), 40));
		categoriesHeaderPanel.add(title5);
		
		categoriesBackBtn = new JButton("");
		categoriesBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		categoriesBackBtn.setBounds(12, 12, 61, 54);
		categoriesBackBtn.setFocusable(false);
		categoriesHeaderPanel.add(categoriesBackBtn);
		
		edgeicon3 = new JLabel("Onides");
		edgeicon3.setFont(new Font("Microsoft New Tai Lue", edgeicon3.getFont().getStyle(), 20));
		edgeicon3.setBounds(889, 16, 82, 16);
		categoriesHeaderPanel.add(edgeicon3);
		
		categoriesMainPanel = new JPanel();
		categoriesMainPanel.setBackground(new Color(255, 255, 255));
		categoriesMainPanel.setBounds(127, 185, 716, 395);
		categoriesPanel.add(categoriesMainPanel);
		categoriesMainPanel.setLayout(new GridLayout(2, 3, 50, 50));
		
		categoriesHatsBtn = new JButton("hats");
		categoriesHatsBtn.setFocusable(false);
		categoriesMainPanel.add(categoriesHatsBtn);
		
		categoriesShirtsBtn = new JButton("shirts");
		categoriesShirtsBtn.setFocusable(false);
		categoriesMainPanel.add(categoriesShirtsBtn);
		
		categoriesOutwearBtn = new JButton("outerwear");
		categoriesOutwearBtn.setFocusable(false);
		categoriesMainPanel.add(categoriesOutwearBtn);
		
		categoriesTrousersBtn = new JButton("trousers");
		categoriesTrousersBtn.setFocusable(false);
		categoriesMainPanel.add(categoriesTrousersBtn);
		
		shoppingCartBtn_1 = new JButton("");
		shoppingCartBtn_1.setIcon(new ImageIcon(Main.class.getResource("/pictures/shoppingCartSmall.png")));
		shoppingCartBtn_1.setBounds(903, 542, 56, 38);
		shoppingCartBtn_1.setFocusable(false);
		categoriesPanel.add(shoppingCartBtn_1);
		
		productViewPanel = new JPanel();
		productViewPanel.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, productViewPanel, null);
		productViewPanel.setLayout(null);
		
		categoriesHeaderPanel_1 = new JPanel();
		categoriesHeaderPanel_1.setBackground(new Color(255, 255, 255));
		categoriesHeaderPanel_1.setLayout(null);
		categoriesHeaderPanel_1.setBounds(0, 0, 971, 154);
		productViewPanel.add(categoriesHeaderPanel_1);
		
		title2 = new JLabel("Viewing Product");
		title2.setFont(new Font("Microsoft New Tai Lue", title2.getFont().getStyle(), 40));
		title2.setBounds(306, 60, 363, 54);
		categoriesHeaderPanel_1.add(title2);
		
		viewingProductBackBtn = new JButton("");
		viewingProductBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		viewingProductBackBtn.setBounds(12, 12, 72, 54);
		viewingProductBackBtn.setFocusable(false);
		categoriesHeaderPanel_1.add(viewingProductBackBtn);
		
		edgeicon2 = new JLabel("Onides");
		edgeicon2.setFont(new Font("Microsoft New Tai Lue", edgeicon2.getFont().getStyle(), 20));
		edgeicon2.setBounds(889, 16, 82, 16);
		categoriesHeaderPanel_1.add(edgeicon2);
		
		productViewLeft = new JPanel();
		productViewLeft.setBackground(new Color(255, 255, 255));
		productViewLeft.setBounds(70, 192, 326, 413);
		productViewPanel.add(productViewLeft);
		productViewLeft.setLayout(null);
		
		viewingProductImage = new JTextField("");
		viewingProductImage.setBackground(new Color(255, 255, 255));
		viewingProductImage.setHorizontalAlignment(SwingConstants.CENTER);
		viewingProductImage.setFont(new Font("Microsoft New Tai Lue", viewingProductImage.getFont().getStyle(), 20));
		viewingProductImage.setEditable(false);
		viewingProductImage.setBounds(0, 0, 326, 277);
		viewingProductImage.setBorder(border);
		productViewLeft.add(viewingProductImage);
		
		viewingProductName = new JLabel("Name of Product");
		viewingProductName.setBounds(0, 290, 326, 55);
		viewingProductName.setFont(new Font("Microsoft New Tai Lue", viewingProductName.getFont().getStyle(), 20));
		viewingProductName.setHorizontalAlignment(SwingConstants.CENTER);
		productViewLeft.add(viewingProductName);
		
		viewingProductStock = new JLabel("Stock Left");
		viewingProductStock.setBounds(0, 357, 326, 55);
		viewingProductStock.setFont(new Font("Microsoft New Tai Lue", viewingProductStock.getFont().getStyle(), 12));
		viewingProductStock.setHorizontalAlignment(SwingConstants.CENTER);
		productViewLeft.add(viewingProductStock);
		
		productViewRight = new JPanel();
		productViewRight.setBackground(new Color(255, 255, 255));
		productViewRight.setBounds(535, 192, 381, 413);
		productViewPanel.add(productViewRight);
		productViewRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		viewingProductDesc = new JTextArea();
		viewingProductDesc.setLineWrap(true);
		viewingProductDesc.setBackground(new Color(244, 244, 244));
		viewingProductDesc.setWrapStyleWord(true);
		viewingProductDesc.setFont(new Font("Microsoft New Tai Lue", viewingProductDesc.getFont().getStyle(), 16));
		viewingProductDesc.setText("test");
		viewingProductDesc.setEditable(false);
		productViewRight.add(viewingProductDesc);
		
		viewingProductType = new JPanel();
		productViewRight.add(viewingProductType);
		viewingProductType.setLayout(new GridLayout(2, 3, 0, 0));
		
		ranpan = new JPanel();
		ranpan.setBackground(new Color(255, 255, 255));
		viewingProductType.add(ranpan);
		ranpan.setLayout(new BorderLayout(0, 0));
		
		productViewTypeTitle = new JLabel("Pick a Type");
		productViewTypeTitle.setFont(new Font("Microsoft New Tai Lue", productViewTypeTitle.getFont().getStyle(), 14));
		ranpan.add(productViewTypeTitle);
		productViewTypeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		ranpan2 = new JPanel();
		ranpan2.setBorder(null);
		ranpan2.setBackground(new Color(255, 255, 255));
		viewingProductType.add(ranpan2);
		ranpan2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		viewingProductType1 = new JRadioButton("S");
		viewingProductType1.setBackground(new Color(255, 255, 255));
		ranpan2.add(viewingProductType1);
		
		viewingProductType2 = new JRadioButton("M");
		viewingProductType2.setBackground(new Color(255, 255, 255));
		ranpan2.add(viewingProductType2);
		
		viewingProductType3 = new JRadioButton("L");
		viewingProductType3.setBackground(new Color(255, 255, 255));
		ranpan2.add(viewingProductType3);
		
		viewingProductPrice = new JLabel("Price");
		viewingProductPrice.setFont(new Font("Microsoft New Tai Lue", viewingProductPrice.getFont().getStyle(), 30));
		viewingProductPrice.setHorizontalAlignment(SwingConstants.CENTER);
		productViewRight.add(viewingProductPrice);
		
		productViewCartBtn = new JButton("1x Add to Cart");
		productViewCartBtn.setFocusable(false);
		productViewRight.add(productViewCartBtn);
		
		shoppingCartBtn = new JButton("");
		shoppingCartBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/shoppingCartSmall.png")));
		shoppingCartBtn.setBounds(443, 567, 45, 38);
		productViewPanel.add(shoppingCartBtn);
		
		specificCategoryPanel = new JPanel();
		tabPanel.addTab("New tab", null, specificCategoryPanel, null);
		specificCategoryPanel.setLayout(null);
		
		categoriesHeaderPanel_2 = new JPanel();
		categoriesHeaderPanel_2.setBackground(new Color(255, 255, 255));
		categoriesHeaderPanel_2.setLayout(null);
		categoriesHeaderPanel_2.setBounds(0, 0, 971, 154);
		specificCategoryPanel.add(categoriesHeaderPanel_2);
		
		specificCategoryTitle = new JLabel("Hats");
		specificCategoryTitle.setFont(new Font("Microsoft New Tai Lue", specificCategoryTitle.getFont().getStyle(), 60));
		specificCategoryTitle.setBounds(70, 90, 352, 84);
		categoriesHeaderPanel_2.add(specificCategoryTitle);
		
		specificCategoryBackBtn = new JButton("");
		specificCategoryBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		specificCategoryBackBtn.setBounds(12, 12, 58, 47);
		specificCategoryBackBtn.setFocusable(false);
		categoriesHeaderPanel_2.add(specificCategoryBackBtn);
		
		edgeicon2_1 = new JLabel("Onides");
		edgeicon2_1.setFont(new Font("Microsoft New Tai Lue", edgeicon2_1.getFont().getStyle(), 20));
		edgeicon2_1.setBounds(889, 16, 82, 16);
		categoriesHeaderPanel_2.add(edgeicon2_1);
		
		specificCategoryMain = 	new JPanel();
		specificCategoryMain.setBackground(new Color(255, 255, 255));
		specificCategoryMain.setBounds(0, 155, 971, 475);
		specificCategoryPanel.add(specificCategoryMain);
		specificCategoryMain.setLayout(null);
		
		shoppingCartBtn_2 = new JButton("");
		shoppingCartBtn_2.setIcon(new ImageIcon(Main.class.getResource("/pictures/shoppingCartSmall.png")));
		shoppingCartBtn_2.setBounds(907, 398, 52, 40);
		shoppingCartBtn_2.setFocusable(false);
		specificCategoryMain.add(shoppingCartBtn_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(246, 26, 487, 412);
		scrollPane.setBorder(null);
		specificCategoryMain.add(scrollPane);
		
		specificCategoryMainPanel = new JPanel();
		specificCategoryMainPanel.setBorder(null);
		specificCategoryMainPanel.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(specificCategoryMainPanel);
		specificCategoryMainPanel.setLayout(new GridLayout(2, 3, 20, 20));
		
		shoppingCartPanel = new JPanel();
		shoppingCartPanel.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, shoppingCartPanel, null);
		shoppingCartPanel.setLayout(null);
		
		shoppingCartHeader = new JPanel();
		shoppingCartHeader.setBackground(new Color(255, 255, 255));
		shoppingCartHeader.setLayout(null);
		shoppingCartHeader.setBounds(0, 0, 971, 154);
		shoppingCartPanel.add(shoppingCartHeader);
		
		shoppingCartHeaderTitle = new JLabel("Shopping Cart");
		shoppingCartHeaderTitle.setFont(new Font("Microsoft New Tai Lue", shoppingCartHeaderTitle.getFont().getStyle(), 40));
		shoppingCartHeaderTitle.setBounds(341, 60, 298, 54);
		shoppingCartHeader.add(shoppingCartHeaderTitle);
		
		shoppingCartBackBtn = new JButton("");
		shoppingCartBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		shoppingCartBackBtn.setBounds(12, 12, 60, 54);
		shoppingCartBackBtn.setFocusable(false);
		shoppingCartHeader.add(shoppingCartBackBtn);
		
		edgeicon = new JLabel("Onides");
		edgeicon.setFont(new Font("Microsoft New Tai Lue", edgeicon.getFont().getStyle(), 20));
		edgeicon.setBounds(889, 16, 82, 16);
		shoppingCartHeader.add(edgeicon);
		
		shoppingCartMain = new JPanel();
		shoppingCartMain.setBackground(new Color(255, 255, 255));
		shoppingCartMain.setBounds(0, 155, 971, 463);
		shoppingCartPanel.add(shoppingCartMain);
		shoppingCartMain.setLayout(null);
		
		shoppingCartUnderPanel = new JPanel();
		shoppingCartUnderPanel.setBackground(new Color(255, 255, 255));
		shoppingCartUnderPanel.setBounds(228, 345, 526, 95);
		shoppingCartMain.add(shoppingCartUnderPanel);
		shoppingCartUnderPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		shoppingCartTotal = new JLabel("Total: $99.9");
		shoppingCartTotal.setBackground(new Color(255, 255, 255));
		shoppingCartTotal.setFont(new Font("Microsoft New Tai Lue", shoppingCartTotal.getFont().getStyle(), 30));
		shoppingCartTotal.setHorizontalAlignment(SwingConstants.CENTER);
		shoppingCartUnderPanel.add(shoppingCartTotal);
		
		shoppingCartConfirmBtn = new JButton("Confirm Purchase");
		shoppingCartConfirmBtn.setFont(new Font("Microsoft New Tai Lue", shoppingCartConfirmBtn.getFont().getStyle(), 20));
		shoppingCartConfirmBtn.setFocusable(false);
		shoppingCartUnderPanel.add(shoppingCartConfirmBtn);
		
		shoppingCartClearBtn = new JButton("Clear All");
		shoppingCartClearBtn.setBounds(110, 349, 101, 26);
		shoppingCartClearBtn.setFocusable(false);
		shoppingCartMain.add(shoppingCartClearBtn);
		
		///
		
		// Shopping Cart UI
        DefaultTableModel shoppingCartModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
		shoppingCartTable = new JTable();
		shoppingCartTable.setModel(shoppingCartModel);
		
        JTableHeader tableHeader = shoppingCartTable.getTableHeader();
        tableHeader.setReorderingAllowed(false);
		
		shoppingCartModel.addColumn("Category");
		shoppingCartModel.addColumn("Name");
		shoppingCartModel.addColumn("Type");
		shoppingCartModel.addColumn("Price");
		
		shoppingCartTable.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
		shoppingCartTable.setBounds(147, 12, 675, 321);
		JScrollPane shoppingCartScrollPane = new JScrollPane(shoppingCartTable);
		shoppingCartScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		shoppingCartScrollPane.setBounds(141, 35, 686, 302);
		shoppingCartMain.add(shoppingCartScrollPane);
		
		///
		
		
		managerTab = new JPanel();
		managerTab.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, managerTab, null);
		managerTab.setLayout(null);
		
		managerHeader = new JPanel();
		managerHeader.setBackground(new Color(255, 255, 255));
		managerHeader.setLayout(null);
		managerHeader.setBounds(0, 0, 971, 154);
		managerTab.add(managerHeader);
		
		lblHiManager = new JLabel("Hi, Manager");
		lblHiManager.setFont(new Font("Microsoft New Tai Lue", lblHiManager.getFont().getStyle(), 40));
		lblHiManager.setBounds(375, 63, 278, 54);
		managerHeader.add(lblHiManager);
		
		managerIntroBackBtn = new JButton("");
		managerIntroBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		managerIntroBackBtn.setBounds(12, 12, 56, 48);
		managerIntroBackBtn.setFocusable(false);
		managerHeader.add(managerIntroBackBtn);
		
		managerEditSalesBtn = new JButton("Edit a Product");
		managerEditSalesBtn.setBounds(97, 166, 312, 430);
		managerEditSalesBtn.setFocusable(false);
		managerTab.add(managerEditSalesBtn);
		
		managerCheckSalesBtn = new JButton("Check Sales History");
		managerCheckSalesBtn.setBounds(574, 166, 312, 430);
		managerCheckSalesBtn.setFocusable(false);
		managerTab.add(managerCheckSalesBtn);
		
		managerLoginPanel = new JPanel();
		tabPanel.addTab("New tab", null, managerLoginPanel, null);
		managerLoginPanel.setLayout(null);
		
		managerHeader_1 = new JPanel();
		managerHeader_1.setBackground(new Color(255, 255, 255));
		managerHeader_1.setLayout(null);
		managerHeader_1.setBounds(0, 0, 971, 154);
		managerLoginPanel.add(managerHeader_1);
		
		managerLoginTitle = new JLabel("Login");
		managerLoginTitle.setFont(new Font("Microsoft New Tai Lue", managerLoginTitle.getFont().getStyle(), 40));
		managerLoginTitle.setBounds(427, 56, 136, 54);
		managerHeader_1.add(managerLoginTitle);
		
		managerLoginBackBtn = new JButton("");
		managerLoginBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		managerLoginBackBtn.setBounds(12, 12, 60, 54);
		managerLoginBackBtn.setFocusable(false);
		managerHeader_1.add(managerLoginBackBtn);
		
		managerLoginPanelBottom = new JPanel();
		managerLoginPanelBottom.setBackground(new Color(255, 255, 255));
		managerLoginPanelBottom.setBounds(0, 154, 971, 476);
		managerLoginPanel.add(managerLoginPanelBottom);
		managerLoginPanelBottom.setLayout(null);
		
		managerLoginTopPanel = new JPanel();
		managerLoginTopPanel.setBackground(new Color(255, 255, 255));
		managerLoginTopPanel.setBounds(260, 79, 486, 159);
		managerLoginPanelBottom.add(managerLoginTopPanel);
		managerLoginTopPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		managerLoginTitle1 = new JLabel("user id:");
		managerLoginTopPanel.add(managerLoginTitle1);
		
		managerLoginUserIdTF = new JTextField();
		managerLoginTopPanel.add(managerLoginUserIdTF);
		managerLoginUserIdTF.setColumns(10);
		
		managerLoginTitle2 = new JLabel("password:");
		managerLoginTopPanel.add(managerLoginTitle2);
		
		managerLoginPasswordTF = new JTextField();
		managerLoginTopPanel.add(managerLoginPasswordTF);
		managerLoginPasswordTF.setColumns(10);
		
		managerLoginBtn = new JButton("Login");
		managerLoginBtn.setBounds(260, 238, 486, 81);
		managerLoginBtn.setFocusable(false);
		managerLoginPanelBottom.add(managerLoginBtn);
		
		managerEditProductPanel = new JPanel();
		managerEditProductPanel.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, managerEditProductPanel, null);
		managerEditProductPanel.setLayout(null);
		
		managerHeader_2 = new JPanel();
		managerHeader_2.setBackground(new Color(255, 255, 255));
		managerHeader_2.setLayout(null);
		managerHeader_2.setBounds(0, 0, 971, 154);
		managerEditProductPanel.add(managerHeader_2);
		
		lblEditAProduct = new JLabel("Edit a Product");
		lblEditAProduct.setFont(new Font("Microsoft New Tai Lue", lblEditAProduct.getFont().getStyle(), 40));
		lblEditAProduct.setBounds(348, 55, 289, 54);
		managerHeader_2.add(lblEditAProduct);
		
		managerEditAProductBackBtn = new JButton("");
		managerEditAProductBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		managerEditAProductBackBtn.setBounds(12, 12, 59, 54);
		managerEditAProductBackBtn.setFocusable(false);
		managerHeader_2.add(managerEditAProductBackBtn);
		
		managerEditAProductMainPanel = new JPanel();
		managerEditAProductMainPanel.setBounds(116, 199, 759, 356);
		managerEditProductPanel.add(managerEditAProductMainPanel);
		managerEditAProductMainPanel.setLayout(null);
		
		managerEditBottomPanel = new JPanel();
		managerEditBottomPanel.setBorder(null);
		managerEditBottomPanel.setBackground(new Color(255, 255, 255));
		managerEditBottomPanel.setBounds(0, 163, 759, 193);
		managerEditAProductMainPanel.add(managerEditBottomPanel);
		managerEditBottomPanel.setLayout(new GridLayout(3, 2, 0, 0));
		
		addStockManagerEdit = new JLabel("Add Stock");
		addStockManagerEdit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		addStockManagerEdit.setForeground(new Color(128, 0, 255));
		addStockManagerEdit.setBackground(new Color(192, 192, 192));
		addStockManagerEdit.setHorizontalAlignment(SwingConstants.CENTER);
		managerEditBottomPanel.add(addStockManagerEdit);
		
		changePriceManagerEditTitle = new JLabel("Change Base Price");
		changePriceManagerEditTitle.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		changePriceManagerEditTitle.setForeground(new Color(255, 128, 0));
		changePriceManagerEditTitle.setHorizontalAlignment(SwingConstants.CENTER);
		managerEditBottomPanel.add(changePriceManagerEditTitle);
		
		currentStockManagerEdit = new JLabel("Current Stock: ");
		currentStockManagerEdit.setForeground(new Color(128, 0, 255));
		currentStockManagerEdit.setHorizontalAlignment(SwingConstants.CENTER);
		managerEditBottomPanel.add(currentStockManagerEdit);
		
		changePriceTF = new JTextField();
		changePriceTF.setHorizontalAlignment(SwingConstants.CENTER);
		changePriceTF.setForeground(new Color(255, 128, 0));
		managerEditBottomPanel.add(changePriceTF);
		changePriceTF.setColumns(10);
		
		addStockManagerEditBtn = new JButton("Add Stock +1");
		addStockManagerEditBtn.setForeground(new Color(128, 0, 255));
		addStockManagerEditBtn.setFont(new Font("Dialog", Font.BOLD, 14));
		addStockManagerEditBtn.setFocusable(false);
		managerEditBottomPanel.add(addStockManagerEditBtn);
		
		changePriceManagerEditBtn = new JButton("Set Price");
		changePriceManagerEditBtn.setForeground(new Color(255, 128, 0));
		changePriceManagerEditBtn.setFont(new Font("Dialog", Font.BOLD, 14));
		changePriceManagerEditBtn.setFocusable(false);
		managerEditBottomPanel.add(changePriceManagerEditBtn);
		
		managerEditTopPanel = new JPanel();
		managerEditTopPanel.setBackground(new Color(255, 255, 255));
		managerEditTopPanel.setBounds(0, 0, 759, 160);
		managerEditAProductMainPanel.add(managerEditTopPanel);
		managerEditTopPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		managerEditCategoryTitle = new JLabel("Category");
		managerEditCategoryTitle.setBackground(new Color(255, 255, 255));
		managerEditTopPanel.add(managerEditCategoryTitle);
		
		editAProductCategoryCombo = new JComboBox();
		editAProductCategoryCombo.setModel(new DefaultComboBoxModel(new String[] {"Hats", "Trousers", "Shirts", "Outerwear"}));
		editAProductCategoryCombo.setBackground(new Color(255, 255, 255));
		managerEditTopPanel.add(editAProductCategoryCombo);
		
		managerEditNameTitle = new JLabel("Name");
		managerEditNameTitle.setBackground(new Color(255, 255, 255));
		managerEditTopPanel.add(managerEditNameTitle);
		
		editAProductNameCombo = new JComboBox();
		editAProductNameCombo.setBackground(new Color(255, 255, 255));
		managerEditTopPanel.add(editAProductNameCombo);
		
		managerSalesHistoryPanel = new JPanel();
		managerSalesHistoryPanel.setBackground(new Color(255, 255, 255));
		tabPanel.addTab("New tab", null, managerSalesHistoryPanel, null);
		managerSalesHistoryPanel.setLayout(null);
		
		managerHeader_3 = new JPanel();
		managerHeader_3.setBackground(new Color(255, 255, 255));
		managerHeader_3.setLayout(null);
		managerHeader_3.setBounds(0, 0, 971, 154);
		managerSalesHistoryPanel.add(managerHeader_3);
		
		managerSalesHistoryTitle = new JLabel("Sales History");
		managerSalesHistoryTitle.setFont(new Font("Microsoft New Tai Lue", managerSalesHistoryTitle.getFont().getStyle(), 40));
		managerSalesHistoryTitle.setBounds(363, 59, 289, 54);
		managerHeader_3.add(managerSalesHistoryTitle);
		
		managerSalesHistoryBackBtn = new JButton("");
		managerSalesHistoryBackBtn.setIcon(new ImageIcon(Main.class.getResource("/pictures/arrowSmall.png")));
		managerSalesHistoryBackBtn.setBounds(12, 12, 60, 54);
		managerSalesHistoryBackBtn.setFocusable(false);
		managerHeader_3.add(managerSalesHistoryBackBtn);
		
		bigPanel = new Panel();
		bigPanel.setBounds(0, 160, 971, 470);
		managerSalesHistoryPanel.add(bigPanel);
		bigPanel.setLayout(null);
		
		underPanel = new JPanel();
		underPanel.setBackground(new Color(255, 255, 255));
		underPanel.setBounds(12, 374, 947, 84);
		bigPanel.add(underPanel);
		underPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		managerSalesHistoryBottomRevenue = new JLabel("Total Revenue: $");
		managerSalesHistoryBottomRevenue.setFont(new Font("Dialog", Font.BOLD, 14));
		managerSalesHistoryBottomRevenue.setForeground(new Color(0, 0, 0));
		managerSalesHistoryBottomRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		underPanel.add(managerSalesHistoryBottomRevenue);
		
		managerSalesHistoryExportBtn = new JButton("export sales history");
		managerSalesHistoryExportBtn.setFocusable(false);
		underPanel.add(managerSalesHistoryExportBtn);
		
		
		// History Sales UI
        DefaultTableModel historySalesModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
		managerSalesHistoryTable = new JTable();
		managerSalesHistoryTable.setModel(historySalesModel);
		
        JTableHeader tableSalesHeader = managerSalesHistoryTable.getTableHeader();
        tableSalesHeader.setReorderingAllowed(false);
		
		historySalesModel.addColumn("Category");
		historySalesModel.addColumn("Name");
		historySalesModel.addColumn("Type");
		historySalesModel.addColumn("Price");
		
		managerSalesHistoryTable.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
		shoppingCartTable.setBounds(147, 12, 675, 321);
		
		managerSalesHistoryScrollPane = new JScrollPane(managerSalesHistoryTable);
		managerSalesHistoryScrollPane.setBounds(141, 35, 686, 302);
		managerSalesHistoryScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		bigPanel.add(managerSalesHistoryScrollPane);
		
		
		
	
		/*
		 * UI ENDS HERE
		 */
		
		
		
		
		/*
		 * FUNCTIONALITY STARTS HERE
		 */
		
		
		
		// Initialize Manager and Items Array
		ManagerAccount manager1 = new ManagerAccount("managerUsername123", "managerPassword456");
		
		// The default & stock array
		// Stock amount of each product and price of each product are editable through manager.
		ArrayList<Shirt> shirtArr = new ArrayList<>();
		ArrayList<Trousers> trouserArr = new ArrayList<>();
		ArrayList<Outerwear> outerwearArr = new ArrayList<>();
		ArrayList<Hats> hatArr = new ArrayList<>();
		
		// The shopping cart array, where products in the shopping cart are added here
		// Editable through clearing or purchasing in shopping cart tab
		ArrayList<Shirt> shoppingCartShirtArr = new ArrayList<>();
		ArrayList<Trousers> shoppingCartTrouserArr = new ArrayList<>();
		ArrayList<Outerwear> shoppingCartOuterwearArr = new ArrayList<>();
		ArrayList<Hats> shoppingCartHatArr = new ArrayList<>();
		
		// All purchased products will go in here. Will always show values in manager's history sales tab.
		ArrayList<Shirt> boughtShirtArr = new ArrayList<>();
		ArrayList<Trousers> boughtTrouserArr = new ArrayList<>();
		ArrayList<Outerwear> boughtOuterwearArr = new ArrayList<>();
		ArrayList<Hats> boughtHatArr = new ArrayList<>();
		
		
		
//		FashionItem(String image, String name, int stockAmount,
//				String description,	int basePrice, String chosenType){
//				this.image = image;
//				this.name = name;
//				this.stockAmount = stockAmount;
//				this.description = description;
//				this.basePrice = basePrice;
//				this.chosenType = chosenType;
//			}
			
		
		
		// Filling Shirt Arr
		shirtArr.add(new Shirt("image", "White Basque", 20, "A crisp and versatile white shirt, exuding timeless charm and a sense of effortless sophistication.",
				15, "polyester"));
		shirtArr.add(new Shirt("image", "Blue Maple", 7, "A timeless classic, this blue shirt effortlessly combines sophistication"
				+ " with a touch of casual elegance.", 30, "polyester"));
		shirtArr.add(new Shirt("image", "Maroon Elix", 5, "A rich and regal maroon shirt that commands attention, blending elegance with a touch of boldness.",
				30, "polyester"));
		shirtArr.add(new Shirt("image", "Polymorphic Fling", 1, "A vibrant and stylish shirt featuring a mesmerizing fusion of bold colors and intricate patterns."
				, 100, "polyester"));
		
		
		// Filling Trouser Arr
		trouserArr.add(new Trousers("image", "Casual Black", 14, "Comfort meets versatility in these simple black pants, perfect for casual outings or athletic activities.",
				30, "cotton"));
		trouserArr.add(new Trousers("image", "Gray Grid", 4, "Elevate your style with these sleek and sophisticated gray pants, blending timeless elegance with a modern twist.",
				50, "cotton"));
		trouserArr.add(new Trousers("image", "Luxurious Golden Shay", 0, "Dazzle with opulence in these luxurious golden pants, exuding a glamorous and radiant allure that steals the spotlight.",
				200, "cotton"));
		trouserArr.add(new Trousers("image", "Blue Floo", 2, "Unleash your bold sense of style with our striking blue trousers, crafted with intricate details and a touch of contemporary flair to make a standout fashion statement.",
				100, "cotton"));

		
		// Filling Outerwear Arr
		outerwearArr.add(new Outerwear("image", "Blending Puffer Jacket", 4, "Embrace warmth and style with this cozy puffer jacket, designed to keep you snug while effortlessly enhancing your winter wardrobe.",
				60, "pre-made"));
		outerwearArr.add(new Outerwear("image", "Biker Leather Jacket", 2, "Unleash your inner rebel with this edgy biker leather jacket, exuding an aura of confidence and timeless cool.",
				100, "pre-made"));
		outerwearArr.add(new Outerwear("image", "Trench Coat", 1, "Step out in classic elegance with this sophisticated trench coat, a versatile and timeless staple that exudes refinement and style.",
				400, "pre-made"));
		outerwearArr.add(new Outerwear("image", "Quilted Vest", 0, "Stay stylish and cozy with our quilted vest, featuring a perfect blend of warmth, comfort, and fashion-forward design.",
				150, "pre-made"));


		// Filling Hat Arr
		hatArr.add(new Hats("image", "Baseball cap", 5, "Top off your casual look with this sporty baseball cap, combining comfort and style for a laid-back yet fashionable statement.",
				30, "pre-made"));
		hatArr.add(new Hats("image", "Fedora", 2, "Channel your individuality with this uniquely crafted fedora, blending vintage allure with contemporary flair to create a head-turning statement piece.",
				30, "pre-made"));
		hatArr.add(new Hats("image", "Flat cap", 10, "Add a touch of refined flair to your outfit with this distinguished flat cap, a perfect fusion of timeless style and contemporary panache.",
				30, "pre-made"));
		hatArr.add(new Hats("image", "The Bautta", 0, "Exude mystery and intrigue with the iconic Bautta mask, an ancient Venetian symbol of elegance and anonymity.",
				300, "pre-made"));
		
		
		// For the specific category panel (creating panels)
		ArrayList<JPanel> panelList = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
		    JPanel scPanel = new JPanel();
		    scPanel.setBackground(new Color(255, 255, 255));
		    scPanel.setLayout(null);

		    JLabel scPanelImage = new JLabel("Image");
		    scPanelImage.setHorizontalAlignment(SwingConstants.CENTER);
		    scPanelImage.setBounds(12, 12, 163, 137);
		    scPanel.add(scPanelImage);
		    Border blackline = BorderFactory.createLineBorder(Color.black);
		    scPanelImage.setBorder(blackline);

		    JLabel scName = new JLabel("name");
		    scName.setHorizontalAlignment(SwingConstants.CENTER);
		    scName.setFont(new Font("Microsoft New Tai Lue", scName.getFont().getStyle(), 14));
		    scName.setBounds(12, 161, 163, 33);
		    scPanel.add(scName);

		    panelList.add(scPanel);
		    
		    // If clicked, add data into panel (will open product preview) (depending on category, hence the 4 ifs/elifs)
		    scPanel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		        	if(specificCategoryTitle.getText().equals("Hats")) {
		        		JLabel chosenLabel = (JLabel) scPanel.getComponent(1);
		        		for(int i = 0; i < 4; i++) {
		        			if(chosenLabel.getText().equals(hatArr.get(i).getName())) {
		        				tabPanel.setSelectedIndex(2);
		        				chosenHat = hatArr.get(i);
		        				
		        				viewingProductImage.setText(chosenHat.getImage());
		        				viewingProductName.setText(chosenHat.getName());
		        				viewingProductStock.setText("Stock left: " + String.valueOf(chosenHat.getStockAmount()));
		        				viewingProductDesc.setText(chosenHat.getDescription());
		        				viewingProductPrice.setText("Price: $" + String.valueOf(chosenHat.getBasePrice()));
		        				viewingProductType1.setText("three-d printed (+$0)");
		        				viewingProductType2.setText("machine sewn (+$10)");
		        				viewingProductType3.setText("handmade (+$30)");
		        				viewingProductType1.setSelected(true);
		        				viewingProductType2.setSelected(false);
		        				viewingProductType3.setSelected(false);
		        				numberOnlyForPrice = chosenHat.getBasePrice();
		        				break;
		        			}
		        		}
		        	} else if(specificCategoryTitle.getText().equals("Trousers")) {
		        		JLabel chosenLabel = (JLabel) scPanel.getComponent(1);
		        		for(int i = 0; i < 4; i++) {
		        			if(chosenLabel.getText().equals(trouserArr.get(i).getName())) {
		        				tabPanel.setSelectedIndex(2);
		        				chosenTrouser = trouserArr.get(i);
		        				
		        				viewingProductImage.setText(chosenTrouser.getImage());
		        				viewingProductName.setText(chosenTrouser.getName());
		        				viewingProductStock.setText("Stock left: " + String.valueOf(chosenTrouser.getStockAmount()));
		        				viewingProductDesc.setText(chosenTrouser.getDescription());
		        				viewingProductPrice.setText("Price: $" + String.valueOf(chosenTrouser.getBasePrice()));
		        				viewingProductType1.setText("cotton (+$0)");
		        				viewingProductType2.setText("wool (+$20)");
		        				viewingProductType3.setText("refined denim (+$40)");
		        				viewingProductType1.setSelected(true);
		        				viewingProductType2.setSelected(false);
		        				viewingProductType3.setSelected(false);
		        				numberOnlyForPrice = chosenTrouser.getBasePrice();
		        				break;
		        			}
		        		}
		        	} else if(specificCategoryTitle.getText().equals("Shirts")) {
		        		JLabel chosenLabel = (JLabel) scPanel.getComponent(1);
		        		for(int i = 0; i < 4; i++) {
		        			if(chosenLabel.getText().equals(shirtArr.get(i).getName())) {
		        				tabPanel.setSelectedIndex(2);
		        				chosenShirt = shirtArr.get(i);
		        				
		        				viewingProductImage.setText(chosenShirt.getImage());
		        				viewingProductName.setText(chosenShirt.getName());
		        				viewingProductStock.setText("Stock left: " + String.valueOf(chosenShirt.getStockAmount()));
		        				viewingProductDesc.setText(chosenShirt.getDescription());
		        				viewingProductPrice.setText("Price: $" + String.valueOf(chosenShirt.getBasePrice()));
		        				viewingProductType1.setText("polyester (+$0)");
		        				viewingProductType2.setText("linen (+$15)");
		        				viewingProductType3.setText("silk (+$30)");
		        				viewingProductType1.setSelected(true);
		        				viewingProductType2.setSelected(false);
		        				viewingProductType3.setSelected(false);
		        				numberOnlyForPrice = chosenShirt.getBasePrice();
		        				break;
		        			}
		        		}
		        	} else if(specificCategoryTitle.getText().equals("Outerwear")) {
		        		JLabel chosenLabel = (JLabel) scPanel.getComponent(1);
		        		for(int i = 0; i < 4; i++) {
		        			if(chosenLabel.getText().equals(outerwearArr.get(i).getName())) {
		        				tabPanel.setSelectedIndex(2);
		        				chosenOuterwear = outerwearArr.get(i);
		        				
		        				viewingProductImage.setText(chosenOuterwear.getImage());
		        				viewingProductName.setText(chosenOuterwear.getName());
		        				viewingProductStock.setText("Stock left: " + String.valueOf(chosenOuterwear.getStockAmount()));
		        				viewingProductDesc.setText(chosenOuterwear.getDescription());
		        				viewingProductPrice.setText("Price: $" + String.valueOf(chosenOuterwear.getBasePrice()));
		        				viewingProductType1.setText("pre-made (+$0)");
		        				viewingProductType2.setText("junior tailored (+$20)");
		        				viewingProductType3.setText("senior tailored (+$100)");
		        				viewingProductType1.setSelected(true);
		        				viewingProductType2.setSelected(false);
		        				viewingProductType3.setSelected(false);
		        				numberOnlyForPrice = chosenOuterwear.getBasePrice();
		        			}
		        		}
		        	}
		        }
		    });
		}
		
		
		
		// Page navigation will be handled depending on each page
		
		
		
		
		/*
		 * GUEST
		 */
		
		
		
		
		
		// LANDING PAGE FUNCTIONALITY
		shopAsGuestBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(1);

			}
		});
		loginAsManagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(6);
			}
		});
		
		
		
		
		// CATEGORIES FUNCTIONALITY
		categoriesBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(0);
			}
		});
		
		// If categorieshats is pressed, show the hats panels (same goes for other categories)
		categoriesHatsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(3);
				specificCategoryTitle.setText("Hats");
				
				for(int i = 0; i < 4; i++) {
					String productImage = "";
					String productName = "";
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				for(int i = 0; i < hatArr.size(); i++) {
					String productImage = hatArr.get(i).getImage();
					String productName = hatArr.get(i).getName();
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				// Revalidate and repaint the container
				specificCategoryMainPanel.revalidate();
				specificCategoryMainPanel.repaint();
			}
		});
		
		categoriesShirtsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(3);
				specificCategoryTitle.setText("Shirts");
				
				for(int i = 0; i < 4; i++) {
					String productImage = "";
					String productName = "";
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				for(int i = 0; i < shirtArr.size(); i++) {
					String productImage = shirtArr.get(i).getImage();
					String productName = shirtArr.get(i).getName();
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				// Revalidate and repaint the container
				specificCategoryMainPanel.revalidate();
				specificCategoryMainPanel.repaint();
			}
		});
		
		categoriesTrousersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(3);
				specificCategoryTitle.setText("Trousers");
				
				for(int i = 0; i < 4; i++) {
					String productImage = "";
					String productName = "";
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				for(int i = 0; i < trouserArr.size(); i++) {
					String productImage = trouserArr.get(i).getImage();
					String productName = trouserArr.get(i).getName();
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				// Revalidate and repaint the container
				specificCategoryMainPanel.revalidate();
				specificCategoryMainPanel.repaint();
			
			}
		});
		
		categoriesOutwearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(3);
				specificCategoryTitle.setText("Outerwear");
				
				for(int i = 0; i < 4; i++) {
					String productImage = "";
					String productName = "";
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				for(int i = 0; i < outerwearArr.size(); i++) {
					String productImage = outerwearArr.get(i).getImage();
					String productName = outerwearArr.get(i).getName();
					
					JPanel panel = panelList.get(i);
					JLabel scPanelImage = (JLabel) panel.getComponent(0);
					JLabel scName = (JLabel) panel.getComponent(1);
					scPanelImage.setText(productImage);
					scName.setText(productName);
					specificCategoryMainPanel.add(panel);
					
				}
				
				// Revalidate and repaint the container
				specificCategoryMainPanel.revalidate();
				specificCategoryMainPanel.repaint();
			}
		});
		
		
		
		// Back button in specific category
		specificCategoryBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(1);
			}
		});
		
		
		
		// VIEWING PRODUCT FUNCTIONALITY
		viewingProductBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(3);
			}
		});
		
		// If type 1 radio button is pressed, update price and only select radio button 1. Same goes for 2 and 3.
		viewingProductType1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewingProductType1.setSelected(true);
				viewingProductType2.setSelected(false);
				viewingProductType3.setSelected(false);
				
				int added = 0;
				int numberOnlyType = Integer.parseInt(viewingProductType1.getText().replaceAll("[^0-9]", ""));
				added = numberOnlyForPrice + numberOnlyType;
				viewingProductPrice.setText("Price: $" + String.valueOf(added));
			}
		});
		viewingProductType2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewingProductType2.setSelected(true);
				viewingProductType1.setSelected(false);
				viewingProductType3.setSelected(false);
				
				int added = 0;
				int numberOnlyType = Integer.parseInt(viewingProductType2.getText().replaceAll("[^0-9]", ""));
				added = numberOnlyForPrice + numberOnlyType;
				viewingProductPrice.setText("Price: $" + String.valueOf(added));
			}
		});
		viewingProductType3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewingProductType3.setSelected(true);
				viewingProductType2.setSelected(false);
				viewingProductType1.setSelected(false);
				
				int added = 0;
				int numberOnlyType = Integer.parseInt(viewingProductType3.getText().replaceAll("[^0-9]", ""));
				added = numberOnlyForPrice + numberOnlyType;
				viewingProductPrice.setText("Price: $" + String.valueOf(added));
			}
		});
		
		// Add to Cart button in product view
		productViewCartBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Check stock
				int numberOnly = Integer.parseInt(viewingProductStock.getText().replaceAll("[^0-9]", ""));
				if(numberOnly != 0) {	
					
					// If type 1 is selected, set dependent chosen type.
					// Also check for which category.
					// This happens for 3 types, 4 categories each type (very similar code).
					if(viewingProductType1.isSelected()) {
						if(specificCategoryTitle.getText().equals("Hats")) {
							chosenHat.setChosenType("3d printed");
							chosenHat.addToTotalCost(chosenHat.getBasePrice());
							chosenHat.calculateOptionCost();
							
							// Add to Shopping Cart Array
							shoppingCartHatArr.add(new Hats("image", chosenHat.getName(), 1, chosenHat.getDescription(), 
									chosenHat.getBasePrice(), chosenHat.getChosenType()));
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).addToTotalCost(chosenHat.getBasePrice());
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).calculateOptionCost();
							
							// Update stock
							for(int i = 0; i < 4; i++) {
			        			if(chosenHat.getName().equals(hatArr.get(i).getName())) {
			        				int numStockNow = ( hatArr.get(i).getStockAmount() ) - 1;
			        				hatArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Shirts")) {
							chosenShirt.setChosenType("polyester");
							chosenShirt.addToTotalCost(chosenShirt.getBasePrice());
							chosenShirt.calculateOptionCost();
							shoppingCartShirtArr.add(new Shirt("image", chosenShirt.getName(), 1, chosenShirt.getDescription(), 
									chosenShirt.getBasePrice(), chosenShirt.getChosenType()));
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).addToTotalCost(chosenShirt.getBasePrice());
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).calculateOptionCost();							for(int i = 0; i < 4; i++) {
			        			if(chosenShirt.getName().equals(shirtArr.get(i).getName())) {
			        				int numStockNow = ( shirtArr.get(i).getStockAmount() ) - 1;
			        				shirtArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Trousers")) {
							chosenTrouser.setChosenType("cotton");
							chosenTrouser.addToTotalCost(chosenTrouser.getBasePrice());
							chosenTrouser.calculateOptionCost();
							shoppingCartTrouserArr.add(new Trousers("image", chosenTrouser.getName(), 1, chosenTrouser.getDescription(), 
									chosenTrouser.getBasePrice(), chosenTrouser.getChosenType()));
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).addToTotalCost(chosenTrouser.getBasePrice());
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).calculateOptionCost();							for(int i = 0; i < 4; i++) {
			        			if(chosenTrouser.getName().equals(trouserArr.get(i).getName())) {
			        				int numStockNow = ( trouserArr.get(i).getStockAmount() ) - 1;
			        				trouserArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Outerwear")) {
							chosenOuterwear.setChosenType("pre-made");
							chosenOuterwear.addToTotalCost(chosenOuterwear.getBasePrice());
							chosenOuterwear.calculateOptionCost();
							shoppingCartOuterwearArr.add(new Outerwear("image", chosenOuterwear.getName(), 1, chosenOuterwear.getDescription(), 
									chosenOuterwear.getBasePrice(), chosenOuterwear.getChosenType()));
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).addToTotalCost(chosenOuterwear.getBasePrice());
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).calculateOptionCost();							for(int i = 0; i < 4; i++) {
			        			if(chosenOuterwear.getName().equals(outerwearArr.get(i).getName())) {
			        				int numStockNow = ( outerwearArr.get(i).getStockAmount() ) - 1;
			        				outerwearArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						}
					
						// Type 2 Chosen
						
					} else if (viewingProductType2.isSelected()) {
						if(specificCategoryTitle.getText().equals("Hats")) {
							chosenHat.setChosenType("machine sewn");
							chosenHat.addToTotalCost(chosenHat.getBasePrice());
							chosenHat.calculateOptionCost();
							shoppingCartHatArr.add(new Hats("image", chosenHat.getName(), 1, chosenHat.getDescription(), 
									chosenHat.getBasePrice(), chosenHat.getChosenType()));
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).addToTotalCost(chosenHat.getBasePrice());
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).calculateOptionCost();							for(int i = 0; i < 4; i++) {
			        			if(chosenHat.getName().equals(hatArr.get(i).getName())) {
			        				int numStockNow = ( hatArr.get(i).getStockAmount() ) - 1;
			        				hatArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Shirts")) {
							chosenShirt.setChosenType("linen");
							chosenShirt.addToTotalCost(chosenShirt.getBasePrice());
							chosenShirt.calculateOptionCost();
							shoppingCartShirtArr.add(new Shirt("image", chosenShirt.getName(), 1, chosenShirt.getDescription(), 
									chosenShirt.getBasePrice(), chosenShirt.getChosenType()));
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).addToTotalCost(chosenShirt.getBasePrice());
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).calculateOptionCost();								for(int i = 0; i < 4; i++) {
			        			if(chosenShirt.getName().equals(shirtArr.get(i).getName())) {
			        				int numStockNow = ( shirtArr.get(i).getStockAmount() ) - 1;
			        				shirtArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Trousers")) {
							chosenTrouser.setChosenType("wool");
							chosenTrouser.addToTotalCost(chosenTrouser.getBasePrice());
							chosenTrouser.calculateOptionCost();
							shoppingCartTrouserArr.add(new Trousers("image", chosenTrouser.getName(), 1, chosenTrouser.getDescription(), 
									chosenTrouser.getBasePrice(), chosenTrouser.getChosenType()));
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).addToTotalCost(chosenTrouser.getBasePrice());
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).calculateOptionCost();								for(int i = 0; i < 4; i++) {
			        			if(chosenTrouser.getName().equals(trouserArr.get(i).getName())) {
			        				int numStockNow = ( trouserArr.get(i).getStockAmount() ) - 1;
			        				trouserArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Outerwear")) {
							chosenOuterwear.setChosenType("junior tailored");
							chosenOuterwear.addToTotalCost(chosenOuterwear.getBasePrice());
							chosenOuterwear.calculateOptionCost();
							shoppingCartOuterwearArr.add(new Outerwear("image", chosenOuterwear.getName(), 1, chosenOuterwear.getDescription(), 
									chosenOuterwear.getBasePrice(), chosenOuterwear.getChosenType()));
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).addToTotalCost(chosenOuterwear.getBasePrice());
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).calculateOptionCost();								for(int i = 0; i < 4; i++) {
			        			if(chosenOuterwear.getName().equals(outerwearArr.get(i).getName())) {
			        				int numStockNow = ( outerwearArr.get(i).getStockAmount() ) - 1;
			        				outerwearArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						}
					
					}
					
					// Type 3 chosen
					
					else if (viewingProductType3.isSelected()) {
						if(specificCategoryTitle.getText().equals("Hats")) {
							chosenHat.setChosenType("handmade");
							chosenHat.addToTotalCost(chosenHat.getBasePrice());
							chosenHat.calculateOptionCost();
							shoppingCartHatArr.add(new Hats("image", chosenHat.getName(), 1, chosenHat.getDescription(), 
									chosenHat.getBasePrice(), chosenHat.getChosenType()));
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).addToTotalCost(chosenHat.getBasePrice());
							shoppingCartHatArr.get(shoppingCartHatArr.size()-1).calculateOptionCost();							for(int i = 0; i < 4; i++) {
			        			if(chosenHat.getName().equals(hatArr.get(i).getName())) {
			        				int numStockNow = ( hatArr.get(i).getStockAmount() ) - 1;
			        				hatArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Shirts")) {
							chosenShirt.setChosenType("silk");
							chosenShirt.addToTotalCost(chosenShirt.getBasePrice());
							chosenShirt.calculateOptionCost();
							shoppingCartShirtArr.add(new Shirt("image", chosenShirt.getName(), 1, chosenShirt.getDescription(), 
									chosenShirt.getBasePrice(), chosenShirt.getChosenType()));
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).addToTotalCost(chosenShirt.getBasePrice());
							shoppingCartShirtArr.get(shoppingCartShirtArr.size()-1).calculateOptionCost();									for(int i = 0; i < 4; i++) {
			        			if(chosenShirt.getName().equals(shirtArr.get(i).getName())) {
			        				int numStockNow = ( shirtArr.get(i).getStockAmount() ) - 1;
			        				shirtArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Trousers")) {
							chosenTrouser.setChosenType("refined denim");
							chosenTrouser.addToTotalCost(chosenTrouser.getBasePrice());
							chosenTrouser.calculateOptionCost();
							shoppingCartTrouserArr.add(new Trousers("image", chosenTrouser.getName(), 1, chosenTrouser.getDescription(), 
									chosenTrouser.getBasePrice(), chosenTrouser.getChosenType()));
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).addToTotalCost(chosenTrouser.getBasePrice());
							shoppingCartTrouserArr.get(shoppingCartTrouserArr.size()-1).calculateOptionCost();								for(int i = 0; i < 4; i++) {
			        			if(chosenTrouser.getName().equals(trouserArr.get(i).getName())) {
			        				int numStockNow = ( trouserArr.get(i).getStockAmount() ) - 1;
			        				trouserArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						} else if(specificCategoryTitle.getText().equals("Outerwear")) {
							chosenOuterwear.setChosenType("senior tailored");
							chosenOuterwear.addToTotalCost(chosenOuterwear.getBasePrice());
							chosenOuterwear.calculateOptionCost();
							shoppingCartOuterwearArr.add(new Outerwear("image", chosenOuterwear.getName(), 1, chosenOuterwear.getDescription(), 
									chosenOuterwear.getBasePrice(), chosenOuterwear.getChosenType()));
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).addToTotalCost(chosenOuterwear.getBasePrice());
							shoppingCartOuterwearArr.get(shoppingCartOuterwearArr.size()-1).calculateOptionCost();								for(int i = 0; i < 4; i++) {
			        			if(chosenOuterwear.getName().equals(outerwearArr.get(i).getName())) {
			        				int numStockNow = ( outerwearArr.get(i).getStockAmount() ) - 1;
			        				outerwearArr.get(i).setStockAmount(numStockNow);
			        				viewingProductStock.setText("Stock left: " + String.valueOf(numStockNow));
			        		        JOptionPane.showMessageDialog(null, "You have succesfully added the product to your shopping cart!");
			        				break;
			        			}
			        		}
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "Sorry, but there is no stock left for this product."
							, "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		
		
		// SHOPPING CART
		shoppingCartBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(1);
			}
		});
		
		// Clear shopping cart
		shoppingCartClearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// To clear everything visually
				while (shoppingCartModel.getRowCount() > 0) {
		            shoppingCartModel.removeRow(0);
		        }
				
				// Clear all Shopping Cart Arrays & Return all Stock (Hat)
				for(int i = 0; i < shoppingCartHatArr.size(); i++) {
					for(int j = 0; j < hatArr.size(); j++) {
						if(shoppingCartHatArr.get(i).getName().equals(hatArr.get(j).getName())) {
							hatArr.get(j).setStockAmount(hatArr.get(j).getStockAmount() + 1);
							break;
						}
					}
				}
				
				shoppingCartHatArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Return all Stock (Shirt)
				for(int i = 0; i < shoppingCartShirtArr.size(); i++) {
					for(int j = 0; j < shirtArr.size(); j++) {
						if(shoppingCartShirtArr.get(i).getName().equals(shirtArr.get(j).getName())) {
							shirtArr.get(j).setStockAmount(shirtArr.get(j).getStockAmount() + 1);
							break;
						}
					}
				}
				
				shoppingCartShirtArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Return all Stock (Trouser)
				for(int i = 0; i < shoppingCartTrouserArr.size(); i++) {
					for(int j = 0; j < trouserArr.size(); j++) {
						if(shoppingCartTrouserArr.get(i).getName().equals(trouserArr.get(j).getName())) {
							trouserArr.get(j).setStockAmount(trouserArr.get(j).getStockAmount() + 1);
							break;
						}
					}
				}
				
				shoppingCartTrouserArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Return all Stock (Outerwear)
				for(int i = 0; i < shoppingCartOuterwearArr.size(); i++) {
					for(int j = 0; j < outerwearArr.size(); j++) {
						if(shoppingCartOuterwearArr.get(i).getName().equals(outerwearArr.get(j).getName())) {
							outerwearArr.get(j).setStockAmount(outerwearArr.get(j).getStockAmount() + 1);
							break;
						}
					}
				}
				
				
				shoppingCartOuterwearArr.clear();
				
				shoppingCartTotal.setText("Total: $0");
				
				if(!shoppingCartTotal.getText().equals("Total: $0")) {
			        JOptionPane.showMessageDialog(null, "You have cleared your shopping cart.");
				} else {
					
				}			
				
			}
		});
		
		// Confirm Purchase in Shopping Cart Tab
		shoppingCartConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// To clear everything
				while (shoppingCartModel.getRowCount() > 0) {
		            shoppingCartModel.removeRow(0);
		        }
				
				// Clear all Shopping Cart Arrays & Add purchased item to boughtArr (depending on respective category)
				for(int i = 0; i < shoppingCartHatArr.size(); i++) {
					boughtHatArr.add(shoppingCartHatArr.get(i));
				}
				
				shoppingCartHatArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Add purchased item to boughtArr (depending on respective category)
				for(int i = 0; i < shoppingCartShirtArr.size(); i++) {
					boughtShirtArr.add(shoppingCartShirtArr.get(i));
				}
				
				shoppingCartShirtArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Add purchased item to boughtArr (depending on respective category)
				for(int i = 0; i < shoppingCartTrouserArr.size(); i++) {
					boughtTrouserArr.add(shoppingCartTrouserArr.get(i));
				}
				
				shoppingCartTrouserArr.clear();
				
				
				// Clear all Shopping Cart Arrays & Add purchased item to boughtArr (depending on respective category)
				for(int i = 0; i < shoppingCartOuterwearArr.size(); i++) {
					boughtOuterwearArr.add(shoppingCartOuterwearArr.get(i));
				}
				
				shoppingCartOuterwearArr.clear();
				
				if(!shoppingCartTotal.getText().equals("Total: $0")) {
			        JOptionPane.showMessageDialog(null, "Thank you for your purchase!");
				} else {
			        JOptionPane.showMessageDialog(null, "You haven't added anything to your cart.");
				}
								
				shoppingCartTotal.setText("Total: $0");
								
			}
		});
		
		
		///
		
		
		// Shopping Cart BTNS
		
		// Go to shopping cart tab (3 buttons, exact same code)
		shoppingCartBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(4);
				int totalPrice = 0;
				
				// To clear everything
				while (shoppingCartModel.getRowCount() > 0) {
		            shoppingCartModel.removeRow(0);
		        }
							
				// To fill the table
				for(int i = 0; i < shoppingCartHatArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Hat", shoppingCartHatArr.get(i).getName(),
							shoppingCartHatArr.get(i).getChosenType(), shoppingCartHatArr.get(i).getTotalCost()});
					totalPrice += shoppingCartHatArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartShirtArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Shirt", shoppingCartShirtArr.get(i).getName(),
							shoppingCartShirtArr.get(i).getChosenType(), shoppingCartShirtArr.get(i).getTotalCost()});
					totalPrice += shoppingCartShirtArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartTrouserArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Trouser", shoppingCartTrouserArr.get(i).getName(),
							shoppingCartTrouserArr.get(i).getChosenType(), shoppingCartTrouserArr.get(i).getTotalCost()});
					totalPrice += shoppingCartTrouserArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartOuterwearArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Outerwear", shoppingCartOuterwearArr.get(i).getName(),
							shoppingCartOuterwearArr.get(i).getChosenType(), shoppingCartOuterwearArr.get(i).getTotalCost()});
					totalPrice += shoppingCartOuterwearArr.get(i).getTotalCost();
				}
				
				// To set the total price
				shoppingCartTotal.setText("Total: $" + totalPrice);
				
			}
		});
		
		shoppingCartBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(4);
				
				int totalPrice = 0;
				
				// To clear everything
				while (shoppingCartModel.getRowCount() > 0) {
		            shoppingCartModel.removeRow(0);
		        }
							
				// To fill the table
				for(int i = 0; i < shoppingCartHatArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Hat", shoppingCartHatArr.get(i).getName(),
							shoppingCartHatArr.get(i).getChosenType(), shoppingCartHatArr.get(i).getTotalCost()});
					totalPrice += shoppingCartHatArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartShirtArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Shirt", shoppingCartShirtArr.get(i).getName(),
							shoppingCartShirtArr.get(i).getChosenType(), shoppingCartShirtArr.get(i).getTotalCost()});
					totalPrice += shoppingCartShirtArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartTrouserArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Trouser", shoppingCartTrouserArr.get(i).getName(),
							shoppingCartTrouserArr.get(i).getChosenType(), shoppingCartTrouserArr.get(i).getTotalCost()});
					totalPrice += shoppingCartTrouserArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartOuterwearArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Outerwear", shoppingCartOuterwearArr.get(i).getName(),
							shoppingCartOuterwearArr.get(i).getChosenType(), shoppingCartOuterwearArr.get(i).getTotalCost()});
					totalPrice += shoppingCartOuterwearArr.get(i).getTotalCost();
				}
				
				// To set the total price
				shoppingCartTotal.setText("Total: $" + totalPrice);
				
			}
		});
		
		shoppingCartBtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(4);
				
				int totalPrice = 0;
				
				// To clear everything
				while (shoppingCartModel.getRowCount() > 0) {
		            shoppingCartModel.removeRow(0);
		        }
							
				// To fill the table
				for(int i = 0; i < shoppingCartHatArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Hat", shoppingCartHatArr.get(i).getName(),
							shoppingCartHatArr.get(i).getChosenType(), shoppingCartHatArr.get(i).getTotalCost()});
					totalPrice += shoppingCartHatArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartShirtArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Shirt", shoppingCartShirtArr.get(i).getName(),
							shoppingCartShirtArr.get(i).getChosenType(), shoppingCartShirtArr.get(i).getTotalCost()});
					totalPrice += shoppingCartShirtArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartTrouserArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Trouser", shoppingCartTrouserArr.get(i).getName(),
							shoppingCartTrouserArr.get(i).getChosenType(), shoppingCartTrouserArr.get(i).getTotalCost()});
					totalPrice += shoppingCartTrouserArr.get(i).getTotalCost();
				}
				for(int i = 0; i < shoppingCartOuterwearArr.size(); i++) {
					shoppingCartModel.addRow(new Object[] {"Outerwear", shoppingCartOuterwearArr.get(i).getName(),
							shoppingCartOuterwearArr.get(i).getChosenType(), shoppingCartOuterwearArr.get(i).getTotalCost()});
					totalPrice += shoppingCartOuterwearArr.get(i).getTotalCost();
				}
				
				// To set the total price
				shoppingCartTotal.setText("Total: $" + totalPrice);
				
			}
		});
		
		
		///

		
		
		
		
		
		/*
		 * MANAGER
		 */
		
		
		
		
		
		
		
		// MANAGER LOGIN FUNCTIONALITY
		managerLoginBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(0);
			}
		});
		
		// Login Functionality (Account preset above)
		managerLoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if(managerLoginUserIdTF.getText().equals(manager1.getUsername()) && 
							managerLoginPasswordTF.getText().equals(manager1.getPassword())) {
						tabPanel.setSelectedIndex(5);
						managerLoginUserIdTF.setText("");
						managerLoginPasswordTF.setText("");
					}else {
						throw new managerLoginException();
					}
				}catch(managerLoginException managerLoginException) {
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password"
							, "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		// MANAGER TAB FUNCTIONALITY
		managerIntroBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(0);
			}
		});
		
		
		
		// Go to check sales tab
		managerCheckSalesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(8);
				
				int totalRevenue = 0;
				
				// To clear everything
				while (historySalesModel.getRowCount() > 0) {
		            historySalesModel.removeRow(0);
		        }
							
				// To fill the table (4 times)
				for(int i = 0; i < boughtHatArr.size(); i++) {
					historySalesModel.addRow(new Object[] {"Hat", boughtHatArr.get(i).getName(),
							boughtHatArr.get(i).getChosenType(), boughtHatArr.get(i).getTotalCost()});
					totalRevenue += boughtHatArr.get(i).getTotalCost();
				}
				for(int i = 0; i < boughtShirtArr.size(); i++) {
					historySalesModel.addRow(new Object[] {"Shirt", boughtShirtArr.get(i).getName(),
							boughtShirtArr.get(i).getChosenType(), boughtShirtArr.get(i).getTotalCost()});
					totalRevenue += boughtShirtArr.get(i).getTotalCost();
				}
				for(int i = 0; i < boughtTrouserArr.size(); i++) {
					historySalesModel.addRow(new Object[] {"Trouser", boughtTrouserArr.get(i).getName(),
							boughtTrouserArr.get(i).getChosenType(), boughtTrouserArr.get(i).getTotalCost()});
					totalRevenue += boughtTrouserArr.get(i).getTotalCost();
				}
				for(int i = 0; i < boughtOuterwearArr.size(); i++) {
					historySalesModel.addRow(new Object[] {"Outerwear", boughtOuterwearArr.get(i).getName(),
							boughtOuterwearArr.get(i).getChosenType(), boughtOuterwearArr.get(i).getTotalCost()});
					totalRevenue += boughtOuterwearArr.get(i).getTotalCost();
				}
			
				managerSalesHistoryBottomRevenue.setText("Total Revenue: $" + String.valueOf(totalRevenue));
			}
		});
		
		// EXPORT SALES BUTTON
		managerSalesHistoryExportBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// If there is nothing, then cannot export
				if(boughtHatArr.size() == 0 && boughtShirtArr.size() == 0 && boughtTrouserArr.size() == 0 && boughtOuterwearArr.size() == 0) {
					JOptionPane.showMessageDialog(null, "You cannot export if there is nothing."
							, "Error Message", JOptionPane.ERROR_MESSAGE);	
				}else {
					// Write every single purchase done (boughtHatArr receives the purchases after confirm purchase from shopping cart tab)
					try (BufferedWriter writer = new BufferedWriter(new FileWriter("SalesHistory.txt"))) {
						
						for(int i = 0; i < boughtHatArr.size(); i++) {
							writer.write("Hats | " + boughtHatArr.get(i).getName() + " | " + boughtHatArr.get(i).getChosenType() + " | " + boughtHatArr.get(i).getTotalCost());
							writer.newLine();
						}
						for(int i = 0; i < boughtShirtArr.size(); i++) {
							writer.write("Shirts | " + boughtShirtArr.get(i).getName() + " | " + boughtShirtArr.get(i).getChosenType() + " | " + boughtShirtArr.get(i).getTotalCost());
							writer.newLine();
						}
						for(int i = 0; i < boughtTrouserArr.size(); i++) {
							writer.write("Trouser | " + boughtTrouserArr.get(i).getName() + " | " + boughtTrouserArr.get(i).getChosenType() + " | " + boughtTrouserArr.get(i).getTotalCost());
							writer.newLine();
						}
						for(int i = 0; i < boughtOuterwearArr.size(); i++) {
							writer.write("Outerwear | " + boughtOuterwearArr.get(i).getName() + " | " + boughtOuterwearArr.get(i).getChosenType() + " | " + boughtOuterwearArr.get(i).getTotalCost());
							writer.newLine();
						}
						
						writer.write(managerSalesHistoryBottomRevenue.getText());
						
						JOptionPane.showMessageDialog(null, "You have successfully exported the sales history to SalesHistory.txt");
					} catch (IOException ioe) {
						JOptionPane.showMessageDialog(null, "Export failed."
								, "Error Message", JOptionPane.ERROR_MESSAGE);		        
					}

				}
			}
		});

		
		
		// MANAGER EDIT SALES FUNCTIONALITY
		
		// Go to edit sales tab
				managerEditSalesBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tabPanel.setSelectedIndex(7);
						
						// Values on Combo Boxes, show
						if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
							editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Baseball cap", "Fedora", "Flat cap", "The Bautta"}));
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
							editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Casual Black", "Gray Grid", "Luxurious Golden Shay", "Blue Floo"}));
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
							editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"White Basque", "Blue Maple", "Maroon Elix", "Polymorphic Fling"}));
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
							editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Blending Puffer Jacket", "Biker Leather Jacket", "Trench Coat", "Quilted Vest"}));
						}
						
						
						// Values of price, show (4 times for each category)
						if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
							for(int i = 0; i < hatArr.size(); i++) {
			        			if(hatArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
			        				changePriceTF.setText(String.valueOf(hatArr.get(i).getBasePrice()));
			        				currentStockManagerEdit.setText("Stock: " + String.valueOf(hatArr.get(i).getStockAmount()));

			        			}
			        		}
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
							for(int i = 0; i < trouserArr.size(); i++) {
			        			if(trouserArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
			        				changePriceTF.setText(String.valueOf(trouserArr.get(i).getBasePrice()));
			        				currentStockManagerEdit.setText("Stock: " + String.valueOf(trouserArr.get(i).getStockAmount()));

			        			}
			        		}
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
							for(int i = 0; i < shirtArr.size(); i++) {
			        			if(shirtArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
			        				changePriceTF.setText(String.valueOf(shirtArr.get(i).getBasePrice()));
			        				currentStockManagerEdit.setText("Stock: " + String.valueOf(shirtArr.get(i).getStockAmount()));

			        			}
			        		}
						}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
							for(int i = 0; i < outerwearArr.size(); i++) {
			        			if(outerwearArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
			        				changePriceTF.setText(String.valueOf(outerwearArr.get(i).getBasePrice()));
			        				currentStockManagerEdit.setText("Stock: " + String.valueOf(outerwearArr.get(i).getStockAmount()));

			        			}
			        		}
						}
					}
				});
				
		managerEditAProductBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(5);
			}
		});
		
		// When Combo Box of Category is changed, update the UI
		editAProductCategoryCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Value on Combo Box
				if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
					editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Baseball cap", "Fedora", "Flat cap", "The Bautta"}));
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
					editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Casual Black", "Gray Grid", "Luxurious Golden Shay", "Blue Floo"}));
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
					editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"White Basque", "Blue Maple", "Maroon Elix", "Polymorphic Fling"}));
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
					editAProductNameCombo.setModel(new DefaultComboBoxModel(new String[] {"Blending Puffer Jacket", "Biker Leather Jacket", "Trench Coat", "Quilted Vest"}));
				}
				
				// Price and Stock
				if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
					for(int i = 0; i < hatArr.size(); i++) {
	        			if(hatArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(hatArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(hatArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
					for(int i = 0; i < trouserArr.size(); i++) {
	        			if(trouserArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(trouserArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(trouserArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
					for(int i = 0; i < shirtArr.size(); i++) {
	        			if(shirtArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(shirtArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(shirtArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
					for(int i = 0; i < outerwearArr.size(); i++) {
	        			if(outerwearArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(outerwearArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(outerwearArr.get(i).getStockAmount()));
	        			}
	        		}
				}				
			}
		});		
		
		// When name changes, update the UI
		editAProductNameCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Price and Stock
				if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
					for(int i = 0; i < hatArr.size(); i++) {
	        			if(hatArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(hatArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(hatArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
					for(int i = 0; i < trouserArr.size(); i++) {
	        			if(trouserArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(trouserArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(trouserArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
					for(int i = 0; i < shirtArr.size(); i++) {
	        			if(shirtArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(shirtArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(shirtArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
					for(int i = 0; i < outerwearArr.size(); i++) {
	        			if(outerwearArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				changePriceTF.setText(String.valueOf(outerwearArr.get(i).getBasePrice()));
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(outerwearArr.get(i).getStockAmount()));
	        			}
	        		}
				}
								
			}
		});
		
		// When add stock is pressed, add 1 stock to the database (the respective categories' array)
		addStockManagerEditBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
					for(int i = 0; i < hatArr.size(); i++) {
	        			if(hatArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				hatArr.get(i).setStockAmount(hatArr.get(i).getStockAmount()+1);
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(hatArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
					for(int i = 0; i < trouserArr.size(); i++) {
	        			if(trouserArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				trouserArr.get(i).setStockAmount(trouserArr.get(i).getStockAmount()+1);
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(trouserArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
					for(int i = 0; i < shirtArr.size(); i++) {
	        			if(shirtArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				shirtArr.get(i).setStockAmount(shirtArr.get(i).getStockAmount()+1);
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(shirtArr.get(i).getStockAmount()));
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
					for(int i = 0; i < outerwearArr.size(); i++) {
	        			if(outerwearArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				outerwearArr.get(i).setStockAmount(outerwearArr.get(i).getStockAmount()+1);
	        				currentStockManagerEdit.setText("Stock: " + String.valueOf(outerwearArr.get(i).getStockAmount()));
	        			}
	        		}
				}
			}
		});
		
		// When change price button is pressed, set new price to the product (error checking if not num)
		changePriceManagerEditBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Price
				if(editAProductCategoryCombo.getSelectedItem().equals("Hats")) {
					for(int i = 0; i < hatArr.size(); i++) {
	        			if(hatArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				
	        				try {
	    		    			Double.parseDouble(changePriceTF.getText());
	    		    			hatArr.get(i).setBasePrice(Integer.parseInt(changePriceTF.getText()));
		        		        JOptionPane.showMessageDialog(null, "You have successfully edited the product's price");
	        				} catch(NumberFormatException nfe) {
	        					JOptionPane.showMessageDialog(null, "Please only input a number for the price"
	        							, "Error Message", JOptionPane.ERROR_MESSAGE);
	        				}
	        				
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Trousers")) {
					for(int i = 0; i < trouserArr.size(); i++) {
	        			if(trouserArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				try {
	    		    			Double.parseDouble(changePriceTF.getText());
	    		    			trouserArr.get(i).setBasePrice(Integer.parseInt(changePriceTF.getText()));
		        		        JOptionPane.showMessageDialog(null, "You have successfully edited the product's price");
	        				} catch(NumberFormatException nfe) {
	        					JOptionPane.showMessageDialog(null, "Please only input a number for the price"
	        							, "Error Message", JOptionPane.ERROR_MESSAGE);
	        				}	        			
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Shirts")) {
					for(int i = 0; i < shirtArr.size(); i++) {
	        			if(shirtArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				
	        				try {
	    		    			Double.parseDouble(changePriceTF.getText());
	    		    			shirtArr.get(i).setBasePrice(Integer.parseInt(changePriceTF.getText()));
		        		        JOptionPane.showMessageDialog(null, "You have successfully edited the product's price");
	        				} catch(NumberFormatException nfe) {
	        					JOptionPane.showMessageDialog(null, "Please only input a number for the price"
	        							, "Error Message", JOptionPane.ERROR_MESSAGE);
	        				}
	        				
	        			}
	        		}
				}else if(editAProductCategoryCombo.getSelectedItem().equals("Outerwear")) {
					for(int i = 0; i < outerwearArr.size(); i++) {
	        			if(outerwearArr.get(i).getName().equals(editAProductNameCombo.getSelectedItem())) {
	        				
	        				try {
	    		    			Double.parseDouble(changePriceTF.getText());
	    		    			outerwearArr.get(i).setBasePrice(Integer.parseInt(changePriceTF.getText()));
		        		        JOptionPane.showMessageDialog(null, "You have successfully edited the product's price");
	        				} catch(NumberFormatException nfe) {
	        					JOptionPane.showMessageDialog(null, "Please only input a number for the price"
	        							, "Error Message", JOptionPane.ERROR_MESSAGE);
	        				}
	        				
	        			}
	        		}
				}
			}
		});
		
		managerSalesHistoryBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabPanel.setSelectedIndex(5);
				
				
			}
		});
		

		
	}
	
	
	public static void main(String[] args) {
		Main ui = new Main();
		ui.setVisible(true);
		
	}
}



// Custom Error Exceptions
class managerLoginException extends Exception { 
    public managerLoginException() {

    }
}				









