package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;

public abstract class h extends Binder implements g {
    public static g a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new i(iBinder) : (g) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng c = c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int g = g();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float h = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean i3 = i();
                parcel2.writeNoException();
                if (i3) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean a = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int j = j();
                parcel2.writeNoException();
                parcel2.writeInt(j);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
