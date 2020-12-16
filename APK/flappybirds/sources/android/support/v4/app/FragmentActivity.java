package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.b.l;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity {
    final Handler a = new h(this);
    final o b = new o();
    final l c = new i(this);
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    l l;
    z m;

    private static String a(View view) {
        String str;
        char c2 = 'F';
        char c3 = '.';
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case e.MapAttrs_mapType /*0*/:
                sb.append('V');
                break;
            case e.MapAttrs_cameraTilt /*4*/:
                sb.append('I');
                break;
            case e.MapAttrs_uiScrollGestures /*8*/:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        if (!view.isFocused()) {
            c2 = '.';
        }
        sb.append(c2);
        sb.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c3 = 'P';
        }
        sb.append(c3);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (Resources.NotFoundException e2) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if ((view instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i2 = 0; i2 < childCount; i2++) {
                a(str2, printWriter, (viewGroup = (ViewGroup) view).getChildAt(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public z a(String str, boolean z, boolean z2) {
        if (this.l == null) {
            this.l = new l();
        }
        z zVar = (z) this.l.get(str);
        if (zVar != null) {
            zVar.a(this);
            return zVar;
        } else if (!z2) {
            return zVar;
        } else {
            z zVar2 = new z(str, this, z);
            this.l.put(str, zVar2);
            return zVar2;
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.b.m();
    }

    public void a(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        z zVar;
        if (this.l != null && (zVar = (z) this.l.get(str)) != null && !zVar.g) {
            zVar.h();
            this.l.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (!this.g) {
            this.g = true;
            this.h = z;
            this.a.removeMessages(1);
            d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public Object b() {
        return null;
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 11) {
            a.a(this);
        } else {
            this.i = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.k) {
            this.k = false;
            if (this.m != null) {
                if (!this.h) {
                    this.m.c();
                } else {
                    this.m.d();
                }
            }
        }
        this.b.p();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.b.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.b.i();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            if (this.b.f == null || i5 < 0 || i5 >= this.b.f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i2));
                return;
            }
            Fragment fragment = (Fragment) this.b.f.get(i5);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i2));
            } else {
                fragment.a(65535 & i2, i3, intent);
            }
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        if (!this.b.c()) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.b.a(this, this.c, (Fragment) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        k kVar = (k) getLastNonConfigurationInstance();
        if (kVar != null) {
            this.l = kVar.e;
        }
        if (bundle != null) {
            this.b.a(bundle.getParcelable("android:support:fragments"), kVar != null ? kVar.d : null);
        }
        this.b.j();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu) | this.b.a(menu, getMenuInflater());
        if (Build.VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: android.support.v4.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r9 = this;
            r3 = 0
            r1 = 0
            r8 = 1
            r6 = -1
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0011
            android.view.View r0 = super.onCreateView(r10, r11, r12)
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.String r0 = "class"
            java.lang.String r0 = r12.getAttributeValue(r1, r0)
            int[] r2 = android.support.v4.app.j.a
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r2)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r4.getString(r3)
        L_0x0023:
            int r2 = r4.getResourceId(r8, r6)
            r5 = 2
            java.lang.String r5 = r4.getString(r5)
            r4.recycle()
            boolean r4 = android.support.v4.app.Fragment.b((android.content.Context) r9, (java.lang.String) r0)
            if (r4 != 0) goto L_0x003a
            android.view.View r0 = super.onCreateView(r10, r11, r12)
            goto L_0x0010
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            int r3 = r1.getId()
        L_0x0040:
            if (r3 != r6) goto L_0x0067
            if (r2 != r6) goto L_0x0067
            if (r5 != 0) goto L_0x0067
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0067:
            if (r2 == r6) goto L_0x006f
            android.support.v4.app.o r1 = r9.b
            android.support.v4.app.Fragment r1 = r1.a((int) r2)
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x0079
            android.support.v4.app.o r1 = r9.b
            android.support.v4.app.Fragment r1 = r1.a((java.lang.String) r5)
        L_0x0079:
            if (r1 != 0) goto L_0x0083
            if (r3 == r6) goto L_0x0083
            android.support.v4.app.o r1 = r9.b
            android.support.v4.app.Fragment r1 = r1.a((int) r3)
        L_0x0083:
            boolean r4 = android.support.v4.app.o.a
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = "FragmentActivity"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onCreateView: id=0x"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " fname="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " existing="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r4, r6)
        L_0x00b7:
            if (r1 != 0) goto L_0x00fe
            android.support.v4.app.Fragment r4 = android.support.v4.app.Fragment.a((android.content.Context) r9, (java.lang.String) r0)
            r4.o = r8
            if (r2 == 0) goto L_0x00fc
            r1 = r2
        L_0x00c2:
            r4.w = r1
            r4.x = r3
            r4.y = r5
            r4.p = r8
            android.support.v4.app.o r1 = r9.b
            r4.s = r1
            android.os.Bundle r1 = r4.d
            r4.a((android.app.Activity) r9, (android.util.AttributeSet) r12, (android.os.Bundle) r1)
            android.support.v4.app.o r1 = r9.b
            r1.a((android.support.v4.app.Fragment) r4, (boolean) r8)
            r1 = r4
        L_0x00d9:
            android.view.View r3 = r1.I
            if (r3 != 0) goto L_0x015a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " did not create a view."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00fc:
            r1 = r3
            goto L_0x00c2
        L_0x00fe:
            boolean r4 = r1.p
            if (r4 == 0) goto L_0x0149
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r12.getPositionDescription()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ": Duplicate id 0x"
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ", tag "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = ", or parent id 0x"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " with another fragment for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0149:
            r1.p = r8
            boolean r3 = r1.C
            if (r3 != 0) goto L_0x0154
            android.os.Bundle r3 = r1.d
            r1.a((android.app.Activity) r9, (android.util.AttributeSet) r12, (android.os.Bundle) r3)
        L_0x0154:
            android.support.v4.app.o r3 = r9.b
            r3.b((android.support.v4.app.Fragment) r1)
            goto L_0x00d9
        L_0x015a:
            if (r2 == 0) goto L_0x0161
            android.view.View r0 = r1.I
            r0.setId(r2)
        L_0x0161:
            android.view.View r0 = r1.I
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x016e
            android.view.View r0 = r1.I
            r0.setTag(r5)
        L_0x016e:
            android.view.View r0 = r1.I
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.b.r();
        if (this.m != null) {
            this.m.h();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i2 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.s();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        switch (i2) {
            case e.MapAttrs_mapType /*0*/:
                return this.b.a(menuItem);
            case e.MapAttrs_uiCompass /*6*/:
                return this.b.b(menuItem);
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.i();
    }

    public void onPanelClosed(int i2, Menu menu) {
        switch (i2) {
            case e.MapAttrs_mapType /*0*/:
                this.b.b(menu);
                break;
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.e = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            a();
        }
        this.b.n();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        a();
        this.b.e();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        if (this.i) {
            this.i = false;
            menu.clear();
            onCreatePanelMenu(i2, menu);
        }
        return a(view, menu) | this.b.a(menu);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.e();
    }

    public final Object onRetainNonConfigurationInstance() {
        boolean z;
        if (this.f) {
            a(true);
        }
        Object b2 = b();
        ArrayList g2 = this.b.g();
        if (this.l != null) {
            int size = this.l.size();
            z[] zVarArr = new z[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                zVarArr[i2] = (z) this.l.c(i2);
            }
            z = false;
            for (int i3 = 0; i3 < size; i3++) {
                z zVar = zVarArr[i3];
                if (zVar.g) {
                    z = true;
                } else {
                    zVar.h();
                    this.l.remove(zVar.d);
                }
            }
        } else {
            z = false;
        }
        if (g2 == null && !z && b2 == null) {
            return null;
        }
        k kVar = new k();
        kVar.a = null;
        kVar.b = b2;
        kVar.c = null;
        kVar.d = g2;
        kVar.e = this.l;
        return kVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable h2 = this.b.h();
        if (h2 != null) {
            bundle.putParcelable("android:support:fragments", h2);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f = false;
        this.g = false;
        this.a.removeMessages(1);
        if (!this.d) {
            this.d = true;
            this.b.k();
        }
        this.b.i();
        this.b.e();
        if (!this.k) {
            this.k = true;
            if (this.m != null) {
                this.m.b();
            } else if (!this.j) {
                this.m = a("(root)", this.k, false);
                if (this.m != null && !this.m.f) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.l();
        if (this.l != null) {
            int size = this.l.size();
            z[] zVarArr = new z[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                zVarArr[i2] = (z) this.l.c(i2);
            }
            for (int i3 = 0; i3 < size; i3++) {
                z zVar = zVarArr[i3];
                zVar.e();
                zVar.g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.o();
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (i2 == -1 || (-65536 & i2) == 0) {
            super.startActivityForResult(intent, i2);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
}
