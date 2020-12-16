package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.h;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.maps.model.k;

public class bj {
    private static Context a;
    private static z b;

    public static z a(Context context) {
        Cdo.a((Object) context);
        b(context);
        if (b == null) {
            d(context);
        }
        if (b != null) {
            return b;
        }
        b = aa.a((IBinder) a(e(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        c(context);
        return b;
    }

    private static Class a() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private static Object a(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    private static Object a(ClassLoader classLoader, String str) {
        try {
            return a((Class) ((ClassLoader) Cdo.a((Object) classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    public static void b(Context context) {
        int a2 = f.a(context);
        if (a2 != 0) {
            throw new e(a2);
        }
    }

    private static void c(Context context) {
        try {
            b.a(h.a((Object) e(context).getResources()), 3265100);
        } catch (RemoteException e) {
            throw new k(e);
        }
    }

    private static void d(Context context) {
        Class a2 = a();
        if (a2 != null) {
            Log.i(bj.class.getSimpleName(), "Making Creator statically");
            b = (z) a(a2);
            c(context);
        }
    }

    private static Context e(Context context) {
        if (a == null) {
            if (a() != null) {
                a = context;
            } else {
                a = f.b(context);
            }
        }
        return a;
    }
}
