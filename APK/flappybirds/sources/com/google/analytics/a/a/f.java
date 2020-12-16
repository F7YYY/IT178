package com.google.analytics.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

public enum f implements ad {
    NO_CACHE(0, 1),
    PRIVATE(1, 2),
    PUBLIC(2, 3);
    
    private static ae d;
    private final int e;

    static {
        d = new g();
    }

    private f(int i, int i2) {
        this.e = i2;
    }

    public static f a(int i) {
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                return NO_CACHE;
            case e.MapAttrs_cameraTargetLat /*2*/:
                return PRIVATE;
            case e.MapAttrs_cameraTargetLng /*3*/:
                return PUBLIC;
            default:
                return null;
        }
    }

    public final int a() {
        return this.e;
    }
}
