package com.google.android.gms.a;

import android.content.Context;
import com.google.android.gms.common.d;

public final class c {
    private static final String[] a = {"https://www.googleapis.com/auth/appstate"};
    private Context b;
    private com.google.android.gms.common.c c;
    private d d;
    private String[] e = a;
    private String f = "<<default account>>";

    public c(Context context, com.google.android.gms.common.c cVar, d dVar) {
        this.b = context;
        this.c = cVar;
        this.d = dVar;
    }

    public a a() {
        return new a(this.b, this.c, this.d, this.f, this.e);
    }

    public c a(String... strArr) {
        this.e = strArr;
        return this;
    }
}
