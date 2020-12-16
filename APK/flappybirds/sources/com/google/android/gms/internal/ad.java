package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;

public interface ad extends IInterface {
    int a(y yVar, byte[] bArr, String str, String str2);

    int a(byte[] bArr, String str, String[] strArr);

    ParcelFileDescriptor a(Uri uri);

    String a();

    String a(String str);

    void a(int i);

    void a(long j);

    void a(IBinder iBinder, Bundle bundle);

    void a(y yVar);

    void a(y yVar, int i, int i2, boolean z, boolean z2);

    void a(y yVar, int i, boolean z, boolean z2);

    void a(y yVar, long j);

    void a(y yVar, Bundle bundle, int i, int i2);

    void a(y yVar, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j);

    void a(y yVar, IBinder iBinder, String str, boolean z, long j);

    void a(y yVar, String str);

    void a(y yVar, String str, int i, int i2, int i3, boolean z);

    void a(y yVar, String str, int i, IBinder iBinder, Bundle bundle);

    void a(y yVar, String str, int i, boolean z, boolean z2);

    void a(y yVar, String str, int i, boolean z, boolean z2, boolean z3, boolean z4);

    void a(y yVar, String str, long j);

    void a(y yVar, String str, IBinder iBinder, Bundle bundle);

    void a(y yVar, String str, String str2);

    void a(y yVar, String str, String str2, int i, int i2, int i3, boolean z);

    void a(y yVar, String str, String str2, boolean z);

    void a(y yVar, String str, boolean z);

    void a(y yVar, String str, boolean z, long[] jArr);

    void a(y yVar, boolean z);

    void a(String str, int i);

    void a(String str, String str2);

    void a(String str, String str2, int i);

    void a(boolean z);

    Bundle b();

    String b(String str);

    void b(long j);

    void b(y yVar);

    void b(y yVar, int i, boolean z, boolean z2);

    void b(y yVar, String str);

    void b(y yVar, String str, int i, int i2, int i3, boolean z);

    void b(y yVar, String str, int i, boolean z, boolean z2);

    void b(y yVar, String str, IBinder iBinder, Bundle bundle);

    void b(y yVar, String str, String str2);

    void b(y yVar, String str, String str2, int i, int i2, int i3, boolean z);

    void b(y yVar, String str, String str2, boolean z);

    void b(y yVar, String str, boolean z);

    void b(y yVar, boolean z);

    void b(String str, int i);

    void c();

    void c(y yVar);

    void c(y yVar, int i, boolean z, boolean z2);

    void c(y yVar, String str);

    void c(y yVar, String str, String str2);

    void c(y yVar, String str, boolean z);

    void c(y yVar, boolean z);

    void c(String str);

    void c(String str, int i);

    int d(String str);

    String d();

    void d(y yVar);

    void d(y yVar, int i, boolean z, boolean z2);

    void d(y yVar, String str);

    void d(y yVar, String str, boolean z);

    Uri e(String str);

    String e();

    void e(y yVar);

    void e(y yVar, int i, boolean z, boolean z2);

    void e(y yVar, String str);

    d f();

    void f(y yVar);

    void f(y yVar, String str);

    void g(y yVar);

    void g(y yVar, String str);

    boolean g();

    d h();

    void h(y yVar);

    void h(y yVar, String str);

    void i(y yVar);

    void i(y yVar, String str);

    int j(y yVar, String str);

    void k(y yVar, String str);

    void l(y yVar, String str);
}
