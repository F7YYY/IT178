package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class ab implements SafeParcelable, d {
    public static final b CREATOR = new b();
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;

    public final class a implements SafeParcelable {
        public static final c CREATOR = new c();
        final int a;
        final String b;
        final int c;

        a(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        a(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }

        public int describeContents() {
            c cVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            c cVar = CREATOR;
            c.a(this, parcel, i);
        }
    }

    public ab() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
    }

    ab(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
        a(arrayList);
    }

    private void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a(aVar.b, aVar.c);
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    public ab a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.c.put(Integer.valueOf(i), str);
        return this;
    }

    public String a(Integer num) {
        String str = (String) this.c.get(num);
        return (str != null || !this.b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    /* access modifiers changed from: package-private */
    public ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new a(str, ((Integer) this.b.get(str)).intValue()));
        }
        return arrayList;
    }

    public int c() {
        return 7;
    }

    public int d() {
        return 0;
    }

    public int describeContents() {
        b bVar = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b bVar = CREATOR;
        b.a(this, parcel, i);
    }
}
