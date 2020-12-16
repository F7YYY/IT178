package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class af extends Binder implements ad {
    public static ad a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ad)) ? new ag(iBinder) : (ad) queryLocalInterface;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v192, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v199, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v256, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v270 */
    /* JADX WARNING: type inference failed for: r0v271 */
    /* JADX WARNING: type inference failed for: r0v272 */
    /* JADX WARNING: type inference failed for: r0v273 */
    /* JADX WARNING: type inference failed for: r0v274 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r0 = 0
            r7 = 0
            r9 = 1
            switch(r11) {
                case 5001: goto L_0x0011;
                case 5002: goto L_0x0021;
                case 5003: goto L_0x0035;
                case 5004: goto L_0x0045;
                case 5005: goto L_0x005e;
                case 5006: goto L_0x007c;
                case 5007: goto L_0x0088;
                case 5008: goto L_0x00c3;
                case 5009: goto L_0x00dc;
                case 5010: goto L_0x00f9;
                case 5011: goto L_0x0112;
                case 5012: goto L_0x0138;
                case 5013: goto L_0x0149;
                case 5014: goto L_0x0164;
                case 5015: goto L_0x017d;
                case 5016: goto L_0x01a6;
                case 5017: goto L_0x01c3;
                case 5018: goto L_0x01d8;
                case 5019: goto L_0x01f1;
                case 5020: goto L_0x0220;
                case 5021: goto L_0x024f;
                case 5022: goto L_0x027a;
                case 5023: goto L_0x028f;
                case 5024: goto L_0x02ba;
                case 5025: goto L_0x02e5;
                case 5026: goto L_0x0318;
                case 5027: goto L_0x032d;
                case 5028: goto L_0x0342;
                case 5029: goto L_0x0357;
                case 5030: goto L_0x0396;
                case 5031: goto L_0x03d6;
                case 5032: goto L_0x0401;
                case 5033: goto L_0x041a;
                case 5034: goto L_0x043f;
                case 5035: goto L_0x045c;
                case 5036: goto L_0x0471;
                case 5037: goto L_0x0482;
                case 5038: goto L_0x049b;
                case 5039: goto L_0x04b8;
                case 5040: goto L_0x04e9;
                case 5041: goto L_0x051a;
                case 5042: goto L_0x0537;
                case 5043: goto L_0x0550;
                case 5044: goto L_0x0569;
                case 5045: goto L_0x0599;
                case 5046: goto L_0x05c9;
                case 5047: goto L_0x05f2;
                case 5048: goto L_0x0607;
                case 5049: goto L_0x0630;
                case 5050: goto L_0x0645;
                case 5051: goto L_0x0656;
                case 5052: goto L_0x066f;
                case 5053: goto L_0x0688;
                case 5054: goto L_0x06ba;
                case 5055: goto L_0x06f3;
                case 5056: goto L_0x0730;
                case 5057: goto L_0x0745;
                case 5058: goto L_0x036c;
                case 5059: goto L_0x0385;
                case 5060: goto L_0x06a5;
                case 5061: goto L_0x06da;
                case 5062: goto L_0x075e;
                case 5063: goto L_0x0773;
                case 5064: goto L_0x0099;
                case 5065: goto L_0x00ae;
                case 5066: goto L_0x078f;
                case 5067: goto L_0x0708;
                case 5068: goto L_0x071c;
                case 5501: goto L_0x07ae;
                case 5502: goto L_0x07de;
                case 6001: goto L_0x07f9;
                case 6002: goto L_0x0815;
                case 6003: goto L_0x0839;
                case 6004: goto L_0x0862;
                case 6501: goto L_0x088b;
                case 6502: goto L_0x08cb;
                case 6503: goto L_0x08eb;
                case 6504: goto L_0x0907;
                case 6505: goto L_0x0927;
                case 6506: goto L_0x0947;
                case 6507: goto L_0x096b;
                case 1598968902: goto L_0x000b;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r9 = super.onTransact(r11, r12, r13, r14)
        L_0x000a:
            return r9
        L_0x000b:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r13.writeString(r0)
            goto L_0x000a
        L_0x0011:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            long r0 = r12.readLong()
            r10.a((long) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0021:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.a((com.google.android.gms.internal.y) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0035:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r10.a()
            r13.writeNoException()
            r13.writeString(r0)
            goto L_0x000a
        L_0x0045:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.Bundle r0 = r10.b()
            r13.writeNoException()
            if (r0 == 0) goto L_0x005a
            r13.writeInt(r9)
            r0.writeToParcel(r13, r9)
            goto L_0x000a
        L_0x005a:
            r13.writeInt(r7)
            goto L_0x000a
        L_0x005e:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x0075
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x0075:
            r10.a((android.os.IBinder) r1, (android.os.Bundle) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x007c:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            r10.c()
            r13.writeNoException()
            goto L_0x000a
        L_0x0088:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r10.d()
            r13.writeNoException()
            r13.writeString(r0)
            goto L_0x000a
        L_0x0099:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            java.lang.String r0 = r10.a((java.lang.String) r0)
            r13.writeNoException()
            r13.writeString(r0)
            goto L_0x000a
        L_0x00ae:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            java.lang.String r1 = r12.readString()
            r10.a((java.lang.String) r0, (java.lang.String) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x00c3:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.a((com.google.android.gms.internal.y) r0, (java.lang.String) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x00dc:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            r10.a((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (java.lang.String) r2)
            r13.writeNoException()
            goto L_0x000a
        L_0x00f9:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.b((com.google.android.gms.internal.y) r0, (java.lang.String) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0112:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0136
            r0 = r9
        L_0x012a:
            long[] r3 = r12.createLongArray()
            r10.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (boolean) r0, (long[]) r3)
            r13.writeNoException()
            goto L_0x000a
        L_0x0136:
            r0 = r7
            goto L_0x012a
        L_0x0138:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r10.e()
            r13.writeNoException()
            r13.writeString(r0)
            goto L_0x000a
        L_0x0149:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            com.google.android.gms.common.data.d r0 = r10.f()
            r13.writeNoException()
            if (r0 == 0) goto L_0x015f
            r13.writeInt(r9)
            r0.writeToParcel(r13, r9)
            goto L_0x000a
        L_0x015f:
            r13.writeInt(r7)
            goto L_0x000a
        L_0x0164:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.c((com.google.android.gms.internal.y) r0, (java.lang.String) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x017d:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x01a4
            r0 = r9
        L_0x0195:
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x019c
            r7 = r9
        L_0x019c:
            r10.a((com.google.android.gms.internal.y) r1, (int) r2, (boolean) r0, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x01a4:
            r0 = r7
            goto L_0x0195
        L_0x01a6:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.a((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (long) r2)
            r13.writeNoException()
            goto L_0x000a
        L_0x01c3:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.b((com.google.android.gms.internal.y) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x01d8:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.d(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x01f1:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x021e
            r6 = r9
        L_0x0215:
            r0 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
            r13.writeNoException()
            goto L_0x000a
        L_0x021e:
            r6 = r7
            goto L_0x0215
        L_0x0220:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x024d
            r6 = r9
        L_0x0244:
            r0 = r10
            r0.b(r1, r2, r3, r4, r5, r6)
            r13.writeNoException()
            goto L_0x000a
        L_0x024d:
            r6 = r7
            goto L_0x0244
        L_0x024f:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r1)
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x026a
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x026a:
            int r2 = r12.readInt()
            int r3 = r12.readInt()
            r10.a((com.google.android.gms.internal.y) r1, (android.os.Bundle) r0, (int) r2, (int) r3)
            r13.writeNoException()
            goto L_0x000a
        L_0x027a:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.c((com.google.android.gms.internal.y) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x028f:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r1)
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            int r4 = r12.readInt()
            if (r4 == 0) goto L_0x02b2
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x02b2:
            r10.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x02ba:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r1)
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            int r4 = r12.readInt()
            if (r4 == 0) goto L_0x02dd
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x02dd:
            r10.b((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (android.os.IBinder) r3, (android.os.Bundle) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x02e5:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r1)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            android.os.IBinder r4 = r12.readStrongBinder()
            int r5 = r12.readInt()
            if (r5 == 0) goto L_0x0316
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5 = r0
        L_0x030d:
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (int) r3, (android.os.IBinder) r4, (android.os.Bundle) r5)
            r13.writeNoException()
            goto L_0x000a
        L_0x0316:
            r5 = r0
            goto L_0x030d
        L_0x0318:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.d((com.google.android.gms.internal.y) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x032d:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.e((com.google.android.gms.internal.y) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0342:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            int r1 = r12.readInt()
            r10.a((java.lang.String) r0, (int) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0357:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            int r1 = r12.readInt()
            r10.b((java.lang.String) r0, (int) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x036c:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            long r1 = r12.readLong()
            r10.a((com.google.android.gms.internal.y) r0, (long) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0385:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            long r0 = r12.readLong()
            r10.b((long) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0396:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r1)
            android.os.IBinder r2 = r12.readStrongBinder()
            int r3 = r12.readInt()
            java.lang.String[] r4 = r12.createStringArray()
            int r5 = r12.readInt()
            if (r5 == 0) goto L_0x03d2
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r5 = r0
        L_0x03be:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x03d4
            r6 = r9
        L_0x03c5:
            long r7 = r12.readLong()
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (android.os.IBinder) r2, (int) r3, (java.lang.String[]) r4, (android.os.Bundle) r5, (boolean) r6, (long) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x03d2:
            r5 = r0
            goto L_0x03be
        L_0x03d4:
            r6 = r7
            goto L_0x03c5
        L_0x03d6:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            android.os.IBinder r2 = r12.readStrongBinder()
            java.lang.String r3 = r12.readString()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x03ff
            r4 = r9
        L_0x03f2:
            long r5 = r12.readLong()
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (android.os.IBinder) r2, (java.lang.String) r3, (boolean) r4, (long) r5)
            r13.writeNoException()
            goto L_0x000a
        L_0x03ff:
            r4 = r7
            goto L_0x03f2
        L_0x0401:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.e(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x041a:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            byte[] r1 = r12.createByteArray()
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            int r0 = r10.a((com.google.android.gms.internal.y) r0, (byte[]) r1, (java.lang.String) r2, (java.lang.String) r3)
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x000a
        L_0x043f:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            byte[] r0 = r12.createByteArray()
            java.lang.String r1 = r12.readString()
            java.lang.String[] r2 = r12.createStringArray()
            int r0 = r10.a((byte[]) r0, (java.lang.String) r1, (java.lang.String[]) r2)
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x000a
        L_0x045c:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            java.lang.String r0 = r10.b((java.lang.String) r0)
            r13.writeNoException()
            r13.writeString(r0)
            goto L_0x000a
        L_0x0471:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            int r0 = r12.readInt()
            r10.a((int) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0482:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.f(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x049b:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            r10.b((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (java.lang.String) r2)
            r13.writeNoException()
            goto L_0x000a
        L_0x04b8:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            int r6 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x04e0
            r7 = r9
        L_0x04e0:
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (int) r6, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x04e9:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            int r6 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0511
            r7 = r9
        L_0x0511:
            r0 = r10
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x051a:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            r10.c((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (java.lang.String) r2)
            r13.writeNoException()
            goto L_0x000a
        L_0x0537:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.g(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0550:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.h(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0569:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r3 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0595
            r4 = r9
        L_0x0585:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0597
            r5 = r9
        L_0x058c:
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (int) r2, (int) r3, (boolean) r4, (boolean) r5)
            r13.writeNoException()
            goto L_0x000a
        L_0x0595:
            r4 = r7
            goto L_0x0585
        L_0x0597:
            r5 = r7
            goto L_0x058c
        L_0x0599:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x05c5
            r4 = r9
        L_0x05b5:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x05c7
            r5 = r9
        L_0x05bc:
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5)
            r13.writeNoException()
            goto L_0x000a
        L_0x05c5:
            r4 = r7
            goto L_0x05b5
        L_0x05c7:
            r5 = r7
            goto L_0x05bc
        L_0x05c9:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x05f0
            r0 = r9
        L_0x05e1:
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x05e8
            r7 = r9
        L_0x05e8:
            r10.b((com.google.android.gms.internal.y) r1, (int) r2, (boolean) r0, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x05f0:
            r0 = r7
            goto L_0x05e1
        L_0x05f2:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.f(r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0607:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x062e
            r0 = r9
        L_0x061f:
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x0626
            r7 = r9
        L_0x0626:
            r10.c(r1, r2, r0, r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x062e:
            r0 = r7
            goto L_0x061f
        L_0x0630:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.g(r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0645:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            r10.c((java.lang.String) r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0656:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            java.lang.String r1 = r12.readString()
            int r2 = r12.readInt()
            r10.a((java.lang.String) r0, (java.lang.String) r1, (int) r2)
            r13.writeNoException()
            goto L_0x000a
        L_0x066f:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.i(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0688:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            int r0 = r10.j(r0, r1)
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x000a
        L_0x06a5:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            int r0 = r10.d((java.lang.String) r0)
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x000a
        L_0x06ba:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x06d2
            r7 = r9
        L_0x06d2:
            r10.a((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x06da:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.k(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x06f3:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            int r1 = r12.readInt()
            r10.c((java.lang.String) r0, (int) r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x0708:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            boolean r0 = r10.g()
            r13.writeNoException()
            if (r0 == 0) goto L_0x0717
            r7 = r9
        L_0x0717:
            r13.writeInt(r7)
            goto L_0x000a
        L_0x071c:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0728
            r7 = r9
        L_0x0728:
            r10.a((boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0730:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.h(r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0745:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            r10.l(r0, r1)
            r13.writeNoException()
            goto L_0x000a
        L_0x075e:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            r10.i(r0)
            r13.writeNoException()
            goto L_0x000a
        L_0x0773:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            int r1 = r12.readInt()
            if (r1 == 0) goto L_0x0787
            r7 = r9
        L_0x0787:
            r10.a((com.google.android.gms.internal.y) r0, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x078f:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            java.lang.String r0 = r12.readString()
            android.net.Uri r0 = r10.e((java.lang.String) r0)
            r13.writeNoException()
            if (r0 == 0) goto L_0x07a9
            r13.writeInt(r9)
            r0.writeToParcel(r13, r9)
            goto L_0x000a
        L_0x07a9:
            r13.writeInt(r7)
            goto L_0x000a
        L_0x07ae:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x07da
            r4 = r9
        L_0x07ca:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x07dc
            r5 = r9
        L_0x07d1:
            r0 = r10
            r0.b(r1, r2, r3, r4, r5)
            r13.writeNoException()
            goto L_0x000a
        L_0x07da:
            r4 = r7
            goto L_0x07ca
        L_0x07dc:
            r5 = r7
            goto L_0x07d1
        L_0x07de:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            com.google.android.gms.common.data.d r0 = r10.h()
            r13.writeNoException()
            if (r0 == 0) goto L_0x07f4
            r13.writeInt(r9)
            r0.writeToParcel(r13, r9)
            goto L_0x000a
        L_0x07f4:
            r13.writeInt(r7)
            goto L_0x000a
        L_0x07f9:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            int r1 = r12.readInt()
            if (r1 == 0) goto L_0x080d
            r7 = r9
        L_0x080d:
            r10.b((com.google.android.gms.internal.y) r0, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0815:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x0831
            r7 = r9
        L_0x0831:
            r10.a((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0839:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0860
            r0 = r9
        L_0x0851:
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x0858
            r7 = r9
        L_0x0858:
            r10.d(r1, r2, r0, r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0860:
            r0 = r7
            goto L_0x0851
        L_0x0862:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            int r2 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x0889
            r0 = r9
        L_0x087a:
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x0881
            r7 = r9
        L_0x0881:
            r10.e(r1, r2, r0, r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0889:
            r0 = r7
            goto L_0x087a
        L_0x088b:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r1 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x08c5
            r4 = r9
        L_0x08a7:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x08c7
            r5 = r9
        L_0x08ae:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x08c9
            r6 = r9
        L_0x08b5:
            int r0 = r12.readInt()
            if (r0 == 0) goto L_0x08bc
            r7 = r9
        L_0x08bc:
            r0 = r10
            r0.a((com.google.android.gms.internal.y) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (boolean) r5, (boolean) r6, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x08c5:
            r4 = r7
            goto L_0x08a7
        L_0x08c7:
            r5 = r7
            goto L_0x08ae
        L_0x08c9:
            r6 = r7
            goto L_0x08b5
        L_0x08cb:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x08e3
            r7 = r9
        L_0x08e3:
            r10.b((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x08eb:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            int r1 = r12.readInt()
            if (r1 == 0) goto L_0x08ff
            r7 = r9
        L_0x08ff:
            r10.c((com.google.android.gms.internal.y) r0, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0907:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x091f
            r7 = r9
        L_0x091f:
            r10.c((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0927:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            int r2 = r12.readInt()
            if (r2 == 0) goto L_0x093f
            r7 = r9
        L_0x093f:
            r10.d(r0, r1, r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x0947:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r0)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.internal.y r0 = com.google.android.gms.internal.aa.a(r0)
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            int r3 = r12.readInt()
            if (r3 == 0) goto L_0x0963
            r7 = r9
        L_0x0963:
            r10.b((com.google.android.gms.internal.y) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r7)
            r13.writeNoException()
            goto L_0x000a
        L_0x096b:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesService"
            r12.enforceInterface(r1)
            int r1 = r12.readInt()
            if (r1 == 0) goto L_0x097e
            android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r12)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x097e:
            android.os.ParcelFileDescriptor r0 = r10.a((android.net.Uri) r0)
            r13.writeNoException()
            if (r0 == 0) goto L_0x098f
            r13.writeInt(r9)
            r0.writeToParcel(r13, r9)
            goto L_0x000a
        L_0x098f:
            r13.writeInt(r7)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.af.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
