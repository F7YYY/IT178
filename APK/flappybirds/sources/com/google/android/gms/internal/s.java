package com.google.android.gms.internal;

import com.google.android.gms.common.data.d;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.a.b;

final class s extends q {
    final /* synthetic */ r a;
    private final a b;

    public s(r rVar, a aVar) {
        this.a = rVar;
        this.b = (a) Cdo.a((Object) aVar, (Object) "Listener must not be null");
    }

    public void c(d dVar) {
        this.a.a((ct) new t(this.a, this.b, new b(dVar)));
    }
}
