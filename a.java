
package com.addonchat.bot;

import java.io.*;

class a extends InputStream
{

    a(InputStream inputstream)
    {
        b = new byte[4096];
        a = new BufferedInputStream(inputstream, 16384);
    }

    public synchronized String a()
        throws IOException
    {
        c = 0;
        int i;
        while((i = a.read()) != -1) 
        {
            if(i == 10)
                return b();
            b[c] = (byte)i;
            c++;
            if(c >= 4096)
                throw new IOException();
        }
        throw new IOException();
    }

    public int read()
        throws IOException
    {
        return a.read();
    }

    private String b()
        throws UnsupportedEncodingException
    {
        return new String(b, 0, c, "UTF-8");
    }

    BufferedInputStream a;
    byte b[];
    int c;
}
