package org.andengine.a.c;

import android.content.Context;

public class b {
    private static String a = "";

    public static a a(c cVar, Context context, String str) {
        a aVar;
        synchronized (cVar) {
            aVar = new a(cVar, cVar.c().load(context.getAssets().openFd(String.valueOf(a) + str), 1));
            cVar.a(aVar);
        }
        return aVar;
    }

    public static void a() {
        a("");
    }

    public static void a(String str) {
        if (str.endsWith("/") || str.length() == 0) {
            a = str;
            return;
        }
        throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
    }
}
