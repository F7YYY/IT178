package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class cq implements SafeParcelable {
    public static final by CREATOR = new by();
    private final int a;
    private final ArrayList b;
    private final ArrayList c;
    private final Bundle d;
    private final boolean e;
    private final int f;

    public cq(int i, ArrayList arrayList, ArrayList arrayList2, Bundle bundle, boolean z, int i2) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = bundle;
        this.e = z;
        this.f = i2;
    }

    public ArrayList a() {
        return this.b;
    }

    public ArrayList b() {
        return this.c;
    }

    public Bundle c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return this.a == cqVar.a && dl.a(this.b, cqVar.b) && dl.a(this.c, cqVar.c) && dl.a(this.d, cqVar.d) && dl.a(Integer.valueOf(this.f), Integer.valueOf(cqVar.f));
    }

    public int f() {
        return this.a;
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.a), this.b, this.c, this.d, Integer.valueOf(this.f));
    }

    public void writeToParcel(Parcel parcel, int i) {
        by.a(this, parcel, i);
    }
}
