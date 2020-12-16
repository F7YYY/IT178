package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class n extends Binder implements m {
    public static m a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new o(iBinder) : (m) queryLocalInterface;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r0v23, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            switch(r4) {
                case 1: goto L_0x0011;
                case 2: goto L_0x0028;
                case 3: goto L_0x0043;
                case 4: goto L_0x0050;
                case 5: goto L_0x005d;
                case 6: goto L_0x006a;
                case 7: goto L_0x0077;
                case 8: goto L_0x00a0;
                case 1598968902: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.onTransact(r4, r5, r6, r7)
        L_0x0009:
            return r0
        L_0x000a:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r6.writeString(r0)
            r0 = r1
            goto L_0x0009
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r2)
            com.google.android.gms.maps.a.d r2 = r3.a()
            r6.writeNoException()
            if (r2 == 0) goto L_0x0023
            android.os.IBinder r0 = r2.asBinder()
        L_0x0023:
            r6.writeStrongBinder(r0)
            r0 = r1
            goto L_0x0009
        L_0x0028:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r2)
            int r2 = r5.readInt()
            if (r2 == 0) goto L_0x003b
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r5)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x003b:
            r3.a(r0)
            r6.writeNoException()
            r0 = r1
            goto L_0x0009
        L_0x0043:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r0)
            r3.b()
            r6.writeNoException()
            r0 = r1
            goto L_0x0009
        L_0x0050:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r0)
            r3.c()
            r6.writeNoException()
            r0 = r1
            goto L_0x0009
        L_0x005d:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r0)
            r3.d()
            r6.writeNoException()
            r0 = r1
            goto L_0x0009
        L_0x006a:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r0)
            r3.e()
            r6.writeNoException()
            r0 = r1
            goto L_0x0009
        L_0x0077:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r2)
            int r2 = r5.readInt()
            if (r2 == 0) goto L_0x008a
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r5)
            android.os.Bundle r0 = (android.os.Bundle) r0
        L_0x008a:
            r3.b(r0)
            r6.writeNoException()
            if (r0 == 0) goto L_0x009b
            r6.writeInt(r1)
            r0.writeToParcel(r6, r1)
        L_0x0098:
            r0 = r1
            goto L_0x0009
        L_0x009b:
            r0 = 0
            r6.writeInt(r0)
            goto L_0x0098
        L_0x00a0:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            r5.enforceInterface(r2)
            com.google.android.gms.b.e r2 = r3.f()
            r6.writeNoException()
            if (r2 == 0) goto L_0x00b2
            android.os.IBinder r0 = r2.asBinder()
        L_0x00b2:
            r6.writeStrongBinder(r0)
            r0 = r1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.a.n.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
