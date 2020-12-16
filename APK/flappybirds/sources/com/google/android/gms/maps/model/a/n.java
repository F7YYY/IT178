package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;

public abstract class n extends Binder implements m {
    public static m a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new o(iBinder) : (m) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean f = f();
                parcel2.writeNoException();
                if (f) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                g();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                h();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean i3 = i();
                parcel2.writeNoException();
                if (i3) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean j = j();
                parcel2.writeNoException();
                if (j) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean a = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                int k = k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean l = l();
                parcel2.writeNoException();
                if (l) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                float m = m();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
