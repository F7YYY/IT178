package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.b.d;
import android.support.v4.b.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class o extends m {
    static final Interpolator A = new DecelerateInterpolator(1.5f);
    static final Interpolator B = new AccelerateInterpolator(2.5f);
    static final Interpolator C = new AccelerateInterpolator(1.5f);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5f);
    ArrayList c;
    Runnable[] d;
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n = 0;
    FragmentActivity o;
    l p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w = null;
    SparseArray x = null;
    Runnable y = new p(this);

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 11) {
            z2 = true;
        }
        b = z2;
    }

    o() {
    }

    static Animation a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public static int b(int i2, boolean z2) {
        switch (i2) {
            case 4097:
                return z2 ? 1 : 2;
            case 4099:
                return z2 ? 5 : 6;
            case 8194:
                return z2 ? 3 : 4;
            default:
                return -1;
        }
    }

    public static int c(int i2) {
        switch (i2) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void t() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    public int a(b bVar) {
        int i2;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                i2 = this.k.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + bVar);
                }
                this.k.add(bVar);
            } else {
                i2 = ((Integer) this.l.remove(this.l.size() - 1)).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + bVar);
                }
                this.k.set(i2, bVar);
            }
        }
        return i2;
    }

    public Fragment a(int i2) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && fragment.w == i2) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && fragment2.w == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        if (i2 >= this.f.size()) {
            a((RuntimeException) new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i2));
        }
        Fragment fragment = (Fragment) this.f.get(i2);
        if (fragment != null) {
            return fragment;
        }
        a((RuntimeException) new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i2));
        return fragment;
    }

    public Fragment a(String str) {
        if (!(this.g == null || str == null)) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (!(this.f == null || str == null)) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f.get(size2);
                if (fragment2 != null && str.equals(fragment2.y)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public w a() {
        return new b(this);
    }

    /* access modifiers changed from: package-private */
    public Animation a(Fragment fragment, int i2, boolean z2, int i3) {
        Animation loadAnimation;
        Animation a2 = fragment.a(i2, z2, fragment.G);
        if (a2 != null) {
            return a2;
        }
        if (fragment.G != 0 && (loadAnimation = AnimationUtils.loadAnimation(this.o, fragment.G)) != null) {
            return loadAnimation;
        }
        if (i2 == 0) {
            return null;
        }
        int b2 = b(i2, z2);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                return a((Context) this.o, 1.125f, 1.0f, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                return a((Context) this.o, 1.0f, 0.975f, 1.0f, 0.0f);
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                return a((Context) this.o, 0.975f, 1.0f, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                return a((Context) this.o, 1.0f, 1.075f, 1.0f, 0.0f);
            case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                return a((Context) this.o, 0.0f, 1.0f);
            case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                return a((Context) this.o, 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.o.getWindow() != null) {
                    i3 = this.o.getWindow().getAttributes().windowAnimations;
                }
                return i3 == 0 ? null : null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, boolean z2) {
        if (this.o == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || this.n != i2) {
            this.n = i2;
            if (this.f != null) {
                int i5 = 0;
                boolean z3 = false;
                while (i5 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i5);
                    if (fragment != null) {
                        a(fragment, i2, i3, i4, false);
                        if (fragment.M != null) {
                            z3 |= fragment.M.a();
                        }
                    }
                    i5++;
                    z3 = z3;
                }
                if (!z3) {
                    d();
                }
                if (this.r && this.o != null && this.n == 5) {
                    this.o.c();
                    this.r = false;
                }
            }
        }
    }

    public void a(int i2, b bVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            int size = this.k.size();
            if (i2 < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + bVar);
                }
                this.k.set(i2, bVar);
            } else {
                while (size < i2) {
                    this.k.add((Object) null);
                    if (this.l == null) {
                        this.l = new ArrayList();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + bVar);
                }
                this.k.add(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        a(i2, 0, 0, z2);
    }

    public void a(Configuration configuration) {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i3);
                    if (fragment != null) {
                        fragment.a(configuration);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f < 0) {
            a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f);
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Fragment fragment = (Fragment) arrayList.get(i2);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[fragment.f];
                        fragmentState.k = fragment;
                        fragment.e = null;
                        fragment.r = 0;
                        fragment.p = false;
                        fragment.l = false;
                        fragment.i = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            fragment.e = fragmentState.j.getSparseParcelableArray("android:view_state");
                        }
                    }
                }
                this.f = new ArrayList(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int i3 = 0; i3 < fragmentManagerState.a.length; i3++) {
                    FragmentState fragmentState2 = fragmentManagerState.a[i3];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.a(this.o, this.q);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a2);
                        }
                        this.f.add(a2);
                        fragmentState2.k = null;
                    } else {
                        this.f.add((Object) null);
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i3);
                        }
                        this.h.add(Integer.valueOf(i3));
                    }
                }
                if (arrayList != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Fragment fragment2 = (Fragment) arrayList.get(i4);
                        if (fragment2.j >= 0) {
                            if (fragment2.j < this.f.size()) {
                                fragment2.i = (Fragment) this.f.get(fragment2.j);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.j);
                                fragment2.i = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList(fragmentManagerState.b.length);
                    for (int i5 = 0; i5 < fragmentManagerState.b.length; i5++) {
                        Fragment fragment3 = (Fragment) this.f.get(fragmentManagerState.b[i5]);
                        if (fragment3 == null) {
                            a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[i5]));
                        }
                        fragment3.l = true;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + fragment3);
                        }
                        if (this.g.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(fragment3);
                    }
                } else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList(fragmentManagerState.c.length);
                    for (int i6 = 0; i6 < fragmentManagerState.c.length; i6++) {
                        b a3 = fragmentManagerState.c[i6].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a3.o + "): " + a3);
                            a3.a("  ", new PrintWriter(new e("FragmentManager")), false);
                        }
                        this.i.add(a3);
                        if (a3.o >= 0) {
                            a(a3.o, a3);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public void a(Fragment fragment) {
        if (!fragment.K) {
            return;
        }
        if (this.e) {
            this.v = true;
            return;
        }
        fragment.K = false;
        a(fragment, this.n, 0, 0, false);
    }

    public void a(Fragment fragment, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z2 = !fragment.a();
        if (!fragment.A || z2) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.l = false;
            fragment.m = true;
            a(fragment, z2 ? 0 : 1, i2, i3, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0214, code lost:
        if (a == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0216, code lost:
        android.util.Log.v("FragmentManager", "moveto RESUMED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022e, code lost:
        r10.n = true;
        r10.p();
        r10.d = null;
        r10.e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023d, code lost:
        r10.J = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024b, code lost:
        if (r11 >= 1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024f, code lost:
        if (r9.t == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0253, code lost:
        if (r10.b == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0255, code lost:
        r0 = r10.b;
        r10.b = null;
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025e, code lost:
        if (r10.b == null) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0260, code lost:
        r10.c = r11;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0289, code lost:
        if (r11 >= 4) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028d, code lost:
        if (a == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028f, code lost:
        android.util.Log.v("FragmentManager", "movefrom STARTED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a7, code lost:
        r10.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02aa, code lost:
        if (r11 >= 3) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ae, code lost:
        if (a == false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b0, code lost:
        android.util.Log.v("FragmentManager", "movefrom STOPPED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c8, code lost:
        r10.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02cc, code lost:
        if (r11 >= 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d0, code lost:
        if (a == false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d2, code lost:
        android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ec, code lost:
        if (r10.I == null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f4, code lost:
        if (r9.o.isFinishing() != false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f8, code lost:
        if (r10.e != null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02fa, code lost:
        e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fd, code lost:
        r10.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0302, code lost:
        if (r10.I == null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0306, code lost:
        if (r10.H == null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030a, code lost:
        if (r9.n <= 0) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x030e, code lost:
        if (r9.t != false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0310, code lost:
        r0 = a(r10, r12, false, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0314, code lost:
        if (r0 == null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0316, code lost:
        r10.b = r10.I;
        r10.c = r11;
        r0.setAnimationListener(new android.support.v4.app.q(r9, r10));
        r10.I.startAnimation(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0329, code lost:
        r10.H.removeView(r10.I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0330, code lost:
        r10.H = null;
        r10.I = null;
        r10.J = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033a, code lost:
        if (a == false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033c, code lost:
        android.util.Log.v("FragmentManager", "movefrom CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0356, code lost:
        if (r10.C != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0358, code lost:
        r10.v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x035b, code lost:
        r10.F = false;
        r10.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0362, code lost:
        if (r10.F != false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0382, code lost:
        throw new android.support.v4.app.ac("Fragment " + r10 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0383, code lost:
        if (r14 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0387, code lost:
        if (r10.C != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0389, code lost:
        d(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x038e, code lost:
        r10.t = null;
        r10.s = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0394, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0397, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        if (r11 <= 1) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        if (a == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        if (r10.o != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014a, code lost:
        if (r10.x == 0) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014c, code lost:
        r0 = (android.view.ViewGroup) r9.p.a(r10.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0156, code lost:
        if (r0 != null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015a, code lost:
        if (r10.q != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015c, code lost:
        a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(r10.x) + " (" + r10.c().getResourceName(r10.x) + ") for fragment " + r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        r10.H = r0;
        r10.I = r10.b(r10.b(r10.d), r0, r10.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ad, code lost:
        if (r10.I == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01af, code lost:
        r10.J = r10.I;
        r10.I = android.support.v4.app.ab.a(r10.I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bb, code lost:
        if (r0 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
        r1 = a(r10, r12, true, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c1, code lost:
        if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c3, code lost:
        r10.I.startAnimation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        r0.addView(r10.I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        if (r10.z == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r10.I.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d8, code lost:
        r10.a(r10.I, r10.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r10.h(r10.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e6, code lost:
        if (r10.I == null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        r10.a(r10.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ed, code lost:
        r10.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ef, code lost:
        if (r11 <= 3) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f3, code lost:
        if (a == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f5, code lost:
        android.util.Log.v("FragmentManager", "moveto STARTED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
        r10.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0210, code lost:
        if (r11 <= 4) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.support.v4.app.Fragment r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            r8 = 4
            r6 = 3
            r3 = 0
            r5 = 1
            r7 = 0
            boolean r0 = r10.l
            if (r0 == 0) goto L_0x000d
            boolean r0 = r10.A
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r11 <= r5) goto L_0x0010
            r11 = r5
        L_0x0010:
            boolean r0 = r10.m
            if (r0 == 0) goto L_0x001a
            int r0 = r10.a
            if (r11 <= r0) goto L_0x001a
            int r11 = r10.a
        L_0x001a:
            boolean r0 = r10.K
            if (r0 == 0) goto L_0x0025
            int r0 = r10.a
            if (r0 >= r8) goto L_0x0025
            if (r11 <= r6) goto L_0x0025
            r11 = r6
        L_0x0025:
            int r0 = r10.a
            if (r0 >= r11) goto L_0x0240
            boolean r0 = r10.o
            if (r0 == 0) goto L_0x0032
            boolean r0 = r10.p
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            android.view.View r0 = r10.b
            if (r0 == 0) goto L_0x0040
            r10.b = r7
            int r2 = r10.c
            r0 = r9
            r1 = r10
            r4 = r3
            r0.a((android.support.v4.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0040:
            int r0 = r10.a
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0126;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01ef;
                case 4: goto L_0x0210;
                default: goto L_0x0045;
            }
        L_0x0045:
            r10.a = r11
            goto L_0x0031
        L_0x0048:
            boolean r0 = a
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0064:
            android.os.Bundle r0 = r10.d
            if (r0 == 0) goto L_0x009d
            android.os.Bundle r0 = r10.d
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r10.e = r0
            android.os.Bundle r0 = r10.d
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r9.a((android.os.Bundle) r0, (java.lang.String) r1)
            r10.i = r0
            android.support.v4.app.Fragment r0 = r10.i
            if (r0 == 0) goto L_0x008a
            android.os.Bundle r0 = r10.d
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r10.k = r0
        L_0x008a:
            android.os.Bundle r0 = r10.d
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r10.L = r0
            boolean r0 = r10.L
            if (r0 != 0) goto L_0x009d
            r10.K = r5
            if (r11 <= r6) goto L_0x009d
            r11 = r6
        L_0x009d:
            android.support.v4.app.FragmentActivity r0 = r9.o
            r10.t = r0
            android.support.v4.app.Fragment r0 = r9.q
            r10.v = r0
            android.support.v4.app.Fragment r0 = r9.q
            if (r0 == 0) goto L_0x00d9
            android.support.v4.app.Fragment r0 = r9.q
            android.support.v4.app.o r0 = r0.u
        L_0x00ad:
            r10.s = r0
            r10.F = r3
            android.support.v4.app.FragmentActivity r0 = r9.o
            r10.a((android.app.Activity) r0)
            boolean r0 = r10.F
            if (r0 != 0) goto L_0x00de
            android.support.v4.app.ac r0 = new android.support.v4.app.ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            android.support.v4.app.FragmentActivity r0 = r9.o
            android.support.v4.app.o r0 = r0.b
            goto L_0x00ad
        L_0x00de:
            android.support.v4.app.Fragment r0 = r10.v
            if (r0 != 0) goto L_0x00e7
            android.support.v4.app.FragmentActivity r0 = r9.o
            r0.a((android.support.v4.app.Fragment) r10)
        L_0x00e7:
            boolean r0 = r10.C
            if (r0 != 0) goto L_0x00f0
            android.os.Bundle r0 = r10.d
            r10.g(r0)
        L_0x00f0:
            r10.C = r3
            boolean r0 = r10.o
            if (r0 == 0) goto L_0x0126
            android.os.Bundle r0 = r10.d
            android.view.LayoutInflater r0 = r10.b((android.os.Bundle) r0)
            android.os.Bundle r1 = r10.d
            android.view.View r0 = r10.b(r0, r7, r1)
            r10.I = r0
            android.view.View r0 = r10.I
            if (r0 == 0) goto L_0x0239
            android.view.View r0 = r10.I
            r10.J = r0
            android.view.View r0 = r10.I
            android.view.ViewGroup r0 = android.support.v4.app.ab.a(r0)
            r10.I = r0
            boolean r0 = r10.z
            if (r0 == 0) goto L_0x011f
            android.view.View r0 = r10.I
            r1 = 8
            r0.setVisibility(r1)
        L_0x011f:
            android.view.View r0 = r10.I
            android.os.Bundle r1 = r10.d
            r10.a((android.view.View) r0, (android.os.Bundle) r1)
        L_0x0126:
            if (r11 <= r5) goto L_0x01ef
            boolean r0 = a
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0144:
            boolean r0 = r10.o
            if (r0 != 0) goto L_0x01df
            int r0 = r10.x
            if (r0 == 0) goto L_0x0397
            android.support.v4.app.l r0 = r9.p
            int r1 = r10.x
            android.view.View r0 = r0.a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x019b
            boolean r1 = r10.q
            if (r1 != 0) goto L_0x019b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r10.x
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.res.Resources r3 = r10.c()
            int r4 = r10.x
            java.lang.String r3 = r3.getResourceName(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ") for fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r9.a((java.lang.RuntimeException) r1)
        L_0x019b:
            r10.H = r0
            android.os.Bundle r1 = r10.d
            android.view.LayoutInflater r1 = r10.b((android.os.Bundle) r1)
            android.os.Bundle r2 = r10.d
            android.view.View r1 = r10.b(r1, r0, r2)
            r10.I = r1
            android.view.View r1 = r10.I
            if (r1 == 0) goto L_0x023d
            android.view.View r1 = r10.I
            r10.J = r1
            android.view.View r1 = r10.I
            android.view.ViewGroup r1 = android.support.v4.app.ab.a(r1)
            r10.I = r1
            if (r0 == 0) goto L_0x01cd
            android.view.animation.Animation r1 = r9.a((android.support.v4.app.Fragment) r10, (int) r12, (boolean) r5, (int) r13)
            if (r1 == 0) goto L_0x01c8
            android.view.View r2 = r10.I
            r2.startAnimation(r1)
        L_0x01c8:
            android.view.View r1 = r10.I
            r0.addView(r1)
        L_0x01cd:
            boolean r0 = r10.z
            if (r0 == 0) goto L_0x01d8
            android.view.View r0 = r10.I
            r1 = 8
            r0.setVisibility(r1)
        L_0x01d8:
            android.view.View r0 = r10.I
            android.os.Bundle r1 = r10.d
            r10.a((android.view.View) r0, (android.os.Bundle) r1)
        L_0x01df:
            android.os.Bundle r0 = r10.d
            r10.h(r0)
            android.view.View r0 = r10.I
            if (r0 == 0) goto L_0x01ed
            android.os.Bundle r0 = r10.d
            r10.a((android.os.Bundle) r0)
        L_0x01ed:
            r10.d = r7
        L_0x01ef:
            if (r11 <= r6) goto L_0x0210
            boolean r0 = a
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x020d:
            r10.o()
        L_0x0210:
            if (r11 <= r8) goto L_0x0045
            boolean r0 = a
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x022e:
            r10.n = r5
            r10.p()
            r10.d = r7
            r10.e = r7
            goto L_0x0045
        L_0x0239:
            r10.J = r7
            goto L_0x0126
        L_0x023d:
            r10.J = r7
            goto L_0x01df
        L_0x0240:
            int r0 = r10.a
            if (r0 <= r11) goto L_0x0045
            int r0 = r10.a
            switch(r0) {
                case 1: goto L_0x024b;
                case 2: goto L_0x02cb;
                case 3: goto L_0x02aa;
                case 4: goto L_0x0289;
                case 5: goto L_0x0265;
                default: goto L_0x0249;
            }
        L_0x0249:
            goto L_0x0045
        L_0x024b:
            if (r11 >= r5) goto L_0x0045
            boolean r0 = r9.t
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r10.b
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r10.b
            r10.b = r7
            r0.clearAnimation()
        L_0x025c:
            android.view.View r0 = r10.b
            if (r0 == 0) goto L_0x0338
            r10.c = r11
            r11 = r5
            goto L_0x0045
        L_0x0265:
            r0 = 5
            if (r11 >= r0) goto L_0x0289
            boolean r0 = a
            if (r0 == 0) goto L_0x0284
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0284:
            r10.r()
            r10.n = r3
        L_0x0289:
            if (r11 >= r8) goto L_0x02aa
            boolean r0 = a
            if (r0 == 0) goto L_0x02a7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02a7:
            r10.s()
        L_0x02aa:
            if (r11 >= r6) goto L_0x02cb
            boolean r0 = a
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STOPPED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02c8:
            r10.t()
        L_0x02cb:
            r0 = 2
            if (r11 >= r0) goto L_0x024b
            boolean r0 = a
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02ea:
            android.view.View r0 = r10.I
            if (r0 == 0) goto L_0x02fd
            android.support.v4.app.FragmentActivity r0 = r9.o
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x02fd
            android.util.SparseArray r0 = r10.e
            if (r0 != 0) goto L_0x02fd
            r9.e(r10)
        L_0x02fd:
            r10.u()
            android.view.View r0 = r10.I
            if (r0 == 0) goto L_0x0330
            android.view.ViewGroup r0 = r10.H
            if (r0 == 0) goto L_0x0330
            int r0 = r9.n
            if (r0 <= 0) goto L_0x0394
            boolean r0 = r9.t
            if (r0 != 0) goto L_0x0394
            android.view.animation.Animation r0 = r9.a((android.support.v4.app.Fragment) r10, (int) r12, (boolean) r3, (int) r13)
        L_0x0314:
            if (r0 == 0) goto L_0x0329
            android.view.View r1 = r10.I
            r10.b = r1
            r10.c = r11
            android.support.v4.app.q r1 = new android.support.v4.app.q
            r1.<init>(r9, r10)
            r0.setAnimationListener(r1)
            android.view.View r1 = r10.I
            r1.startAnimation(r0)
        L_0x0329:
            android.view.ViewGroup r0 = r10.H
            android.view.View r1 = r10.I
            r0.removeView(r1)
        L_0x0330:
            r10.H = r7
            r10.I = r7
            r10.J = r7
            goto L_0x024b
        L_0x0338:
            boolean r0 = a
            if (r0 == 0) goto L_0x0354
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0354:
            boolean r0 = r10.C
            if (r0 != 0) goto L_0x035b
            r10.v()
        L_0x035b:
            r10.F = r3
            r10.l()
            boolean r0 = r10.F
            if (r0 != 0) goto L_0x0383
            android.support.v4.app.ac r0 = new android.support.v4.app.ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0383:
            if (r14 != 0) goto L_0x0045
            boolean r0 = r10.C
            if (r0 != 0) goto L_0x038e
            r9.d(r10)
            goto L_0x0045
        L_0x038e:
            r10.t = r7
            r10.s = r7
            goto L_0x0045
        L_0x0394:
            r0 = r7
            goto L_0x0314
        L_0x0397:
            r0 = r7
            goto L_0x019b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public void a(Fragment fragment, boolean z2) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        c(fragment);
        if (fragment.A) {
            return;
        }
        if (this.g.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        this.g.add(fragment);
        fragment.l = true;
        fragment.m = false;
        if (fragment.D && fragment.E) {
            this.r = true;
        }
        if (z2) {
            b(fragment);
        }
    }

    public void a(FragmentActivity fragmentActivity, l lVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = fragmentActivity;
        this.p = lVar;
        this.q = fragment;
    }

    public void a(Runnable runnable, boolean z2) {
        if (!z2) {
            t();
        }
        synchronized (this) {
            if (this.t || this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.a.removeCallbacks(this.y);
                this.o.a.post(this.y);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f != null && (size6 = this.f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size6; i2++) {
                Fragment fragment = (Fragment) this.f.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.g != null && (size5 = this.g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size5; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.g.get(i3)).toString());
            }
        }
        if (this.j != null && (size4 = this.j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.j.get(i4)).toString());
            }
        }
        if (this.i != null && (size3 = this.i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                b bVar = (b) this.i.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println((b) this.k.get(i6));
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null && (size = this.c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println((Runnable) this.c.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(Handler handler, String str, int i2, int i3) {
        int i4;
        if (this.i == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = this.i.size() - 1;
            if (size < 0) {
                return false;
            }
            ((b) this.i.remove(size)).b(true);
            f();
        } else {
            int i5 = -1;
            if (str != null || i2 >= 0) {
                int size2 = this.i.size() - 1;
                while (i4 >= 0) {
                    b bVar = (b) this.i.get(i4);
                    if ((str != null && str.equals(bVar.b())) || (i2 >= 0 && i2 == bVar.o)) {
                        break;
                    }
                    size2 = i4 - 1;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    i4--;
                    while (i4 >= 0) {
                        b bVar2 = (b) this.i.get(i4);
                        if ((str == null || !str.equals(bVar2.b())) && (i2 < 0 || i2 != bVar2.o)) {
                            break;
                        }
                        i4--;
                    }
                }
                i5 = i4;
            }
            if (i5 == this.i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.i.size() - 1; size3 > i5; size3--) {
                arrayList.add(this.i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            int i6 = 0;
            while (i6 <= size4) {
                if (a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i6));
                }
                ((b) arrayList.get(i6)).b(i6 == size4);
                i6++;
            }
            f();
        }
        return true;
    }

    public boolean a(Menu menu) {
        if (this.g == null) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = (Fragment) this.g.get(i2);
            if (fragment != null && fragment.c(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        ArrayList arrayList = null;
        if (this.g != null) {
            int i2 = 0;
            z2 = false;
            while (i2 < this.g.size()) {
                Fragment fragment = (Fragment) this.g.get(i2);
                if (fragment != null && fragment.b(menu, menuInflater)) {
                    z2 = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i2++;
                z2 = z2;
            }
        } else {
            z2 = false;
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                Fragment fragment2 = (Fragment) this.j.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m();
                }
            }
        }
        this.j = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = (Fragment) this.g.get(i2);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(int i2) {
        synchronized (this) {
            this.k.set(i2, (Object) null);
            if (this.l == null) {
                this.l = new ArrayList();
            }
            if (a) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.l.add(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    public void b(Fragment fragment, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            if (fragment.I != null) {
                Animation a2 = a(fragment, i2, false, i3);
                if (a2 != null) {
                    fragment.I.startAnimation(a2);
                }
                fragment.I.setVisibility(8);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(bVar);
        f();
    }

    public void b(Menu menu) {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i3);
                    if (fragment != null) {
                        fragment.d(menu);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public boolean b() {
        return e();
    }

    public boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = (Fragment) this.g.get(i2);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        if (fragment.f < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(((Integer) this.h.remove(this.h.size() - 1)).intValue(), this.q);
                this.f.set(fragment.f, fragment);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public void c(Fragment fragment, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            if (fragment.I != null) {
                Animation a2 = a(fragment, i2, true, i3);
                if (a2 != null) {
                    fragment.I.startAnimation(a2);
                }
                fragment.I.setVisibility(0);
            }
            if (fragment.l && fragment.D && fragment.E) {
                this.r = true;
            }
            fragment.a(false);
        }
    }

    public boolean c() {
        t();
        b();
        return a(this.o.a, (String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f.size()) {
                    Fragment fragment = (Fragment) this.f.get(i3);
                    if (fragment != null) {
                        a(fragment);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (fragment.f >= 0) {
            if (a) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f.set(fragment.f, (Object) null);
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(Integer.valueOf(fragment.f));
            this.o.a(fragment.g);
            fragment.k();
        }
    }

    public void d(Fragment fragment, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                fragment.l = false;
                a(fragment, 1, i2, i3, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (fragment.J != null) {
            if (this.x == null) {
                this.x = new SparseArray();
            } else {
                this.x.clear();
            }
            fragment.J.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                fragment.e = this.x;
                this.x = null;
            }
        }
    }

    public void e(Fragment fragment, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (!fragment.l) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (this.g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.g.add(fragment);
                fragment.l = true;
                if (fragment.D && fragment.E) {
                    this.r = true;
                }
                a(fragment, this.n, i2, i3, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 >= r3) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.e
            if (r1 == 0) goto L_0x000e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        L_0x000e:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.FragmentActivity r3 = r6.o
            android.os.Handler r3 = r3.a
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L_0x0024
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            r1 = r2
        L_0x0025:
            monitor-enter(r6)
            java.util.ArrayList r3 = r6.c     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0032
            java.util.ArrayList r3 = r6.c     // Catch:{ all -> 0x0097 }
            int r3 = r3.size()     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x005a
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            boolean r0 = r6.v
            if (r0 == 0) goto L_0x00a5
            r3 = r2
            r4 = r2
        L_0x0039:
            java.util.ArrayList r0 = r6.f
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x009e
            java.util.ArrayList r0 = r6.f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L_0x0056
            android.support.v4.app.z r5 = r0.M
            if (r5 == 0) goto L_0x0056
            android.support.v4.app.z r0 = r0.M
            boolean r0 = r0.a()
            r4 = r4 | r0
        L_0x0056:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x0039
        L_0x005a:
            java.util.ArrayList r1 = r6.c     // Catch:{ all -> 0x0097 }
            int r3 = r1.size()     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r1 = r6.d     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0069
            java.lang.Runnable[] r1 = r6.d     // Catch:{ all -> 0x0097 }
            int r1 = r1.length     // Catch:{ all -> 0x0097 }
            if (r1 >= r3) goto L_0x006d
        L_0x0069:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch:{ all -> 0x0097 }
            r6.d = r1     // Catch:{ all -> 0x0097 }
        L_0x006d:
            java.util.ArrayList r1 = r6.c     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r4 = r6.d     // Catch:{ all -> 0x0097 }
            r1.toArray(r4)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r1 = r6.c     // Catch:{ all -> 0x0097 }
            r1.clear()     // Catch:{ all -> 0x0097 }
            android.support.v4.app.FragmentActivity r1 = r6.o     // Catch:{ all -> 0x0097 }
            android.os.Handler r1 = r1.a     // Catch:{ all -> 0x0097 }
            java.lang.Runnable r4 = r6.y     // Catch:{ all -> 0x0097 }
            r1.removeCallbacks(r4)     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            r6.e = r0
            r1 = r2
        L_0x0086:
            if (r1 >= r3) goto L_0x009a
            java.lang.Runnable[] r4 = r6.d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L_0x0086
        L_0x0097:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            throw r0
        L_0x009a:
            r6.e = r2
            r1 = r0
            goto L_0x0025
        L_0x009e:
            if (r4 != 0) goto L_0x00a5
            r6.v = r2
            r6.d()
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.e():boolean");
    }

    /* access modifiers changed from: package-private */
    public Bundle f(Fragment fragment) {
        Bundle bundle;
        if (this.w == null) {
            this.w = new Bundle();
        }
        fragment.i(this.w);
        if (!this.w.isEmpty()) {
            bundle = this.w;
            this.w = null;
        } else {
            bundle = null;
        }
        if (fragment.I != null) {
            e(fragment);
        }
        if (fragment.e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.e);
        }
        if (!fragment.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.L);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.m != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.m.size()) {
                    ((n) this.m.get(i3)).a();
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList g() {
        ArrayList arrayList = null;
        if (this.f != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= this.f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f.get(i3);
                if (fragment != null && fragment.B) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.C = true;
                    fragment.j = fragment.i != null ? fragment.i.f : -1;
                    if (a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i2 = i3 + 1;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Parcelable h() {
        int[] iArr;
        int size;
        int size2;
        boolean z2;
        BackStackState[] backStackStateArr = null;
        e();
        if (b) {
            this.s = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size3 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i2 = 0;
        boolean z3 = false;
        while (i2 < size3) {
            Fragment fragment = (Fragment) this.f.get(i2);
            if (fragment != null) {
                if (fragment.f < 0) {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i2] = fragmentState;
                if (fragment.a <= 0 || fragmentState.j != null) {
                    fragmentState.j = fragment.d;
                } else {
                    fragmentState.j = f(fragment);
                    if (fragment.i != null) {
                        if (fragment.i.f < 0) {
                            a((RuntimeException) new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                        }
                        if (fragmentState.j == null) {
                            fragmentState.j = new Bundle();
                        }
                        a(fragmentState.j, "android:target_state", fragment.i);
                        if (fragment.k != 0) {
                            fragmentState.j.putInt("android:target_req_state", fragment.k);
                        }
                    }
                }
                if (a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.j);
                }
                z2 = true;
            } else {
                z2 = z3;
            }
            i2++;
            z3 = z2;
        }
        if (z3) {
            if (this.g == null || (size2 = this.g.size()) <= 0) {
                iArr = null;
            } else {
                iArr = new int[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    iArr[i3] = ((Fragment) this.g.get(i3)).f;
                    if (iArr[i3] < 0) {
                        a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.g.get(i3) + " has cleared index: " + iArr[i3]));
                    }
                    if (a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.g.get(i3));
                    }
                }
            }
            if (this.i != null && (size = this.i.size()) > 0) {
                backStackStateArr = new BackStackState[size];
                for (int i4 = 0; i4 < size; i4++) {
                    backStackStateArr[i4] = new BackStackState(this, (b) this.i.get(i4));
                    if (a) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.i.get(i4));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = fragmentStateArr;
            fragmentManagerState.b = iArr;
            fragmentManagerState.c = backStackStateArr;
            return fragmentManagerState;
        } else if (!a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void i() {
        this.s = false;
    }

    public void j() {
        this.s = false;
        a(1, false);
    }

    public void k() {
        this.s = false;
        a(2, false);
    }

    public void l() {
        this.s = false;
        a(4, false);
    }

    public void m() {
        this.s = false;
        a(5, false);
    }

    public void n() {
        a(4, false);
    }

    public void o() {
        this.s = true;
        a(3, false);
    }

    public void p() {
        a(2, false);
    }

    public void q() {
        a(1, false);
    }

    public void r() {
        this.t = true;
        e();
        a(0, false);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void s() {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    Fragment fragment = (Fragment) this.g.get(i3);
                    if (fragment != null) {
                        fragment.q();
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            d.a(this.q, sb);
        } else {
            d.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }
}
