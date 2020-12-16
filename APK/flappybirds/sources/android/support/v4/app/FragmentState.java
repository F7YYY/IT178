package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new s();
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    Fragment k;

    public FragmentState(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() == 0 ? false : z;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    public FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.f;
        this.c = fragment.o;
        this.d = fragment.w;
        this.e = fragment.x;
        this.f = fragment.y;
        this.g = fragment.B;
        this.h = fragment.A;
        this.i = fragment.h;
    }

    public Fragment a(FragmentActivity fragmentActivity, Fragment fragment) {
        if (this.k != null) {
            return this.k;
        }
        if (this.i != null) {
            this.i.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.k = Fragment.a((Context) fragmentActivity, this.a, this.i);
        if (this.j != null) {
            this.j.setClassLoader(fragmentActivity.getClassLoader());
            this.k.d = this.j;
        }
        this.k.a(this.b, fragment);
        this.k.o = this.c;
        this.k.q = true;
        this.k.w = this.d;
        this.k.x = this.e;
        this.k.y = this.f;
        this.k.B = this.g;
        this.k.A = this.h;
        this.k.s = fragmentActivity.b;
        if (o.a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.k);
        }
        return this.k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        if (!this.h) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
