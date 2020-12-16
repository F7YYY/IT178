package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new d();
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public BackStackState(o oVar, b bVar) {
        int i2 = 0;
        for (c cVar = bVar.b; cVar != null; cVar = cVar.a) {
            if (cVar.i != null) {
                i2 += cVar.i.size();
            }
        }
        this.a = new int[(i2 + (bVar.d * 7))];
        if (!bVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i3 = 0;
        for (c cVar2 = bVar.b; cVar2 != null; cVar2 = cVar2.a) {
            int i4 = i3 + 1;
            this.a[i3] = cVar2.c;
            int i5 = i4 + 1;
            this.a[i4] = cVar2.d != null ? cVar2.d.f : -1;
            int i6 = i5 + 1;
            this.a[i5] = cVar2.e;
            int i7 = i6 + 1;
            this.a[i6] = cVar2.f;
            int i8 = i7 + 1;
            this.a[i7] = cVar2.g;
            int i9 = i8 + 1;
            this.a[i8] = cVar2.h;
            if (cVar2.i != null) {
                int size = cVar2.i.size();
                int i10 = i9 + 1;
                this.a[i9] = size;
                int i11 = 0;
                while (i11 < size) {
                    this.a[i10] = ((Fragment) cVar2.i.get(i11)).f;
                    i11++;
                    i10++;
                }
                i3 = i10;
            } else {
                i3 = i9 + 1;
                this.a[i9] = 0;
            }
        }
        this.b = bVar.i;
        this.c = bVar.j;
        this.d = bVar.m;
        this.e = bVar.o;
        this.f = bVar.p;
        this.g = bVar.q;
        this.h = bVar.r;
        this.i = bVar.s;
    }

    public b a(o oVar) {
        b bVar = new b(oVar);
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.a.length) {
            c cVar = new c();
            int i4 = i3 + 1;
            cVar.c = this.a[i3];
            if (o.a) {
                Log.v("FragmentManager", "Instantiate " + bVar + " op #" + i2 + " base fragment #" + this.a[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.a[i4];
            if (i6 >= 0) {
                cVar.d = (Fragment) oVar.f.get(i6);
            } else {
                cVar.d = null;
            }
            int i7 = i5 + 1;
            cVar.e = this.a[i5];
            int i8 = i7 + 1;
            cVar.f = this.a[i7];
            int i9 = i8 + 1;
            cVar.g = this.a[i8];
            int i10 = i9 + 1;
            cVar.h = this.a[i9];
            int i11 = i10 + 1;
            int i12 = this.a[i10];
            if (i12 > 0) {
                cVar.i = new ArrayList(i12);
                int i13 = 0;
                while (i13 < i12) {
                    if (o.a) {
                        Log.v("FragmentManager", "Instantiate " + bVar + " set remove fragment #" + this.a[i11]);
                    }
                    cVar.i.add((Fragment) oVar.f.get(this.a[i11]));
                    i13++;
                    i11++;
                }
            }
            bVar.a(cVar);
            i2++;
            i3 = i11;
        }
        bVar.i = this.b;
        bVar.j = this.c;
        bVar.m = this.d;
        bVar.o = this.e;
        bVar.k = true;
        bVar.p = this.f;
        bVar.q = this.g;
        bVar.r = this.h;
        bVar.s = this.i;
        bVar.a(1);
        return bVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
    }
}
