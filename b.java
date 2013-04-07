
package com.addonchat.bot;

import java.io.OutputStream;

class b extends OutputStream
{

    b(OutputStream outputstream)
    {
        a = outputstream;
        b = false;
    }

    public synchronized void a(String s)
    {
        try
        {
            byte abyte0[] = s.getBytes("UTF-8");
            byte abyte1[] = new byte[abyte0.length + 1];
            for(int i = 0; i < abyte0.length; i++)
                abyte1[i] = abyte0[i];

            abyte1[abyte0.length] = 10;
            a.write(abyte1, 0, abyte1.length);
        }
        catch(Exception exception)
        {
            b = true;
        }
    }

    public void write(int i)
    {
        try
        {
            a.write(i);
        }
        catch(Exception exception)
        {
            b = true;
        }
    }

    public void flush()
    {
        try
        {
            a.flush();
        }
        catch(Exception exception)
        {
            b = true;
        }
    }

    OutputStream a;
    boolean b;
}
