package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;

public abstract class dg extends Binder implements df {
    public static df a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof df)) ? new dh(iBinder) : (df) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a = dd.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(dd.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a2 = dd.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(a2, readInt2, readString2, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a3 = dd.a(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                c(a3, readInt3, readString3, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a4 = dd.a(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                d(a4, readInt4, readString4, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a5 = dd.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                e(a5, readInt5, readString5, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a6 = dd.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                String readString6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                f(a6, readInt6, readString6, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a7 = dd.a(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                g(a7, readInt7, readString7, bundle);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dc a8 = dd.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                h(a8, readInt8, readString8, bundle);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
