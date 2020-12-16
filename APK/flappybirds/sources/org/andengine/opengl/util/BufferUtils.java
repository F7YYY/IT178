package org.andengine.opengl.util;

import java.nio.ByteBuffer;
import org.andengine.d.i.a;

public class BufferUtils {
    private static final boolean a;
    private static final boolean b;
    private static final boolean c;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        a = z;
        if (a) {
            if (a.a(11, 13)) {
                c = true;
            } else {
                c = false;
            }
            if (a.a(8)) {
                b = true;
            } else {
                b = false;
            }
        } else {
            c = false;
            if (a.a(11, 13)) {
                org.andengine.d.e.a.c("Creating a " + ByteBuffer.class.getSimpleName() + " will actually allocate 4x the memory than requested!");
            }
            b = false;
        }
    }

    public static ByteBuffer a(int i) {
        return c ? jniAllocateDirect(i) : ByteBuffer.allocateDirect(i);
    }

    public static void a(ByteBuffer byteBuffer) {
        if (c) {
            jniFreeDirect(byteBuffer);
        }
    }

    public static void a(ByteBuffer byteBuffer, float[] fArr, int i, int i2) {
        if (b) {
            jniPut(byteBuffer, fArr, i, i2);
        } else {
            for (int i3 = i2; i3 < i2 + i; i3++) {
                byteBuffer.putFloat(fArr[i3]);
            }
        }
        byteBuffer.position(0);
        byteBuffer.limit(i << 2);
    }

    private static native ByteBuffer jniAllocateDirect(int i);

    private static native void jniFreeDirect(ByteBuffer byteBuffer);

    private static native void jniPut(ByteBuffer byteBuffer, float[] fArr, int i, int i2);
}
