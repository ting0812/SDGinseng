import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.event.MenuListener;
import java.util.*;

public class gamepage extends JFrame{

	public static JLabel attack1Label;
	public static JLabel attack2Label;
	public static JLabel attack3Label;
	public static JLabel attack4Label;
	public static JLabel attack5Label;
	public static JLabel attack6Label;
	public static JLabel turnLabel;
	public static JLabel defense1Label;
	public static JLabel defense2Label;
	public static JLabel defense3Label;
	public static JLabel defense4Label;
	public static JLabel winLabel;
	public static JLabel loseLabel;
	public static computerturn computerturn;

	public tableCardPP tableCardPanel;
	public static handCardPP handCardPanel;
	public static JTextField textField;
	public JTextField textFieldOne;
	public JTextField textFieldThree;
	public JTextField textFieldFour;
	public JTextField textFieldtest ;
	private boolean draw;
	public static final int PAUSE1 = 1500;
	public static final int PAUSE2 = 3000;
	public static final int PAUSE3 = 2000;
	JLabel playeronemotion ;
	JLabel playertwomotion ;
	JLabel playerthreemotion ;
	public static ArrayList<Integer> match;
	public static ArrayList<Integer> removedCard;
	public static ArrayList<Card> handCard;
	public static ArrayList<Card> playerOneHandCard;
	public static ArrayList<Card> playerThreeHandCard;
	public static ArrayList<Card> playerFourHandCard;
	public static ArrayList<foodCard> tableCard;
	public static Card C[] = new Card[300];
	public foodCard F[] = new foodCard[100];
	private JFrame f;
	int run = 8;

	public gamepage() 
	{	
		handCard = new ArrayList<>();
		tableCard = new ArrayList<>();
		match = new ArrayList<>();
		removedCard = new ArrayList<>();

		playerOneHandCard = new ArrayList<>();
		playerThreeHandCard = new ArrayList<>();
		playerFourHandCard = new ArrayList<>();


		initialize();
	}

	//電腦玩家抽牌回合
	/******************************************************************************* */
    private class computerturn extends Thread {
	
