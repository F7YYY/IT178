package org.andengine.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import org.andengine.b.b.d;
import org.andengine.input.a.a.e;
import org.andengine.input.a.a.f;
import org.andengine.input.sensor.a.g;
import org.andengine.input.sensor.b;
import org.andengine.opengl.a.c;
import org.andengine.opengl.b.h;

public class a implements SensorEventListener, LocationListener, View.OnTouchListener, e {
    private static final b e = b.GAME;
    private final d A = new d(8);
    private final org.andengine.b.b.a B = new org.andengine.b.b.a(4);
    protected final org.andengine.b.a.a a;
    protected org.andengine.c.b.e b;
    protected int c = 1;
    protected int d = 1;
    private boolean f;
    private boolean g;
    private long h;
    private float i;
    private final c j;
    private final d k;
    private final org.andengine.b.b.a.a l = new org.andengine.b.b.a.a();
    private final org.andengine.b.c.b m;
    private org.andengine.input.a.a.d n;
    private final org.andengine.opengl.d.e o = new org.andengine.opengl.d.e();
    private final org.andengine.opengl.c.e p = new org.andengine.opengl.c.e();
    private final c q = new c();
    private final h r = new h();
    private final org.andengine.a.c.c s;
    private final org.andengine.a.b.b t;
    private org.andengine.input.sensor.location.a u;
    private Location v;
    private g w;
    private org.andengine.input.sensor.a.a x;
    private org.andengine.input.sensor.b.a y;
    private org.andengine.input.sensor.b.b z;

    public a(org.andengine.b.c.b bVar) {
        org.andengine.opengl.c.a.a.b.a();
        org.andengine.a.c.b.a();
        org.andengine.a.b.a.a();
        org.andengine.opengl.a.b.a();
        this.o.a();
        this.p.a();
        this.q.a();
        this.r.a();
        this.m = bVar;
        if (this.m.a()) {
            this.j = bVar.b();
        } else {
            this.j = new c(false);
        }
        this.a = bVar.i();
        if (this.m.c().a()) {
            a((org.andengine.input.a.a.d) new f());
        } else {
            a((org.andengine.input.a.a.d) new org.andengine.input.a.a.g());
        }
        if (this.m.d().b()) {
            this.s = new org.andengine.a.c.c(this.m.d().a().b());
        } else {
            this.s = null;
        }
        if (this.m.d().c()) {
            this.t = new org.andengine.a.b.b();
        } else {
            this.t = null;
        }
        if (this.m.j()) {
            this.k = this.m.k();
        } else {
            this.k = new d();
        }
        this.k.a(this);
    }

    private void n() {
        if (this.g) {
            throw new b(this);
        }
    }

    private long o() {
        return System.nanoTime() - this.h;
    }

    public void a() {
        this.k.start();
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
        if (this.b != null) {
            this.b.a_(f2);
        }
    }

    public void a(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        f();
    }

    public void a(long j2) {
        float f2 = ((float) j2) * 1.0E-9f;
        this.i += f2;
        this.h += j2;
        this.n.a_(f2);
        b(f2);
        a(f2);
    }

    public void a(org.andengine.c.b.e eVar) {
        this.b = eVar;
    }

    public void a(org.andengine.input.a.a.d dVar) {
        this.n = dVar;
        this.n.a((e) this);
    }

