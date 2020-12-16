package org.andengine.opengl.a;

import org.andengine.d.d.a;

public class b {
    private static final int a = a.C;
    private static String b = "";

    public static void a() {
        a("");
    }

    public static void a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            b = str;
            return;
        }
        throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
