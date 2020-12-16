package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;

public abstract class t extends Binder implements s {
    public static s a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof s)) ? new u(iBinder) : (s) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (i) {
            case e.MapAttrs_cameraBearing:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLng:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                d(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraZoom:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                e(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                f(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiRotateGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                g(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                h(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiTiltGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean a = a();
                parcel2.writeNoException();
                if (a) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_uiZoomControls:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean b = b();
                parcel2.writeNoException();
                if (b) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_uiZoomGestures:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean c = c();
                parcel2.writeNoException();
                if (c) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_useViewLifecycle:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean d = d();
                parcel2.writeNoException();
                if (d) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case e.MapAttrs_zOrderOnTop:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean e = e();
                parcel2.writeNoException();
                if (e) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean f = f();
                parcel2.writeNoException();
                if (f) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean g = g();
                parcel2.writeNoException();
                if (g) {
                    z = true;
                }
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
