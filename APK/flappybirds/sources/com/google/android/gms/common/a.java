package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.e;
import com.google.android.gms.internal.dl;

public final class a {
    public static final a a = new a(0, (PendingIntent) null);
    private final PendingIntent b;
    private final int c;

    public a(int i, PendingIntent pendingIntent) {
        this.c = i;
        this.b = pendingIntent;
    }

    private String c() {
        switch (this.c) {
            case e.MapAttrs_mapType /*0*/:
                return "SUCCESS";
            case e.MapAttrs_cameraBearing /*1*/:
                return "SERVICE_MISSING";
            case e.MapAttrs_cameraTargetLat /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case e.MapAttrs_cameraTargetLng /*3*/:
                return "SERVICE_DISABLED";
            case e.MapAttrs_cameraTilt /*4*/:
                return "SIGN_IN_REQUIRED";
            case e.MapAttrs_cameraZoom /*5*/:
                return "INVALID_ACCOUNT";
            case e.MapAttrs_uiCompass /*6*/:
                return "RESOLUTION_REQUIRED";
            case e.MapAttrs_uiRotateGestures /*7*/:
                return "NETWORK_ERROR";
            case e.MapAttrs_uiScrollGestures /*8*/:
                return "INTERNAL_ERROR";
            case e.MapAttrs_uiTiltGestures /*9*/:
                return "SERVICE_INVALID";
            case e.MapAttrs_uiZoomControls /*10*/:
                return "DEVELOPER_ERROR";
            case e.MapAttrs_uiZoomGestures /*11*/:
                return "LICENSE_CHECK_FAILED";
            default:
                return "unknown status code " + this.c;
        }
    }

    public void a(Activity activity, int i) {
        if (a()) {
            activity.startIntentSenderForResult(this.b.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public boolean a() {
        return (this.c == 0 || this.b == null) ? false : true;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        return dl.a((Object) this).a("statusCode", c()).a("resolution", this.b).toString();
    }
}
