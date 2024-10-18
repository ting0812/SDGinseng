 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
  public class storeFrame extends JFrame implements ActionListener{
		public static final int WIDTH =1200; 
		public static final int HEIGHT = 600;
		public JPanel attackCardPanel;//上方放置攻擊卡的panel
		public JPanel defenseCardPanel;//下方放置防禦卡的panel
		public JButton attackCard_1;
		public JButton attackCard_2;
		public JButton attackCard_3;
		public JButton attackCard_4;
		public JButton attackCard_5;
		public JButton attackCard_6;
		public JTextField textField;
		public String cardcost;
		public String havemoney;
		public Card C[] = gamepage.C;

		
		// public static gamepage gamepage ;
  	  /*public static void main(String[] args){
  	  	  storeFrame gui =new storeFrame();
  	  	  gui.setVisible(true);
		}*/
		private class poorWindow extends JFrame implements ActionListener
		{
			public poorWindow()
			{
				super("Drawing card point");
				setSize(600, 500);
				getContentPane().setBackground(Color.lightGray);
				setLayout(new BorderLayout());
				JLabel tipsLabel = new JLabel("your money is not enough, Poor man...");
				tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
				add(tipsLabel, BorderLayout.CENTER);
				JPanel buttonPanel = new JPanel();
				buttonPanel.setBackground(Color.lightGray);
				buttonPanel.setLayout(new FlowLayout());
				JButton tipsButton = new JButton("I got it");
				tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
				tipsButton.addActionListener(this);
				buttonPanel.add(tipsButton);
				add(buttonPanel, BorderLayout.SOUTH);
			}
			public void actionPerformed(ActionEvent e)
			{
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("I got it"))
				dispose(); 
			}
	
		}
		private class tipsWindow extends JFrame implements ActionListener
		{
			private int num;
			private JFrame f;

			public tipsWindow(int num)
			{
				super("Buying card point");
				this.num = num;
				setSize(500, 400);
				getContentPane().setBackground(Color.lightGray);
				
				setLayout(new BorderLayout());
				JLabel tipsLabel = new JLabel("Are you sure you want to buy it?");
				tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
				add(tipsLabel, BorderLayout.CENTER);
				JPanel buttonPanel = new JPanel();
				buttonPanel.setBackground(Color.lightGray);
				buttonPanel.setLayout(new FlowLayout());
				JButton sureButton = new JButton("sure");
				sureButton.setFont(new Font("Calibri",Font.BOLD,20));
				sureButton.addActionListener(this);
				buttonPanel.add(sureButton);
				JButton noneButton = new JButton("No");
				noneButton.setFont(new Font("Calibri",Font.BOLD,20));
				noneButton.addActionListener(this);
				buttonPanel.add(noneButton);
				add(buttonPanel, BorderLayout.SOUTH);
				f=new JFrame("JOptionPane Test");
			}
			public void actionPerformed(ActionEvent e)
			{
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("sure"))
			{
				if(Integer.valueOf(havemoney) >= Integer.valueOf(cardcost))
				{
					if(num==1)
					{
						C[101] = new Card(7,101);
						gamepage.handCard.add(0,C[101]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==2)
					{
						C[102] = new Card(8,102);
						gamepage.handCard.add(0,C[102]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==3)
					{
						C[103] = new Card(9,103);
						gamepage.handCard.add(0,C[103]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==4)
					{
						C[104] = new Card(10,104);
						gamepage.handCard.add(0,C[104]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==5)
					{
						C[105] = new Card(11,105);
						gamepage.handCard.add(0,C[105]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==6)
					{
						C[106] = new Card(12,106);
						gamepage.handCard.add(0,C[106]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==7)
					{
						C[201] = new Card(13,201);
						gamepage.handCard.add(0,C[201]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==8)
					{
						C[202] = new Card(14,202);
						gamepage.handCard.add(0,C[202]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==9)
					{
						C[203] = new Card(15,203);
						gamepage.handCard.add(0,C[203]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
					if(num==10)
					{
						C[204] = new Card(16,204);
						gamepage.handCard.add(0,C[204]);
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						gamepage.textField.setText(Integer.toString(Integer.valueOf(gamepage.textField.getText())-2));
						havemoney = Integer.toString(Integer.valueOf(havemoney)-2);
						gamepage.handCardPanel.repaintHandCardPanel();
					}
	
					dispose();
				}
				else
				{
					// poorWindow poor = new poorWindow();
					// poor.setVisible(true);
					JOptionPane.showMessageDialog(f,"You do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					dispose();
				}

			}
			else if(actionCommand.equals("No"))
				dispose(); 
			}
	
		}

  	  public storeFrame(String nowMoney){
			  super("Store");
  	  	  	setSize(WIDTH,HEIGHT);
			  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			  this.cardcost = "2";
			  havemoney = nowMoney;
			//   this.gamepage = gamepage;
  	  	  setLayout(new GridLayout(2, 1));//把整個JFrame切成兩??panel
  	  	  
  	  	  //****upContentPanel--attackCard****//
  	  	  JPanel upContentPanel= new JPanel();//上面的panel
  	  	  upContentPanel.setLayout(new BorderLayout());
  	  	  attackCardPanel = new JPanel();//擺放卡片的panel
  	  	  attackCardPanel.setBackground(new Color(100,100,150));
  	  	  ImageIcon attack_icon_1 = new ImageIcon("Store/attack1.jpg");
  	  	  ImageIcon attack_icon_2 = new ImageIcon("Store/attack2.jpg");
  	  	  ImageIcon attack_icon_3 = new ImageIcon("Store/attack3.jpg");
  	  	  ImageIcon attack_icon_4 = new ImageIcon("Store/attack4.jpg");
  	  	  ImageIcon attack_icon_5 = new ImageIcon("Store/attack5.jpg");
  	  	  ImageIcon attack_icon_6 = new ImageIcon("Store/attack6.jpg");
  	  	  attackCard_1 = new JButton(attack_icon_1);
  	  	  attackCard_1.addActionListener(new ActionListener(){ 
  	  	  	  public void actionPerformed(ActionEvent e) {
				tipsWindow tips = new tipsWindow(1);
				tips.setVisible(true);
			   }
			});
  	
  	  	 /* Image icontemp_1 = icon_1.getImage().getScaledInstance(attackCard_1.getWidth(0),
				attackCard_1.getHeight(0), icon_1.getImage().SCALE_DEFAULT);
		  icon_1 = new ImageIcon(icontemp_1);*/
  
  	  	  //JButton attackCard_1 = new JButton();
  	  	  //attackCard_1.setPreferredSize(new Dimension(icon_1.getIconWidth(), icon_1.getIconHeight()));
			  attackCard_2 = new JButton(attack_icon_2);
			  attackCard_2.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
				tipsWindow tips = new tipsWindow(2);
				tips.setVisible(true);
		   }
		});
			  attackCard_3 = new JButton(attack_icon_3);
			  attackCard_3.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
					tipsWindow tips = new tipsWindow(3);
					tips.setVisible(true);
		   }
		});
			  attackCard_4 = new JButton(attack_icon_4);
			  attackCard_4.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
					tipsWindow tips = new tipsWindow(4);
					tips.setVisible(true);
		   }
		});
			  attackCard_5 = new JButton(attack_icon_5);
			  attackCard_5.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
					tipsWindow tips = new tipsWindow(5);
					tips.setVisible(true);
		   }
		});
			  attackCard_6 = new JButton(attack_icon_6);
			  attackCard_6.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
					tipsWindow tips = new tipsWindow(6);
					tips.setVisible(true);
		   }
		});
  	  	  attackCardPanel.setLayout(new GridLayout(1,6,10,5));//切成1,6(後面兩??數字為component之間水平跟垂直的距離GridLayout(int rows, int cols, int hgap, int vgap))
  	  	  attackCardPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));//上左下右(component跟container的距雄1?7)
  	  	  attackCardPanel.add(attackCard_1);
  	  	  attackCardPanel.add(attackCard_2);
  	  	  attackCardPanel.add(attackCard_3);
  	  	  attackCardPanel.add(attackCard_4);
  	  	  attackCardPanel.add(attackCard_5);
  	  	  attackCardPanel.add(attackCard_6);
  	  	  upContentPanel.add(attackCardPanel,BorderLayout.CENTER);//將attackCardPanel加到upContentPanel內，並設在中?1?7
  	  	  JPanel upEmptyPanel_1= new JPanel();//為了製??attackCardPanel右邊空隙而建的panel(EAST),讓upContentPanel呈現出來
  	  	  JPanel upEmptyPanel_2= new JPanel();//為了製??attackCardPanel左邊空隙而建的panel(WEST),讓upContentPanel呈現出來
  	  	  upContentPanel.add(upEmptyPanel_1,BorderLayout.EAST);
  	  	  upContentPanel.add(upEmptyPanel_2,BorderLayout.WEST);
  	  	  add(upContentPanel);//將upContentPanel加到JFrame?1?7
  	  	  
  	  	   //****downContentPanel--defenseCard****//
  	  	   JPanel downContentPanel= new JPanel();//下面的panel
  	  	  downContentPanel.setLayout(new BorderLayout());
  	  	  defenseCardPanel= new JPanel();//擺放卡片的panel
  	  	  defenseCardPanel.setBackground(new Color(100,100,150));
  	  	  ImageIcon defense_icon_1 = new ImageIcon("Store/defense1.jpg");
  	  	  ImageIcon defense_icon_2 = new ImageIcon("Store/defense2.jpg");
  	  	  ImageIcon defense_icon_3 = new ImageIcon("Store/defense3.jpg");
  	  	  ImageIcon defense_icon_4 = new ImageIcon("Store/defense4.jpg");
			  JButton defenseCard_1 = new JButton(defense_icon_1);
			  defenseCard_1.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
			tipsWindow tips = new tipsWindow(7);
			tips.setVisible(true);
		   }
		});
			  JButton defenseCard_2 = new JButton(defense_icon_2);
			  defenseCard_2.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
			tipsWindow tips = new tipsWindow(8);
			tips.setVisible(true);
		   }
		});
			  JButton defenseCard_3 = new JButton(defense_icon_3);
			  defenseCard_3.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
			tipsWindow tips = new tipsWindow(9);
			tips.setVisible(true);
		   }
		});
			  JButton defenseCard_4 = new JButton(defense_icon_4);
			  defenseCard_4.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) {
			tipsWindow tips = new tipsWindow(10);
			tips.setVisible(true);
		   }
		});
  	  	  defenseCardPanel.setLayout(new GridLayout(1,5,10,5));//切成1,6(後面兩??數字為component之間水平跟垂直的距離GridLayout(int rows, int cols, int hgap, int vgap))
  	  	  defenseCardPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));//上左下右(component跟container的距雄1?7)
  	  	  defenseCardPanel.add(defenseCard_1);
  	  	  defenseCardPanel.add(defenseCard_2);
  	  	  defenseCardPanel.add(defenseCard_3);
			  defenseCardPanel.add(defenseCard_4);


			  JPanel moneyPanel = new JPanel();
			  moneyPanel.setOpaque(false);
			  JLabel moneyLabel = new JLabel();
			  Icon money=new ImageIcon("picture/money.png");
			  moneyLabel.setIcon(money);
			  moneyLabel.setPreferredSize(new Dimension(60,100));
			  moneyPanel.add(moneyLabel);

				  textField = new JTextField(nowMoney);
				//   textField = new JTextField(gamepage.getMoney());
				textField.setEditable(false);
				textField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
				textField.setOpaque(false);
				textField.setPreferredSize(new Dimension(450,100));
				textField.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
				
				moneyPanel.add(textField);

				textField.setColumns(2);
			  defenseCardPanel.add(moneyPanel);


  	  	  downContentPanel.add(defenseCardPanel,BorderLayout.CENTER);//將defenseCardPanel加到downContentPanel內，並設在中?1?7
  	  	  JPanel downEmptyPanel_1= new JPanel();//為了製??defenseCardPanel右邊空隙而建的panel(EAST)
  	  	 // JPanel downEmptyPanel_1_1= new JPanel();
  	  	  JPanel downEmptyPanel_2= new JPanel();//為了製??defenseCardPanel左邊空隙而建的panel(WEST)
  	  	 // JPanel downEmptyPanel_2_1= new JPanel();
  	  	  downContentPanel.add(downEmptyPanel_1,BorderLayout.EAST);
  	  	  //downContentPanel.add(downEmptyPanel_1_1,BorderLayout.EAST);
  	  	  downContentPanel.add(downEmptyPanel_2,BorderLayout.WEST);
  	  	  //downContentPanel.add(downEmptyPanel_2_1,BorderLayout.WEST);
  	  	  add(downContentPanel);//將downContentPanel加到JFrame?1?7
  	  }
  	  public void actionPerformed(ActionEvent e){
  	  	  
  	  }
  }
  	  