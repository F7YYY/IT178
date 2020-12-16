package com.google.tagmanager.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class ac {
    public static final byte[] a = new byte[0];
    public static final ByteBuffer b = ByteBuffer.wrap(a);

    public static int a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int a(ad adVar) {
        return adVar.a();
    }

    public static int a(List list) {
        int i = 1;
        Iterator it = list.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = a((ad) it.next()) + (i2 * 31);
        }
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean a(byte[] bArr) {
        return bj.a(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
