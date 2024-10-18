import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class foodCard extends JLabel
{
    private int dollars;
    private int id;

    private static Card cc = new Card();
    public static ArrayList<Integer> matchclone = cc.getMatch();

    public foodCard(int firstCard,int secondCard,int id)
    {  
        this.dollars = 2;

        if(firstCard==3 && secondCard==6)
        {
            this.id = id;
            Icon takoyaki=new ImageIcon("./picture/takoyaki.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(takoyaki);  
            
        }
        else if(firstCard==3 && secondCard==5)
        {
            this.id = id;
            Icon sausage=new ImageIcon("./picture/sausage.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(sausage);
        }
        else if(firstCard==5 && secondCard==3)
        {
            this.id = id;
            Icon chickenchop=new ImageIcon("./picture/chicken chop.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(chickenchop);
        }
        else if(firstCard==2 && secondCard==5)
        {
            this.id = id;
            Icon beefsoup=new ImageIcon("./picture/beefsoup.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(beefsoup);
        }
        else if(firstCard==1 && secondCard==3)
        {
            this.id = id;
            Icon stinkytofu=new ImageIcon("./picture/stinky tofu.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(stinkytofu);
        }
        else if(firstCard==3 && secondCard==1)
        {
            this.id = id;
            Icon scallionpancakes = new ImageIcon("./picture/scallion pancakes.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(scallionpancakes);
        }
    }
    
    public foodCard(int firstCard,int secondCard,int thirdCard,int id)
    {   
        this.dollars = 3;

        if(firstCard==1 && secondCard==5 && thirdCard==6)
        {
            this.id = id;
            Icon chicken=new ImageIcon("./picture/chicken.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(chicken);

        }
        else if(firstCard==6 && secondCard==5 && thirdCard==1)
        {
            this.id = id;
            Icon Lomei = new ImageIcon("./picture/Lo mei.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(Lomei);
        }
        else if(firstCard==1 && secondCard==3 && thirdCard==6)
        {
            this.id = id;
            Icon friedoyster=new ImageIcon("./picture/fried oyster.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(friedoyster);
        }
        else if(firstCard==2 && secondCard==3 && thirdCard==6)
        {
            this.id = id;
            Icon seafoodcongee=new ImageIcon("./picture/seafood congee.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(seafoodcongee);
        }
    }

    public foodCard(int firstCard,int secondCard,int thirdCard,int fourthCard,int id)
    {
        this.dollars = 4;

        if(firstCard==1 && secondCard==2 && thirdCard==5 && fourthCard==6)
        {
            this.id = id;
            Icon hotPot=new ImageIcon("./picture/HotPot.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(hotPot);
        }
        else if(firstCard==6 && secondCard==5 && thirdCard==1 && fourthCard==2)
        {
            this.id = id;
            Icon jumpwall = new ImageIcon("./picture/jump wall.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(jumpwall);
        }
        else if(firstCard==1 && secondCard==2 && thirdCard==3 && fourthCard==5)
        {
            this.id = id;
            Icon pasta=new ImageIcon("./picture/pasta.png");
            setPreferredSize(new Dimension(200,330));
            setIcon(pasta);
        }
    }

    public int getDollars()
    {
        return this.dollars;
    }
    public int getID()
    {
        return this.id;
    }


}
