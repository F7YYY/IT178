package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.bd;
import java.util.ArrayList;
import java.util.Arrays;

public class c {
    private Context a;
    private String b;
    private com.google.android.gms.common.c c;
    private d d;
    private ArrayList e = new ArrayList();
    private String[] f;
    private String[] g;
    private String h = this.a.getPackageName();
    private String i = this.a.getPackageName();
    private String j;

    public c(Context context, com.google.android.gms.common.c cVar, d dVar) {
        this.a = context;
        this.c = cVar;
        this.d = dVar;
        this.e.add("https://www.googleapis.com/auth/plus.login");
    }

    public b a() {
        if (this.b == null) {
            this.b = "<<default account>>";
        }
        return new b(new bd(this.a, new a(this.b, (String[]) this.e.toArray(new String[this.e.size()]), this.f, this.g, this.h, this.i, this.j), this.c, this.d));
    }

    public c a(String... strArr) {
        this.e.clear();
        this.e.addAll(Arrays.asList(strArr));
        return this;
    }
}
