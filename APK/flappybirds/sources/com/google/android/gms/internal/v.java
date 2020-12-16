package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class v {
    public static final Intent a(Intent intent) {
        intent.setData(Uri.fromParts("version", Integer.toString(3265100), (String) null));
        return intent;
    }
}
