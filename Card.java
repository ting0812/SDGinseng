import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.util.*;

public class Card extends JLabel
{
    private Integer number;
    private boolean onclick;
    public static ArrayList<Integer> match = gamepage.match;
    public static ArrayList<Integer> removedCard = gamepage.removedCard;
    private Integer ID;

    public Card()
    {

    }

    public Card(Integer number,int id)
    {
        this.number=number;
        this.onclick = false;
        MouseHandler handler = new MouseHandler();
        this.ID = id;

        if(number==1)
        {
            Icon green=new ImageIcon("./picture/green.png");
		    setIcon(green);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==2)
        {
            Icon yellow=new ImageIcon("./picture/yellow.png");
		    setIcon(yellow);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==3)
        {
            Icon grey=new ImageIcon("./picture/grey.png");
		    setIcon(grey);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==4)
        {
            Icon purple=new ImageIcon("./picture/purple.png");
		    setIcon(purple);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==5)
        {
            Icon red=new ImageIcon("./picture/red.png");
		    setIcon(red);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==6)
        {
            Icon blue=new ImageIcon("./picture/blue.png");
		    setIcon(blue);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }        
        else if(number==7)
        {
            Icon attack=new ImageIcon("./Store/attack1test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==8)
        {
            Icon attack=new ImageIcon("./Store/attack2test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==9)
        {
            Icon attack=new ImageIcon("./Store/attack3test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==10)
        {
            Icon attack=new ImageIcon("./Store/attack4test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==11)
        {
            Icon attack=new ImageIcon("./Store/attack5test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==12)
        {
            Icon attack=new ImageIcon("./Store/attack6test.jpg");
		    setIcon(attack);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==13)
        {
            Icon defense=new ImageIcon("./Store/defense1test.jpg");
		    setIcon(defense);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==14)
        {
            Icon defense=new ImageIcon("./Store/defense2test.jpg");
		    setIcon(defense);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==15)
        {
            Icon defense=new ImageIcon("./Store/defense3test.jpg");
		    setIcon(defense);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }
        else if(number==16)
        {
            Icon defense=new ImageIcon("./Store/defense4test.jpg");
		    setIcon(defense);
            setPreferredSize(new Dimension(85,180));
            addMouseListener(handler);
        }

    }

    public class MouseHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent event)
        {
            if(onclick==true)
			{
				setonclick(false);
                setBorder(null);
                match.remove(number);

                if(match.isEmpty()==true)
                {
                    System.out.println("match is empty");
                }
                else
                {
                    for (Integer element : match) 
                    {
                        System.out.print(element+" ");
                    }
                    System.out.println();
                }
                removedCard.remove(ID);
			}
			else if(onclick==false)
			{
				setonclick(true);
				Border whiteline = BorderFactory.createLineBorder(Color.white);
                setBorder(whiteline);
                match.add(number);
                
                for (Integer element : match) 
                {
                    System.out.print(element+" ");
                }
                System.out.println();
                
                removedCard.add(ID);
			}
        }

        @Override
        public void mouseEntered(MouseEvent event)
        {
            if(number==7)
                gamepage.attack1Label.setVisible(true);
            if(number==8)
                gamepage.attack2Label.setVisible(true);
            if(number==9)
                gamepage.attack3Label.setVisible(true);
            if(number==10)
                gamepage.attack4Label.setVisible(true);
            if(number==11)
                gamepage.attack5Label.setVisible(true);
            if(number==12)
                gamepage.attack6Label.setVisible(true);
            if(number==13)
                gamepage.defense1Label.setVisible(true);
            if(number==14)
                gamepage.defense2Label.setVisible(true);
            if(number==15)
                gamepage.defense3Label.setVisible(true);
            if(number==16)
                gamepage.defense4Label.setVisible(true);
        }

        @Override
        public void mouseExited(MouseEvent event)
        {
            if(number==7)
                gamepage.attack1Label.setVisible(false);
            if(number==8)
                gamepage.attack2Label.setVisible(false);
            if(number==9)
                gamepage.attack3Label.setVisible(false);
            if(number==10)
                gamepage.attack4Label.setVisible(false);
            if(number==11)
                gamepage.attack5Label.setVisible(false);
            if(number==12)
                gamepage.attack6Label.setVisible(false);
            if(number==13)
                gamepage.defense1Label.setVisible(false);
            if(number==14)
                gamepage.defense2Label.setVisible(false);
            if(number==15)
                gamepage.defense3Label.setVisible(false);
            if(number==16)
                gamepage.defense4Label.setVisible(false);
        }
    }

    public ArrayList getMatch()
	{
		return this.match;
	}

    public int getNumber(){
        return this.number;
    }
    public boolean getonclick(){
        return this.onclick;
    }
    public void setonclick(boolean onclick){
        this.onclick = onclick;
    }
    public int getID(){
        return this.ID;
    }
}
