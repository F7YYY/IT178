package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.h;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;

public final class dp extends j {
    private static final dp a = new dp();

    private dp() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2) {
        return a.b(context, i, i2);
    }

    private View b(Context context, int i, int i2) {
        try {
            return (View) h.a(((di) a(context)).a(h.a((Object) context), i, i2));
        } catch (Exception e) {
            throw new k("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: b */
    public di a(IBinder iBinder) {
        return dj.a(iBinder);
    }
}
