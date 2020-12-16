package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.e;
import java.util.HashMap;

public final class cx implements Handler.Callback {
    private static final Object a = new Object();
    private static cx b;
    private final Context c;
    /* access modifiers changed from: private */
    public final HashMap d = new HashMap();
    private final Handler e;

    private cx(Context context) {
        this.e = new Handler(context.getMainLooper(), this);
        this.c = context.getApplicationContext();
    }

    public static cx a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new cx(context.getApplicationContext());
            }
        }
        return b;
    }

    public boolean a(String str, cv cvVar) {
        boolean c2;
        synchronized (this.d) {
            cy cyVar = (cy) this.d.get(str);
            if (cyVar != null) {
                this.e.removeMessages(0, cyVar);
                if (!cyVar.c(cvVar)) {
                    cyVar.a(cvVar);
                    switch (cyVar.d()) {
                        case e.MapAttrs_cameraBearing:
                            cvVar.onServiceConnected(cyVar.g(), cyVar.f());
                            break;
                        case e.MapAttrs_cameraTargetLat:
                            cyVar.a(this.c.bindService(new Intent(str).setPackage("com.google.android.gms"), cyVar.a(), 129));
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                cyVar = new cy(this, str);
                cyVar.a(cvVar);
                cyVar.a(this.c.bindService(new Intent(str).setPackage("com.google.android.gms"), cyVar.a(), 129));
                this.d.put(str, cyVar);
            }
            c2 = cyVar.c();
        }
        return c2;
    }

    public void b(String str, cv cvVar) {
        synchronized (this.d) {
            cy cyVar = (cy) this.d.get(str);
            if (cyVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (!cyVar.c(cvVar)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            } else {
                cyVar.b(cvVar);
                if (cyVar.e()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, cyVar), 5000);
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case e.MapAttrs_mapType:
                cy cyVar = (cy) message.obj;
                synchronized (this.d) {
                    if (cyVar.e()) {
                        this.c.unbindService(cyVar.a());
                        this.d.remove(cyVar.b());
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
