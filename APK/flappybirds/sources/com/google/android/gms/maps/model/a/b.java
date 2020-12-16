package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new c(iBinder) : (a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a((List) parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                List c = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                int e = e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                float f = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean g = g();
                parcel2.writeNoException();
                if (g) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean h = h();
                parcel2.writeNoException();
                if (h) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                boolean a = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                int i3 = i();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
