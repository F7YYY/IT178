package com.google.android.gms.maps.a;

import com.google.android.gms.e;

public final class v {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    public static Boolean a(byte b) {
        switch (b) {
            case e.MapAttrs_mapType:
                return Boolean.FALSE;
            case e.MapAttrs_cameraBearing:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
