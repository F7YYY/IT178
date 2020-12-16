package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class co implements SafeParcelable {
    public static final bw CREATOR = new bw();
    private final int a;
    private final String b;
    private final List c;
    private final List d;
    private final Uri e;
    private final String f;
    private final String g;
    private final String h;
    private final Bundle i;
    private final Bundle j;
    private final int k;

    public co(int i2, String str, List list, List list2, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, int i3) {
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = uri;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = bundle;
        this.j = bundle2;
        this.k = i3;
    }

    public List a() {
        return this.c;
    }

    public List b() {
        return this.d;
    }

    public Uri c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return this.a == coVar.a && dl.a(this.c, coVar.c) && dl.a(this.d, coVar.d) && dl.a(this.e, coVar.e) && dl.a(this.f, coVar.f) && dl.a(this.g, coVar.g) && dl.a(this.h, coVar.h);
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.b;
    }

    public Bundle h() {
        return this.i;
    }

    public int hashCode() {
        return dl.a(Integer.valueOf(this.a), this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public Bundle i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        bw.a(this, parcel, i2);
    }
}
