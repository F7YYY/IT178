package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class h {
    static Map a = new HashMap();
    private static String b;

    h() {
    }

    static String a(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    static void a(Context context, String str) {
        p.a(context, "gtm_install_referrer", "referrer", str);
        b(context, str);
    }

    static void a(String str) {
        synchronized (h.class) {
            b = str;
        }
    }

    static void b(Context context, String str) {
        String a2 = a(str, "conv");
        if (a2 != null && a2.length() > 0) {
            a.put(a2, str);
            p.a(context, "gtm_click_referrers", a2, str);
        }
    }
}
