package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae;
import com.google.android.gms.plus.a.a.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bz extends ae implements SafeParcelable, b {
    public static final bk CREATOR = new bk();
    private static final HashMap a = new HashMap();
    private final Set b;
    private final int c;
    private String d;
    private bx e;
    private String f;
    private bx g;
    private String h;

    static {
        a.put("id", ae.a.d("id", 2));
        a.put("result", ae.a.a("result", 4, bx.class));
        a.put("startDate", ae.a.d("startDate", 5));
        a.put("target", ae.a.a("target", 6, bx.class));
        a.put("type", ae.a.d("type", 7));
    }

    public bz() {
        this.c = 1;
        this.b = new HashSet();
    }

    bz(Set set, int i, String str, bx bxVar, String str2, bx bxVar2, String str3) {
        this.b = set;
        this.c = i;
        this.d = str;
        this.e = bxVar;
        this.f = str2;
        this.g = bxVar2;
        this.h = str3;
    }

    /* access modifiers changed from: protected */
    public Object a(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean a(ae.a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    /* access modifiers changed from: protected */
    public Object b(ae.a aVar) {
        switch (aVar.g()) {
            case e.MapAttrs_cameraTargetLat:
                return this.d;
            case e.MapAttrs_cameraTilt:
                return this.e;
            case e.MapAttrs_cameraZoom:
                return this.f;
            case e.MapAttrs_uiCompass:
                return this.g;
            case e.MapAttrs_uiRotateGestures:
                return this.h;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.g());
        }
    }

    public HashMap b() {
        return a;
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        return false;
    }

    public int describeContents() {
        bk bkVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bz bzVar = (bz) obj;
        for (ae.a aVar : a.values()) {
            if (a(aVar)) {
                if (!bzVar.a(aVar)) {
                    return false;
                }
                if (!b(aVar).equals(bzVar.b(aVar))) {
                    return false;
                }
            } else if (bzVar.a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public bx h() {
        return this.e;
    }

    public int hashCode() {
        int i = 0;
        Iterator it = a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            ae.a aVar = (ae.a) it.next();
            if (a(aVar)) {
                i = b(aVar).hashCode() + i2 + aVar.g();
            } else {
                i = i2;
            }
        }
    }

    public String i() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public bx j() {
        return this.g;
    }

    public String k() {
        return this.h;
    }

    /* renamed from: l */
    public bz a() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bk bkVar = CREATOR;
        bk.a(this, parcel, i);
    }
}
