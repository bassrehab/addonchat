package com.addonchat.bot;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

public class Bot
{

    public Bot(int i, int j)
    {
        b = new f(i, j, this, c);
        a = b.a;
        if(a.c)
            onMyDisconnect();
    }

    public static void setDebug(boolean flag)
    {
        c = flag;
    }

    public String getSettingString(String s)
    {
        return a.b(s);
    }

    public URL getSettingURL(String s)
    {
        return a.f(s);
    }

    public int getSettingInt(String s)
    {
        return a.e(s);
    }

    public boolean getSettingBoolean(String s)
    {
        return a.g(s);
    }

    public String[] getSettingStringArray(String s)
    {
        return a.h(s);
    }

    public Font getSettingFont(String s)
    {
        return a.c(s);
    }

    public Color getSettingColor(String s)
    {
        return a.d(s);
    }

    public synchronized void setDisconnectReason(String s)
    {
    }

    public synchronized boolean doConnect()
    {
        return b.c();
    }

    public synchronized void doDisconnect()
    {
        b.d();
        b.a();
    }

    public synchronized void doLogin(String s, String s1)
    {
        b.a(s, s1);
    }

    public synchronized void doLogout()
    {
        b.e();
    }

    public synchronized void doPing()
    {
        b.a(0);
    }

    public synchronized void doRoomEnter(String s, String s1)
    {
        b.b(s, s1);
    }

    public synchronized void doRoomEnter(String s)
    {
        b.a(s);
    }

    public synchronized void doRoomDepart(String s)
    {
        b.a(6, s);
    }

    public synchronized void doPublicMessageSend(String s, String s1, Color color, int i)
    {
        c c1 = new c();
        c1.a = 5;
        c1.e = s;
        c1.f = s1;
        c1.g = color.getRed();
        c1.h = color.getGreen();
        c1.i = color.getBlue();
        c1.b = i;
        b.a(c1);
    }

    public synchronized void doPublicMessageSend(String s, String s1, Color color)
    {
        c c1 = new c();
        c1.a = 5;
        c1.e = s;
        c1.f = s1;
        c1.g = color.getRed();
        c1.h = color.getGreen();
        c1.i = color.getBlue();
        b.a(c1);
    }

    public synchronized void doPublicMessageSend(String s, String s1)
    {
        c c1 = new c();
        c1.a = 5;
        c1.e = s;
        c1.f = s1;
        b.a(c1);
    }

    public synchronized void doPublicActionSend(String s, String s1, int i)
    {
        c c1 = new c();
        c1.a = 15;
        c1.e = s;
        c1.f = s1;
        c1.b = i;
        b.a(c1);
    }

    public synchronized void doPublicActionSend(String s, String s1)
    {
        c c1 = new c();
        c1.a = 15;
        c1.e = s;
        c1.f = s1;
        b.a(c1);
    }

  
    public synchronized void doPrivateMessageSend(String s, String s1, Color color)
    {
        c c1 = new c();
        c1.a = 12;
        c1.e = s;
        c1.f = s1;
        c1.g = color.getRed();
        c1.h = color.getGreen();
        c1.i = color.getBlue();
        b.a(c1);
    }

    // Set bot status

    public synchronized void doStatusSet(int i)
    {
        b.a(18, i);
    }

   // Alert MODS in Chat a report abuse event has occured at the LV chat system

    public synchronized void doModSendMessage(String s, String s1, String s2, Color color, int i)
    {
        c c1 = new c();
        c1.a = 32;
        c1.d = s;
        c1.e = s2;
        c1.f = s1;
        c1.g = color.getRed();
        c1.h = color.getGreen();
        c1.i = color.getBlue();
        c1.b = i;
        b.a(c1);
    }

    public synchronized void doModSendAction(String s, String s1, String s2, int i)
    {
        c c1 = new c();
        c1.a = 33;
        c1.d = s;
        c1.e = s2;
        c1.f = s1;
        c1.b = i;
        b.a(c1);
    }

    public synchronized void doModProcessMessageID(int i)
    {
        b.a(100, i);
    }

    
 /// Just for fun no good use vis-a-vis the current idea

    public synchronized void doUserKick(String s)
    {
        b.a(19, s);
    }

    public synchronized void doUserBan(String s)
    {
        b.a(20, s);
    }

    public synchronized void doUserBanCookie(String s)
    {
        b.a(22, s);
    }

    public synchronized void doUserBanSubnet(String s)
    {
        b.a(21, s);
    }

    public synchronized void doUserQueryIP(String s)
    {
        b.a(23, s);
    }

 

    public synchronized void doEtherQuery()
    {
        b.a(49);
    }

   
    public synchronized void doRoomTopic(String s, String s1)
    {
        b.a(54, s, s1);
    }

    public synchronized void doUserTransfer(String s, String s1, String s2)
    {
        b.a(53, s, s1, s2);
    }

   //IMPORTANT

    public synchronized void doNoticeSystem(String s, String s1)
    {
        b.a(37, null, s, s1);
    }

    public synchronized void doNoticeBroadcast(String s)
    {
        b.a(48, null, s);
    }

    public synchronized void doNoticeAdmin(String s)
    {
        b.a(39, null, s);
    }

    public synchronized void doNoticeModerator(String s)
    {
        b.a(46, null, s);
    }

    public synchronized void doNoticeGuestSpeaker(String s)
    {
        b.a(47, null, s);
    }

    public synchronized void doCloakToggle(boolean flag)
    {
        b.a(flag ? 44 : 45);
    }

    public synchronized void doNoticeURL(String s, URL url)
    {
        b.a(41, null, s, url.toString());
    }

    public synchronized void doUserShowURL(String s, URL url)
    {
        b.a(52, s, url.toString());
    }

   

    private d a;
    private f b;
    private static boolean c = false;

}
