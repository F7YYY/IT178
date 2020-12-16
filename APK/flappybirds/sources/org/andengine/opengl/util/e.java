package org.andengine.opengl.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import org.andengine.b.c.d;
import org.andengine.opengl.c.c;
import org.andengine.opengl.view.a;

public class e {
    private final float[] A = new float[16];
    private final float[] B = new float[16];
    private final int[] a = new int[1];
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private final int[] m = new int[31];
    private int n = -1;
    private int o = 0;
    private int p = -1;
    private int q = -1;
    private boolean r = true;
    private boolean s = true;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private float w = 1.0f;
    private final b x = new b();
    private final b y = new b();
    private final float[] z = new float[16];

    public void a(float f2, float f3) {
        this.x.a(f2, f3);
    }

    public void a(float f2, float f3, float f4) {
        this.x.a(f2, f3, f4);
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.x.a(f2, f3, f4, f5);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.y.a(f2, f3, f4, f5, f6, f7);
    }

    public void a(float f2, float f3, int i2) {
        this.x.b(f2, f3, (float) i2);
    }

    public void a(int i2) {
        if (this.j != i2) {
            this.j = i2;
            GLES20.glBindBuffer(34962, i2);
        }
    }

    public void a(int i2, int i3) {
        if (this.p != i2 || this.q != i3) {
            this.p = i2;
            this.q = i3;
            GLES20.glBlendFunc(i2, i3);
        }
    }

    public void a(int i2, int i3, int i4, int i5, Bitmap bitmap, c cVar) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        GLES20.glTexSubImage2D(i6, i7, i8, i9, bitmap.getWidth(), bitmap.getHeight(), cVar.b(), cVar.c(), a.a(bitmap, cVar, ByteOrder.BIG_ENDIAN));
    }

    public void a(d dVar, a aVar, EGLConfig eGLConfig) {
        this.b = GLES20.glGetString(7938);
        this.c = GLES20.glGetString(7937);
        this.d = GLES20.glGetString(7939);
        this.e = f(34921);
        this.f = f(36347);
        this.g = f(36349);
        this.i = f(34930);
        this.h = f(3379);
        org.andengine.d.e.a.b("VERSION: " + this.b);
        org.andengine.d.e.a.b("RENDERER: " + this.c);
        org.andengine.d.e.a.b("EGLCONFIG: " + EGLConfig.class.getSimpleName() + "(Red=" + aVar.b() + ", Green=" + aVar.c() + ", Blue=" + aVar.d() + ", Alpha=" + aVar.e() + ", Depth=" + aVar.f() + ", Stencil=" + aVar.g() + ")");
        org.andengine.d.e.a.b("EXTENSIONS: " + this.d);
        org.andengine.d.e.a.b("MAX_VERTEX_ATTRIBS: " + this.e);
        org.andengine.d.e.a.b("MAX_VERTEX_UNIFORM_VECTORS: " + this.f);
        org.andengine.d.e.a.b("MAX_FRAGMENT_UNIFORM_VECTORS: " + this.g);
        org.andengine.d.e.a.b("MAX_TEXTURE_IMAGE_UNITS: " + this.i);
        org.andengine.d.e.a.b("MAX_TEXTURE_SIZE: " + this.h);
        this.x.d();
        this.y.d();
        this.j = -1;
        this.k = -1;
        this.l = -1;
        Arrays.fill(this.m, -1);
        this.n = -1;
        this.o = 0;
        this.p = -1;
        this.q = -1;
        d();
        f();
        b();
        c();
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(3);
        this.w = 1.0f;
    }

    public boolean a() {
        if (this.u) {
            return true;
        }
        this.u = true;
        GLES20.glEnable(3042);
        return false;
    }

    public boolean a(boolean z2) {
        return z2 ? d() : e();
    }

    public void b(float f2, float f3, float f4) {
        this.y.a(f2, f3, f4);
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.y.a(f2, f3, f4, f5);
    }

    public void b(int i2) {
        if (this.j == i2) {
            this.j = -1;
        }
        this.a[0] = i2;
        GLES20.glDeleteBuffers(1, this.a, 0);
    }

    public boolean b() {
        if (!this.u) {
            return false;
        }
        this.u = false;
        GLES20.glDisable(3042);
        return true;
    }

    public void c(int i2) {
        if (this.l != i2) {
            this.l = i2;
            GLES20.glUseProgram(i2);
        }
    }

    public boolean c() {
        if (!this.v) {
            return false;
        }
        this.v = false;
        GLES20.glDisable(2884);
        return true;
    }

    public void d(int i2) {
        if (this.m[this.o] != i2) {
            this.m[this.o] = i2;
            GLES20.glBindTexture(3553, i2);
        }
    }

    public boolean d() {
        if (this.r) {
            return true;
        }
        this.r = true;
        GLES20.glEnable(3024);
        return false;
    }

    public void e(int i2) {
        if (this.m[this.o] == i2) {
            this.m[this.o] = -1;
        }
        this.a[0] = i2;
        GLES20.glDeleteTextures(1, this.a, 0);
    }

    public boolean e() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        GLES20.glDisable(3024);
        return true;
    }

    public int f(int i2) {
        GLES20.glGetIntegerv(i2, this.a, 0);
        return this.a[0];
    }

    public boolean f() {
        if (this.s) {
            return true;
        }
        this.s = true;
        GLES20.glEnable(2929);
        return false;
    }

    public boolean g() {
        if (!this.s) {
            return false;
        }
        this.s = false;
        GLES20.glDisable(2929);
        return true;
    }

    public int h() {
        GLES20.glGenBuffers(1, this.a, 0);
        return this.a[0];
    }

    public int i() {
        GLES20.glGenTextures(1, this.a, 0);
        return this.a[0];
    }

    public void j() {
        this.x.b();
    }

    public void k() {
        this.x.c();
    }

    public void l() {
        this.x.a();
    }

    public void m() {
        this.y.b();
    }

    public void n() {
        this.y.c();
    }

    public void o() {
        this.y.a();
    }

    public float[] p() {
        Matrix.multiplyMM(this.B, 0, this.y.a, this.y.b, this.x.a, this.x.b);
        return this.B;
    }
}
