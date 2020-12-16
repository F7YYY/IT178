package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.dl;

public final class f {
    public final Uri a;

    public f(Uri uri) {
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this == obj || ((f) obj).hashCode() == hashCode();
    }

    public int hashCode() {
        return dl.a(this.a);
    }
}
