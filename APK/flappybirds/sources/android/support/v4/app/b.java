package android.support.v4.app;

import android.support.v4.b.e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class b extends w implements Runnable {
    final o a;
    c b;
    c c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l = true;
    String m;
    boolean n;
    int o = -1;
    int p;
    CharSequence q;
    int r;
    CharSequence s;

    public b(o oVar) {
        this.a = oVar;
    }

    private void a(int i2, Fragment fragment, String str, int i3) {
        fragment.s = this.a;
        if (str != null) {
            if (fragment.y == null || str.equals(fragment.y)) {
                fragment.y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
        }
        if (i2 != 0) {
            if (fragment.w == 0 || fragment.w == i2) {
                fragment.w = i2;
                fragment.x = i2;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i2);
            }
        }
        c cVar = new c();
        cVar.c = i3;
        cVar.d = fragment;
        a(cVar);
    }

    public int a() {
        return a(false);
    }

    /* access modifiers changed from: package-private */
    public int a(boolean z) {
        if (this.n) {
            throw new IllegalStateException("commit already called");
        }
        if (o.a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new e("FragmentManager")), (String[]) null);
        }
        this.n = true;
        if (this.k) {
            this.o = this.a.a(this);
        } else {
            this.o = -1;
        }
        this.a.a((Runnable) this, z);
        return this.o;
    }

    public w a(int i2, Fragment fragment, String str) {
        a(i2, fragment, str, 1);
        return this;
    }

    public w a(Fragment fragment) {
        c cVar = new c();
        cVar.c = 6;
        cVar.d = fragment;
        a(cVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.k) {
            if (o.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            for (c cVar = this.b; cVar != null; cVar = cVar.a) {
                if (cVar.d != null) {
                    cVar.d.r += i2;
                    if (o.a) {
                        Log.v("FragmentManager", "Bump nesting of " + cVar.d + " to " + cVar.d.r);
                    }
                }
                if (cVar.i != null) {
                    for (int size = cVar.i.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) cVar.i.get(size);
                        fragment.r += i2;
                        if (o.a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.r);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        if (this.b == null) {
            this.c = cVar;
            this.b = cVar;
        } else {
            cVar.b = this.c;
            this.c.a = cVar;
            this.c = cVar;
        }
        cVar.e = this.e;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.h = this.h;
        this.d++;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.g == 0 && this.h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (!(this.r == 0 && this.s == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i2 = 0;
            c cVar = this.b;
            while (cVar != null) {
                switch (cVar.c) {
                    case com.google.android.gms.e.MapAttrs_mapType /*0*/:
                        str2 = "NULL";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                        str2 = "ADD";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                        str2 = "REPLACE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                        str2 = "REMOVE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                        str2 = "HIDE";
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                        str2 = "SHOW";
                        break;
                    case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                        str2 = "DETACH";
                        break;
                    case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + cVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(cVar.d);
                if (z) {
                    if (!(cVar.e == 0 && cVar.f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(cVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(cVar.f));
                    }
                    if (!(cVar.g == 0 && cVar.h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(cVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(cVar.h));
                    }
                }
                if (cVar.i != null && cVar.i.size() > 0) {
                    for (int i3 = 0; i3 < cVar.i.size(); i3++) {
                        printWriter.print(str3);
                        if (cVar.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i3 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i3);
                            printWriter.print(": ");
                        }
                        printWriter.println(cVar.i.get(i3));
                    }
                }
                cVar = cVar.a;
                i2++;
            }
        }
    }

    public w b(Fragment fragment) {
        c cVar = new c();
        cVar.c = 7;
        cVar.d = fragment;
        a(cVar);
        return this;
    }

    public String b() {
        return this.m;
    }

    public void b(boolean z) {
        if (o.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", (FileDescriptor) null, new PrintWriter(new e("FragmentManager")), (String[]) null);
        }
        a(-1);
        for (c cVar = this.c; cVar != null; cVar = cVar.b) {
            switch (cVar.c) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    Fragment fragment = cVar.d;
                    fragment.G = cVar.h;
                    this.a.a(fragment, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    Fragment fragment2 = cVar.d;
                    if (fragment2 != null) {
                        fragment2.G = cVar.h;
                        this.a.a(fragment2, o.c(this.i), this.j);
                    }
                    if (cVar.i == null) {
                        break;
                    } else {
                        for (int i2 = 0; i2 < cVar.i.size(); i2++) {
                            Fragment fragment3 = (Fragment) cVar.i.get(i2);
                            fragment3.G = cVar.g;
                            this.a.a(fragment3, false);
                        }
                        break;
                    }
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                    Fragment fragment4 = cVar.d;
                    fragment4.G = cVar.g;
                    this.a.a(fragment4, false);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                    Fragment fragment5 = cVar.d;
                    fragment5.G = cVar.g;
                    this.a.c(fragment5, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                    Fragment fragment6 = cVar.d;
                    fragment6.G = cVar.h;
                    this.a.b(fragment6, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                    Fragment fragment7 = cVar.d;
                    fragment7.G = cVar.g;
                    this.a.e(fragment7, o.c(this.i), this.j);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                    Fragment fragment8 = cVar.d;
                    fragment8.G = cVar.g;
                    this.a.d(fragment8, o.c(this.i), this.j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + cVar.c);
            }
        }
        if (z) {
            this.a.a(this.a.n, o.c(this.i), this.j, true);
        }
        if (this.o >= 0) {
            this.a.b(this.o);
            this.o = -1;
        }
    }

    public void run() {
        Fragment fragment;
        if (o.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.k || this.o >= 0) {
            a(1);
            for (c cVar = this.b; cVar != null; cVar = cVar.a) {
                switch (cVar.c) {
                    case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                        Fragment fragment2 = cVar.d;
                        fragment2.G = cVar.e;
                        this.a.a(fragment2, false);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                        Fragment fragment3 = cVar.d;
                        if (this.a.g != null) {
                            fragment = fragment3;
                            for (int i2 = 0; i2 < this.a.g.size(); i2++) {
                                Fragment fragment4 = (Fragment) this.a.g.get(i2);
                                if (o.a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                                }
                                if (fragment == null || fragment4.x == fragment.x) {
                                    if (fragment4 == fragment) {
                                        fragment = null;
                                        cVar.d = null;
                                    } else {
                                        if (cVar.i == null) {
                                            cVar.i = new ArrayList();
                                        }
                                        cVar.i.add(fragment4);
                                        fragment4.G = cVar.f;
                                        if (this.k) {
                                            fragment4.r++;
                                            if (o.a) {
                                                Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.r);
                                            }
                                        }
                                        this.a.a(fragment4, this.i, this.j);
                                    }
                                }
                            }
                        } else {
                            fragment = fragment3;
                        }
                        if (fragment == null) {
                            break;
                        } else {
                            fragment.G = cVar.e;
                            this.a.a(fragment, false);
                            break;
                        }
                    case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                        Fragment fragment5 = cVar.d;
                        fragment5.G = cVar.f;
                        this.a.a(fragment5, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                        Fragment fragment6 = cVar.d;
                        fragment6.G = cVar.f;
                        this.a.b(fragment6, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                        Fragment fragment7 = cVar.d;
                        fragment7.G = cVar.e;
                        this.a.c(fragment7, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                        Fragment fragment8 = cVar.d;
                        fragment8.G = cVar.f;
                        this.a.d(fragment8, this.i, this.j);
                        break;
                    case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                        Fragment fragment9 = cVar.d;
                        fragment9.G = cVar.e;
                        this.a.e(fragment9, this.i, this.j);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + cVar.c);
                }
            }
            this.a.a(this.a.n, this.i, this.j, true);
            if (this.k) {
                this.a.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.o >= 0) {
            sb.append(" #");
            sb.append(this.o);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        sb.append("}");
        return sb.toString();
    }
}
