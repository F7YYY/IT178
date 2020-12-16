package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.d;

public abstract class cb extends Binder implements ca {
    public static ca a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ca)) ? new cd(iBinder) : (ca) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        d dVar = null;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                a(readInt, dVar);
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                a(dVar);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a();
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
