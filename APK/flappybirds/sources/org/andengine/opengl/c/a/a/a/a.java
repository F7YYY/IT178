package org.andengine.opengl.c.a.a.a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import org.andengine.d.d;

public class a extends org.andengine.opengl.c.a.b.a implements b {
    private final AssetManager e;
    private final String f;

    a(AssetManager assetManager, String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = assetManager;
        this.f = str;
    }

    public static a a(AssetManager assetManager, String str) {
        return a(assetManager, str, 0, 0);
    }

    public static a a(AssetManager assetManager, String str, int i, int i2) {
        InputStream inputStream = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            inputStream = assetManager.open(str);
            BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (IOException e2) {
            org.andengine.d.e.a.b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + str, e2);
        } finally {
            d.a(inputStream);
        }
        return new a(assetManager, str, i, i2, options.outWidth, options.outHeight);
    }

    public Bitmap a(Bitmap.Config config) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = config;
            inputStream = this.e.open(this.f);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                d.a(inputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    org.andengine.d.e.a.b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f, e);
                    d.a(inputStream);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    d.a(inputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            org.andengine.d.e.a.b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f, e);
            d.a(inputStream);
            return bitmap;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
            d.a(inputStream);
            throw th;
        }
        return bitmap;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "(" + this.f + ")";
    }
}
