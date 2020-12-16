package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class cg implements ce {
    private IBinder a;

    cg(IBinder iBinder) {
        this.a = iBinder;
    }

    public int a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.a.transact(5001, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5005, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(ca caVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            this.a.transact(5004, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(ca caVar, int i, String str, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            this.a.transact(5006, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(ca caVar, int i, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            obtain.writeByteArray(bArr);
            this.a.transact(5003, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public int b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.a.transact(5002, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5008, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(ca caVar, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            obtain.writeInt(i);
            this.a.transact(5007, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void c(ca caVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            obtain.writeStrongBinder(caVar != null ? caVar.asBinder() : null);
            this.a.transact(5009, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
