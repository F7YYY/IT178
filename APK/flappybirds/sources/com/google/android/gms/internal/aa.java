package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class aa extends Binder implements y {
    public aa() {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static y a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new ac(iBinder) : (y) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: com.google.android.gms.common.data.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: com.google.android.gms.common.data.d} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v119 */
    /* JADX WARNING: type inference failed for: r0v120 */
    /* JADX WARNING: type inference failed for: r0v121 */
    /* JADX WARNING: type inference failed for: r0v122 */
    /* JADX WARNING: type inference failed for: r0v123 */
    /* JADX WARNING: type inference failed for: r0v124 */
    /* JADX WARNING: type inference failed for: r0v125 */
    /* JADX WARNING: type inference failed for: r0v126 */
    /* JADX WARNING: type inference failed for: r0v127 */
    /* JADX WARNING: type inference failed for: r0v128 */
    /* JADX WARNING: type inference failed for: r0v129 */
    /* JADX WARNING: type inference failed for: r0v130 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r0v132 */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: type inference failed for: r0v135 */
    /* JADX WARNING: type inference failed for: r0v136 */
    /* JADX WARNING: type inference failed for: r0v137 */
    /* JADX WARNING: type inference failed for: r0v138 */
    /* JADX WARNING: type inference failed for: r0v139 */
    /* JADX WARNING: type inference failed for: r0v140 */
    /* JADX WARNING: type inference failed for: r0v141 */
    /* JADX WARNING: type inference failed for: r0v142 */
    /* JADX WARNING: type inference failed for: r0v143 */
    /* JADX WARNING: type inference failed for: r0v144 */
    /* JADX WARNING: type inference failed for: r0v145 */
    /* JADX WARNING: type inference failed for: r0v146 */
    /* JADX WARNING: type inference failed for: r0v147 */
    /* JADX WARNING: type inference failed for: r0v148 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            r2 = 1
            switch(r5) {
                case 5001: goto L_0x0010;
                case 5002: goto L_0x0024;
                case 5003: goto L_0x003c;
                case 5004: goto L_0x0050;
                case 5005: goto L_0x0068;
                case 5006: goto L_0x008f;
                case 5007: goto L_0x00a8;
                case 5008: goto L_0x00c1;
                case 5009: goto L_0x00da;
                case 5010: goto L_0x00f3;
                case 5011: goto L_0x010c;
                case 5012: goto L_0x0125;
                case 5013: goto L_0x013e;
                case 5014: goto L_0x014f;
                case 5015: goto L_0x0168;
                case 5016: goto L_0x0179;
                case 5017: goto L_0x0186;
                case 5018: goto L_0x01b8;
                case 5019: goto L_0x01d1;
                case 5020: goto L_0x01ea;
                case 5021: goto L_0x01ff;
                case 5022: goto L_0x0218;
                case 5023: goto L_0x0231;
                case 5024: goto L_0x024a;
                case 5025: goto L_0x0263;
                case 5026: goto L_0x027c;
                case 5027: goto L_0x0299;
                case 5028: goto L_0x02b6;
                case 5029: goto L_0x02d3;
                case 5030: goto L_0x02f0;
                case 5031: goto L_0x030d;
                case 5032: goto L_0x032a;
                case 5033: goto L_0x0345;
                case 5034: goto L_0x035e;
                case 5035: goto L_0x0395;
                case 5036: goto L_0x03ae;
                case 5037: goto L_0x019f;
                case 5038: goto L_0x037c;
                case 5039: goto L_0x03bf;
                case 5040: goto L_0x03d8;
                case 6001: goto L_0x03e9;
                case 6002: goto L_0x03fa;
                case 1598968902: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r2 = super.onTransact(r5, r6, r7, r8)
        L_0x0009:
            return r2
        L_0x000a:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r7.writeString(r0)
            goto L_0x0009
        L_0x0010:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            java.lang.String r1 = r6.readString()
            r4.a((int) r0, (java.lang.String) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x0024:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0035:
            r4.a((com.google.android.gms.common.data.d) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x003c:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            java.lang.String r1 = r6.readString()
            r4.b((int) r0, (java.lang.String) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x0050:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0061:
            r4.b((com.google.android.gms.common.data.d) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0068:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.common.data.f r1 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r1 = r1.createFromParcel((android.os.Parcel) r6)
        L_0x0079:
            int r3 = r6.readInt()
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0085:
            r4.a((com.google.android.gms.common.data.d) r1, (com.google.android.gms.common.data.d) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x008d:
            r1 = r0
            goto L_0x0079
        L_0x008f:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x00a0
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x00a0:
            r4.c((com.google.android.gms.common.data.d) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x00a8:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x00b9
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x00b9:
            r4.d((com.google.android.gms.common.data.d) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x00c1:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x00d2:
            r4.e(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x00da:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x00eb
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x00eb:
            r4.f(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x00f3:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0104
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0104:
            r4.g(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x010c:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x011d
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x011d:
            r4.h(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0125:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0136
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0136:
            r4.k(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x013e:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            r4.a((int) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x014f:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0160
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0160:
            r4.l(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0168:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            r4.b((int) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0179:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            r4.a()
            r7.writeNoException()
            goto L_0x0009
        L_0x0186:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0197
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0197:
            r4.i(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x019f:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x01b0
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x01b0:
            r4.j(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x01b8:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x01c9
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x01c9:
            r4.m(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x01d1:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x01e2
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x01e2:
            r4.n(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x01ea:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            java.lang.String r1 = r6.readString()
            r4.c((int) r0, (java.lang.String) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x01ff:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0210
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0210:
            r4.o(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0218:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0229
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0229:
            r4.p(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0231:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0242
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0242:
            r4.q(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x024a:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x025b
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x025b:
            r4.r(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0263:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0274
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0274:
            r4.s(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x027c:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x028d
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x028d:
            java.lang.String[] r1 = r6.createStringArray()
            r4.a((com.google.android.gms.common.data.d) r0, (java.lang.String[]) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x0299:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x02aa
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x02aa:
            java.lang.String[] r1 = r6.createStringArray()
            r4.b((com.google.android.gms.common.data.d) r0, (java.lang.String[]) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x02b6:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x02c7
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x02c7:
            java.lang.String[] r1 = r6.createStringArray()
            r4.c((com.google.android.gms.common.data.d) r0, (java.lang.String[]) r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x02d3:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x02e4
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x02e4:
            java.lang.String[] r1 = r6.createStringArray()
            r4.d(r0, r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x02f0:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x0301
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x0301:
            java.lang.String[] r1 = r6.createStringArray()
            r4.e(r0, r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x030d:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x031e
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x031e:
            java.lang.String[] r1 = r6.createStringArray()
            r4.f(r0, r1)
            r7.writeNoException()
            goto L_0x0009
        L_0x032a:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x033d
            android.os.Parcelable$Creator r0 = com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r6)
            com.google.android.gms.games.multiplayer.realtime.RealTimeMessage r0 = (com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) r0
        L_0x033d:
            r4.a((com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0345:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            int r1 = r6.readInt()
            java.lang.String r3 = r6.readString()
            r4.a((int) r0, (int) r1, (java.lang.String) r3)
            r7.writeNoException()
            goto L_0x0009
        L_0x035e:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r1 = r6.readInt()
            java.lang.String r3 = r6.readString()
            int r0 = r6.readInt()
            if (r0 == 0) goto L_0x037a
            r0 = r2
        L_0x0372:
            r4.a((int) r1, (java.lang.String) r3, (boolean) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x037a:
            r0 = 0
            goto L_0x0372
        L_0x037c:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x038d
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x038d:
            r4.t(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x0395:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x03a6
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x03a6:
            r4.u(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x03ae:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            r4.c((int) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x03bf:
            java.lang.String r1 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r1)
            int r1 = r6.readInt()
            if (r1 == 0) goto L_0x03d0
            com.google.android.gms.common.data.f r0 = com.google.android.gms.common.data.d.CREATOR
            com.google.android.gms.common.data.d r0 = r0.createFromParcel((android.os.Parcel) r6)
        L_0x03d0:
            r4.v(r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x03d8:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            int r0 = r6.readInt()
            r4.d((int) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x03e9:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            java.lang.String r0 = r6.readString()
            r4.a((java.lang.String) r0)
            r7.writeNoException()
            goto L_0x0009
        L_0x03fa:
            java.lang.String r0 = "com.google.android.gms.games.internal.IGamesCallbacks"
            r6.enforceInterface(r0)
            java.lang.String r0 = r6.readString()
            r4.b((java.lang.String) r0)
            r7.writeNoException()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aa.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
