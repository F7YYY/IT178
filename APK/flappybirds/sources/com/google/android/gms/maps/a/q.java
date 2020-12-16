package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract class q extends Binder implements p {
    public static p a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new r(iBinder) : (p) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                LatLng a = a(f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                com.google.android.gms.b.e a2 = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                VisibleRegion a3 = a();
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
