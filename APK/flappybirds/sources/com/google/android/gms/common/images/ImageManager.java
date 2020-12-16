package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */
    public static final Object a = new Object();
    /* access modifiers changed from: private */
    public static HashSet b = new HashSet();
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final Handler d;
    /* access modifiers changed from: private */
    public final ExecutorService e;
    /* access modifiers changed from: private */
    public final b f;
    /* access modifiers changed from: private */
    public final Map g;
    /* access modifiers changed from: private */
    public final Map h;

    final class ImageReceiver extends ResultReceiver {
        boolean a;
        final /* synthetic */ ImageManager b;
        private final Uri c;
        /* access modifiers changed from: private */
        public final ArrayList d;

        public void onReceiveResult(int i, Bundle bundle) {
            this.b.e.execute(new c(this.b, this.c, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
