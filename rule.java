import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.awt.BorderLayout.*;
import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.event.MenuListener;
import javax.swing.event.*;
import javax.swing.JLabel.*;
public class rule extends JFrame {
	public static final int WIDTH=1000;
	public static final int HEIGHT=750;
	// private final JTextArea jTextArea1;
	// private final JTextArea jTextArea2;
	// private final JTextArea jTextArea3;
	// private final JTextArea jTextArea;

	public rule()
	{
		
		super("rule");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// rulePage panel = new rulePage();
		// JTextArea content = new JTextArea(100,10) ;

	    // JPanel rulepanel = new JPanel();

		ImageIcon image = new ImageIcon("./picture/rule1.png");
		JLabel picture = new JLabel();
		picture.setIcon(image);

		JScrollPane g = new JScrollPane(picture);
		g.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		g.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		// g.setBounds(110,10,200,100);
		// rulepanel.add(g);
		// add(rulepanel);
		add(g,BorderLayout.CENTER);


		JMenuBar rulebar = new JMenuBar();

		JMenu rulemenu1 = new JMenu("Rule description");
		rulemenu1.addMenuListener(new MenuListener(){
			
			public void menuSelected(MenuEvent e)
			{
				// String s = e.getActionCommand();
				ImageIcon image1 = new ImageIcon("./picture/rule1.png");
				picture.setIcon(image1);
			}
			public void menuCanceled(MenuEvent e)
			{}
			public void menuDeselected(MenuEvent e)
			{}
		});

		JMenu rulemenu2 = new JMenu("Ingredient card");
		rulemenu2.addMenuListener(new MenuListener(){
			
			public void menuSelected(MenuEvent e)
			{
				ImageIcon image2 = new ImageIcon("./picture/rule3.png");
				picture.setIcon(image2);
			}
			public void menuCanceled(MenuEvent e)
			{}
			public void menuDeselected(MenuEvent e)
			{}
		});
		// rulemenu2.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e)
		// 	{
		// 		// remove(g);
		// 		System.out.println("test");
		// 	}
		// });
		JMenu rulemenu3 = new JMenu("Meal card");
		rulemenu3.addMenuListener(new MenuListener(){
			
			public void menuSelected(MenuEvent e)
			{
				ImageIcon image3 = new ImageIcon("./picture/rule2.png");
				picture.setIcon(image3);
			}
			public void menuCanceled(MenuEvent e)
			{}
			public void menuDeselected(MenuEvent e)
			{}
		});
		JMenu rulemenu4 = new JMenu("Function card");
		rulemenu4.addMenuListener(new MenuListener(){
			
			public void menuSelected(MenuEvent e)
			{
				ImageIcon image4 = new ImageIcon("./picture/rule4.png");
				picture.setIcon(image4);
			}
			public void menuCanceled(MenuEvent e)
			{}
			public void menuDeselected(MenuEvent e)
			{}
		});
		JMenu rulemenu5 = new JMenu("Recipe");
		JMenuItem recipe1 = new JMenuItem("fried oyster");
		recipe1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe1 = new ImageIcon("./picture/fried oysterrecipe.png");
				picture.setIcon(recipe1);
		}
		});
		JMenuItem recipe2 = new JMenuItem("chicken chop");
		recipe2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe2 = new ImageIcon("./picture/chicken chopreceipt.png");
				picture.setIcon(recipe2);
		}
		});
		JMenuItem recipe3 = new JMenuItem("jump wall");
		recipe3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe3 = new ImageIcon("./picture/jump wallreceipt.png");
				picture.setIcon(recipe3);
		}
		});
		JMenuItem recipe4 = new JMenuItem("looway");
		recipe4.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe4 = new ImageIcon("./picture/loowayreceipt.png");
				picture.setIcon(recipe4);
		}
		});
		JMenuItem recipe5 = new JMenuItem("beefsoup");
		recipe5.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe5 = new ImageIcon("./picture/beefsoupreceipt.png");
				picture.setIcon(recipe5);
		}
		});
		JMenuItem recipe6 = new JMenuItem("takoyaki");
		recipe6.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe6 = new ImageIcon("./picture/takoyakireceipt.png");
				picture.setIcon(recipe6);
		}
		});
		JMenuItem recipe7 = new JMenuItem("chicken");
		recipe7.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe7 = new ImageIcon("./picture/chickenreceipt.png");
				picture.setIcon(recipe7);
		}
		});
		JMenuItem recipe8 = new JMenuItem("stinky tofu");
		recipe8.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe8 = new ImageIcon("./picture/stinky tofureceipt.png");
				picture.setIcon(recipe8);
		}
		});
		JMenuItem recipe9 = new JMenuItem("Xiao Long Bao");
		recipe9.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe9 = new ImageIcon("./picture/Xiao Long Baoreceipt.png");
				picture.setIcon(recipe9);
		}
		});
		JMenuItem recipe10 = new JMenuItem("seafood congee");
		recipe10.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe10 = new ImageIcon("./picture/seafood congeereceipt.png");
				picture.setIcon(recipe10);
		}
		});
		JMenuItem recipe11 = new JMenuItem("sausage");
		recipe11.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe11 = new ImageIcon("./picture/sausagereceipt.png");
				picture.setIcon(recipe11);
		}
		});
		JMenuItem recipe12 = new JMenuItem("HotPot");
		recipe12.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe12 = new ImageIcon("./picture/HotPotreceipt.png");
				picture.setIcon(recipe12);
		}
		});
		JMenuItem recipe13 = new JMenuItem("scallion pancakes");
		recipe13.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe13 = new ImageIcon("./picture/scallion pancakesreceipt.png");
				picture.setIcon(recipe13);
		}
		});
		JMenuItem recipe14 = new JMenuItem("meatballs");
		recipe14.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe14 = new ImageIcon("./picture/meatballsreceipt.png");
				picture.setIcon(recipe14);
		}
		});
		JMenuItem recipe15 = new JMenuItem("pasta");
		recipe15.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe15 = new ImageIcon("./picture/pastareceipt.png");
				picture.setIcon(recipe15);
		}
		});
		JMenuItem recipe16 = new JMenuItem("potato balls");
		recipe16.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				ImageIcon recipe16 = new ImageIcon("./picture/potato ballsreceipt.png");
				picture.setIcon(recipe16);
		}
		});

		rulemenu5.add(recipe1);
		rulemenu5.add(recipe2);
		rulemenu5.add(recipe3);
		rulemenu5.add(recipe4);
		rulemenu5.add(recipe5);
		rulemenu5.add(recipe6);
		rulemenu5.add(recipe7);
		rulemenu5.add(recipe8);
		rulemenu5.add(recipe9);
		rulemenu5.add(recipe10);
		rulemenu5.add(recipe11);
		rulemenu5.add(recipe12);
		rulemenu5.add(recipe13);
		rulemenu5.add(recipe14);
		rulemenu5.add(recipe15);
		rulemenu5.add(recipe16);


		rulebar.add(rulemenu1);
		rulebar.add(rulemenu2);
		rulebar.add(rulemenu3);
		rulebar.add(rulemenu4);
		rulebar.add(rulemenu5);
		setJMenuBar(rulebar);

		
	   
	}

}
