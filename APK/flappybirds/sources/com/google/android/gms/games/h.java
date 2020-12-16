package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class h implements Parcelable.Creator {
    static void a(GameEntity gameEntity, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, gameEntity.b(), false);
        c.a(parcel, 2, gameEntity.c(), false);
        c.a(parcel, 3, gameEntity.d(), false);
        c.a(parcel, 4, gameEntity.e(), false);
        c.a(parcel, 5, gameEntity.f(), false);
        c.a(parcel, 6, gameEntity.g(), false);
        c.a(parcel, 7, (Parcelable) gameEntity.h(), i, false);
        c.a(parcel, 8, (Parcelable) gameEntity.i(), i, false);
        c.a(parcel, 9, (Parcelable) gameEntity.j(), i, false);
        c.a(parcel, 10, gameEntity.k());
        c.a(parcel, 11, gameEntity.l());
        c.a(parcel, 12, gameEntity.m(), false);
        c.a(parcel, 13, gameEntity.n());
        c.a(parcel, 14, gameEntity.o());
        c.a(parcel, 15, gameEntity.p());
        c.a(parcel, 1000, gameEntity.q());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat:
                    str2 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng:
                    str3 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt:
                    str4 = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom:
                    str5 = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiCompass:
                    str6 = a.l(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_uiScrollGestures:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_uiTiltGestures:
                    uri3 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case e.MapAttrs_uiZoomControls:
                    z = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiZoomGestures:
                    z2 = a.c(parcel, a);
                    break;
                case e.MapAttrs_useViewLifecycle:
                    str7 = a.l(parcel, a);
                    break;
                case e.MapAttrs_zOrderOnTop:
                    i2 = a.f(parcel, a);
                    break;
                case 14:
                    i3 = a.f(parcel, a);
                    break;
                case 15:
                    i4 = a.f(parcel, a);
                    break;
                case 1000:
                    i = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
