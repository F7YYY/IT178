package org.andengine.a.b;

public class a {
    private static String a = "";

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
