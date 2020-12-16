package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;

final class cs extends Handler {
    final /* synthetic */ cr a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cs(cr crVar, Looper looper) {
        super(looper);
        this.a = crVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 1 || this.a.i()) {
            synchronized (this.a.o) {
                this.a.d = false;
            }
            if (message.what == 3) {
                this.a.a(new a(((Integer) message.obj).intValue(), (PendingIntent) null));
            } else if (message.what == 4) {
                synchronized (this.a.h) {
                    if (this.a.c && this.a.h() && this.a.h.contains(message.obj)) {
                        ((c) message.obj).a(this.a.e());
                    }
                }
            } else if (message.what == 2 && !this.a.h()) {
                ct ctVar = (ct) message.obj;
                ctVar.a();
                ctVar.c();
            } else if (message.what == 2 || message.what == 1) {
                ((ct) message.obj).b();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        } else {
            ct ctVar2 = (ct) message.obj;
            ctVar2.a();
            ctVar2.c();
        }
    }
}
