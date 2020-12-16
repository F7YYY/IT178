package com.google.android.gms.maps.model;

public final class b {
    private LatLng a;
    private float b;
    private float c;
    private float d;

    public CameraPosition a() {
        return new CameraPosition(this.a, this.b, this.c, this.d);
    }

    public b a(float f) {
        this.b = f;
        return this;
    }

    public b a(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public b b(float f) {
        this.c = f;
        return this;
    }

    public b c(float f) {
        this.d = f;
        return this;
    }
}
