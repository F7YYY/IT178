package org.andengine.d.i;

import android.os.Build;

public class a {
    public static final boolean a = (Build.VERSION.SDK_INT >= 5);
    public static final boolean b = (Build.VERSION.SDK_INT >= 8);
    public static final boolean c = (Build.VERSION.SDK_INT >= 9);
    public static final boolean d = (Build.VERSION.SDK_INT >= 11);
    public static final boolean e;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 14) {
            z = false;
        }
        e = z;
    }

    public static boolean a(int i) {
        return Build.VERSION.SDK_INT <= i;
    }

    public static boolean a(int i, int i2) {
        return Build.VERSION.SDK_INT >= i && Build.VERSION.SDK_INT <= i2;
    }
}
