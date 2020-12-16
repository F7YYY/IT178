package org.andengine.opengl.c.a.a;

import android.content.Context;
import android.content.res.AssetManager;
import org.andengine.opengl.c.a.a.a.a;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.c.d;

public class b {
    private static String a = "";

    public static c a(a aVar, Context context, String str, int i, int i2) {
        return a(aVar, context.getAssets(), str, i, i2);
    }

    public static c a(a aVar, AssetManager assetManager, String str, int i, int i2) {
        return a(aVar, a.a(assetManager, String.valueOf(a) + str), i, i2);
    }

    public static c a(a aVar, org.andengine.opengl.c.a.a.a.b bVar, int i, int i2) {
        return d.a(aVar, bVar, i, i2);
    }

    public static void a() {
        a("");
    }

    public static void a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            a = str;
            return;
        }
        throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
