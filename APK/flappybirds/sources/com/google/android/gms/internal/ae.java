package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class ae {

    public class a implements SafeParcelable {
        public static final e CREATOR = new e();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private ah j;
        /* access modifiers changed from: private */
        public d k;

        a(int i2, int i3, boolean z, int i4, boolean z2, String str, int i5, String str2, z zVar) {
            this.i = i2;
            this.a = i3;
            this.b = z;
            this.c = i4;
            this.d = z2;
            this.e = str;
            this.f = i5;
            if (str2 == null) {
                this.g = null;
                this.h = null;
            } else {
                this.g = ak.class;
                this.h = str2;
            }
            if (zVar == null) {
                this.k = null;
            } else {
                this.k = zVar.c();
            }
        }

        protected a(int i2, boolean z, int i3, boolean z2, String str, int i4, Class cls, d dVar) {
            this.i = 1;
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = z2;
            this.e = str;
            this.f = i4;
            this.g = cls;
            if (cls == null) {
                this.h = null;
            } else {
                this.h = cls.getCanonicalName();
            }
            this.k = dVar;
        }

        public static a a(String str, int i2) {
            return new a(0, false, 0, false, str, i2, (Class) null, (d) null);
        }

        public static a a(String str, int i2, d dVar, boolean z) {
            return new a(dVar.c(), z, dVar.d(), false, str, i2, (Class) null, dVar);
        }

        public static a a(String str, int i2, Class cls) {
            return new a(11, false, 11, false, str, i2, cls, (d) null);
        }

        public static a b(String str, int i2) {
            return new a(4, false, 4, false, str, i2, (Class) null, (d) null);
        }

        public static a b(String str, int i2, Class cls) {
            return new a(11, true, 11, true, str, i2, cls, (d) null);
        }

        public static a c(String str, int i2) {
            return new a(6, false, 6, false, str, i2, (Class) null, (d) null);
        }

        public static a d(String str, int i2) {
            return new a(7, false, 7, false, str, i2, (Class) null, (d) null);
        }

        public static a e(String str, int i2) {
            return new a(7, true, 7, true, str, i2, (Class) null, (d) null);
        }

        public int a() {
            return this.i;
        }

        public Object a(Object obj) {
            return this.k.a(obj);
        }

        public void a(ah ahVar) {
            this.j = ahVar;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public int d() {
            return this.c;
        }

        public int describeContents() {
            e eVar = CREATOR;
            return 0;
        }

        public boolean e() {
            return this.d;
        }

        public String f() {
            return this.e;
        }

        public int g() {
            return this.f;
        }

        public Class h() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public String i() {
            if (this.h == null) {
                return null;
            }
            return this.h;
        }

        public boolean j() {
            return this.k != null;
        }

        /* access modifiers changed from: package-private */
        public z k() {
            if (this.k == null) {
                return null;
            }
            return z.a(this.k);
        }

        public HashMap l() {
            Cdo.a((Object) this.h);
            Cdo.a((Object) this.j);
            return this.j.a(this.h);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=").append(this.i).append(10);
            sb.append("                 typeIn=").append(this.a).append(10);
            sb.append("            typeInArray=").append(this.b).append(10);
            sb.append("                typeOut=").append(this.c).append(10);
            sb.append("           typeOutArray=").append(this.d).append(10);
            sb.append("        outputFieldName=").append(this.e).append(10);
            sb.append("      safeParcelFieldId=").append(this.f).append(10);
            sb.append("       concreteTypeName=").append(i()).append(10);
            if (h() != null) {
                sb.append("     concreteType.class=").append(h().getCanonicalName()).append(10);
            }
            sb.append("          converterName=").append(this.k == null ? "null" : this.k.getClass().getCanonicalName()).append(10);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            e eVar = CREATOR;
            e.a(this, parcel, i2);
        }
    }

    private void a(StringBuilder sb, a aVar, Object obj) {
        if (aVar.b() == 11) {
            sb.append(((ae) aVar.h().cast(obj)).toString());
        } else if (aVar.b() == 7) {
            sb.append("\"");
            sb.append(n.a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    private void a(StringBuilder sb, a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    /* access modifiers changed from: protected */
    public Object a(a aVar, Object obj) {
        return aVar.k != null ? aVar.a(obj) : obj;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(String str);

    /* access modifiers changed from: protected */
    public boolean a(a aVar) {
        return aVar.d() == 11 ? aVar.e() ? d(aVar.f()) : c(aVar.f()) : b(aVar.f());
    }

    /* access modifiers changed from: protected */
    public Object b(a aVar) {
        boolean z = true;
        String f = aVar.f();
        if (aVar.h() == null) {
            return a(aVar.f());
        }
        if (a(aVar.f()) != null) {
            z = false;
        }
        Cdo.a(z, (Object) "Concrete field shouldn't be value object: " + aVar.f());
        HashMap d = aVar.e() ? d() : c();
        if (d != null) {
            return d.get(f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract HashMap b();

    /* access modifiers changed from: protected */
    public abstract boolean b(String str);

    public HashMap c() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap b = b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : b.keySet()) {
            a aVar = (a) b.get(str);
            if (a(aVar)) {
                Object a2 = a(aVar, b(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"").append(str).append("\":");
                if (a2 != null) {
                    switch (aVar.d()) {
                        case e.MapAttrs_uiScrollGestures:
                            sb.append("\"").append(l.a((byte[]) a2)).append("\"");
                            break;
                        case e.MapAttrs_uiTiltGestures:
                            sb.append("\"").append(l.b((byte[]) a2)).append("\"");
                            break;
                        case e.MapAttrs_uiZoomControls:
                            o.a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!aVar.c()) {
                                a(sb, aVar, a2);
                                break;
                            } else {
                                a(sb, aVar, (ArrayList) a2);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
