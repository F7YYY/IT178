package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.b.d;
import android.support.v4.b.l;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {
    private static final l P = new l();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E = true;
    boolean F;
    int G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    boolean L = true;
    z M;
    boolean N;
    boolean O;
    int a = 0;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    int f = -1;
    String g;
    Bundle h;
    Fragment i;
    int j = -1;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    o s;
    FragmentActivity t;
    o u;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new g();
        final Bundle a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader != null && this.a != null) {
                this.a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    public static Fragment a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = (Class) P.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                P.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e4);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class<?> cls = (Class) P.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                P.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation a(int i2, boolean z2, int i3) {
        return null;
    }

    public void a(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Fragment fragment) {
        this.f = i2;
        if (fragment != null) {
            this.g = fragment.g + ":" + this.f;
        } else {
            this.g = "android:fragment:" + this.f;
        }
    }

    public void a(Activity activity) {
        this.F = true;
    }

    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.u != null) {
            this.u.a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (this.e != null) {
            this.J.restoreHierarchyState(this.e);
            this.e = null;
        }
        this.F = false;
        e(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mResumed=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.h);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.G != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.I);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.c);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.M.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.u + ":");
            this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void a(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.r > 0;
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public final FragmentActivity b() {
        return this.t;
    }

    public LayoutInflater b(Bundle bundle) {
        return this.t.getLayoutInflater();
    }

    /* access modifiers changed from: package-private */
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.u != null) {
            this.u.i();
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    public void b(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            a(menu, menuInflater);
        }
        return this.u != null ? z2 | this.u.a(menu, menuInflater) : z2;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public final Resources c() {
        if (this.t != null) {
            return this.t.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void c(Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public boolean c(Menu menu) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            a(menu);
        }
        return this.u != null ? z2 | this.u.a(menu) : z2;
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (!this.z) {
            if (!this.D || !this.E || !a(menuItem)) {
                return this.u != null && this.u.a(menuItem);
            }
            return true;
        }
    }

    public void d(Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void d(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                b(menu);
            }
            if (this.u != null) {
                this.u.b(menu);
            }
        }
    }

    public final boolean d() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (!this.z) {
            if (b(menuItem)) {
                return true;
            }
            return this.u != null && this.u.b(menuItem);
        }
    }

    public void e() {
        this.F = true;
        if (!this.N) {
            this.N = true;
            if (!this.O) {
                this.O = true;
                this.M = this.t.a(this.g, this.N, false);
            }
            if (this.M != null) {
                this.M.b();
            }
        }
    }

    public void e(Bundle bundle) {
        this.F = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f() {
        this.F = true;
    }

    public void f(Bundle bundle) {
    }

    public void g() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        Parcelable parcelable;
        if (this.u != null) {
            this.u.i();
        }
        this.F = false;
        c(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onCreate()");
        } else if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.u == null) {
                n();
            }
            this.u.a(parcelable, (ArrayList) null);
            this.u.j();
        }
    }

    public void h() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        if (this.u != null) {
            this.u.i();
        }
        this.F = false;
        d(bundle);
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.u != null) {
            this.u.k();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void i(Bundle bundle) {
        Parcelable h2;
        f(bundle);
        if (this.u != null && (h2 = this.u.h()) != null) {
            bundle.putParcelable("android:support:fragments", h2);
        }
    }

    public void j() {
        this.F = true;
        if (!this.O) {
            this.O = true;
            this.M = this.t.a(this.g, this.N, false);
        }
        if (this.M != null) {
            this.M.h();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
        this.C = false;
        this.M = null;
        this.N = false;
        this.O = false;
    }

    public void l() {
        this.F = true;
    }

    public void m() {
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.u = new o();
        this.u.a(this.t, (l) new e(this), this);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (this.u != null) {
            this.u.i();
            this.u.e();
        }
        this.F = false;
        e();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.u != null) {
            this.u.l();
        }
        if (this.M != null) {
            this.M.g();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        b().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.u != null) {
            this.u.i();
            this.u.e();
        }
        this.F = false;
        f();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.u != null) {
            this.u.m();
            this.u.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        onLowMemory();
        if (this.u != null) {
            this.u.s();
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (this.u != null) {
            this.u.n();
        }
        this.F = false;
        g();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.u != null) {
            this.u.o();
        }
        this.F = false;
        h();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (this.u != null) {
            this.u.p();
        }
        if (this.N) {
            this.N = false;
            if (!this.O) {
                this.O = true;
                this.M = this.t.a(this.g, this.N, false);
            }
            if (this.M == null) {
                return;
            }
            if (!this.t.h) {
                this.M.c();
            } else {
                this.M.d();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        d.a(this, sb);
        if (this.f >= 0) {
            sb.append(" #");
            sb.append(this.f);
        }
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (this.u != null) {
            this.u.q();
        }
        this.F = false;
        i();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.M != null) {
            this.M.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (this.u != null) {
            this.u.r();
        }
        this.F = false;
        j();
        if (!this.F) {
            throw new ac("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
