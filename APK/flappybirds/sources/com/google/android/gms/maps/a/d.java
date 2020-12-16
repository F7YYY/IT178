package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.b.e;
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

public interface d extends IInterface {
    CameraPosition a();

    a a(PolylineOptions polylineOptions);

    g a(CircleOptions circleOptions);

    j a(GroundOverlayOptions groundOverlayOptions);

    m a(MarkerOptions markerOptions);

    p a(PolygonOptions polygonOptions);

    s a(TileOverlayOptions tileOverlayOptions);

    void a(int i);

    void a(int i, int i2, int i3, int i4);

    void a(e eVar);

    void a(e eVar, int i, w wVar);

    void a(e eVar, w wVar);

    void a(ac acVar);

    void a(af afVar);

    void a(ai aiVar);

    void a(ao aoVar);

    void a(ar arVar);

    void a(au auVar);

    void a(ax axVar);

    void a(ba baVar);

    void a(bd bdVar);

    void a(bg bgVar, e eVar);

    void a(g gVar);

    void a(boolean z);

    float b();

    void b(e eVar);

    boolean b(boolean z);

    float c();

    void c(boolean z);

    void d();

    void e();

    int f();

    boolean g();

    boolean h();

    boolean i();

    Location j();

    s k();

    p l();

    e m();
}
