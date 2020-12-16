package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

class dk implements di {
    private IBinder a;

    dk(IBinder iBinder) {
        this.a = iBinder;
    }

    public e a(e eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return f.a(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
