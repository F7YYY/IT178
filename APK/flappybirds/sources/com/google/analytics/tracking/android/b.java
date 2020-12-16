package com.google.analytics.tracking.android;

public class b {
    private static a a;

    private static c a() {
        if (a == null) {
            a = a.a();
        }
        if (a != null) {
            return a.b();
        }
        return null;
    }

    public static void a(String str) {
        c a2 = a();
        if (a2 != null) {
            a2.a(str);
        }
    }
}
