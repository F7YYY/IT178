package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.e;

public abstract class dj extends Binder implements di {
    public static di a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof di)) ? new dk(iBinder) : (di) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                com.google.android.gms.b.e a = a(f.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
