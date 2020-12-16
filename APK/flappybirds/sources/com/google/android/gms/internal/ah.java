package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ae;
import java.util.ArrayList;
import java.util.HashMap;

public class ah implements SafeParcelable {
    public static final g CREATOR = new g();
    private final int a;
    private final HashMap b;
    private final ArrayList c = null;
    private final String d;

    public class a implements SafeParcelable {
        public static final h CREATOR = new h();
        final int a;
        final String b;
        final ArrayList c;

        a(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        a(String str, HashMap hashMap) {
            this.a = 1;
            this.b = str;
            this.c = a(hashMap);
        }

        private static ArrayList a(HashMap hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : hashMap.keySet()) {
                arrayList.add(new b(str, (ae.a) hashMap.get(str)));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public HashMap a() {
            HashMap hashMap = new HashMap();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                b bVar = (b) this.c.get(i);
                hashMap.put(bVar.b, bVar.c);
            }
            return hashMap;
        }

        public int describeContents() {
            h hVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            h hVar = CREATOR;
            h.a(this, parcel, i);
        }
    }

    public class b implements SafeParcelable {
        public static final f CREATOR = new f();
        final int a;
        final String b;
        final ae.a c;

        b(int i, String str, ae.a aVar) {
            this.a = i;
            this.b = str;
            this.c = aVar;
        }

        b(String str, ae.a aVar) {
            this.a = 1;
            this.b = str;
            this.c = aVar;
        }

        public int describeContents() {
            f fVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            f fVar = CREATOR;
            f.a(this, parcel, i);
        }
    }

    ah(int i, ArrayList arrayList, String str) {
        this.a = i;
        this.b = a(arrayList);
        this.d = (String) Cdo.a((Object) str);
        a();
    }

    private static HashMap a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            hashMap.put(aVar.b, aVar.a());
        }
        return hashMap;
    }

    public HashMap a(String str) {
        return (HashMap) this.b.get(str);
    }

    public void a() {
        for (String str : this.b.keySet()) {
            HashMap hashMap = (HashMap) this.b.get(str);
            for (String str2 : hashMap.keySet()) {
                ((ae.a) hashMap.get(str2)).a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new a(str, (HashMap) this.b.get(str)));
        }
        return arrayList;
    }

    public String d() {
        return this.d;
    }

    public int describeContents() {
        g gVar = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(str).append(":\n");
            HashMap hashMap = (HashMap) this.b.get(str);
            for (String str2 : hashMap.keySet()) {
                sb.append("  ").append(str2).append(": ");
                sb.append(hashMap.get(str2));
            }
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g gVar = CREATOR;
        g.a(this, parcel, i);
    }
}
