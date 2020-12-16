package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public final class f {
    private final Context a;
    private String b;
    private String c = "<<default account>>";
    private final c d;
    private final d e;
    private String[] f = {"https://www.googleapis.com/auth/games"};
    private int g = 49;
    private View h;

    public f(Context context, c cVar, d dVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.d = cVar;
        this.e = dVar;
    }

    public c a() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public f a(int i) {
        this.g = i;
        return this;
    }

    public f a(String... strArr) {
        this.f = strArr;
        return this;
    }
}
