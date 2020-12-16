package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public final class bj extends cr {
    private final String f;

    public bj(Context context, c cVar, d dVar, String str, String[] strArr) {
        super(context, cVar, dVar, strArr);
        this.f = (String) Cdo.a((Object) str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ce b(IBinder iBinder) {
        return cf.a(iBinder);
    }

    /* access modifiers changed from: protected */
    public void a(df dfVar, cu cuVar) {
        dfVar.a(cuVar, 3265100, j().getPackageName(), this.f, k());
    }

    /* access modifiers changed from: protected */
    public void a(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals("https://www.googleapis.com/auth/appstate")) {
                z = true;
            }
        }
        Cdo.a(z, (Object) String.format("AppStateClient requires %s to function.", new Object[]{"https://www.googleapis.com/auth/appstate"}));
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "com.google.android.gms.appstate.service.START";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
