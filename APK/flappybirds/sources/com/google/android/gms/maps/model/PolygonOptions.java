package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final i CREATOR = new i();
    private final int a;
    private final List b;
    private final List c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public PolygonOptions() {
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.a = 1;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    PolygonOptions(int i2, List list, List list2, float f2, int i3, int i4, float f3, boolean z, boolean z2) {
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.i = false;
        this.a = i2;
        this.b = list;
        this.c = list2;
        this.d = f2;
        this.e = i3;
        this.f = i4;
        this.g = f3;
        this.h = z;
        this.i = z2;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public List b() {
        return this.c;
    }

    public List c() {
        return this.b;
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

    public boolean i() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (bk.a()) {
            w.a(this, parcel, i2);
        } else {
            i.a(this, parcel, i2);
        }
    }
}
