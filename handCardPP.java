import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.border.Border;
import java.util.HashMap;
import java.util.*;
public class handCardPP extends JPanel
{
    private ArrayList<Card> handCard;
    public handCardPP(ArrayList<Card> hc)
    {
        this.handCard = hc;
        repaintHandCardPanel();
    }
    
    public void repaintHandCardPanel()
    {
        removeAll();

		for(Card temp : handCard)
		{
            add(temp);
            //System.out.println(temp.getNumber());
		}
		revalidate();
    }
}
