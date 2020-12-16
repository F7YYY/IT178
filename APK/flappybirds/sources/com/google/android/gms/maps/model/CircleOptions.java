package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;

public final class CircleOptions implements SafeParcelable {
    public static final d CREATOR = new d();
    private final int a;
    private LatLng b;
    private double c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;

    public CircleOptions() {
        this.b = null;
        this.c = 0.0d;
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d2, float f2, int i2, int i3, float f3, boolean z) {
        this.b = null;
        this.c = 0.0d;
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.a = i;
        this.b = latLng;
        this.c = d2;
        this.d = f2;
        this.e = i2;
        this.f = i3;
        this.g = f3;
        this.h = z;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    public LatLng b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            r.a(this, parcel, i);
        } else {
            d.a(this, parcel, i);
        }
    }
}
