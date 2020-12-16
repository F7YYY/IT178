package org.andengine.d.b.a;

import org.andengine.opengl.util.f;

public class d extends a {
    public static boolean a(float[] fArr, int i, float f, float f2) {
        return a(fArr, i, 0, 1, 2, f, f2);
    }

    public static boolean a(float[] fArr, int i, int i2, int i3, int i4, float f, float f2) {
        boolean z;
        int i5 = i - 1;
        boolean z2 = false;
        for (int i6 = 0; i6 < i; i6++) {
            float a = f.a(fArr, i2, i4, i6);
            float a2 = f.a(fArr, i3, i4, i6);
            float a3 = f.a(fArr, i2, i4, i5);
            float a4 = f.a(fArr, i3, i4, i5);
            if (((a2 >= f2 || a4 < f2) && (a4 >= f2 || a2 < f2)) || (a > f && a3 > f)) {
                z = z2;
            } else {
                z = ((((f2 - a2) / (a4 - a2)) * (a3 - a)) + a < f) ^ z2;
            }
            z2 = z;
            i5 = i6;
        }
        return z2;
    }

    private static boolean a(float[] fArr, int i, int i2, int i3, int i4, int i5, float[] fArr2, int i6, int i7, int i8, int i9) {
        float a = f.a(fArr, i, i3, i4);
        float a2 = f.a(fArr, i2, i3, i4);
        float a3 = f.a(fArr, i, i3, i5);
        float a4 = f.a(fArr, i2, i3, i5);
        for (int i10 = i6 - 2; i10 >= 0; i10--) {
            if (b.a(a, a2, a3, a4, f.a(fArr2, i7, i9, i10), f.a(fArr2, i8, i9, i10), f.a(fArr2, i7, i9, i10 + 1), f.a(fArr2, i8, i9, i10 + 1))) {
                return true;
            }
        }
        return b.a(a, a2, a3, a4, f.a(fArr2, i7, i9, i6 + -1), f.a(fArr2, i8, i9, i6 + -1), f.a(fArr2, i7, i9, 0), f.a(fArr2, i8, i9, 0));
    }

    public static boolean a(float[] fArr, int i, int i2, int i3, int i4, float[] fArr2, int i5, int i6, int i7, int i8) {
        for (int i9 = i - 2; i9 >= 0; i9--) {
            if (a(fArr, i2, i3, i4, i9, i9 + 1, fArr2, i5, i6, i7, i8)) {
                return true;
            }
        }
        if (a(fArr, i2, i3, i4, i - 1, 0, fArr2, i5, i6, i7, i8) || a(fArr, i, f.a(fArr2, i6, i8, 0), f.a(fArr2, i7, i8, 0))) {
            return true;
        }
        return a(fArr2, i5, f.a(fArr, i2, i4, 0), f.a(fArr, i3, i4, 0));
    }

    public static boolean a(float[] fArr, int i, float[] fArr2, int i2) {
        return a(fArr, i, 0, 1, 2, fArr2, i2, 0, 1, 2);
    }
}
