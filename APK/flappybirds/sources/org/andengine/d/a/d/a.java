package org.andengine.d.a.d;

import android.util.FloatMath;

public class a {
    private float a = 1.0f;
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 1.0f;
    private float e = 0.0f;
    private float f = 0.0f;

    private void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.a;
        float f9 = this.b;
        float f10 = this.c;
        float f11 = this.d;
        float f12 = this.e;
        float f13 = this.f;
        this.a = (f8 * f2) + (f9 * f4);
        this.b = (f8 * f3) + (f9 * f5);
        this.c = (f10 * f2) + (f11 * f4);
        this.d = (f10 * f3) + (f11 * f5);
        this.e = (f12 * f2) + (f13 * f4) + f6;
        this.f = (f12 * f3) + (f13 * f5) + f7;
    }

    private void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.a;
        float f9 = this.b;
        float f10 = this.c;
        float f11 = this.d;
        float f12 = this.e;
        float f13 = this.f;
        this.a = (f2 * f8) + (f3 * f10);
        this.b = (f2 * f9) + (f3 * f11);
        this.c = (f4 * f8) + (f5 * f10);
        this.d = (f4 * f9) + (f5 * f11);
        this.e = (f8 * f6) + (f10 * f7) + f12;
        this.f = (f6 * f9) + (f7 * f11) + f13;
    }

    public final void a() {
        this.a = 1.0f;
        this.d = 1.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public final void a(float f2) {
        float f3 = 0.017453292f * f2;
        float sin = FloatMath.sin(f3);
        float cos = FloatMath.cos(f3);
        float f4 = this.a;
        float f5 = this.b;
        float f6 = this.c;
        float f7 = this.d;
        float f8 = this.e;
        float f9 = this.f;
        this.a = (f4 * cos) - (f5 * sin);
        this.b = (f4 * sin) + (f5 * cos);
        this.c = (f6 * cos) - (f7 * sin);
        this.d = (f6 * sin) + (f7 * cos);
        this.e = (f8 * cos) - (f9 * sin);
        this.f = (cos * f9) + (sin * f8);
    }

    public final void a(float f2, float f3) {
        this.e += f2;
        this.f += f3;
    }

    public final void a(a aVar) {
        this.a = aVar.a;
        this.d = aVar.d;
        this.b = aVar.b;
        this.c = aVar.c;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public final void a(float[] fArr) {
        int i = 0;
        int length = fArr.length >> 1;
        int i2 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                int i3 = i2 + 1;
                float f2 = fArr[i2];
                i2 = i3 + 1;
                float f3 = fArr[i3];
                int i4 = i + 1;
                fArr[i] = (this.a * f2) + (this.c * f3) + this.e;
                i = i4 + 1;
                fArr[i4] = (f3 * this.d) + (f2 * this.b) + this.f;
            } else {
                return;
            }
        }
    }

    public final void b(float f2, float f3) {
        this.a *= f2;
        this.b *= f3;
        this.c *= f2;
        this.d *= f3;
        this.e *= f2;
        this.f *= f3;
    }

    public final void b(a aVar) {
        a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
    }

    public final void c(float f2, float f3) {
        float tan = (float) Math.tan((double) (-0.017453292f * f2));
        float tan2 = (float) Math.tan((double) (-0.017453292f * f3));
        float f4 = this.a;
        float f5 = this.b;
        float f6 = this.c;
        float f7 = this.d;
        float f8 = this.e;
        float f9 = this.f;
        this.a = (f5 * tan) + f4;
        this.b = (f4 * tan2) + f5;
        this.c = (f7 * tan) + f6;
        this.d = (f6 * tan2) + f7;
        this.e = (tan * f9) + f8;
        this.f = (f8 * tan2) + f9;
    }

    public final void c(a aVar) {
        b(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
    }

    public String toString() {
        return "Transformation{[" + this.a + ", " + this.c + ", " + this.e + "][" + this.b + ", " + this.d + ", " + this.f + "][0.0, 0.0, 1.0]}";
    }
}
