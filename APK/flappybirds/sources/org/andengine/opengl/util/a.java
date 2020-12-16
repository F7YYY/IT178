package org.andengine.opengl.util;

import android.graphics.Bitmap;
import com.google.android.gms.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.andengine.opengl.c.c;

public class a {
    private static /* synthetic */ int[] a;

    public static Buffer a(Bitmap bitmap, c cVar, ByteOrder byteOrder) {
        int[] a2 = a(bitmap);
        switch (a()[cVar.ordinal()]) {
            case e.MapAttrs_cameraTargetLat:
                return ShortBuffer.wrap(c(a2, byteOrder));
            case e.MapAttrs_cameraTilt:
                return IntBuffer.wrap(a(a2, byteOrder == ByteOrder.LITTLE_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
            case e.MapAttrs_cameraZoom:
                return ShortBuffer.wrap(b(a2, byteOrder));
            case e.MapAttrs_uiCompass:
                return ByteBuffer.wrap(a(a2));
            default:
                throw new IllegalArgumentException("Unexpected " + c.class.getSimpleName() + ": '" + cVar + "'.");
        }
    }

    public static byte[] a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) ((iArr[length] >> 24) & 255);
        }
        return bArr;
    }

    static /* synthetic */ int[] a() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[c.values().length];
            try {
                iArr[c.AI_88.ordinal()] = 8;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[c.A_8.ordinal()] = 6;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[c.I_8.ordinal()] = 7;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[c.RGBA_4444.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[c.RGBA_5551.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[c.RGBA_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[c.RGB_565.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            a = iArr;
        }
        return iArr;
    }

    public static int[] a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    public static int[] a(int[] iArr, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                iArr[length] = ((i >> 16) & 255) | (-16711936 & i) | ((i << 16) & 16711680);
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                iArr[length2] = ((i2 >> 24) & 255) | ((i2 << 8) & -256);
            }
        }
        return iArr;
    }

    public static short[] b(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i << 5) & 7936) | ((i >> 16) & 248) | ((i >> 13) & 7) | ((i << 3) & 57344));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 3) & 31) | ((i2 >> 8) & 63488) | ((i2 >> 5) & 2016));
            }
        }
        return sArr;
    }

    public static short[] c(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i >> 20) & 3840) | ((i >> 16) & 240) | ((i >> 12) & 15) | ((i << 8) & 61440));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 28) & 15) | ((i2 >> 8) & 61440) | ((i2 >> 4) & 3840) | (i2 & 240));
            }
        }
        return sArr;
    }
}
