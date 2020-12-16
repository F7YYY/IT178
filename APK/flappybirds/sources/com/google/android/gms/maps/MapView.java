package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.k;

public class MapView extends FrameLayout {
    private final d a;
    private a b;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new d(this, context, GoogleMapOptions.a(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new d(this, context, GoogleMapOptions.a(context, attributeSet));
    }

    public final a getMap() {
        if (this.b != null) {
            return this.b;
        }
        this.a.b();
        if (this.a.a() == null) {
            return null;
        }
        try {
            this.b = new a(((c) this.a.a()).a().a());
            return this.b;
        } catch (RemoteException e) {
            throw new k(e);
        }
    }
}
