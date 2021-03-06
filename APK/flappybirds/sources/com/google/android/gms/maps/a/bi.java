package com.google.android.gms.maps.a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

class bi implements bg {
    private IBinder a;

    bi(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(Bitmap bitmap) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap != null) {
                obtain.writeInt(1);
                bitmap.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
