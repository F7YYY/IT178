package com.google.tagmanager;

import android.util.Log;

class g implements j {
    private k a = k.WARNING;

    g() {
    }

    public void a(String str) {
        if (this.a.ordinal() <= k.ERROR.ordinal()) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void b(String str) {
        if (this.a.ordinal() <= k.WARNING.ordinal()) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void c(String str) {
        if (this.a.ordinal() <= k.INFO.ordinal()) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void d(String str) {
        if (this.a.ordinal() <= k.VERBOSE.ordinal()) {
            Log.v("GoogleTagManager", str);
        }
    }
}
