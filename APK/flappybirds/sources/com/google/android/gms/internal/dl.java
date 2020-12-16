package com.google.android.gms.internal;

import java.util.Arrays;

public final class dl {
    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static dn a(Object obj) {
        return new dn(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
