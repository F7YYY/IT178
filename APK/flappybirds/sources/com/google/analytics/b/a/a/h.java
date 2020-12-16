package com.google.analytics.b.a.a;

import com.google.android.gms.e;
import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

public enum h implements ad {
    STRING(0, 1),
    LIST(1, 2),
    MAP(2, 3),
    MACRO_REFERENCE(3, 4),
    FUNCTION_ID(4, 5),
    INTEGER(5, 6),
    TEMPLATE(6, 7),
    BOOLEAN(7, 8);
    
    private static ae i;
    private final int j;

    static {
        i = new i();
    }

    private h(int i2, int i3) {
        this.j = i3;
    }

    public static h a(int i2) {
        switch (i2) {
            case e.MapAttrs_cameraBearing /*1*/:
                return STRING;
            case e.MapAttrs_cameraTargetLat /*2*/:
                return LIST;
            case e.MapAttrs_cameraTargetLng /*3*/:
                return MAP;
            case e.MapAttrs_cameraTilt /*4*/:
                return MACRO_REFERENCE;
            case e.MapAttrs_cameraZoom /*5*/:
                return FUNCTION_ID;
            case e.MapAttrs_uiCompass /*6*/:
                return INTEGER;
            case e.MapAttrs_uiRotateGestures /*7*/:
                return TEMPLATE;
            case e.MapAttrs_uiScrollGestures /*8*/:
                return BOOLEAN;
            default:
                return null;
        }
    }

    public final int a() {
        return this.j;
    }
}
