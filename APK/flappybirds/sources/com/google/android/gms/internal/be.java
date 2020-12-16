package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.h;
import com.google.android.gms.plus.f;

public final class be {
    private static Context a;
    private static at b;

    public static View a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) h.a(a(context).a(h.a((Object) context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new f(context, i);
        }
    }

    public static View a(Context context, int i, int i2, String str, String str2) {
        if (str != null) {
            return (View) h.a(a(context).a(h.a((Object) context), i, i2, str, str2));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new f(context, i);
        }
    }

    private static at a(Context context) {
        Cdo.a((Object) context);
        if (b == null) {
            if (a == null) {
                a = com.google.android.gms.common.f.b(context);
                if (a == null) {
                    throw new bf("Could not get remote context.");
                }
            }
            try {
                b = au.a((IBinder) a.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new bf("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new bf("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new bf("Could not access creator.");
            }
        }
        return b;
    }
}