    public void a(org.andengine.opengl.util.e eVar) {
        c cVar = this.j;
        cVar.lock();
        try {
            cVar.c();
            this.o.a(eVar);
            this.p.a(eVar);
            this.q.a(eVar);
            a(eVar, this.a);
            b(eVar, this.a);
            cVar.b();
        } finally {
            cVar.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void a(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.B.a(eVar, aVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(org.andengine.b.a.a aVar, org.andengine.input.a.a aVar2) {
        if (aVar.j()) {
            return aVar.i().a(aVar2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(org.andengine.c.b.e eVar, org.andengine.input.a.a aVar) {
        if (eVar != null) {
            return eVar.a(aVar);
        }
        return false;
    }

    public boolean a(org.andengine.input.a.a aVar) {
        org.andengine.c.b.e c2 = c(aVar);
        org.andengine.b.a.a b2 = b(aVar);
        b(b2, aVar);
        if (a(b2, aVar)) {
            return true;
        }
        return a(c2, aVar);
    }

    /* access modifiers changed from: protected */
    public org.andengine.b.a.a b(org.andengine.input.a.a aVar) {
        return e();
    }

    public synchronized void b() {
        if (!this.f) {
            this.h = System.nanoTime();
            this.f = true;
        }
    }

    /* access modifiers changed from: protected */
    public void b(float f2) {
        this.l.a_(f2);
        this.A.a_(f2);
        e().a_(f2);
    }

    /* access modifiers changed from: protected */
    public void b(org.andengine.b.a.a aVar, org.andengine.input.a.a aVar2) {
        aVar.a(aVar2, this.c, this.d);
    }

    /* access modifiers changed from: protected */
    public void b(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        if (this.b != null) {
            this.b.a(eVar, aVar);
        }
        aVar.a(eVar);
    }

    /* access modifiers changed from: protected */
    public org.andengine.c.b.e c(org.andengine.input.a.a aVar) {
        return this.b;
    }

    public synchronized void c() {
        if (this.f) {
            this.f = false;
        }
    }

    public org.andengine.b.c.b d() {
        return this.m;
    }

    public org.andengine.b.a.a e() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void f() {
        this.a.a(0, 0, this.c, this.d);
    }

    public org.andengine.opengl.d.e g() {
        return this.o;
    }

    public org.andengine.opengl.c.e h() {
        return this.p;
    }

    public org.andengine.a.c.c i() {
        if (this.s != null) {
            return this.s;
        }
        throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
    }

    public org.andengine.a.b.b j() {
        if (this.t != null) {
            return this.t;
        }
        throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
    }

    public void k() {
        this.j.lock();
        try {
            this.g = true;
            this.j.b();
            try {
                this.k.join();
            } catch (InterruptedException e2) {
                org.andengine.d.e.a.b("Could not join UpdateThread.", e2);
                org.andengine.d.e.a.c("Trying to manually interrupt UpdateThread.");
                this.k.interrupt();
            }
            this.o.b();
            this.p.c();
            this.q.b();
            this.r.b();
        } finally {
            this.j.unlock();
        }
    }

    public void l() {
        this.o.c();
        this.p.b();
        this.q.c();
        this.r.c();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void m() {
        if (this.f) {
            long o2 = o();
            this.j.lock();
            try {
                n();
                a(o2);
                n();
                this.j.a();
                this.j.d();
            } finally {
                this.j.unlock();
            }
        } else {
            this.j.lock();
            try {
                n();
                this.j.a();
                this.j.d();
                this.j.unlock();
                Thread.sleep(16);
            } catch (Throwable th) {
                this.j.unlock();
                throw th;
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
        if (this.f) {
            switch (sensor.getType()) {
                case com.google.android.gms.e.MapAttrs_cameraBearing:
                    if (this.x != null) {
                        this.x.a(i2);
                        this.w.a(this.x);
                        return;
                    } else if (this.z != null) {
                        this.z.b(i2);
                        this.y.a(this.z);
                        return;
                    } else {
                        return;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                    this.z.c(i2);
                    this.y.a(this.z);
                    return;
                default:
                    return;
            }
        }
    }

    public void onLocationChanged(Location location) {
        if (this.v == null) {
            this.v = location;
        } else if (location == null) {
            this.u.b();
        } else {
            this.v = location;
            this.u.a(location);
        }
    }

    public void onProviderDisabled(String str) {
        this.u.c();
    }

    public void onProviderEnabled(String str) {
        this.u.a();
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f) {
            switch (sensorEvent.sensor.getType()) {
                case com.google.android.gms.e.MapAttrs_cameraBearing:
                    if (this.x != null) {
                        this.x.a(sensorEvent.values);
                        this.w.b(this.x);
                        return;
                    } else if (this.z != null) {
                        this.z.b(sensorEvent.values);
                        this.y.b(this.z);
                        return;
                    } else {
                        return;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                    this.z.c(sensorEvent.values);
                    this.y.b(this.z);
                    return;
                default:
                    return;
            }
        }
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
        switch (i2) {
            case com.google.android.gms.e.MapAttrs_mapType:
                this.u.a(org.andengine.input.sensor.location.b.OUT_OF_SERVICE, bundle);
                return;
            case com.google.android.gms.e.MapAttrs_cameraBearing:
                this.u.a(org.andengine.input.sensor.location.b.TEMPORARILY_UNAVAILABLE, bundle);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                this.u.a(org.andengine.input.sensor.location.b.AVAILABLE, bundle);
                return;
            default:
                return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f) {
            return false;
        }
        this.n.a(motionEvent);
        try {
            Thread.sleep(this.m.c().b());
        } catch (InterruptedException e2) {
            org.andengine.d.e.a.a((Throwable) e2);
        }
        return true;
    }
}
