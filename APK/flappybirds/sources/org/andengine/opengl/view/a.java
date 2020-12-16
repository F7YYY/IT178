package org.andengine.opengl.view;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class a implements GLSurfaceView.EGLConfigChooser {
    private static final int[] a = new int[1];
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    static {
        int[] iArr = new int[19];
        iArr[0] = 12324;
        iArr[1] = 5;
        iArr[2] = 12323;
        iArr[3] = 6;
        iArr[4] = 12322;
        iArr[5] = 5;
        iArr[6] = 12321;
        iArr[8] = 12325;
        iArr[10] = 12326;
        iArr[12] = 12352;
        iArr[13] = 4;
        iArr[14] = 12338;
        iArr[15] = 1;
        iArr[16] = 12337;
        iArr[17] = 2;
        iArr[18] = 12344;
        b = iArr;
        int[] iArr2 = new int[19];
        iArr2[0] = 12324;
        iArr2[1] = 5;
        iArr2[2] = 12323;
        iArr2[3] = 6;
        iArr2[4] = 12322;
        iArr2[5] = 5;
        iArr2[6] = 12321;
        iArr2[8] = 12325;
        iArr2[10] = 12326;
        iArr2[12] = 12352;
        iArr2[13] = 4;
        iArr2[14] = 12512;
        iArr2[15] = 1;
        iArr2[16] = 12513;
        iArr2[17] = 2;
        iArr2[18] = 12344;
        c = iArr2;
        int[] iArr3 = new int[15];
        iArr3[0] = 12324;
        iArr3[1] = 5;
        iArr3[2] = 12323;
        iArr3[3] = 6;
        iArr3[4] = 12322;
        iArr3[5] = 5;
        iArr3[6] = 12321;
        iArr3[8] = 12325;
        iArr3[10] = 12326;
        iArr3[12] = 12352;
        iArr3[13] = 4;
        iArr3[14] = 12344;
        d = iArr3;
    }

    public a(boolean z) {
        this.e = z;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, a) ? a[0] : i3;
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        if (egl10.eglChooseConfig(eGLDisplay, iArr, (EGLConfig[]) null, 0, a)) {
            return a[0];
        }
        throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, b bVar) {
        a[0] = 0;
        if (this.e) {
            int a2 = a(egl10, eGLDisplay, b);
            if (a2 > 0) {
                this.f = true;
                return a(egl10, eGLDisplay, b, a2, bVar);
            }
            int a3 = a(egl10, eGLDisplay, c);
            if (a3 > 0) {
                this.g = true;
                return a(egl10, eGLDisplay, c, a3, bVar);
            }
        }
        int a4 = a(egl10, eGLDisplay, d);
        if (a4 > 0) {
            return a(egl10, eGLDisplay, d, a4, bVar);
        }
        throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int i2, b bVar) {
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i2, a)) {
            return a(egl10, eGLDisplay, eGLConfigArr, bVar);
        }
        throw new IllegalArgumentException("findEGLConfig failed!");
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, b bVar) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (eGLConfig != null) {
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int a3 = a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int a4 = a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int a5 = a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                int a6 = a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int a7 = a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (bVar.a(a2, a3, a4, a5, a6, a7)) {
                    this.h = a2;
                    this.i = a3;
                    this.j = a4;
                    this.k = a5;
                    this.l = a6;
                    this.m = a7;
                    return eGLConfig;
                }
            }
        }
        throw new IllegalArgumentException("No EGLConfig found!");
    }

    public boolean a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        try {
            return a(egl10, eGLDisplay, b.STRICT);
        } catch (IllegalArgumentException e2) {
            try {
                return a(egl10, eGLDisplay, b.LOOSE_STENCIL);
            } catch (IllegalArgumentException e3) {
                try {
                    return a(egl10, eGLDisplay, b.LOOSE_DEPTH_AND_STENCIL);
                } catch (IllegalArgumentException e4) {
                    return a(egl10, eGLDisplay, b.ANY);
                }
            }
        }
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public int g() {
        return this.m;
    }
}
