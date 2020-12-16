package org.andengine.opengl.util;

import android.opengl.Matrix;

public class b {
    final float[] a = new float[512];
    int b;
    private final float[] c = new float[32];

    public b() {
        a();
    }

    private static void a(float[] fArr, int i, float f, float f2) {
        fArr[i + 0] = 1.0f;
        fArr[i + 1] = (float) Math.tan((double) (-0.017453292f * f2));
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = 0.0f;
        fArr[i + 4] = (float) Math.tan((double) (-0.017453292f * f));
        fArr[i + 5] = 1.0f;
        fArr[i + 6] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = 0.0f;
        fArr[i + 10] = 1.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 12] = 0.0f;
        fArr[i + 13] = 0.0f;
        fArr[i + 14] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public void a() {
        Matrix.setIdentityM(this.a, this.b);
    }

    public void a(float f, float f2) {
        a(this.c, 0, f, f2);
        System.arraycopy(this.a, this.b, this.c, 16, 16);
        Matrix.multiplyMM(this.a, this.b, this.c, 16, this.c, 0);
    }

    public void a(float f, float f2, float f3) {
        Matrix.translateM(this.a, this.b, f, f2, f3);
    }

    public void a(float f, float f2, float f3, float f4) {
        Matrix.setRotateM(this.c, 0, f, f2, f3, f4);
        System.arraycopy(this.a, this.b, this.c, 16, 16);
        Matrix.multiplyMM(this.a, this.b, this.c, 16, this.c, 0);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(this.a, this.b, f, f2, f3, f4, f5, f6);
    }

    public void b() {
        if (this.b + 16 >= 512) {
            throw new c();
        }
        System.arraycopy(this.a, this.b, this.a, this.b + 16, 16);
        this.b += 16;
    }

    public void b(float f, float f2, float f3) {
        Matrix.scaleM(this.a, this.b, f, f2, f3);
    }

    public void c() {
        if (this.b - 16 <= -16) {
            throw new d();
        }
        this.b -= 16;
    }

    public void d() {
        this.b = 0;
        a();
    }
}
