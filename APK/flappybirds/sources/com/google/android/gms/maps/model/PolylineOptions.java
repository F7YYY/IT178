package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final j CREATOR = new j();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.a = 1;
        this.b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f2, int i2, float f3, boolean z, boolean z2) {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0.0f;
        this.f = true;
        this.g = false;
        this.a = i;
        this.b = list;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = z;
        this.g = z2;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            x.a(this, parcel, i);
        } else {
            j.a(this, parcel, i);
        }
    }
}