		@Override
        public void run() {

			playerFourHandCard.add(C[run]);
			run += 1;
			System.out.print("player four：");
			for (Card card : playerFourHandCard) {
				System.out.print(card.getID()+" ");
			}
			System.out.println();
			playeronemotion.setText("Drawing card");
			playeronemotion.setForeground(Color.WHITE);
			playeronemotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playeronemotion);
			doNothing(PAUSE1);
			playeronemotion.setText("I am making card");
			Random random4 = new Random();
			Integer s = random4.nextInt(3);;
			textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())+s));			
			doNothing(PAUSE3);
			playeronemotion.setText("I am playing now");
			

			if(playerFourHandCard.contains(C[108]))
			{

				for(int i=0;i<handCard.size();i++){
					if(handCard.get(i).getNumber() == 13 |handCard.get(i).getNumber() == 15 |handCard.get(i).getNumber() == 16){
					int result = JOptionPane.showConfirmDialog(f,"player is use 偷工減料 attack you, do you want to defence?" ,"ERROR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
					if (result == JOptionPane.YES_OPTION){						
								handCard.remove(i);
								handCardPanel.repaintHandCardPanel();
								handCardPanel.repaint();
								removedCard.clear();
								match.clear();
								playerFourHandCard.remove(0);
								break;
							}
					else{
						if(Integer.valueOf(textField.getText()) >= 2)
							{
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						playerFourHandCard.remove(0);
							}
						else{
							for(int j=0;j<handCard.size();j++){
								if(handCard.get(j).getNumber() == 1 | handCard.get(j).getNumber() == 2 | handCard.get(j).getNumber() == 3 | handCard.get(j).getNumber() == 4 | handCard.get(j).getNumber() == 5 | handCard.get(j).getNumber() == 6){
									 
									handCard.remove(j--);
			
								}
							}
							playerFourHandCard.remove(0);
							handCardPanel.repaintHandCardPanel();
							handCardPanel.repaint();
							removedCard.clear();
								
							match.clear();
							}
						}

						}
						else if(handCard.get(i).getNumber() == 14){
							int result = JOptionPane.showConfirmDialog(f,"player is use 偷工減料 attack you, do you want to defence?" ,"ERROR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
							if (result == JOptionPane.YES_OPTION){	
							if(Integer.valueOf(textFieldFour.getText()) >= 2){
								textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-2));
								handCard.remove(i);
								handCardPanel.repaintHandCardPanel();
								playerFourHandCard.remove(0);
								handCardPanel.repaint();
								removedCard.clear();
								match.clear();
								break;
							}
							else{
								playerFourHandCard.remove(0);
								for(int j=0;j<playerFourHandCard.size();j++){
									if(playerFourHandCard.get(j).getNumber() == 1 | playerFourHandCard.get(j).getNumber() == 2 | playerFourHandCard.get(j).getNumber() == 3 | playerFourHandCard.get(j).getNumber() == 4 | playerFourHandCard.get(j).getNumber() == 5 | playerFourHandCard.get(j).getNumber() == 6){
										 
										playerFourHandCard.remove(j--);
				
									}
								}
								// playerFourHandCard.clear();
								handCard.remove(i);
								handCardPanel.repaintHandCardPanel();
								handCardPanel.repaint();
								removedCard.clear();
								match.clear();
							}
						}
							else{
								if(Integer.valueOf(textField.getText()) >= 2)
							{
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						playerFourHandCard.remove(0);
							}
						else{
							for(int j=0;j<handCard.size();j++){
								if(handCard.get(j).getNumber() == 1 | handCard.get(j).getNumber() == 2 | handCard.get(j).getNumber() == 3 | handCard.get(j).getNumber() == 4 | handCard.get(j).getNumber() == 5 | handCard.get(j).getNumber() == 6){
									 
									handCard.remove(j--);
			
								}
							}
							playerFourHandCard.remove(0);
							handCardPanel.repaintHandCardPanel();
							handCardPanel.repaint();
							removedCard.clear();
								
							match.clear();
							}
							}
						}
					
				}
				

			}
			doNothing(PAUSE2);
			if(Integer.valueOf(textFieldFour.getText())>=6)
			{
						loseLabel.setVisible(true);
						computerturn.interrupt();
			}
			playeronemotion.setText("End my round");
			doNothing(PAUSE1);
			playeronemotion.setText("");

			playerOneHandCard.add(C[run]);
			run += 1;
			System.out.print("player one：");
			for (Card card : playerOneHandCard) {
				System.out.print(card.getID()+" ");
			}
			System.out.println();
			playertwomotion.setText("Drawing card");
			playertwomotion.setForeground(Color.WHITE);
			playertwomotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playertwomotion);
			doNothing(PAUSE1);
			playertwomotion.setText("I am making card");
			Random random5 = new Random();
			Integer s1 = random5.nextInt(3);
			textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())+s1));		
			doNothing(PAUSE3);
			playertwomotion.setText("I am playing now");
			
			if(playerOneHandCard.contains(C[109])){
				JOptionPane.showMessageDialog(f,"player2 is use 扒手 attack player1" ,"Event",JOptionPane.INFORMATION_MESSAGE);
				for(int i=0;i<playerFourHandCard.size(); i++){
					if(playerFourHandCard.get(i).getNumber() == 13 |playerFourHandCard.get(i).getNumber() == 15 ){
						playerFourHandCard.remove(i);
						playerOneHandCard.remove(0);
						break;
					}
					else if(playerFourHandCard.get(i).getNumber() == 14){
						if(Integer.valueOf(textFieldOne.getText())>=2){
							textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-2));
							textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())+2));
							playerFourHandCard.remove(i);
							playerOneHandCard.remove(0);
							break;
						}
						else if(Integer.valueOf(textFieldOne.getText())==1){
							textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-1));
							textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())+2));
							playerFourHandCard.remove(i);
							playerOneHandCard.remove(0);
							break;
							
						}
						else{
							textFieldOne.setText("0");
							textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())+0));
							playerFourHandCard.remove(i);
							playerOneHandCard.remove(0);
							break;
						}
					}
					else{
						if(Integer.valueOf(textFieldFour.getText())>=2){
						textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-2));
						textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())+2));
						playerFourHandCard.remove(i);
						playerOneHandCard.remove(0);
						break;
						}
						else if(Integer.valueOf(textFieldFour.getText())==1){
							textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-1));
							textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())+2));
							playerFourHandCard.remove(i);
							playerOneHandCard.remove(0);
							break;
							
						}
						else{
							textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())+2));
						playerFourHandCard.remove(i);
						playerOneHandCard.remove(0);
						break;
						}
					}
			}
		}

			
			doNothing(PAUSE2);
			if(Integer.valueOf(textFieldOne.getText())>=6)
			{
						loseLabel.setVisible(true);
						computerturn.interrupt();
			}
			playertwomotion.setText("End my round");
			doNothing(PAUSE1);
			playertwomotion.setText("");

			playerThreeHandCard.add(C[run]);
			run += 1;
			System.out.print("player three：");
			for (Card card : playerThreeHandCard) {
				System.out.print(card.getID()+" ");
			}
			System.out.println();
			playerthreemotion.setText("Drawing card");
			playerthreemotion.setForeground(Color.WHITE);
			playerthreemotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playerthreemotion);
			doNothing(PAUSE1);
			playerthreemotion.setText("I am making card");
			Random random6 = new Random();
			Integer s2 = random6.nextInt(3);
			textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())+s2));
			doNothing(PAUSE3);
			playerthreemotion.setText("I am playing now");
			
			// if(playerThreeHandCard.contains(C[108]))
			// {

			// 	for(int i=0;i<handCard.size();i++){
			// 		if(handCard.get(i).getNumber() == 13 |handCard.get(i).getNumber() == 15 |handCard.get(i).getNumber() == 16){
			// 		int result = JOptionPane.showConfirmDialog(f,"player is use 偷工減料 attack you, do you want to defence?" ,"ERROR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			// 		if (result == JOptionPane.YES_OPTION){						
			// 					handCard.remove(i);
			// 					handCardPanel.repaintHandCardPanel();
			// 					handCardPanel.repaint();
			// 					removedCard.clear();
			// 					match.clear();
			// 					playerThreeHandCard.remove(0);
			// 					break;
			// 				}
			// 		else{
			// 			if(Integer.valueOf(textField.getText()) >= 2)
			// 				{
			// 			textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
			// 			playerThreeHandCard.remove(0);
			// 				}
			// 			else{
			// 				for(int j=0;j<handCard.size();j++){
			// 					if(handCard.get(j).getNumber() == 1 | handCard.get(j).getNumber() == 2 | handCard.get(j).getNumber() == 3 | handCard.get(j).getNumber() == 4 | handCard.get(j).getNumber() == 5 | handCard.get(j).getNumber() == 6){
									 
			// 						handCard.remove(j--);
			
			// 					}
			// 				}
			// 				playerThreeHandCard.remove(0);
			// 				handCardPanel.repaintHandCardPanel();
			// 				handCardPanel.repaint();
			// 				removedCard.clear();
								
			// 				match.clear();
			// 				}
			// 			}

			// 			}
			// 			else if(handCard.get(i).getNumber() == 14){
			// 				int result = JOptionPane.showConfirmDialog(f,"player is use 偷工減料 attack you, do you want to defence?" ,"ERROR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			// 				if (result == JOptionPane.YES_OPTION){	
			// 				if(Integer.valueOf(textFieldThree.getText()) >= 2){
			// 					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-2));
			// 					handCard.remove(i);
			// 					handCardPanel.repaintHandCardPanel();
			// 					playerThreeHandCard.remove(0);
			// 					handCardPanel.repaint();
			// 					removedCard.clear();
			// 					match.clear();
			// 					break;
			// 				}
			// 				else{
			// 					playerThreeHandCard.remove(0);
			// 					// playerFourHandCard.clear();
			// 					for(int j=0;j<playerThreeHandCard.size();j++){
			// 						if(playerThreeHandCard.get(j).getNumber() == 1 | playerThreeHandCard.get(j).getNumber() == 2 | playerThreeHandCard.get(j).getNumber() == 3 | playerThreeHandCard.get(j).getNumber() == 4 | playerThreeHandCard.get(j).getNumber() == 5 | playerThreeHandCard.get(j).getNumber() == 6){
										 
			// 							playerThreeHandCard.remove(j--);
				
			// 						}
			// 					}
			// 					handCard.remove(i);
			// 					handCardPanel.repaintHandCardPanel();
			// 					handCardPanel.repaint();
			// 					removedCard.clear();
			// 					match.clear();
			// 				}
			// 			}
			// 				else{
			// 					if(Integer.valueOf(textField.getText()) >= 2)
			// 				{
			// 			textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
			// 			playerThreeHandCard.remove(0);
			// 				}
			// 			else{
			// 				for(int j=0;j<handCard.size();j++){
			// 					if(handCard.get(j).getNumber() == 1 | handCard.get(j).getNumber() == 2 | handCard.get(j).getNumber() == 3 | handCard.get(j).getNumber() == 4 | handCard.get(j).getNumber() == 5 | handCard.get(j).getNumber() == 6){
									 
			// 						handCard.remove(j--);
			
			// 					}
			// 				}
			// 				playerThreeHandCard.remove(0);
			// 				handCardPanel.repaintHandCardPanel();
			// 				handCardPanel.repaint();
			// 				removedCard.clear();
								
			// 				match.clear();
			// 				}
			// 				}
			// 			}
			// 			else{
			// 				if(Integer.valueOf(textField.getText()) >= 2)
			// 				{
			// 			textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
			// 			playerThreeHandCard.remove(0);
			// 				}
			// 			else{
			// 				JOptionPane.showMessageDialog(f,"player is use 偷工減料 attack you" ,"Event",JOptionPane.INFORMATION_MESSAGE);
			// 				for(int j=0;j<handCard.size();j++){
			// 					if(handCard.get(j).getNumber() == 1 | handCard.get(j).getNumber() == 2 | handCard.get(j).getNumber() == 3 | handCard.get(j).getNumber() == 4 | handCard.get(j).getNumber() == 5 | handCard.get(j).getNumber() == 6){
									 
			// 						handCard.remove(j--);
			
			// 					}
			// 				}
			// 				playerThreeHandCard.remove(0);
			// 				handCardPanel.repaintHandCardPanel();
			// 				handCardPanel.repaint();
			// 				removedCard.clear();
								
			// 				match.clear();
			// 				}
			// 			}
					
			// 	}
				

			// }
			
			doNothing(PAUSE2);
			if(Integer.valueOf(textFieldThree.getText())>=6)
			{
						loseLabel.setVisible(true);
						computerturn.interrupt();
			}
			playerthreemotion.setText("End my round");
			doNothing(PAUSE1);
			playerthreemotion.setText("");
			draw = true;
			
			turnLabel.setVisible(true);
			doNothing(PAUSE3);
			turnLabel.setVisible(false);

			
		}
	}

	/******************************************************************************* */

	private class attack1Window extends JFrame implements ActionListener
	{
		private JFrame f;
		public attack1Window(JTextField textFieldtest)
		{
			
			super("Attack confirm");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel tipsLabel = new JLabel("Are you sure to attack?");
			tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
			add(tipsLabel, BorderLayout.CENTER);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.lightGray);
			buttonPanel.setLayout(new FlowLayout());
			JButton tipsButton = new JButton("Yes");
			tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
			tipsButton.addActionListener(this);
			buttonPanel.add(tipsButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			buttonPanel.add(noButton);
			add(buttonPanel, BorderLayout.SOUTH);
			f=new JFrame("JOptionPane Test");
		}
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Yes")){
			//偷工減料
			if(match.contains(7)){
				if(Integer.valueOf(textFieldOne.getText()) >= 2){
					textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerOneHandCard.isEmpty()){

					for(int i=0;i<playerOneHandCard.size();i++){
							if(playerOneHandCard.get(i).getNumber() == 1 | playerOneHandCard.get(i).getNumber() == 2 | playerOneHandCard.get(i).getNumber() == 3 | playerOneHandCard.get(i).getNumber() == 4 | playerOneHandCard.get(i).getNumber() == 5 | playerOneHandCard.get(i).getNumber() == 6){
								 
								playerOneHandCard.remove(i--);
		
							}
						}
					// playerOneHandCard.clear();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
			}
			//抽菸賊
			else if(match.contains(8)){
				if(!playerOneHandCard.isEmpty()){
					handCard.add(playerOneHandCard.get(2));
					handCard.add(playerOneHandCard.get(3));
					playerOneHandCard.remove(2);
					playerOneHandCard.remove(2);
	
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}

				}	
				//衛生稽查
			else if(match.contains(9)){

				// playerOneHandCard.clear();
				// playerThreeHandCard.clear();
				// playerFourHandCard.clear();
					//這裡想想
	/******************************************************************************* */
				for(int i=0;i<handCard.size();i++){
					if(handCard.get(i).getNumber() == 1 | handCard.get(i).getNumber() == 2 | handCard.get(i).getNumber() == 3 | handCard.get(i).getNumber() == 4 | handCard.get(i).getNumber() == 5 | handCard.get(i).getNumber() == 6){
						 
						handCard.remove(i--);

					}

					if(playerOneHandCard.get(i).getNumber() == 1 | playerOneHandCard.get(i).getNumber() == 2 | playerOneHandCard.get(i).getNumber() == 3 | playerOneHandCard.get(i).getNumber() == 4 | playerOneHandCard.get(i).getNumber() == 5 | playerOneHandCard.get(i).getNumber() == 6){
								 
						playerOneHandCard.remove(i--);

					}
					if(playerThreeHandCard.get(i).getNumber() == 1 | playerThreeHandCard.get(i).getNumber() == 2 | playerThreeHandCard.get(i).getNumber() == 3 | playerThreeHandCard.get(i).getNumber() == 4 | playerThreeHandCard.get(i).getNumber() == 5 | playerThreeHandCard.get(i).getNumber() == 6){
						 
						playerThreeHandCard.remove(i--);
					}
					if(playerFourHandCard.get(i).getNumber() == 1 | playerFourHandCard.get(i).getNumber() == 2 | playerFourHandCard.get(i).getNumber() == 3 | playerFourHandCard.get(i).getNumber() == 4 | playerFourHandCard.get(i).getNumber() == 5 | playerFourHandCard.get(i).getNumber() == 6){
						 
						playerFourHandCard.remove(i--);
					}
				}
	
				handCardPanel.repaintHandCardPanel();
				handCard.remove(C[removedCard.get(0)]);
				handCardPanel.repaintHandCardPanel();
				// handCard.clear();
				handCardPanel.repaintHandCardPanel();
				handCardPanel.repaint();
				removedCard.clear();
				match.clear();
				}	
				//警察
			else if(match.contains(10)){
				if(Integer.valueOf(textFieldOne.getText()) >= 2){
					textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerOneHandCard.isEmpty()){
					for(int i=0;i<playerOneHandCard.size();i++){
						if(playerOneHandCard.get(i).getNumber() == 1 | playerOneHandCard.get(i).getNumber() == 2 | playerOneHandCard.get(i).getNumber() == 3 | playerOneHandCard.get(i).getNumber() == 4 | playerOneHandCard.get(i).getNumber() == 5 | playerOneHandCard.get(i).getNumber() == 6){
							 
							playerOneHandCard.remove(i--);
	
						}
					}
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
				}
				//食物中毒
			else if(match.contains(11)){
				if(Integer.valueOf(textFieldOne.getText()) >= 1){
					textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}

			}
				//扒手
			else if(match.contains(12)){
				if(Integer.valueOf(textFieldOne.getText())>=2){
					textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-2));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(Integer.valueOf(textFieldOne.getText())==1){
					textFieldOne.setText(Integer.toString(Integer.valueOf(textFieldOne.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);

				}
				}


			dispose();
		}
		else if(actionCommand.equals("No"))
			dispose(); 
		}

	}
	private class attack2Window extends JFrame implements ActionListener
	{
		private JFrame f;
		public attack2Window(JTextField textFieldtest)
		{
			
			super("Attack confirm");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel tipsLabel = new JLabel("Are you sure to attack?");
			tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
			add(tipsLabel, BorderLayout.CENTER);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.lightGray);
			buttonPanel.setLayout(new FlowLayout());
			JButton tipsButton = new JButton("Yes");
			tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
			tipsButton.addActionListener(this);
			buttonPanel.add(tipsButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			buttonPanel.add(noButton);
			add(buttonPanel, BorderLayout.SOUTH);
			f=new JFrame("JOptionPane Test");
		}
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Yes")){
			//偷工減料
			if(match.contains(7)){
				if(Integer.valueOf(textFieldThree.getText()) >= 2){
					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerThreeHandCard.isEmpty()){
					for(int i=0;i<playerThreeHandCard.size();i++){
						if(playerThreeHandCard.get(i).getNumber() == 1 | playerThreeHandCard.get(i).getNumber() == 2 | playerThreeHandCard.get(i).getNumber() == 3 | playerThreeHandCard.get(i).getNumber() == 4 | playerThreeHandCard.get(i).getNumber() == 5 | playerThreeHandCard.get(i).getNumber() == 6){
							 
							playerThreeHandCard.remove(i--);
	
						}
					}
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
			}
			//抽菸賊
			else if(match.contains(8)){
				if(!playerThreeHandCard.isEmpty()){
					handCard.add(playerThreeHandCard.get(2));
					handCard.add(playerThreeHandCard.get(3));
					playerThreeHandCard.remove(2);
					playerThreeHandCard.remove(2);
	
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}

				}	
				//衛生稽查
			else if(match.contains(9)){
				for(int i=0;i<handCard.size();i++){
					if(handCard.get(i).getNumber() == 1 | handCard.get(i).getNumber() == 2 | handCard.get(i).getNumber() == 3 | handCard.get(i).getNumber() == 4 | handCard.get(i).getNumber() == 5 | handCard.get(i).getNumber() == 6){
						 
						handCard.remove(i--);

					}

					if(playerOneHandCard.get(i).getNumber() == 1 | playerOneHandCard.get(i).getNumber() == 2 | playerOneHandCard.get(i).getNumber() == 3 | playerOneHandCard.get(i).getNumber() == 4 | playerOneHandCard.get(i).getNumber() == 5 | playerOneHandCard.get(i).getNumber() == 6){
								 
						playerOneHandCard.remove(i--);

					}
					if(playerThreeHandCard.get(i).getNumber() == 1 | playerThreeHandCard.get(i).getNumber() == 2 | playerThreeHandCard.get(i).getNumber() == 3 | playerThreeHandCard.get(i).getNumber() == 4 | playerThreeHandCard.get(i).getNumber() == 5 | playerThreeHandCard.get(i).getNumber() == 6){
						 
						playerThreeHandCard.remove(i--);
					}
					if(playerFourHandCard.get(i).getNumber() == 1 | playerFourHandCard.get(i).getNumber() == 2 | playerFourHandCard.get(i).getNumber() == 3 | playerFourHandCard.get(i).getNumber() == 4 | playerFourHandCard.get(i).getNumber() == 5 | playerFourHandCard.get(i).getNumber() == 6){
						 
						playerFourHandCard.remove(i--);
					}
				}
				// playerFourHandCard.clear();
				// playerThreeHandCard.clear();
				// playerOneHandCard.clear();
				handCard.remove(C[removedCard.get(0)]);
				handCardPanel.repaintHandCardPanel();
				// handCard.clear();
				handCardPanel.repaintHandCardPanel();
				handCardPanel.repaint();
				removedCard.clear();
				match.clear();
				}	
				//警察
			else if(match.contains(10)){
				if(Integer.valueOf(textFieldThree.getText()) >= 2){
					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerThreeHandCard.isEmpty()){
					for(int i=0;i<playerThreeHandCard.size();i++){
						if(playerThreeHandCard.get(i).getNumber() == 1 | playerThreeHandCard.get(i).getNumber() == 2 | playerThreeHandCard.get(i).getNumber() == 3 | playerThreeHandCard.get(i).getNumber() == 4 | playerThreeHandCard.get(i).getNumber() == 5 | playerThreeHandCard.get(i).getNumber() == 6){
							 
							playerThreeHandCard.remove(i--);
	
						}
					}
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
				}
				//食物中毒
			else if(match.contains(11)){
				if(Integer.valueOf(textFieldThree.getText()) >= 1){
					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}

			}
				//扒手
			else if(match.contains(12)){
				if(Integer.valueOf(textFieldThree.getText())>=2){
					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-2));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(Integer.valueOf(textFieldThree.getText())==1){
					textFieldThree.setText(Integer.toString(Integer.valueOf(textFieldThree.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);

				}
				}


			dispose();
		}
		else if(actionCommand.equals("No"))
			dispose(); 
		}

	}
	private class attack3Window extends JFrame implements ActionListener
	{
		private JFrame f;
		public attack3Window(JTextField textFieldtest)
		{
			
			super("Attack confirm");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel tipsLabel = new JLabel("Are you sure to attack?");
			tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
			add(tipsLabel, BorderLayout.CENTER);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.lightGray);
			buttonPanel.setLayout(new FlowLayout());
			JButton tipsButton = new JButton("Yes");
			tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
			tipsButton.addActionListener(this);
			buttonPanel.add(tipsButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			buttonPanel.add(noButton);
			add(buttonPanel, BorderLayout.SOUTH);
			f=new JFrame("JOptionPane Test");
		}
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Yes")){
			//偷工減料
			if(match.contains(7)){
				if(Integer.valueOf(textFieldFour.getText()) >= 2){
					textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerFourHandCard.isEmpty()){
					for(int i=0;i<playerFourHandCard.size();i++){
						if(playerFourHandCard.get(i).getNumber() == 1 | playerFourHandCard.get(i).getNumber() == 2 | playerFourHandCard.get(i).getNumber() == 3 | playerFourHandCard.get(i).getNumber() == 4 | playerFourHandCard.get(i).getNumber() == 5 | playerFourHandCard.get(i).getNumber() == 6){
							 
							playerFourHandCard.remove(i--);
	
						}
					}
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
			}
			//抽菸賊
			else if(match.contains(8)){
				if(!playerFourHandCard.isEmpty()){
					handCard.add(playerFourHandCard.get(2));
					handCard.add(playerFourHandCard.get(3));
					playerFourHandCard.remove(2);
					playerFourHandCard.remove(2);
	
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}

				}	
				//衛生稽查
			else if(match.contains(9)){
				for(int i=0;i<handCard.size();i++){
					if(handCard.get(i).getNumber() == 1 | handCard.get(i).getNumber() == 2 | handCard.get(i).getNumber() == 3 | handCard.get(i).getNumber() == 4 | handCard.get(i).getNumber() == 5 | handCard.get(i).getNumber() == 6){
						 
						handCard.remove(i--);

					}

					if(playerOneHandCard.get(i).getNumber() == 1 | playerOneHandCard.get(i).getNumber() == 2 | playerOneHandCard.get(i).getNumber() == 3 | playerOneHandCard.get(i).getNumber() == 4 | playerOneHandCard.get(i).getNumber() == 5 | playerOneHandCard.get(i).getNumber() == 6){
								 
						playerOneHandCard.remove(i--);

					}
					if(playerThreeHandCard.get(i).getNumber() == 1 | playerThreeHandCard.get(i).getNumber() == 2 | playerThreeHandCard.get(i).getNumber() == 3 | playerThreeHandCard.get(i).getNumber() == 4 | playerThreeHandCard.get(i).getNumber() == 5 | playerThreeHandCard.get(i).getNumber() == 6){
						 
						playerThreeHandCard.remove(i--);
					}
					if(playerFourHandCard.get(i).getNumber() == 1 | playerFourHandCard.get(i).getNumber() == 2 | playerFourHandCard.get(i).getNumber() == 3 | playerFourHandCard.get(i).getNumber() == 4 | playerFourHandCard.get(i).getNumber() == 5 | playerFourHandCard.get(i).getNumber() == 6){
						 
						playerFourHandCard.remove(i--);
					}
				}
				// playerFourHandCard.clear();
				// playerThreeHandCard.clear();
				// playerOneHandCard.clear();
				handCard.remove(C[removedCard.get(0)]);
				handCardPanel.repaintHandCardPanel();
				// handCard.clear();
				handCardPanel.repaintHandCardPanel();
				handCardPanel.repaint();
				removedCard.clear();
				match.clear();
				}	
				//警察
			else if(match.contains(10)){
				if(Integer.valueOf(textFieldFour.getText()) >= 2){
					textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(!playerFourHandCard.isEmpty()){
					for(int i=0;i<playerFourHandCard.size();i++){
						if(playerFourHandCard.get(i).getNumber() == 1 | playerFourHandCard.get(i).getNumber() == 2 | playerFourHandCard.get(i).getNumber() == 3 | playerFourHandCard.get(i).getNumber() == 4 | playerFourHandCard.get(i).getNumber() == 5 | playerFourHandCard.get(i).getNumber() == 6){
							 
							playerFourHandCard.remove(i--);
	
						}
					}
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
				}
				else{
					JOptionPane.showMessageDialog(f,"This player do not have enough money or card" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
				}
				//食物中毒
			else if(match.contains(11)){
				if(Integer.valueOf(textFieldFour.getText()) >= 1){
					textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}

			}
				//扒手
			else if(match.contains(12)){
				if(Integer.valueOf(textFieldFour.getText())>=2){
					textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-2));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else if(Integer.valueOf(textFieldFour.getText())==1){
					textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())-1));
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);
				}
				else{
					// JOptionPane.showMessageDialog(f,"This player do not have enough money" ,"ERROR",JOptionPane.WARNING_MESSAGE);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					if(Integer.valueOf(textField.getText())>=6)
					winLabel.setVisible(true);

				}
				}


			dispose();
		}
		else if(actionCommand.equals("No"))
			dispose(); 
		}

	}
	private class defenceWindow extends JFrame implements ActionListener
	{
		public defenceWindow()
		{
			super("Defence tips");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel tipsLabel = new JLabel("XXX is attack you, Do you want to use XXX to defence?");
			tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
			add(tipsLabel, BorderLayout.CENTER);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.lightGray);
			buttonPanel.setLayout(new FlowLayout());
			JButton tipsButton = new JButton("Yes");
			tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
			tipsButton.addActionListener(this);
			buttonPanel.add(tipsButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			buttonPanel.add(noButton);
			add(buttonPanel, BorderLayout.SOUTH);
		}
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
			if (actionCommand.equals("Yes")){
				if(match.contains(13)){	
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCardPanel.repaint();
					removedCard.clear();
					match.clear();
					playerFourHandCard.remove(0);
					dispose();
				}
				
			}				
			else if(actionCommand.equals("No")){
					if(Integer.valueOf(textField.getText()) >= 2)
					{
						textField.setText(Integer.toString(Integer.valueOf(textField.getText())-2));
						textFieldFour.setText(Integer.toString(Integer.valueOf(textFieldFour.getText())+2));
						playerFourHandCard.remove(0);
						dispose();
					}
					else{
						handCard.clear();
						handCardPanel.repaintHandCardPanel();
						handCardPanel.repaint();
						removedCard.clear();
						match.clear();
						dispose();
					}
					

			}
		}

	}

	private class exitWindow extends JFrame implements ActionListener
	{
		public exitWindow()
		{
			super("Exit point");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel exitLabel = new JLabel("Are you sure you want to end"
			+" your round?");
			exitLabel.setFont(new Font("Calibri",Font.BOLD,20));
			add(exitLabel, BorderLayout.CENTER);
			JPanel exitPanel = new JPanel();
			exitPanel.setBackground(Color.lightGray);
			exitPanel.setLayout(new FlowLayout());
			JButton yesButton = new JButton("Yes");
			yesButton.setFont(new Font("Calibri",Font.BOLD,20));
			yesButton.addActionListener(this);
			exitPanel.add(yesButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			exitPanel.add(noButton);
			add(exitPanel, BorderLayout.SOUTH);
		}	
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Yes"))
		{
			computerturn computerturn = new computerturn();
			computerturn.start();
			dispose();
		}
		else if (actionCommand.equals("No"))
			dispose(); 
		}
	}

	private void initialize() {
		
		this.setBounds(10, 10, 1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		ImageIcon background = new ImageIcon("picture/background.png");
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, this.getWidth(), this.getHeight());
		JPanel imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));


		//牌變大的面板
		/************************************************************* */
		attack1Label = new JLabel();
		Icon attack1 = new ImageIcon("./Store/attack1.jpg");
		attack1Label.setIcon(attack1);
		attack1Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack1Label);
		attack1Label.setVisible(false);

		attack2Label = new JLabel();
		Icon attack2 = new ImageIcon("./Store/attack2.jpg");
		attack2Label.setIcon(attack2);
		attack2Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack2Label);
		attack2Label.setVisible(false);

		attack3Label = new JLabel();
		Icon attack3 = new ImageIcon("./Store/attack3.jpg");
		attack3Label.setIcon(attack3);
		attack3Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack3Label);
		attack3Label.setVisible(false);

		attack4Label = new JLabel();
		Icon attack4 = new ImageIcon("./Store/attack4.jpg");
		attack4Label.setIcon(attack4);
		attack4Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack4Label);
		attack4Label.setVisible(false);

		attack5Label = new JLabel();
		Icon attack5 = new ImageIcon("./Store/attack5.jpg");
		attack5Label.setIcon(attack5);
		attack5Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack5Label);
		attack5Label.setVisible(false);

		attack6Label = new JLabel();
		Icon attack6 = new ImageIcon("./Store/attack6.jpg");
		attack6Label.setIcon(attack6);
		attack6Label.setBounds(180,280,189,270);
		this.getContentPane().add(attack6Label);
		attack6Label.setVisible(false);

		defense1Label= new JLabel();
		Icon defense1 = new ImageIcon("./Store/defense1.jpg");
		defense1Label.setIcon(defense1);
		defense1Label.setBounds(180,280,189,270);
		this.getContentPane().add(defense1Label);
		defense1Label.setVisible(false);

		defense2Label= new JLabel();
		Icon defense2 = new ImageIcon("./Store/defense2.jpg");
		defense2Label.setIcon(defense2);
		defense2Label.setBounds(180,280,189,270);
		this.getContentPane().add(defense2Label);
		defense2Label.setVisible(false);

		defense3Label= new JLabel();
		Icon defense3 = new ImageIcon("./Store/defense3.jpg");
		defense3Label.setIcon(defense3);
		defense3Label.setBounds(180,280,189,270);
		this.getContentPane().add(defense3Label);
		defense3Label.setVisible(false);

		defense4Label= new JLabel();
		Icon defense4 = new ImageIcon("./Store/defense4.jpg");
		defense4Label.setIcon(defense4);
		defense4Label.setBounds(180,280,189,270);
		this.getContentPane().add(defense4Label);
		defense4Label.setVisible(false);

		/************************************************************** */

		turnLabel = new JLabel();
		Icon turn1 = new ImageIcon("./picture/yourturn.png");
		turnLabel.setIcon(turn1);
		turnLabel.setBounds(380,260,600,124);
		turnLabel.setBackground(Color.WHITE);
		this.getContentPane().add(turnLabel);
		turnLabel.setVisible(false);



		JMenuBar settingbar = new JMenuBar();
		JMenu setting = new JMenu("Setting");
		JMenuItem rule = new JMenuItem("Rule");
		rule.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				rule rrr = new rule();
				rrr.setVisible(true);
		}
		});
		// JMenuItem reset = new JMenuItem("Reset");
		// reset.addActionListener(new ActionListener(){ 
		// 	public void actionPerformed(ActionEvent e) {
				
		// 		gamepage gp = new gamepage();
		// 		gp.setVisible(true);
		// 		dispose();
		// }
		// });

		setting.add(rule);
		// setting.add(reset);
		settingbar.add(setting);
		setJMenuBar(settingbar);
		
		//上方玩家
		/********************************************************** */
		JLabel playerOne = new JLabel();
		Icon icon1=new ImageIcon("picture/001.png");
		playerOne.setIcon(icon1);
		playerOne.setBounds(525, 10, 150, 150);
		this.getContentPane().add(playerOne);
		playerOne.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent event)
			{
				attack1Window attack = new attack1Window(textFieldOne);
					attack.setVisible(true);

					// handCard.remove(C[removedCard.get(0)]);
					// handCardPanel.repaintHandCardPanel();
					// handCardPanel.repaint();
					// removedCard.clear();
					// match.clear();
			}
		});

		playertwomotion = new JLabel();
		playertwomotion.setOpaque(false);
		playertwomotion.setBounds(680, 25, 300, 100);
		this.getContentPane().add(playertwomotion);

		JPanel moneyPanelOne = new JPanel();
		moneyPanelOne.setBounds(390, 10, 175, 122);
		this.getContentPane().add(moneyPanelOne);
		moneyPanelOne.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		moneyPanelOne.setOpaque(false);
		JLabel moneyLabelOne = new JLabel("moneyLabel");
		Icon money=new ImageIcon("picture/money.png");
		moneyLabelOne.setIcon(money);
		moneyLabelOne.setPreferredSize(new Dimension(60,100));
		moneyPanelOne.add(moneyLabelOne);
		textFieldOne = new JTextField("0");
		textFieldOne.setOpaque(false);
		textFieldOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textFieldOne.setEditable(false);
		textFieldOne.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		textFieldOne.setForeground(Color.ORANGE);
		moneyPanelOne.add(textFieldOne);
		/********************************************************** */
	

		//玩家本人
		JLabel playerTwo = new JLabel();
		Icon icon2=new ImageIcon("picture/002.png");
		playerTwo.setIcon(icon2);
		playerTwo.setBounds(750, 603, 150, 150);
		this.getContentPane().add(playerTwo);


		//左方玩家
		/****************************************************** */
		JLabel playerThree = new JLabel();
		Icon icon3=new ImageIcon("picture/003.png");
		playerThree.setIcon(icon3);
		playerThree.setBounds(10, 325, 150, 150);
		this.getContentPane().add(playerThree);
		playerThree.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent event)
			{
					attack2Window attack = new attack2Window(textFieldThree);
					attack.setVisible(true);
			}
		});

		playerthreemotion = new JLabel();
		playerthreemotion.setOpaque(false);
		playerthreemotion.setBounds(10, 230, 300, 100);
		this.getContentPane().add(playerthreemotion);

		JPanel moneyPanelThree = new JPanel();
		moneyPanelThree.setBounds(10, 460, 175, 122);
		this.getContentPane().add(moneyPanelThree);
		moneyPanelThree.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		moneyPanelThree.setOpaque(false);
		JLabel moneyLabelThree = new JLabel("moneyLabel");
		moneyLabelThree.setIcon(money);
		moneyLabelThree.setPreferredSize(new Dimension(60,100));
		moneyPanelThree.add(moneyLabelThree);
		textFieldThree = new JTextField("0");
		textFieldThree.setEditable(false);
		textFieldThree.setOpaque(false);
		textFieldThree.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textFieldThree.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		textFieldThree.setForeground(Color.ORANGE);
		moneyPanelThree.add(textFieldThree);
		/****************************************************** */
		
		//右方玩家
		/******************************************************* */
		JLabel playerFour = new JLabel();
		Icon icon4=new ImageIcon("picture/004.png");
		playerFour.setIcon(icon4);
		playerFour.setBounds(1026, 325, 150, 150);
		this.getContentPane().add(playerFour);
		playerFour.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent event)
			{

				attack3Window attack = new attack3Window(textFieldFour);
					attack.setVisible(true);


			}
		});

		playeronemotion = new JLabel();
		playeronemotion.setOpaque(false);
		playeronemotion.setBounds(1000, 230, 300, 100);
		this.getContentPane().add(playeronemotion);

		JPanel moneyPanelFour = new JPanel();
		moneyPanelFour.setBounds(1026, 475, 175, 122);
		this.getContentPane().add(moneyPanelFour);
		moneyPanelFour.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		moneyPanelFour.setOpaque(false);
		JLabel moneyLabelFour = new JLabel("moneyLabel");
		moneyLabelFour.setIcon(money);
		moneyLabelFour.setPreferredSize(new Dimension(60,100));
		moneyPanelFour.add(moneyLabelFour);
		textFieldFour = new JTextField("0");
		textFieldFour.setEditable(false);
		textFieldFour.setOpaque(false);
		textFieldFour.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textFieldFour.setForeground(Color.ORANGE);
		textFieldFour.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		moneyPanelFour.add(textFieldFour);
		/***************************************************** */


		//贏得遊戲
		winLabel = new JLabel();
		Icon win=new ImageIcon("./picture/youwin.jpg");
		winLabel.setIcon(win);
		winLabel.setBounds(270,214,626,302);
		this.getContentPane().add(winLabel);
		winLabel.setVisible(false);
