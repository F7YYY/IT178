package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new c(iBinder) : (a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a = a();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e b = b();
                parcel2.writeNoException();
                if (b != null) {
                    iBinder = b.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a2 = a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a3 = a(parcel.readFloat());
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e b2 = b(parcel.readFloat());
                parcel2.writeNoException();
                if (b2 != null) {
                    iBinder = b2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a4 = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a4 != null) {
                    iBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a5 = a(parcel.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a5 != null) {
                    iBinder = a5.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a6 = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a6 != null) {
                    iBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a7 = a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                parcel2.writeNoException();
                if (a7 != null) {
                    iBinder = a7.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a8 = a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                if (a8 != null) {
                    iBinder = a8.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                com.google.android.gms.b.e a9 = a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a9 != null) {
                    iBinder = a9.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
