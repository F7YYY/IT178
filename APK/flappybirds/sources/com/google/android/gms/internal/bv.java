package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class bv implements SafeParcelable {
    public static final bg CREATOR = new bg();
    private final int a;
    private final String b;
    private final ArrayList c;
    private final ArrayList d;
    private final boolean e;

    public bv(int i, String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = z;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public ArrayList c() {
        return this.c;
    }

    public ArrayList d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bg.a(this, parcel, i);
    }
}
