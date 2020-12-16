package org.andengine.d.d;

public class b {
    private static final float[] a = new float[3];

    public static final float a(int i) {
        return Float.intBitsToFloat(i & -1);
    }

    public static final int a(float f, float f2, float f3, float f4) {
        return (((int) (255.0f * f4)) << 24) | (((int) (255.0f * f)) << 16) | (((int) (255.0f * f2)) << 8) | (((int) (255.0f * f3)) << 0);
    }

    public static final int b(float f, float f2, float f3, float f4) {
        return (((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16) | (((int) (255.0f * f2)) << 8) | (((int) (255.0f * f)) << 0);
    }
}
