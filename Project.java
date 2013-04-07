import java.applet.Applet;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class Project extends Applet
{
    private Image msg = null;

    public void init()
    {
        // Load the message_string
        try 
        {
           
            // Wait for the msg load
            msgWait.waitForAll();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        // TODO: Initialization things here.
    }
    
    /**
     * This is where things will get drawn to the screen within your applet.
     */
    public void paint(Graphics g)
    {
        g.drawString("Listener Venter_waiting alert from HeartoHelp.us", 25, 25);
//Some LV_count parameter
        g.drawImage(msg, 0, 50, null);
    }
}






