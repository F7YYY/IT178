package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.internal.cn;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

final class d implements Runnable {
    final /* synthetic */ ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

    public d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.a = imageManager;
        this.b = uri;
        this.c = bitmap;
        this.e = z;
        this.d = countDownLatch;
    }

    private void a(ImageManager.ImageReceiver imageReceiver, boolean z) {
        imageReceiver.a = true;
        ArrayList a2 = imageReceiver.d;
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) a2.get(i);
            if (z) {
                eVar.a(this.a.c, this.c, false);
            } else {
                eVar.a(this.a.c, false);
            }
            if (eVar.b != 1) {
                this.a.g.remove(eVar);
            }
        }
        imageReceiver.a = false;
    }

    public void run() {
        cn.a("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean z = this.c != null;
        if (this.a.f != null) {
            if (this.e) {
                this.a.f.a();
                System.gc();
                this.e = false;
                this.a.d.post(this);
                return;
            } else if (z) {
                this.a.f.b(new f(this.b), this.c);
            }
        }
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.a.h.remove(this.b);
        if (imageReceiver != null) {
            a(imageReceiver, z);
        }
        this.d.countDown();
        synchronized (ImageManager.a) {
            ImageManager.b.remove(this.b);
        }
    }
}
