package com.dotgears;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.dotgears.flappybird.R;
import org.andengine.c.b.e;
import org.andengine.c.d.a;

public class c extends e implements org.andengine.c.b.c {
    public static a[] a;
    static int c;
    public final int b = 50;
    public GameActivity d;
    public int e;
    float[] f = new float[10];
    float[] g = new float[10];
    boolean h = false;
    int i = 0;
    int j = 0;

    public c(GameActivity gameActivity, org.andengine.opengl.c.c.c cVar) {
        this.d = gameActivity;
        this.e = gameActivity.getSharedPreferences("FlappyBird", 0).getInt("score", 0);
        g.D = new com.dotgears.flappy.c(this.e, 0, gameActivity.getApplication().getResources().openRawResource(R.raw.atlas));
        g.D.a();
        j.a((int) System.currentTimeMillis());
        a = new a[50];
        for (int i2 = 0; i2 < 50; i2++) {
            a[i2] = new a(0.0f, 0.0f, cVar.i(), gameActivity.x().g());
            a[i2].a(false);
            b((org.andengine.c.c) a[i2]);
        }
        a((org.andengine.c.b.c) this);
    }

    public static void a(int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5, float f6) {
        a aVar = a[c];
        aVar.b((float) i2, (float) i3, (float) i4, (float) i5, f2, f3, f4, f5);
        aVar.b(f6);
        aVar.a(true);
        c++;
    }

    public static void a(int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5, float f6, float f7) {
        a aVar = a[c];
        j.a((float) i2, (float) i3, ((float) (i2 + i4)) * 0.5f, ((float) (i3 + i5)) * 0.5f, f7);
        float f8 = j.A - ((float) i2);
        float f9 = j.B - ((float) i3);
        j.a((float) i2, (float) i5, ((float) (i2 + i4)) * 0.5f, ((float) (i3 + i5)) * 0.5f, f7);
        float f10 = j.A - ((float) i2);
        float f11 = j.B - ((float) i3);
        j.a((float) i4, (float) i3, ((float) (i2 + i4)) * 0.5f, ((float) (i3 + i5)) * 0.5f, f7);
        float f12 = j.A - ((float) i2);
        float f13 = j.B - ((float) i3);
        j.a((float) i4, (float) i5, ((float) (i2 + i4)) * 0.5f, ((float) (i3 + i5)) * 0.5f, f7);
        aVar.a((float) i2, (float) i3, (float) i4, (float) i5, f2, f3, f4, f5, f8, f9, f10, f11, f12, f13, j.A - ((float) i2), j.B - ((float) i3));
        aVar.b(f6);
        aVar.a(true);
        c++;
    }

    public void a() {
        for (int i2 = 0; i2 < 50; i2++) {
            a[i2].a(false);
        }
        c = 0;
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
        super.a(f2);
        a();
        g.D.a(this.f, this.g);
        if (this.h) {
            g.D.a(this.i, this.j);
            g.D.a(this.i, this.j, this.i, this.j);
            this.h = false;
        }
        g.D.b();
        for (int i2 = 0; i2 < g.D.v; i2++) {
            switch (g.D.w[i2]) {
                case com.google.android.gms.e.MapAttrs_mapType /*0*/:
                    int i3 = (int) g.D.x[i2];
                    if (this.d.o()) {
                        this.d.g.b().a("CgkI5J2sk6QXEAIQAA", (long) i3);
                    }
                    if (i3 <= this.e) {
                        break;
                    } else {
                        SharedPreferences.Editor edit = this.d.getSharedPreferences("FlappyBird", 0).edit();
                        edit.clear();
                        edit.putInt("score", (int) g.D.x[i2]);
                        edit.commit();
                        this.e = i3;
                        break;
                    }
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    if (!this.d.o()) {
                        this.d.p();
                        break;
                    } else {
                        this.d.startActivityForResult(this.d.n().a("CgkI5J2sk6QXEAIQAA"), 1);
                        break;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.dotgears.flappybird"));
                    this.d.startActivity(intent);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                    this.d.d();
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                    this.d.c();
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /*8*/:
                    this.d.d();
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /*9*/:
                    this.d.e();
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /*10*/:
                    this.d.h();
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /*11*/:
                    this.d.f();
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /*12*/:
                    this.d.g();
                    break;
                case com.google.android.gms.e.MapAttrs_zOrderOnTop /*13*/:
                    this.d.i();
                    break;
            }
        }
    }

    public boolean a(e eVar, org.andengine.input.a.a aVar) {
        if (aVar.f()) {
            if (g.D != null) {
                this.h = true;
                this.i = (int) aVar.b();
                this.j = (int) aVar.c();
            }
            this.f[aVar.d() % 10] = aVar.b();
            this.g[aVar.d() % 10] = aVar.c();
        } else if (aVar.g() || aVar.j() || aVar.i()) {
            g gVar = g.D;
            this.f[aVar.d() % 10] = -100.0f;
            this.g[aVar.d() % 10] = -100.0f;
        }
        return true;
    }
}
