package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class m {
    private static m a;
    private volatile n b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    m() {
        e();
    }

    static m a() {
        m mVar;
        synchronized (m.class) {
            if (a == null) {
                a = new m();
            }
            mVar = a;
        }
        return mVar;
    }

    private String a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    i.d("Container preview url: " + decode);
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.b = n.CONTAINER_DEBUG;
                    } else {
                        this.b = n.CONTAINER;
                    }
                    this.e = b(uri);
                    if (this.b == n.CONTAINER || this.b == n.CONTAINER_DEBUG) {
                        this.d = "/r?" + this.e;
                    }
                    this.c = a(this.e);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    i.b("Invalid preview uri: " + decode);
                    z = false;
                } else if (a(uri.getQuery()).equals(this.c)) {
                    i.d("Exit preview mode for container: " + this.c);
                    this.b = n.NONE;
                    this.d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e2) {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public n b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.b = n.NONE;
        this.d = null;
        this.c = null;
        this.e = null;
    }
}
