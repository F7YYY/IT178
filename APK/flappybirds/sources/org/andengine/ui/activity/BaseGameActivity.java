package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.widget.FrameLayout;
import org.andengine.a.c.c;
import org.andengine.b.c.b;
import org.andengine.b.c.e;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.opengl.view.h;
import org.andengine.ui.a;

public abstract class BaseGameActivity extends BaseActivity implements h, a {
    private static /* synthetic */ int[] f;
    private PowerManager.WakeLock a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    protected org.andengine.b.a k;
    protected RenderSurfaceView l;

    protected static FrameLayout.LayoutParams B() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    static /* synthetic */ int[] C() {
        int[] iArr = f;
        if (iArr == null) {
            iArr = new int[e.values().length];
            try {
                iArr[e.LANDSCAPE_FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[e.LANDSCAPE_SENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[e.PORTRAIT_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[e.PORTRAIT_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            f = iArr;
        }
        return iArr;
    }

    private void a(org.andengine.b.c.h hVar) {
        if (hVar == org.andengine.b.c.h.SCREEN_ON) {
            org.andengine.d.a.b(this);
            return;
        }
        this.a = ((PowerManager) getSystemService("power")).newWakeLock(hVar.a() | 536870912, "AndEngine");
        try {
            this.a.acquire();
        } catch (SecurityException e2) {
            org.andengine.d.e.a.b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", e2);
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        runOnUiThread(new d(this));
    }

    private void d() {
        a(this.k.d().m());
    }

    private void e() {
        if (this.a != null && this.a.isHeld()) {
            this.a.release();
        }
    }

    private void f() {
        b d2 = this.k.d();
        if (d2.f()) {
            org.andengine.d.a.a(this);
        }
        if (d2.d().c() || d2.d().b()) {
            setVolumeControlStream(3);
        }
        switch (C()[d2.g().ordinal()]) {
            case com.google.android.gms.e.MapAttrs_cameraBearing:
                setRequestedOrientation(0);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat:
                if (org.andengine.d.i.a.c) {
                    setRequestedOrientation(6);
                    return;
                }
                org.andengine.d.e.a.c(String.valueOf(e.class.getSimpleName()) + "." + e.LANDSCAPE_SENSOR + " is not supported on this device. Falling back to " + e.class.getSimpleName() + "." + e.LANDSCAPE_FIXED);
                setRequestedOrientation(0);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng:
                setRequestedOrientation(1);
                return;
            case com.google.android.gms.e.MapAttrs_cameraTilt:
                if (org.andengine.d.i.a.c) {
                    setRequestedOrientation(7);
                    return;
                }
                org.andengine.d.e.a.c(String.valueOf(e.class.getSimpleName()) + "." + e.PORTRAIT_SENSOR + " is not supported on this device. Falling back to " + e.class.getSimpleName() + "." + e.PORTRAIT_FIXED);
                setRequestedOrientation(1);
                return;
            default:
                return;
        }
    }

    public org.andengine.a.b.b A() {
        return this.k.j();
    }

    public org.andengine.b.a a(b bVar) {
        return new org.andengine.b.a(bVar);
    }

    public synchronized void a(org.andengine.opengl.util.e eVar) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceCreated" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.c) {
            t();
            if (this.b && this.c) {
                s();
            }
        } else if (this.d) {
            this.e = true;
        } else {
            this.d = true;
            q();
        }
    }

    public synchronized void a(org.andengine.opengl.util.e eVar, int i, int i2) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceChanged(Width=" + i + ",  Height=" + i2 + ")" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, (h) this);
        setContentView(this.l, B());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreate" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onCreate(bundle);
        this.b = true;
        this.k = a(a());
        this.k.a();
        f();
        b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroy" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onDestroy();
        this.k.k();
        try {
            v();
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        w();
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onPause" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onPause();
        this.l.onPause();
        e();
        if (!this.b) {
            u();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void onResume() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onResume" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onResume();
        d();
        this.l.onResume();
    }

    public synchronized void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.b && this.c) {
            s();
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void q() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        c cVar = new c(this, new b(this, new a(this)));
        try {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateResources" + " @(Thread: '" + Thread.currentThread().getName() + "')");
            a((org.andengine.ui.b) cVar);
        } catch (Throwable th) {
            org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        return;
    }

    public synchronized void r() {
        this.c = true;
        if (this.e) {
            this.e = false;
            try {
                t();
            } catch (Throwable th) {
                org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", th);
            }
        }
        return;
    }

    public synchronized void s() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onResumeGame" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        this.k.b();
        this.b = false;
    }

    public void t() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        this.k.l();
    }

    public synchronized void u() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onPauseGame" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        this.b = true;
        this.k.c();
    }

    public void v() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.k.d().d().c()) {
            A().b();
        }
        if (this.k.d().d().b()) {
            z().b();
        }
    }

    public synchronized void w() {
        org.andengine.d.e.a.b(String.valueOf(getClass().getSimpleName()) + ".onGameDestroyed" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        this.c = false;
    }

    public org.andengine.b.a x() {
        return this.k;
    }

    public org.andengine.opengl.c.e y() {
        return this.k.h();
    }

    public c z() {
        return this.k.i();
    }
}
