package com.google.tagmanager.a;

import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class q {
    private static final q d = new q(true);
    private final ax a = ax.a(16);
    private boolean b;
    private boolean c = false;

    private q() {
    }

    private q(boolean z) {
        c();
    }

    static int a(bm bmVar, boolean z) {
        if (z) {
            return 2;
        }
        return bmVar.b();
    }

    public static q a() {
        return new q();
    }

    public static Object a(k kVar, bm bmVar, boolean z) {
        switch (r.b[bmVar.ordinal()]) {
            case e.MapAttrs_cameraBearing:
                return Double.valueOf(kVar.b());
            case e.MapAttrs_cameraTargetLat:
                return Float.valueOf(kVar.c());
            case e.MapAttrs_cameraTargetLng:
                return Long.valueOf(kVar.e());
            case e.MapAttrs_cameraTilt:
                return Long.valueOf(kVar.d());
            case e.MapAttrs_cameraZoom:
                return Integer.valueOf(kVar.f());
            case e.MapAttrs_uiCompass:
                return Long.valueOf(kVar.g());
            case e.MapAttrs_uiRotateGestures:
                return Integer.valueOf(kVar.h());
            case e.MapAttrs_uiScrollGestures:
                return Boolean.valueOf(kVar.i());
            case e.MapAttrs_uiTiltGestures:
                return z ? kVar.k() : kVar.j();
            case e.MapAttrs_uiZoomControls:
                return kVar.l();
            case e.MapAttrs_uiZoomGestures:
                return Integer.valueOf(kVar.m());
            case e.MapAttrs_useViewLifecycle:
                return Integer.valueOf(kVar.o());
            case e.MapAttrs_zOrderOnTop:
                return Long.valueOf(kVar.p());
            case 14:
                return Integer.valueOf(kVar.q());
            case 15:
                return Long.valueOf(kVar.r());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void a(bm bmVar, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (r.a[bmVar.a().ordinal()]) {
            case e.MapAttrs_cameraBearing:
                z = obj instanceof Integer;
                break;
            case e.MapAttrs_cameraTargetLat:
                z = obj instanceof Long;
                break;
            case e.MapAttrs_cameraTargetLng:
                z = obj instanceof Float;
                break;
            case e.MapAttrs_cameraTilt:
                z = obj instanceof Double;
                break;
            case e.MapAttrs_cameraZoom:
                z = obj instanceof Boolean;
                break;
            case e.MapAttrs_uiCompass:
                z = obj instanceof String;
                break;
            case e.MapAttrs_uiRotateGestures:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case e.MapAttrs_uiScrollGestures:
                if ((obj instanceof Integer) || (obj instanceof ad)) {
                    z = true;
                    break;
                }
            case e.MapAttrs_uiTiltGestures:
                if ((obj instanceof am) || (obj instanceof ag)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private boolean a(Map.Entry entry) {
        s sVar = (s) entry.getKey();
        if (sVar.b() == br.MESSAGE) {
            if (sVar.c()) {
                for (am j : (List) entry.getValue()) {
                    if (!j.j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof am) {
                    if (!((am) value).j()) {
                        return false;
                    }
                } else if (value instanceof ag) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static q b() {
        return d;
    }

    private void b(Map.Entry entry) {
        s sVar = (s) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ag) {
            value = ((ag) value).a();
        }
        if (sVar.c()) {
            Object a2 = a(sVar);
            if (a2 == null) {
                this.a.put((Comparable) sVar, (Object) new ArrayList((List) value));
            } else {
                ((List) a2).addAll((List) value);
            }
        } else if (sVar.b() == br.MESSAGE) {
            Object a3 = a(sVar);
            if (a3 == null) {
                this.a.put((Comparable) sVar, value);
            } else {
                this.a.put((Comparable) sVar, a3 instanceof ap ? sVar.a((ap) a3, (ap) value) : sVar.a(((am) a3).n(), (am) value).h());
            }
        } else {
            this.a.put((Comparable) sVar, value);
        }
    }

    public Object a(s sVar) {
        Object obj = this.a.get(sVar);
        return obj instanceof ag ? ((ag) obj).a() : obj;
    }

    public void a(q qVar) {
        for (int i = 0; i < qVar.a.c(); i++) {
            b(qVar.a.b(i));
        }
        for (Map.Entry b2 : qVar.a.d()) {
            b(b2);
        }
    }

    public void a(s sVar, Object obj) {
        if (!sVar.c()) {
            a(sVar.a(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object a2 : arrayList) {
                a(sVar.a(), a2);
            }
            obj = arrayList;
        }
        if (obj instanceof ag) {
            this.c = true;
        }
        this.a.put((Comparable) sVar, obj);
    }

    public void b(s sVar, Object obj) {
        List list;
        if (!sVar.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(sVar.a(), obj);
        Object a2 = a(sVar);
        if (a2 == null) {
            list = new ArrayList();
            this.a.put((Comparable) sVar, (Object) list);
        } else {
            list = (List) a2;
        }
        list.add(obj);
    }

    public void c() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    /* renamed from: d */
    public q clone() {
        q a2 = a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.c()) {
                break;
            }
            Map.Entry b2 = this.a.b(i2);
            a2.a((s) b2.getKey(), b2.getValue());
            i = i2 + 1;
        }
        for (Map.Entry entry : this.a.d()) {
            a2.a((s) entry.getKey(), entry.getValue());
        }
        a2.c = this.c;
        return a2;
    }

    public boolean e() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!a(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry a2 : this.a.d()) {
            if (!a(a2)) {
                return false;
            }
        }
        return true;
    }
}
