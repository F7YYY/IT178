package com.google.android.gms.internal;

import android.os.Build;

public final class p {
    public static boolean a() {
        return a(11);
    }

    private static boolean a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean b() {
        return a(12);
    }

    public static boolean c() {
        return a(13);
    }

    public static boolean d() {
        return a(16);
    }

    public static boolean e() {
        return a(17);
    }
}
