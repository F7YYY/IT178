package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.plus.a.b.a;

public class bd extends cr {
    private a f;
    private com.google.android.gms.plus.a g;

    public bd(Context context, com.google.android.gms.plus.a aVar, c cVar, d dVar) {
        super(context, cVar, dVar, aVar.c());
        this.g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ba b(IBinder iBinder) {
        return bb.a(iBinder);
    }

    /* access modifiers changed from: protected */
    public void a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f = cc.a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    public void a(df dfVar, cu cuVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", this.g.d());
        if (this.g.e() != null) {
            bundle.putStringArray("required_features", this.g.e());
        }
        if (this.g.h() != null) {
            bundle.putString("application_name", this.g.h());
        }
        dfVar.a(cuVar, 3265100, this.g.g(), this.g.f(), k(), this.g.b(), bundle);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }
}
