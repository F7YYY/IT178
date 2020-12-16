package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.s;

public abstract class e extends Binder implements d {
    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new f(iBinder) : (d) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        IBinder iBinder = null;
        switch (i) {
            case com.google.android.gms.e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition a = a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float b = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float c = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c);
                return true;
            case com.google.android.gms.e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                b(f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(f.a(parcel.readStrongBinder()), x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(f.a(parcel.readStrongBinder()), parcel.readInt(), x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                d();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a a2 = a(parcel.readInt() != 0 ? PolylineOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                p a3 = a(parcel.readInt() != 0 ? PolygonOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case com.google.android.gms.e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                m a4 = a(parcel.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a4 != null) {
                    iBinder = a4.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case com.google.android.gms.e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                j a5 = a(parcel.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a5 != null) {
                    iBinder = a5.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case com.google.android.gms.e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                s a6 = a(parcel.readInt() != 0 ? TileOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a6 != null) {
                    iBinder = a6.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                int f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean g = g();
                parcel2.writeNoException();
                if (g) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean h = h();
                parcel2.writeNoException();
                if (h) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean b2 = b(parcel.readInt() != 0);
                parcel2.writeNoException();
                if (b2) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean i3 = i();
                parcel2.writeNoException();
                if (i3) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location j = j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(h.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                s k = k();
                parcel2.writeNoException();
                if (k != null) {
                    iBinder = k.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                p l = l();
                parcel2.writeNoException();
                if (l != null) {
                    iBinder = l.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ag.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ap.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(as.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(av.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ay.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(aj.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(ad.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                com.google.android.gms.b.e m = m();
                parcel2.writeNoException();
                if (m != null) {
                    iBinder = m.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                g a7 = a(parcel.readInt() != 0 ? CircleOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a7 != null) {
                    iBinder = a7.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(be.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(bb.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(bh.a(parcel.readStrongBinder()), f.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
