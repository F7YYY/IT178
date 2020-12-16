package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.Cdo;
import java.util.HashMap;

public final class d implements SafeParcelable {
    public static final f CREATOR = new f();
    private static final HashMap e = null;
    private static final Object f = new Object();
    private static final e l = new c(new String[0], (String) null);
    Bundle a;
    int[] b;
    int c;
    boolean d = false;
    private final int g;
    private final String[] h;
    private final CursorWindow[] i;
    private final int j;
    private final Bundle k;

    d(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.g = i2;
        this.h = strArr;
        this.i = cursorWindowArr;
        this.j = i3;
        this.k = bundle;
    }

    private void a(String str, int i2) {
        if (this.a == null || !this.a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.c) {
            throw new CursorIndexOutOfBoundsException(i2, this.c);
        }
    }

    public int a(int i2) {
        int i3 = 0;
        Cdo.a(i2 >= 0 && i2 < this.c);
        while (true) {
            if (i3 >= this.b.length) {
                break;
            } else if (i2 < this.b[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == this.b.length ? i3 - 1 : i3;
    }

    public long a(String str, int i2, int i3) {
        a(str, i2);
        return this.i[i3].getLong(i2 - this.b[i3], this.a.getInt(str));
    }

    public void a() {
        this.a = new Bundle();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            this.a.putInt(this.h[i2], i2);
        }
        this.b = new int[this.i.length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.i.length; i4++) {
            this.b[i4] = i3;
            i3 += this.i[i4].getNumRows();
        }
        this.c = i3;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.g;
    }

    public int b(String str, int i2, int i3) {
        a(str, i2);
        return this.i[i3].getInt(i2 - this.b[i3], this.a.getInt(str));
    }

    public String c(String str, int i2, int i3) {
        a(str, i2);
        return this.i[i3].getString(i2 - this.b[i3], this.a.getInt(str));
    }

    /* access modifiers changed from: package-private */
    public String[] c() {
        return this.h;
    }

    public boolean d(String str, int i2, int i3) {
        a(str, i2);
        return Long.valueOf(this.i[i3].getLong(i2 - this.b[i3], this.a.getInt(str))).longValue() == 1;
    }

    /* access modifiers changed from: package-private */
    public CursorWindow[] d() {
        return this.i;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.j;
    }

    public Uri e(String str, int i2, int i3) {
        String c2 = c(str, i2, i3);
        if (c2 == null) {
            return null;
        }
        return Uri.parse(c2);
    }

    public Bundle f() {
        return this.k;
    }

    public boolean f(String str, int i2, int i3) {
        a(str, i2);
        return this.i[i3].isNull(i2 - this.b[i3], this.a.getInt(str));
    }

    public int g() {
        return this.c;
    }

    public boolean h() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        f.a(this, parcel, i2);
    }
}
