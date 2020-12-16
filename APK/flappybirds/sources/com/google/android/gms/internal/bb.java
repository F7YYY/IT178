package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class bb extends Binder implements ba {
    public static ba a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ba)) ? new bc(iBinder) : (ba) queryLocalInterface;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.google.android.gms.internal.co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.android.gms.internal.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r0 = 0
            r4 = 0
            r7 = 1
            switch(r9) {
                case 1: goto L_0x0011;
                case 2: goto L_0x0029;
                case 3: goto L_0x0045;
                case 4: goto L_0x005d;
                case 5: goto L_0x0077;
                case 6: goto L_0x0087;
                case 7: goto L_0x0094;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00c2;
                case 10: goto L_0x00f8;
                case 11: goto L_0x0111;
                case 12: goto L_0x0126;
                case 13: goto L_0x014c;
                case 14: goto L_0x0161;
                case 16: goto L_0x0196;
                case 17: goto L_0x01bc;
                case 18: goto L_0x01cd;
                case 19: goto L_0x01e6;
                case 20: goto L_0x01fb;
                case 21: goto L_0x0218;
                case 22: goto L_0x0238;
                case 23: goto L_0x025d;
                case 24: goto L_0x0283;
                case 25: goto L_0x029c;
                case 26: goto L_0x02c1;
                case 27: goto L_0x02da;
                case 28: goto L_0x02fe;
                case 29: goto L_0x031d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0364;
                case 32: goto L_0x0393;
                case 33: goto L_0x03c4;
                case 34: goto L_0x03dd;
                case 35: goto L_0x03f6;
                case 36: goto L_0x040f;
                case 37: goto L_0x0430;
                case 38: goto L_0x045b;
                case 39: goto L_0x0470;
                case 1598968902: goto L_0x000b;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r7 = super.onTransact(r9, r10, r11, r12)
        L_0x000a:
            return r7
        L_0x000b:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r11.writeString(r0)
            goto L_0x000a
        L_0x0011:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r0, (java.lang.String) r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x0029:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r0, (java.lang.String) r1, (java.lang.String) r2)
            r11.writeNoException()
            goto L_0x000a
        L_0x0045:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.b(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x005d:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x0075
            com.google.android.gms.internal.i r0 = com.google.android.gms.internal.ak.CREATOR
            com.google.android.gms.internal.ak r0 = r0.createFromParcel((android.os.Parcel) r10)
        L_0x006e:
            r8.a((com.google.android.gms.internal.ak) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0075:
            r0 = r4
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            java.lang.String r0 = r8.a()
            r11.writeNoException()
            r11.writeString(r0)
            goto L_0x000a
        L_0x0087:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            r8.b()
            r11.writeNoException()
            goto L_0x000a
        L_0x0094:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.c(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x00ad:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            r8.a((com.google.android.gms.internal.aq) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x00c2:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r2 = com.google.android.gms.internal.ar.a(r0)
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x00f4
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r10)
            android.net.Uri r0 = (android.net.Uri) r0
            r1 = r0
        L_0x00de:
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x00f6
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r10)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x00ec:
            r8.a((com.google.android.gms.internal.aq) r2, (android.net.Uri) r1, (android.os.Bundle) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x00f4:
            r1 = r4
            goto L_0x00de
        L_0x00f6:
            r0 = r4
            goto L_0x00ec
        L_0x00f8:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.d(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x0111:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            java.lang.String r0 = r10.readString()
            java.lang.String r1 = r10.readString()
            r8.a((java.lang.String) r0, (java.lang.String) r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x0126:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            int r4 = r10.readInt()
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5)
            r11.writeNoException()
            goto L_0x000a
        L_0x014c:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            r8.b(r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0161:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            int r2 = r10.readInt()
            java.lang.String r3 = r10.readString()
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x0185
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r10)
            android.net.Uri r0 = (android.net.Uri) r0
            r4 = r0
        L_0x0185:
            java.lang.String r5 = r10.readString()
            java.lang.String r6 = r10.readString()
            r0 = r8
            r0.a(r1, r2, r3, r4, r5, r6)
            r11.writeNoException()
            goto L_0x000a
        L_0x0196:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            int r2 = r10.readInt()
            int r3 = r10.readInt()
            int r4 = r10.readInt()
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.a((com.google.android.gms.internal.aq) r1, (int) r2, (int) r3, (int) r4, (java.lang.String) r5)
            r11.writeNoException()
            goto L_0x000a
        L_0x01bc:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            java.lang.String r0 = r10.readString()
            r8.a((java.lang.String) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x01cd:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.e(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x01e6:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            r8.c(r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x01fb:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            int r1 = r10.readInt()
            java.lang.String r2 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r0, (int) r1, (java.lang.String) r2)
            r11.writeNoException()
            goto L_0x000a
        L_0x0218:
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r1)
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r1)
            java.lang.String r2 = r10.readString()
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x0230
            r0 = r7
        L_0x0230:
            r8.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (boolean) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0238:
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r1)
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r2 = com.google.android.gms.internal.ar.a(r1)
            int r1 = r10.readInt()
            if (r1 == 0) goto L_0x025b
            r1 = r7
        L_0x024c:
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x0253
            r0 = r7
        L_0x0253:
            r8.a((com.google.android.gms.internal.aq) r2, (boolean) r1, (boolean) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x025b:
            r1 = r0
            goto L_0x024c
        L_0x025d:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r2 = r10.readString()
            java.util.ArrayList r3 = r10.createStringArrayList()
            java.util.ArrayList r4 = r10.createStringArrayList()
            java.util.ArrayList r5 = r10.createStringArrayList()
            r0 = r8
            r0.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (java.util.List) r3, (java.util.List) r4, (java.util.List) r5)
            r11.writeNoException()
            goto L_0x000a
        L_0x0283:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.f(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x029c:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            int r2 = r10.readInt()
            if (r2 == 0) goto L_0x02b9
            com.google.android.gms.internal.bg r2 = com.google.android.gms.internal.bv.CREATOR
            com.google.android.gms.internal.bv r4 = r2.createFromParcel((android.os.Parcel) r10)
        L_0x02b9:
            r8.a((com.google.android.gms.internal.aq) r0, (java.lang.String) r1, (com.google.android.gms.internal.bv) r4)
            r11.writeNoException()
            goto L_0x000a
        L_0x02c1:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.g(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x02da:
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r1)
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r1)
            java.lang.String r2 = r10.readString()
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x02f2
            r0 = r7
        L_0x02f2:
            java.lang.String r3 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (boolean) r0, (java.lang.String) r3)
            r11.writeNoException()
            goto L_0x000a
        L_0x02fe:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            com.google.android.gms.internal.ds r2 = com.google.android.gms.internal.x.CREATOR
            java.util.ArrayList r2 = r10.createTypedArrayList(r2)
            r8.a((com.google.android.gms.internal.aq) r0, (java.lang.String) r1, (java.util.List) r2)
            r11.writeNoException()
            goto L_0x000a
        L_0x031d:
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r1)
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r1)
            java.lang.String r2 = r10.readString()
            com.google.android.gms.internal.ds r3 = com.google.android.gms.internal.x.CREATOR
            java.util.ArrayList r3 = r10.createTypedArrayList(r3)
            int r4 = r10.readInt()
            if (r4 == 0) goto L_0x033b
            r0 = r7
        L_0x033b:
            r8.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (java.util.List) r3, (boolean) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0343:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            int r1 = r10.readInt()
            if (r1 == 0) goto L_0x035c
            com.google.android.gms.internal.bw r1 = com.google.android.gms.internal.co.CREATOR
            com.google.android.gms.internal.co r4 = r1.createFromParcel((android.os.Parcel) r10)
        L_0x035c:
            r8.a((com.google.android.gms.internal.aq) r0, (com.google.android.gms.internal.co) r4)
            r11.writeNoException()
            goto L_0x000a
        L_0x0364:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r2 = r10.readString()
            com.google.android.gms.internal.ds r0 = com.google.android.gms.internal.x.CREATOR
            java.util.ArrayList r3 = r10.createTypedArrayList(r0)
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x0391
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r10)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x0389:
            r8.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (java.util.List) r3, (android.os.Bundle) r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0391:
            r0 = r4
            goto L_0x0389
        L_0x0393:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r0)
            int r2 = r10.readInt()
            java.lang.String r3 = r10.readString()
            int r0 = r10.readInt()
            if (r0 == 0) goto L_0x03b7
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r10)
            android.net.Uri r0 = (android.net.Uri) r0
            r4 = r0
        L_0x03b7:
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.a((com.google.android.gms.internal.aq) r1, (int) r2, (java.lang.String) r3, (android.net.Uri) r4, (java.lang.String) r5)
            r11.writeNoException()
            goto L_0x000a
        L_0x03c4:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.h(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x03dd:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.util.ArrayList r1 = r10.createStringArrayList()
            r8.a((com.google.android.gms.internal.aq) r0, (java.util.List) r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x03f6:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            r8.i(r0, r1)
            r11.writeNoException()
            goto L_0x000a
        L_0x040f:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            java.lang.String r1 = r10.readString()
            int r2 = r10.readInt()
            java.lang.String r3 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r0, (java.lang.String) r1, (int) r2, (java.lang.String) r3)
            r11.writeNoException()
            goto L_0x000a
        L_0x0430:
            java.lang.String r1 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r1)
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r1 = com.google.android.gms.internal.ar.a(r1)
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            int r4 = r10.readInt()
            if (r4 == 0) goto L_0x0459
            r4 = r7
        L_0x044c:
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.a((com.google.android.gms.internal.aq) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (java.lang.String) r5)
            r11.writeNoException()
            goto L_0x000a
        L_0x0459:
            r4 = r0
            goto L_0x044c
        L_0x045b:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            r8.d(r0)
            r11.writeNoException()
            goto L_0x000a
        L_0x0470:
            java.lang.String r0 = "com.google.android.gms.plus.internal.IPlusService"
            r10.enforceInterface(r0)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.internal.aq r0 = com.google.android.gms.internal.ar.a(r0)
            int r1 = r10.readInt()
            int r2 = r10.readInt()
            java.lang.String r3 = r10.readString()
            r8.a((com.google.android.gms.internal.aq) r0, (int) r1, (int) r2, (java.lang.String) r3)
            r11.writeNoException()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
