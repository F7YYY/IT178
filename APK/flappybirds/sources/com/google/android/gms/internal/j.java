package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class j implements SafeParcelable {
    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d = false;

    private static boolean a(Class cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get((Object) null));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public static boolean b(String str) {
        ClassLoader t = t();
        if (t == null) {
            return true;
        }
        try {
            return a(t.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader t() {
        ClassLoader classLoader;
        synchronized (a) {
            classLoader = b;
        }
        return classLoader;
    }

    /* access modifiers changed from: protected */
    public static Integer u() {
        Integer num;
        synchronized (a) {
            num = c;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public boolean v() {
        return this.d;
    }
}
