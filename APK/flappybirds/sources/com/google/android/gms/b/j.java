package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.Cdo;

public abstract class j {
    private final String a;
    private Object b;

    protected j(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final Object a(Context context) {
        if (this.b == null) {
            Cdo.a((Object) context);
            Context b2 = f.b(context);
            if (b2 == null) {
                throw new k("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) b2.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new k("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new k("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new k("Could not access creator.");
            }
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(IBinder iBinder);
}
