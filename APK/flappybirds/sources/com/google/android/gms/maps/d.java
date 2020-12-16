package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.b.b;
import com.google.android.gms.b.h;
import com.google.android.gms.b.i;
import com.google.android.gms.common.e;
import com.google.android.gms.maps.a.bj;
import com.google.android.gms.maps.model.k;

class d extends b {
    protected i a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;

    d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.b = viewGroup;
        this.c = context;
        this.d = googleMapOptions;
    }

    public void b() {
        if (this.a != null && a() == null) {
            try {
                this.a.a(new c(this.b, bj.a(this.c).a(h.a((Object) this.c), this.d)));
            } catch (RemoteException e) {
                throw new k(e);
            } catch (e e2) {
            }
        }
    }
}