/***************************************************** */


		//輸掉遊戲
		loseLabel = new JLabel();
		Icon lose=new ImageIcon("./picture/youlose.jpg");
		loseLabel.setIcon(lose);
		loseLabel.setBounds(270,214,626,302);
		this.getContentPane().add(loseLabel);
		loseLabel.setVisible(false);

		

		//放入桌上牌庫ArrayList
		/************************************************************************************/
		F[0] = new foodCard(3,6,0);
		F[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[0].getID());
				if(   (match.contains(3)&&match.contains(6))  ||  
					  (match.contains(3)&&match.contains(4))  ||  
					  (match.contains(6)&&match.contains(4))   ||  
					  (match.contains(4)&&match.contains(4)))
				{	
					tableCard.remove(F[0]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
				
			}           
		});
		tableCard.add(F[0]);


		F[1] = new foodCard(1,5,6,1);
		F[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[1].getID());
				if(     (match.contains(1)&&match.contains(5)&&match.contains(6))  || 
						(match.contains(4)&&match.contains(5)&&match.contains(6))  ||
						(match.contains(1)&&match.contains(4)&&match.contains(6))  || 
						(match.contains(1)&&match.contains(5)&&match.contains(4))  || 
						(match.contains(1)&&match.contains(4)&&match.contains(4))  || 
						(match.contains(4)&&match.contains(5)&&match.contains(4))  || 
						(match.contains(4)&&match.contains(4)&&match.contains(6))  || 
						(match.contains(4)&&match.contains(4)&&match.contains(4))     )
				{	
					tableCard.remove(F[1]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
				
			}           
		});
		tableCard.add(F[1]);


		F[2] = new foodCard(1,2,5,6,2);
		F[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[2].getID());
				if(     (match.contains(1)&&match.contains(2)&&match.contains(5)&&match.contains(6)) ||
						(match.contains(4)&&match.contains(2)&&match.contains(5)&&match.contains(6)) ||  
						(match.contains(1)&&match.contains(4)&&match.contains(5)&&match.contains(6)) ||
						(match.contains(1)&&match.contains(2)&&match.contains(4)&&match.contains(6)) ||
						(match.contains(1)&&match.contains(2)&&match.contains(5)&&match.contains(4))  ||
						(match.contains(1)&&match.contains(2)&&match.contains(4)&&match.contains(4)) ||
						(match.contains(1)&&match.contains(4)&&match.contains(5)&&match.contains(4)) ||
						(match.contains(4)&&match.contains(2)&&match.contains(5)&&match.contains(4)) ||
						(match.contains(1)&&match.contains(4)&&match.contains(4)&&match.contains(4)) ||
						(match.contains(4)&&match.contains(4)&&match.contains(5)&&match.contains(6)) ||
						(match.contains(4)&&match.contains(2)&&match.contains(4)&&match.contains(6)) ||
						(match.contains(1)&&match.contains(4)&&match.contains(4)&&match.contains(6)))
				{	
					tableCard.remove(F[2]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(3)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+4));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		}); 
		tableCard.add(F[2]);


		F[3] = new foodCard(3,5,3);
		F[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[3].getID());
				if(     (match.contains(3) && match.contains(5))  ||
						(match.contains(4) && match.contains(5))  ||
						(match.contains(3) && match.contains(4))  ||
						(match.contains(4) && match.contains(4))  )
				{	
					tableCard.remove(F[3]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[3]);


		F[4] = new foodCard(1,3,6,4);
		F[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[4].getID());
				if(     (match.contains(1)&&match.contains(3)&&match.contains(6))  ||
						(match.contains(4)&&match.contains(3)&&match.contains(6))  ||
						(match.contains(1)&&match.contains(4)&&match.contains(6))  ||
						(match.contains(1)&&match.contains(3)&&match.contains(4))  ||
						(match.contains(1)&&match.contains(4)&&match.contains(4))||
						(match.contains(4)&&match.contains(3)&&match.contains(4)) ||
						(match.contains(4)&&match.contains(4)&&match.contains(6)) )
				{	
					tableCard.remove(F[4]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[4]);


		F[5] = new foodCard(1,2,3,5,5);
		F[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[5].getID());
				if(     (match.contains(1)&&match.contains(2)&&match.contains(3)&&match.contains(5))  ||
						(match.contains(4)&&match.contains(2)&&match.contains(3)&&match.contains(5))  ||
						(match.contains(1)&&match.contains(4)&&match.contains(3)&&match.contains(5))  ||
						(match.contains(1)&&match.contains(2)&&match.contains(4)&&match.contains(5))  ||
						(match.contains(1)&&match.contains(2)&&match.contains(3)&&match.contains(4))    )
				{	
					tableCard.remove(F[5]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(3)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+4));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[5]);


		F[6] = new foodCard(2,5,6);
		F[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[6].getID());
				if(  	(match.contains(2)&&match.contains(5))  ||
						(match.contains(4)&&match.contains(5))  ||
						(match.contains(2)&&match.contains(4))  ||
						(match.contains(4)&&match.contains(4))  )
				{	
					tableCard.remove(F[6]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[6]);


		F[7] = new foodCard(1,3,7);
		F[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[7].getID());
				if(   	(match.contains(1)&&match.contains(3))  ||
						(match.contains(4)&&match.contains(3))  ||
						(match.contains(1)&&match.contains(4))   ||
						(match.contains(4)&&match.contains(4)) )
				{	
					tableCard.remove(F[7]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[7]);


		F[8] = new foodCard(2,3,6,8);
		F[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[8].getID());
				if(   	(match.contains(2)&&match.contains(3)&&match.contains(6))  ||
						(match.contains(4)&&match.contains(3)&&match.contains(6))  ||
						(match.contains(2)&&match.contains(4)&&match.contains(6))  ||
						(match.contains(2)&&match.contains(3)&&match.contains(4))    )
				{	
					tableCard.remove(F[8]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[8]);

		F[9] = new foodCard(5,3,9);
		F[9].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[0].getID());
				if(   (match.contains(3)&&match.contains(5))  ||  
					  (match.contains(4)&&match.contains(3))  ||  
					  (match.contains(5)&&match.contains(4))   ||  
					  (match.contains(4)&&match.contains(4)))
				{	
					tableCard.remove(F[9]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
				
			}           
		});
		tableCard.add(F[9]);

		F[10] = new foodCard(3,1,10);
		F[10].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[7].getID());
				if(   	(match.contains(1)&&match.contains(3))  ||
						(match.contains(4)&&match.contains(3))  ||
						(match.contains(1)&&match.contains(4))  ||
						(match.contains(4)&&match.contains(4))  )
				{	
					tableCard.remove(F[10]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+1));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		});
		tableCard.add(F[10]);

		F[11] = new foodCard(6,5,1,11);
		F[11].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[1].getID());
				if(     (match.contains(1)&&match.contains(5)&&match.contains(6))  || 
						(match.contains(4)&&match.contains(5)&&match.contains(6))  ||
						(match.contains(1)&&match.contains(4)&&match.contains(6))  || 
						(match.contains(1)&&match.contains(5)&&match.contains(4))    )
				{	
					tableCard.remove(F[11]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+2));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
				
			}           
		});
		tableCard.add(F[11]);

		F[12] = new foodCard(6,5,1,2,12);
		F[12].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(F[2].getID());
				if(     (match.contains(1)&&match.contains(2)&&match.contains(5)&&match.contains(6)) ||
						(match.contains(4)&&match.contains(2)&&match.contains(5)&&match.contains(6)) ||  
						(match.contains(1)&&match.contains(4)&&match.contains(5)&&match.contains(6)) ||
						(match.contains(1)&&match.contains(2)&&match.contains(4)&&match.contains(6)) ||
						(match.contains(1)&&match.contains(2)&&match.contains(5)&&match.contains(4))   )
				{	
					tableCard.remove(F[12]);
					tableCardPanel.repaintTableCardPanel();
					handCard.remove(C[removedCard.get(0)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(1)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(2)]);
					handCardPanel.repaintHandCardPanel();
					handCard.remove(C[removedCard.get(3)]);
					handCardPanel.repaintHandCardPanel();
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+4));

					if(Integer.valueOf(textField.getText())>=6)
						winLabel.setVisible(true);
					
					removedCard.clear();
					match.clear();
				}
			}           
		}); 
		tableCard.add(F[12]);


		/************************************************************************************/

		tableCardPanel = new tableCardPP(tableCard);
		tableCardPanel.setBounds(371, 214, 646, 337);
		this.getContentPane().add(tableCardPanel);
		tableCardPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		tableCardPanel.setOpaque(false);


		


		Icon button=new ImageIcon("picture/button.png");
		JButton drawCard = new JButton(button);
		drawCard.setBounds(170, 214, 200, 330);  
		drawCard.setBorderPainted(false);
		drawCard.setContentAreaFilled(false); 
		drawCard.setOpaque(false);
		this.getContentPane().add(drawCard);
		draw = true ;

		//放入手牌ArrayList
		for(int i=0;i<100;i++)
		{
			Random random = new Random();
			Integer s = random.nextInt(6)%(6-1+1) + 1;
			C[i] = new Card(s,i);
			//System.out.println(C[i].getNumber());
		}
		for(int i=100;i<200;i++)
		{
			Random random1 = new Random();
			Integer s = random1.nextInt(6)%(6-1+1) + 7;
			C[i] = new Card(s,i);
			//System.out.println(C[i].getNumber());
		}
		for(int i=200;i<300;i++)
		{
			Random random2 = new Random();
			Integer s = random2.nextInt(4)%(4-1+1) + 13;
			C[i] = new Card(s,i);
			//System.out.println(C[i].getNumber());
		}

		C[108] = new Card(7,108);
		C[109] = new Card(12,109);
		// C[101] = new Card(8,101);
		// C[102] = new Card(9,102);
		// C[103] = new Card(10,103);
		// C[104] = new Card(11,104);
		// C[105] = new Card(12,105);
		// C[106] = new Card(13,106);
		// C[107] = new Card(14,107);
		// C[108] = new Card(15,108);
		// C[109] = new Card(16,109);
		
		
		handCard.add(C[100]);
		handCard.add(C[200]);

		// handCard.add(C[102]);
		// handCard.add(C[103]);
		// handCard.add(C[104]);
		// handCard.add(C[105]);
		// handCard.add(C[106]);
		// handCard.add(C[107]);
		// handCard.add(C[108]);
		// handCard.add(C[109]);
		handCard.add(C[0]);
		handCard.add(C[1]);
		handCard.add(C[2]);
		//給電腦手牌
		/********************************************** */
		playerOneHandCard.add(C[109]);
		playerOneHandCard.add(C[201]);
		playerOneHandCard.add(C[2]);
		playerOneHandCard.add(C[3]);
		playerThreeHandCard.add(C[108]);
		playerThreeHandCard.add(C[202]);
		playerThreeHandCard.add(C[4]);
		playerThreeHandCard.add(C[5]);
		playerFourHandCard.add(C[108]);
		playerFourHandCard.add(C[203]);
		playerFourHandCard.add(C[6]);
		playerFourHandCard.add(C[7]);
		/********************************************** */

		handCardPanel = new handCardPP(handCard);
		handCardPanel.setBounds(10, 564, 750, 199);
		this.getContentPane().add(handCardPanel);
		handCardPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		handCardPanel.setOpaque(false);

		f=new JFrame("JOptionPane Test");
		drawCard.setPreferredSize(new Dimension(200,330));
		drawCard.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				// handCard.add(C[run]);
				// handCardPanel.repaintHandCardPanel();
				// run += 1;
				if(draw == true)
				{
					handCard.add(C[run]);
					handCardPanel.repaintHandCardPanel();
					run += 1;
					draw = false;
				}
				else
				{
					// tipsWindow tips = new tipsWindow();
					// tips.setVisible(true);
					JOptionPane.showMessageDialog(f,"The card has been drawn!" ,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		
		Icon store = new ImageIcon("picture/store.png");
		JButton storeButton = new JButton(store);
		storeButton.setBounds(20, 20, 150, 150);
		storeButton.setBorderPainted(false);
		storeButton.setContentAreaFilled(false);	
		storeButton.setOpaque(false);	          //Button設置為透明
		storeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				storeFrame sf = new storeFrame(textField.getText());
				sf.setVisible(true);
				//handCardPanel.repaintHandCardPanel();
			}
		});
		this.getContentPane().add(storeButton);

		JPanel moneyPanel = new JPanel();
		moneyPanel.setBounds(880, 604, 175, 122);
		this.getContentPane().add(moneyPanel);
		moneyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		moneyPanel.setOpaque(false);
		
		JLabel moneyLabel = new JLabel("moneyLabel");
		//Icon money=new ImageIcon("picture/money.png");
		moneyLabel.setIcon(money);
		moneyLabel.setPreferredSize(new Dimension(60,100));
		moneyPanel.add(moneyLabel);
		
		textField = new JTextField("0");
		textField.setEditable(false);
		textField.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		moneyPanel.add(textField);
		
		JButton endButton = new JButton("next player");
		endButton.setBounds(1026, 603, 120, 120);
		endButton.setBackground(Color.YELLOW);
		this.getContentPane().add(endButton);
		endButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				exitWindow exit = new exitWindow();
				exit.setVisible(true);		
			}
		});
	}
	public void doNothing(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interruption");
            System.exit(0);
        }
        //repaint();
	}
	


}