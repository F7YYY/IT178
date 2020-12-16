package com.google.android.gms.internal;

import com.google.android.gms.e;

public final class ao {
    public static String a(int i) {
        switch (i) {
            case e.MapAttrs_mapType:
                return "DAILY";
            case e.MapAttrs_cameraBearing:
                return "WEEKLY";
            case e.MapAttrs_cameraTargetLat:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
