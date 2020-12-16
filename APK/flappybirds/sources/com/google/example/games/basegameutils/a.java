package com.google.example.games.basegameutils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.e;
import com.google.android.gms.games.f;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.plus.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

public class a implements c, d {
    public static final String[] a = {"UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"};
    int b = 0;
    boolean c = false;
    Activity d = null;
    String[] e;
    com.google.android.gms.games.c f = null;
    b g = null;
    com.google.android.gms.a.a h = null;
    int i = 0;
    int j = 0;
    int k = 0;
    boolean l = true;
    boolean m = false;
    com.google.android.gms.common.a n = null;
    c o = null;
    boolean p = false;
    String q = "GameHelper";
    String r;
    b s = null;

    public a(Activity activity) {
        this.d = activity;
    }

    static String b(int i2) {
        switch (i2) {
            case -1:
                return "RESULT_OK";
            case e.MapAttrs_mapType:
                return "RESULT_CANCELED";
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i2);
        }
    }

    static String c(int i2) {
        switch (i2) {
            case e.MapAttrs_mapType:
                return "SUCCESS(" + i2 + ")";
            case e.MapAttrs_cameraBearing:
                return "SERVICE_MISSING(" + i2 + ")";
            case e.MapAttrs_cameraTargetLat:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i2 + ")";
            case e.MapAttrs_cameraTargetLng:
                return "SERVICE_DISABLED(" + i2 + ")";
            case e.MapAttrs_cameraTilt:
                return "SIGN_IN_REQUIRED(" + i2 + ")";
            case e.MapAttrs_cameraZoom:
                return "INVALID_ACCOUNT(" + i2 + ")";
            case e.MapAttrs_uiCompass:
                return "RESOLUTION_REQUIRED(" + i2 + ")";
            case e.MapAttrs_uiRotateGestures:
                return "NETWORK_ERROR(" + i2 + ")";
            case e.MapAttrs_uiScrollGestures:
                return "INTERNAL_ERROR(" + i2 + ")";
            case e.MapAttrs_uiTiltGestures:
                return "SERVICE_INVALID(" + i2 + ")";
            case e.MapAttrs_uiZoomControls:
                return "DEVELOPER_ERROR(" + i2 + ")";
            case e.MapAttrs_uiZoomGestures:
                return "LICENSE_CHECK_FAILED(" + i2 + ")";
            default:
                return "Unknown error code " + i2;
        }
    }

    public void a() {
        c("onDisconnected.");
        if (this.b == 1) {
            c("onDisconnected is expected, so no action taken.");
            return;
        }
        d("Unexpectedly disconnected. Severing remaining connections.");
        e();
        this.o = null;
        c("Making extraordinary call to onSignInFailed callback");
        a(false);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        String str = a[this.b];
        String str2 = a[i2];
        this.b = i2;
        c("State change " + str + " -> " + str2);
    }

    public void a(int i2, int i3, Intent intent) {
        c("onActivityResult: req=" + (i2 == 9001 ? "RC_RESOLVE" : String.valueOf(i2)) + ", resp=" + b(i3));
        if (i2 != 9001) {
            c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        this.c = false;
        if (this.b != 2) {
            c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + a[this.b] + ")");
        } else if (i3 == -1) {
            c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            j();
        } else if (i3 == 10001) {
            c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            j();
        } else if (i3 == 0) {
            c("onAR: Got a cancellation result, so disconnecting.");
            this.l = false;
            this.m = false;
            this.o = null;
            e();
            a(false);
        } else {
            c("onAR: responseCode=" + b(i3) + ", so giving up.");
            a(new c(this.n.b(), i3));
        }
    }

    public void a(Activity activity) {
        this.d = activity;
        c("onStart, state = " + a[this.b]);
        a("onStart");
        switch (this.b) {
            case e.MapAttrs_cameraBearing:
                if (this.l) {
                    c("onStart: Now connecting clients.");
                    h();
                    return;
                }
                c("onStart: Not connecting (user specifically signed out).");
                return;
            case e.MapAttrs_cameraTargetLat:
                c("onStart: connection process in progress, no action taken.");
                return;
            case e.MapAttrs_cameraTargetLng:
                c("onStart: already connected (unusual, but ok).");
                return;
            default:
                String str = "onStart: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
    }

    public void a(Bundle bundle) {
        c("onConnected: connected! client=" + this.k);
        this.j |= this.k;
        c("Connected clients updated to: " + this.j);
        if (this.k == 1 && bundle != null) {
            c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation) bundle.getParcelable("invitation");
            if (!(invitation == null || invitation.c() == null)) {
                c("onConnected: connection hint has a room invite!");
                this.r = invitation.c();
                c("Invitation ID: " + this.r);
            }
            c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        i();
    }

    public void a(com.google.android.gms.common.a aVar) {
        c("onConnectionFailed");
        this.n = aVar;
        c("Connection failure:");
        c("   - code: " + c(this.n.b()));
        c("   - resolvable: " + this.n.a());
        c("   - details: " + this.n.toString());
        if (!this.m) {
            c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
            this.n = aVar;
            a(1);
            a(false);
            return;
        }
        c("onConnectionFailed: since user initiated sign-in, resolving problem.");
        l();
    }

    public void a(b bVar, int i2, String... strArr) {
        if (this.b != 0) {
            e("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
            throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
        }
        this.s = bVar;
        this.i = i2;
        c("Setup: requested clients: " + this.i);
        Vector vector = new Vector();
        if ((i2 & 1) != 0) {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i2 & 2) != 0) {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i2 & 4) != 0) {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (strArr != null) {
            for (String add : strArr) {
                vector.add(add);
            }
        }
        this.e = new String[vector.size()];
        vector.copyInto(this.e);
        c("setup: scopes:");
        String[] strArr2 = this.e;
        int length = strArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            c("  - " + strArr2[i3]);
        }
        if ((i2 & 1) != 0) {
            c("setup: creating GamesClient");
            this.f = new f(g(), this, this).a(49).a(this.e).a();
        }
        if ((i2 & 2) != 0) {
            c("setup: creating GamesPlusClient");
            this.g = new com.google.android.gms.plus.c(g(), this, this).a(this.e).a();
        }
        if ((i2 & 4) != 0) {
            c("setup: creating AppStateClient");
            this.h = new com.google.android.gms.a.c(g(), this, this).a(this.e).a();
        }
        a(1);
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", 2);
        this.l = false;
        e();
        this.o = cVar;
        m();
        a(false);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (this.b == 0) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            e(str2);
            throw new IllegalStateException(str2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v0, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.StringBuilder r5, int r6) {
        /*
            r4 = this;
            if (r6 >= 0) goto L_0x0004
            int r6 = r6 + 256
        L_0x0004:
            int r0 = r6 / 16
            int r1 = r6 % 16
            java.lang.String r2 = "0123456789ABCDEF"
            int r3 = r0 + 1
            java.lang.String r0 = r2.substring(r0, r3)
            r5.append(r0)
            java.lang.String r0 = "0123456789ABCDEF"
            int r2 = r1 + 1
            java.lang.String r0 = r0.substring(r1, r2)
            r5.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.example.games.basegameutils.a.a(java.lang.StringBuilder, byte):void");
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        c("Notifying LISTENER of sign-in " + (z ? "SUCCESS" : this.o != null ? "FAILURE (error)" : "FAILURE (no error)"));
        if (this.s == null) {
            return;
        }
        if (z) {
            this.s.k();
        } else {
            this.s.j();
        }
    }

    public void a(boolean z, String str) {
        this.p = z;
        this.q = str;
        if (z) {
            c("Debug log enabled, tag: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, String str, String str2, int... iArr) {
        for (int i3 : iArr) {
            if (this.b == i3) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i2 == 1001) {
            sb.append("GameHelper: you attempted an operation at an invalid. ");
        } else {
            sb.append("GameHelper: bug detected. Please report it at our bug tracker ");
            sb.append("https://github.com/playgameservices/android-samples/issues. ");
            sb.append("Please include the last couple hundred lines of logcat output ");
            sb.append("and describe the operation that caused this. ");
        }
        sb.append("Explanation: ").append(str2);
        sb.append("Operation: ").append(str).append(". ");
        sb.append("State: ").append(a[this.b]).append(". ");
        if (iArr.length == 1) {
            sb.append("Expected state: ").append(a[iArr[0]]).append(".");
        } else {
            sb.append("Expected states:");
            for (int i4 : iArr) {
                sb.append(" ").append(a[i4]);
            }
            sb.append(".");
        }
        d(sb.toString());
        return false;
    }

    /* access modifiers changed from: package-private */
    public Dialog b(String str) {
        return new AlertDialog.Builder(g()).setMessage(str).setNeutralButton(17039370, (DialogInterface.OnClickListener) null).create();
    }

    public com.google.android.gms.games.c b() {
        if (this.f != null) {
            return this.f;
        }
        throw new IllegalStateException("No GamesClient. Did you request it at setup?");
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        if (this.p) {
            Log.d(this.q, "GameHelper: " + str);
        }
    }

    public boolean c() {
        return this.b == 3;
    }

    public void d() {
        c("onStop, state = " + a[this.b]);
        a("onStop");
        switch (this.b) {
            case e.MapAttrs_cameraBearing:
                c("onStop: not connected, so no action taken.");
                break;
            case e.MapAttrs_cameraTargetLat:
            case e.MapAttrs_cameraTargetLng:
                c("onStop: Killing connections");
                e();
                break;
            default:
                String str = "onStop: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
        this.d = null;
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        Log.w(this.q, "!!! GameHelper WARNING: " + str);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", 3, 2)) {
            c("killConnections: killing connections.");
            this.n = null;
            this.o = null;
            if (this.f != null && this.f.b()) {
                c("Disconnecting GamesClient.");
                this.f.c();
            }
            if (this.g != null && this.g.b()) {
                c("Disconnecting PlusClient.");
                this.g.c();
            }
            if (this.h != null && this.h.b()) {
                c("Disconnecting AppStateClient.");
                this.h.c();
            }
            this.j = 0;
            c("killConnections: all clients disconnected.");
            a(1);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        Log.e(this.q, "*** GameHelper ERROR: " + str);
    }

    public void f() {
        if (this.b == 3) {
            d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            a(true);
        } else if (this.b == 2) {
            d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
        } else {
            c("Starting USER-INITIATED sign-in flow.");
            this.l = true;
            int a2 = com.google.android.gms.common.f.a(g());
            c("isGooglePlayServicesAvailable returned " + a2);
            if (a2 != 0) {
                c("Google Play services not available. Show error dialog.");
                this.o = new c(a2, 0);
                m();
                a(false);
                return;
            }
            this.m = true;
            if (this.n != null) {
                c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
                a(2);
                l();
                return;
            }
            c("beginUserInitiatedSignIn: starting new sign-in flow.");
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (a(1002, "startConnections", "startConnections should only get called when disconnected.", 1)) {
            c("Starting connections.");
            a(2);
            this.r = null;
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        c("connectNextClient: requested clients: " + this.i + ", connected clients: " + this.j);
        if (this.f != null && this.f.b() && (this.j & 1) == 0) {
            d("GamesClient was already connected. Fixing.");
            this.j |= 1;
        }
        if (this.g != null && this.g.b() && (this.j & 2) == 0) {
            d("PlusClient was already connected. Fixing.");
            this.j |= 2;
        }
        if (this.h != null && this.h.b() && (this.j & 4) == 0) {
            d("AppStateClient was already connected. Fixing");
            this.j |= 4;
        }
        int i2 = this.i & (this.j ^ -1);
        c("Pending clients: " + i2);
        if (i2 == 0) {
            c("All clients now connected. Sign-in successful!");
            k();
            return;
        }
        if (this.f != null && (i2 & 1) != 0) {
            c("Connecting GamesClient.");
            this.k = 1;
        } else if (this.g != null && (i2 & 2) != 0) {
            c("Connecting PlusClient.");
            this.k = 2;
        } else if (this.h == null || (i2 & 4) == 0) {
            throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.i + ", C=" + this.j);
        } else {
            c("Connecting AppStateClient.");
            this.k = 4;
        }
        j();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.b == 1) {
            d("GameHelper got disconnected during connection process. Aborting.");
            return;
        }
        if (a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", 2)) {
            switch (this.k) {
                case e.MapAttrs_cameraBearing:
                    this.f.a();
                    return;
                case e.MapAttrs_cameraTargetLat:
                    this.g.a();
                    return;
                case e.MapAttrs_cameraTilt:
                    this.h.a();
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", 2, 3);
        c("All requested clients connected. Sign-in succeeded!");
        a(3);
        this.o = null;
        this.l = true;
        this.m = false;
        a(true);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", 2);
        if (this.c) {
            c("We're already expecting the result of a previous resolution.");
            return;
        }
        c("resolveConnectionResult: trying to resolve result: " + this.n);
        if (this.n.a()) {
            c("Result has resolution. Starting it.");
            try {
                this.c = true;
                this.n.a(this.d, 9001);
            } catch (IntentSender.SendIntentException e2) {
                c("SendIntentException, so connecting again.");
                j();
            }
        } else {
            c("resolveConnectionResult: result has no resolution. Giving up.");
            a(new c(this.n.b()));
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        Dialog b2;
        Context g2 = g();
        if (g2 == null) {
            c("*** No context. Can't show failure dialog.");
            return;
        }
        c("Making error dialog for failure: " + this.o);
        int a2 = this.o.a();
        switch (this.o.b()) {
            case 10002:
                b2 = b(g2.getString(e.gamehelper_sign_in_failed));
                break;
            case 10003:
                b2 = b(g2.getString(e.gamehelper_license_failed));
                break;
            case 10004:
                b2 = b(g2.getString(e.gamehelper_app_misconfigured));
                n();
                break;
            default:
                b2 = com.google.android.gms.common.f.a(a2, this.d, 9002, (DialogInterface.OnCancelListener) null);
                if (b2 == null) {
                    c("No standard error dialog available. Making fallback dialog.");
                    b2 = b(String.valueOf(g2.getString(e.gamehelper_unknown_error)) + " " + c(a2));
                    break;
                }
                break;
        }
        c("Showing error dialog.");
        b2.show();
    }

    /* access modifiers changed from: package-private */
    public void n() {
        c("****");
        c("****");
        c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        c("**** This is usually caused by one of these reasons:");
        c("**** (1) Your package name and certificate fingerprint do not match");
        c("****     the client ID you registered in Developer Console.");
        c("**** (2) Your App ID was incorrectly entered.");
        c("**** (3) Your game settings have not been published and you are ");
        c("****     trying to log in with an account that is not listed as");
        c("****     a test account.");
        c("****");
        if (g() == null) {
            c("*** (no Context, so can't print more debug info)");
            return;
        }
        c("**** To help you debug, here is the information about this app");
        c("**** Package name         : " + g().getPackageName());
        c("**** Cert SHA1 fingerprint: " + p());
        c("**** App ID from          : " + o());
        c("****");
        c("**** Check that the above information matches your setup in ");
        c("**** Developer Console. Also, check that you're logging in with the");
        c("**** right account (it should be listed in the Testers section if");
        c("**** your project is not yet published).");
        c("****");
        c("**** For more information, refer to the troubleshooting guide:");
        c("****   http://developers.google.com/games/services/android/troubleshooting");
    }

    /* access modifiers changed from: package-private */
    public String o() {
        try {
            Resources resources = g().getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", g().getPackageName()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    /* access modifiers changed from: package-private */
    public String p() {
        try {
            Signature[] signatureArr = g().getPackageManager().getPackageInfo(g().getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < digest.length; i2++) {
                if (i2 > 0) {
                    sb.append(":");
                }
                a(sb, digest[i2]);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }
}
