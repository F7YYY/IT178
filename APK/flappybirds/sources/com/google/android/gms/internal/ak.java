package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ak extends ae implements SafeParcelable {
    public static final i CREATOR = new i();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final ah d;
    private final String e;
    private int f;
    private int g;

    ak(int i, Parcel parcel, ah ahVar) {
        this.a = i;
        this.b = (Parcel) Cdo.a((Object) parcel);
        this.d = ahVar;
        if (this.d == null) {
            this.e = null;
        } else {
            this.e = this.d.d();
        }
        this.f = 2;
    }

    public static HashMap a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put(Integer.valueOf(((ae.a) entry.getValue()).g()), entry);
        }
        return hashMap2;
    }

    private void a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case e.MapAttrs_mapType:
            case e.MapAttrs_cameraBearing:
            case e.MapAttrs_cameraTargetLat:
            case e.MapAttrs_cameraTargetLng:
            case e.MapAttrs_cameraTilt:
            case e.MapAttrs_cameraZoom:
            case e.MapAttrs_uiCompass:
                sb.append(obj);
                return;
            case e.MapAttrs_uiRotateGestures:
                sb.append("\"").append(n.a(obj.toString())).append("\"");
                return;
            case e.MapAttrs_uiScrollGestures:
                sb.append("\"").append(l.a((byte[]) obj)).append("\"");
                return;
            case e.MapAttrs_uiTiltGestures:
                sb.append("\"").append(l.b((byte[]) obj));
                sb.append("\"");
                return;
            case e.MapAttrs_uiZoomControls:
                o.a(sb, (HashMap) obj);
                return;
            case e.MapAttrs_uiZoomGestures:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void a(StringBuilder sb, ae.a aVar, Parcel parcel, int i) {
        switch (aVar.d()) {
            case e.MapAttrs_mapType:
                a(sb, aVar, a(aVar, Integer.valueOf(a.f(parcel, i))));
                return;
            case e.MapAttrs_cameraBearing:
                a(sb, aVar, a(aVar, a.h(parcel, i)));
                return;
            case e.MapAttrs_cameraTargetLat:
                a(sb, aVar, a(aVar, Long.valueOf(a.g(parcel, i))));
                return;
            case e.MapAttrs_cameraTargetLng:
                a(sb, aVar, a(aVar, Float.valueOf(a.i(parcel, i))));
                return;
            case e.MapAttrs_cameraTilt:
                a(sb, aVar, a(aVar, Double.valueOf(a.j(parcel, i))));
                return;
            case e.MapAttrs_cameraZoom:
                a(sb, aVar, a(aVar, a.k(parcel, i)));
                return;
            case e.MapAttrs_uiCompass:
                a(sb, aVar, a(aVar, Boolean.valueOf(a.c(parcel, i))));
                return;
            case e.MapAttrs_uiRotateGestures:
                a(sb, aVar, a(aVar, a.l(parcel, i)));
                return;
            case e.MapAttrs_uiScrollGestures:
            case e.MapAttrs_uiTiltGestures:
                a(sb, aVar, a(aVar, a.o(parcel, i)));
                return;
            case e.MapAttrs_uiZoomControls:
                a(sb, aVar, a(aVar, a(a.n(parcel, i))));
                return;
            case e.MapAttrs_uiZoomGestures:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.d());
        }
    }

    private void a(StringBuilder sb, ae.a aVar, Object obj) {
        if (aVar.c()) {
            a(sb, aVar, (ArrayList) obj);
        } else {
            a(sb, aVar.b(), obj);
        }
    }

    private void a(StringBuilder sb, ae.a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            a(sb, aVar.b(), arrayList.get(i));
        }
        sb.append("]");
    }

    private void a(StringBuilder sb, String str, ae.a aVar, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (aVar.j()) {
            a(sb, aVar, parcel, i);
        } else {
            b(sb, aVar, parcel, i);
        }
    }

    private void a(StringBuilder sb, HashMap hashMap, Parcel parcel) {
        HashMap a2 = a(hashMap);
        sb.append('{');
        int b2 = a.b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a3 = a.a(parcel);
            Map.Entry entry = (Map.Entry) a2.get(Integer.valueOf(a.a(a3)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                a(sb, (String) entry.getKey(), (ae.a) entry.getValue(), parcel, a3);
                z = true;
            }
        }
        if (parcel.dataPosition() != b2) {
            throw new b("Overread allowed size end=" + b2, parcel);
        }
        sb.append('}');
    }

    private void b(StringBuilder sb, ae.a aVar, Parcel parcel, int i) {
        if (aVar.e()) {
            sb.append("[");
            switch (aVar.d()) {
                case e.MapAttrs_mapType:
                    k.a(sb, a.q(parcel, i));
                    break;
                case e.MapAttrs_cameraBearing:
                    k.a(sb, (Object[]) a.s(parcel, i));
                    break;
                case e.MapAttrs_cameraTargetLat:
                    k.a(sb, a.r(parcel, i));
                    break;
                case e.MapAttrs_cameraTargetLng:
                    k.a(sb, a.t(parcel, i));
                    break;
                case e.MapAttrs_cameraTilt:
                    k.a(sb, a.u(parcel, i));
                    break;
                case e.MapAttrs_cameraZoom:
                    k.a(sb, (Object[]) a.v(parcel, i));
                    break;
                case e.MapAttrs_uiCompass:
                    k.a(sb, a.p(parcel, i));
                    break;
                case e.MapAttrs_uiRotateGestures:
                    k.a(sb, a.w(parcel, i));
                    break;
                case e.MapAttrs_uiScrollGestures:
                case e.MapAttrs_uiTiltGestures:
                case e.MapAttrs_uiZoomControls:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case e.MapAttrs_uiZoomGestures:
                    Parcel[] z = a.z(parcel, i);
                    int length = z.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        z[i2].setDataPosition(0);
                        a(sb, aVar.l(), z[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (aVar.d()) {
            case e.MapAttrs_mapType:
                sb.append(a.f(parcel, i));
                return;
            case e.MapAttrs_cameraBearing:
                sb.append(a.h(parcel, i));
                return;
            case e.MapAttrs_cameraTargetLat:
                sb.append(a.g(parcel, i));
                return;
            case e.MapAttrs_cameraTargetLng:
                sb.append(a.i(parcel, i));
                return;
            case e.MapAttrs_cameraTilt:
                sb.append(a.j(parcel, i));
                return;
            case e.MapAttrs_cameraZoom:
                sb.append(a.k(parcel, i));
                return;
            case e.MapAttrs_uiCompass:
                sb.append(a.c(parcel, i));
                return;
            case e.MapAttrs_uiRotateGestures:
                sb.append("\"").append(n.a(a.l(parcel, i))).append("\"");
                return;
            case e.MapAttrs_uiScrollGestures:
                sb.append("\"").append(l.a(a.o(parcel, i))).append("\"");
                return;
            case e.MapAttrs_uiTiltGestures:
                sb.append("\"").append(l.b(a.o(parcel, i)));
                sb.append("\"");
                return;
            case e.MapAttrs_uiZoomControls:
                Bundle n = a.n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                sb.append("{");
                boolean z2 = true;
                for (String str : keySet) {
                    if (!z2) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(n.a(n.getString(str))).append("\"");
                    z2 = false;
                }
                sb.append("}");
                return;
            case e.MapAttrs_uiZoomGestures:
                Parcel y = a.y(parcel, i);
                y.setDataPosition(0);
                a(sb, aVar.l(), y);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    public int a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public Object a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public HashMap b() {
        if (this.d == null) {
            return null;
        }
        return this.d.a(this.e);
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        i iVar = CREATOR;
        return 0;
    }

    public Parcel e() {
        switch (this.f) {
            case e.MapAttrs_mapType:
                this.g = c.a(this.b);
                c.a(this.b, this.g);
                this.f = 2;
                break;
            case e.MapAttrs_cameraBearing:
                c.a(this.b, this.g);
                this.f = 2;
                break;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public ah f() {
        switch (this.c) {
            case e.MapAttrs_mapType:
                return null;
            case e.MapAttrs_cameraBearing:
                return this.d;
            case e.MapAttrs_cameraTargetLat:
                return this.d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.c);
        }
    }

    public String toString() {
        Cdo.a((Object) this.d, (Object) "Cannot convert to JSON on client side.");
        Parcel e2 = e();
        e2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        a(sb, this.d.a(this.e), e2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i iVar = CREATOR;
        i.a(this, parcel, i);
    }
}
