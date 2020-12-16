package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class x implements SafeParcelable {
    public static final ds CREATOR = new ds();
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public x(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && dl.a(this.d, xVar.d) && dl.a(this.e, xVar.e);
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public boolean h() {
        return this.b == 1 && this.c == -1;
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    public boolean i() {
        return this.b == 2;
    }

    public String toString() {
        if (i()) {
            return String.format("Person [%s] %s", new Object[]{e(), f()});
        } else if (h()) {
            return String.format("Circle [%s] %s", new Object[]{d(), f()});
        } else {
            return String.format("Group [%s] %s", new Object[]{d(), f()});
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        ds.a(this, parcel, i);
    }
}
