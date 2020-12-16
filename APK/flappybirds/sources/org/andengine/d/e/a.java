package org.andengine.d.e;

import android.util.Log;

public class a {
    private static String a = "AndEngine";
    private static String b = "";
    private static b c = b.VERBOSE;

    public static void a(String str) {
        a(a, str, (Throwable) null);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!c.a(b.VERBOSE)) {
            return;
        }
        if (th == null) {
            Log.v(str, str2);
        } else {
            Log.v(str, str2, th);
        }
    }

    public static void a(String str, Throwable th) {
        b(a, str, th);
    }

    public static void a(Throwable th) {
        b(a, th);
    }

    public static void b(String str) {
        b(a, str, (Throwable) null);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!c.a(b.DEBUG)) {
            return;
        }
        if (th == null) {
            Log.d(str, str2);
        } else {
            Log.d(str, str2, th);
        }
    }

    public static void b(String str, Throwable th) {
        d(a, str, th);
    }

    public static void c(String str) {
        c(a, str, (Throwable) null);
    }

    public static void c(String str, String str2, Throwable th) {
        if (!c.a(b.WARNING)) {
            return;
        }
        if (th == null) {
            Log.w(str, str2);
        } else {
            Log.w(str, str2, th);
        }
    }

    public static void d(String str) {
        d(a, str, (Throwable) null);
    }

    public static void d(String str, String str2, Throwable th) {
        if (!c.a(b.ERROR)) {
            return;
        }
        if (th == null) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, th);
        }
    }
}
