package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class q extends Binder implements p {
    public static p a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new r(iBinder) : (p) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a((List) parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                List c = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b((List) parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                List d = d();
                parcel2.writeNoException();
                parcel2.writeList(d);
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int g = g();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float h = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean i3 = i();
                parcel2.writeNoException();
                if (i3) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean j = j();
                parcel2.writeNoException();
                if (j) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean a = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int k = k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
