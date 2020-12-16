package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface a extends IInterface {
    e a();

    e a(float f);

    e a(float f, float f2);

    e a(float f, int i, int i2);

    e a(CameraPosition cameraPosition);

    e a(LatLng latLng);

    e a(LatLng latLng, float f);

    e a(LatLngBounds latLngBounds, int i);

    e a(LatLngBounds latLngBounds, int i, int i2, int i3);

    e b();

    e b(float f);
}
