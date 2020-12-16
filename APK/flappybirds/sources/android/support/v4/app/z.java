package android.support.v4.app;

import android.support.v4.b.d;
import android.support.v4.b.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class z extends x {
    static boolean a = false;
    final m b = new m();
    final m c = new m();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    z(String str, FragmentActivity fragmentActivity, boolean z) {
        this.d = str;
        this.e = fragmentActivity;
        this.f = z;
    }

    /* access modifiers changed from: package-private */
    public void a(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.b.b(); i++) {
                aa aaVar = (aa) this.b.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(aaVar.toString());
                aaVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.b(); i2++) {
                aa aaVar2 = (aa) this.c.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i2));
                printWriter.print(": ");
                printWriter.println(aaVar2.toString());
                aaVar2.a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    public boolean a() {
        int b2 = this.b.b();
        boolean z = false;
        for (int i = 0; i < b2; i++) {
            aa aaVar = (aa) this.b.b(i);
            z |= aaVar.h && !aaVar.f;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f = true;
        for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
            ((aa) this.b.b(b2)).a();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
            ((aa) this.b.b(b2)).e();
        }
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.g = true;
        this.f = false;
        for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
            ((aa) this.b.b(b2)).b();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.g) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.g = false;
            for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
                ((aa) this.b.b(b2)).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
            ((aa) this.b.b(b2)).k = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
            ((aa) this.b.b(b2)).d();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int b2 = this.b.b() - 1; b2 >= 0; b2--) {
                ((aa) this.b.b(b2)).f();
            }
            this.b.c();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int b3 = this.c.b() - 1; b3 >= 0; b3--) {
            ((aa) this.c.b(b3)).f();
        }
        this.c.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }
}
