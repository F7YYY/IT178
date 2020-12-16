package com.google.android.gms.internal;

import android.util.Log;

public final class db {
    private final String a;

    public db(String str) {
        this.a = (String) Cdo.a((Object) str);
    }

    public void a(String str, String str2) {
        if (a(5)) {
            Log.w(str, str2);
        }
    }

    public void a(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, str2, th);
        }
    }

    public boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public void b(String str, String str2) {
        if (a(6)) {
            Log.e(str, str2);
        }
    }
}
