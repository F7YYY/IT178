package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class r {
    private static r f;
    private final v a;
    private final Context b;
    private final e c;
    private volatile w d;
    private final ConcurrentMap e;

    r(Context context, v vVar, e eVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.b = context.getApplicationContext();
        this.a = vVar;
        this.d = w.STANDARD;
        this.e = new ConcurrentHashMap();
        this.c = eVar;
        this.c.a(new s(this));
        this.c.a(new a(this.b));
    }

    public static r a(Context context) {
        r rVar;
        synchronized (r.class) {
            if (f == null) {
                f = new r(context, new t(), new e());
            }
            rVar = f;
        }
        return rVar;
    }

    public w a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(Uri uri) {
        boolean z;
        m a2 = m.a();
        if (a2.a(uri)) {
            String d2 = a2.d();
            switch (u.a[a2.b().ordinal()]) {
                case e.MapAttrs_cameraBearing:
                    c cVar = (c) this.e.get(d2);
                    if (cVar != null) {
                        cVar.a((String) null);
                        cVar.a();
                        break;
                    }
                    break;
                case e.MapAttrs_cameraTargetLat:
                case e.MapAttrs_cameraTargetLng:
                    for (Map.Entry entry : this.e.entrySet()) {
                        c cVar2 = (c) entry.getValue();
                        if (((String) entry.getKey()).equals(d2)) {
                            cVar2.a(a2.c());
                            cVar2.a();
                        } else if (cVar2.b() != null) {
                            cVar2.a((String) null);
                            cVar2.a();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
