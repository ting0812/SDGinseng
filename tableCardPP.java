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

public class tableCardPP extends JPanel
{
    private ArrayList<foodCard> tableCard;
    public tableCardPP(ArrayList<foodCard> tc)
    {
        this.tableCard = tc;

        repaintTableCardPanel();
    }


    public void repaintTableCardPanel()
	{
        removeAll();
        add(tableCard.get(0));
        add(tableCard.get(1));
        add(tableCard.get(2));
		revalidate();
    }
    
    public void abandon(foodCard no)
    {
        tableCard.remove(no);
    }

}
