package org.andengine.opengl;

import org.andengine.d.i.a;

public class GLES20Fix {
    private static boolean a;
    private static final boolean b;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        a = z;
        if (!a.a(8)) {
            b = false;
        } else if (z) {
            b = true;
        } else {
            throw new org.andengine.d.f.a("Inherently incompatible device detected.");
        }
    }

    public static native void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, int i5);
}
