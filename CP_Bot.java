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

    public synchronized void doNickChange(String s, String s1)
    {
        b.a(38, s, s1);
    }

    public synchronized void doNickChange(String s)
    {
        b.a(38, s);
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

    public synchronized void doPrivateMessageSend(String s, String s1)
    {
        c c1 = new c();
        c1.a = 12;
        c1.e = s;
        c1.f = s1;
        b.a(c1);
    }

    public synchronized void doPrivateActionSend(String s, String s1)
    {
        c c1 = new c();
        c1.a = 16;
        c1.e = s;
        c1.f = s1;
        b.a(c1);
    }

    public synchronized void doPrivateMessageCloseWindow(String s)
    {
        b.a(14, s);
    }

    public synchronized void doRoomCreate(String s, String s1)
    {
        b.a(17, s, s1);
    }

    public synchronized void doStatusSet(int i)
    {
        b.a(18, i);
    }

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

    public synchronized void doModRoomToggle(String s, boolean flag)
    {
        b.a(flag ? 35 : 36, s);
    }

    public synchronized void doRoomClose(String s)
    {
        b.a(34, s);
    }

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

    public synchronized void doUserQueryLocation(String s)
    {
        b.a(11006, s);
    }

    public synchronized void doUserNickChange(String s, String s1)
    {
        b.a(40, s, s1);
    }

    public synchronized void doEtherQuery()
    {
        b.a(49);
    }

    public synchronized void doUserSetAdmin(String s, boolean flag)
    {
        b.a(flag ? 24 : 27, s);
    }

    public synchronized void doUserSetModerator(String s, boolean flag)
    {
        b.a(flag ? 25 : 28, s);
    }

    public synchronized void doUserSetGuestSpeaker(String s, boolean flag)
    {
        b.a(flag ? 30 : 31, s);
    }

    public synchronized void doUserSetVIP(String s, boolean flag)
    {
        b.a(flag ? 60 : 61, s);
    }

    public synchronized void doUserSetSilenced(String s, boolean flag)
    {
        b.a(flag ? 26 : 29, s);
    }

    public synchronized void doRoomTopic(String s, String s1)
    {
        b.a(54, s, s1);
    }

    public synchronized void doUserTransfer(String s, String s1, String s2)
    {
        b.a(53, s, s1, s2);
    }

    public synchronized void doRoomTransfer(String s, String s1)
    {
        b.a(59, s, s1, null);
    }

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

    public synchronized void doNoticeRandom(String s, int i)
    {
        b.a(50, null, s, null, i);
    }

    public synchronized void doHistoryClearRoom(String s)
    {
        b.a(55, s);
    }

    public synchronized void doHistoryClearAll()
    {
        b.a(56);
    }

    public synchronized void doScreenClearRoom(String s)
    {
        b.a(57, s);
    }

    public synchronized void doScreenClearAll()
    {
        b.a(58);
    }

    public void onMyRoomJoinSuccess(String s)
    {
    }

    public void onMyLoginSuccess()
    {
    }

    public void onMyInvalidLogin()
    {
    }

    public void onMyBan()
    {
    }

    public void onMyDisconnect()
    {
    }

    public void onMyAccessDenied()
    {
    }

    public void onMyIdleKick()
    {
    }

    public void onMyUsernameInUse()
    {
    }

    public void onMyIPInUse()
    {
    }

    public void onMyFloodWarning()
    {
    }

    public void onMyFloodKick()
    {
    }

    public void onMyKick()
    {
    }

    public void onMyInvalidRoomJoin(String s)
    {
    }

    public void onMyCannotCreateRoom()
    {
    }

    public void onMyNoModeratorAvailable()
    {
    }

    public void onMyMessageSubmittedToModerator()
    {
    }

    public void onMyInvalidNickChange()
    {
    }

    public void onModerateMessageHandled(int i)
    {
    }

    public void onModerateMessage(int i, String s, String s1, String s2, Color color, int j)
    {
    }

    public void onModerateAction(int i, String s, String s1, String s2, int j)
    {
    }

    public void onServerReset()
    {
    }

    public void onServerUnavailable()
    {
    }

    public void onServerAtCapacity()
    {
    }

    public void onServerConnectionLost()
    {
    }

    public void onServerPingResponse()
    {
    }

    public void onServerShutdownNotice(int i, int j)
    {
    }

    public void onPublicMessage(String s, String s1, String s2, Color color, int i)
    {
    }

    public void onPublicAction(String s, String s1, String s2, int i)
    {
    }

    public void onPrivateMessage(String s, String s1, Color color)
    {
    }

    public void onPrivateAction(String s, String s1)
    {
    }

    public void onPrivateMessageWindowClosed(String s)
    {
    }

    public void onSystemMessage(String s)
    {
    }

    public void onModeratorNotice(String s, String s1)
    {
    }

    public void onSpeakerNotice(String s, String s1)
    {
    }

    public void onAdminNotice(String s, String s1)
    {
    }

    public void onRandomNumber(int i)
    {
    }

    public void onRoomPresent(String s)
    {
    }

    public void onRoomClose(String s)
    {
    }

    public void onRoomNotExist(String s)
    {
    }

    public void onRoomAtCapacity(String s)
    {
    }

    public void onRoomUnavailable(String s)
    {
    }

    public void onRoomHistoryMessage(String s, String s1, String s2, int i)
    {
    }

    public void onRoomEntry(String s, String s1)
    {
    }

    public void onRoomDeparture(String s, String s1)
    {
    }

    public void onRoomToggleModerated(String s, boolean flag)
    {
    }

    public void onRoomSetTopic(String s, String s1)
    {
    }

    public void onUserLogin(String s, String s1, String s2)
    {
    }

    public void onUserLogout(String s)
    {
    }

    public void onUserNameChange(String s, String s1)
    {
    }

    public void onUserNotExist(String s)
    {
    }

    public void onUserKicked(String s)
    {
    }

    public void onUserBanned(String s)
    {
    }

    public void onUserInEther(String s, String s1)
    {
    }

    public void onUserSetInRoom(String s, String s1)
    {
    }

    public void onUserSetStatus(String s, int i)
    {
    }

    public void onUserSetIcon(String s, int i)
    {
    }

    public void onUserSetDevice(String s, int i)
    {
    }

    public void onUserToggleAdmin(String s, boolean flag)
    {
    }

    public void onUserToggleModerator(String s, boolean flag)
    {
    }

    public void onUserToggleSpeaker(String s, boolean flag)
    {
    }

    public void onUserToggleTempAdmin(String s, boolean flag)
    {
    }

    public void onUserToggleVIP(String s, boolean flag)
    {
    }

    public void onUserToggleTempMod(String s, boolean flag)
    {
    }

    public void onUserToggleTempSpeaker(String s, boolean flag)
    {
    }

    public void onUserToggleSilenced(String s, boolean flag)
    {
    }

    public void onUserToggleCloaked(String s, boolean flag)
    {
    }

    public void onUserToggleIgnore(String s, String s1, boolean flag)
    {
    }

    public void onUserIPQueryResponse(String s, String s1)
    {
    }

    public void onUserGeoQueryResponse(String s, String s1, String s2)
    {
    }

    private d a;
    private f b;
    private static boolean c = false;

}
