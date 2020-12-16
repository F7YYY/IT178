package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

public class cz implements ServiceConnection {
    final /* synthetic */ cy a;

    public cz(cy cyVar) {
        this.a = cyVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a.a.d) {
            IBinder unused = this.a.g = iBinder;
            ComponentName unused2 = this.a.h = componentName;
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((cv) it.next()).onServiceConnected(componentName, iBinder);
            }
            int unused3 = this.a.e = 1;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.a.d) {
            IBinder unused = this.a.g = null;
            ComponentName unused2 = this.a.h = componentName;
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((cv) it.next()).onServiceDisconnected(componentName);
            }
            int unused3 = this.a.e = 2;
        }
    }
}
