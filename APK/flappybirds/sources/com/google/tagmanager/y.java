package com.google.tagmanager;

import com.google.analytics.b.a.a.c;
import com.google.analytics.b.a.a.e;
import com.google.analytics.b.a.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class y {
    private static final Object a = null;
    private static Long b = new Long(0);
    private static Double c = new Double(0.0d);
    private static x d = x.a(0);
    private static String e = new String("");
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static c i = a(e);

    public static c a() {
        return i;
    }

    public static c a(Object obj) {
        boolean z = false;
        e F = c.F();
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj instanceof String) {
            F.a(h.STRING).a((String) obj);
        } else if (obj instanceof List) {
            F.a(h.LIST);
            boolean z2 = false;
            for (Object a2 : (List) obj) {
                c a3 = a(a2);
                if (a3 == i) {
                    return i;
                }
                z2 = z2 || a3.E();
                F.b(a3);
            }
            z = z2;
        } else if (obj instanceof Map) {
            F.a(h.MAP);
            boolean z3 = false;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c a4 = a(entry.getKey());
                c a5 = a(entry.getValue());
                if (a4 == i || a5 == i) {
                    return i;
                }
                boolean z4 = z3 || a4.E() || a5.E();
                F.c(a4);
                F.d(a5);
                z3 = z4;
            }
            z = z3;
        } else if (b(obj)) {
            F.a(h.STRING).a(obj.toString());
        } else if (c(obj)) {
            F.a(h.INTEGER).a(d(obj));
        } else if (obj instanceof Boolean) {
            F.a(h.BOOLEAN).a(((Boolean) obj).booleanValue());
        } else {
            i.a("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
            return i;
        }
        if (z) {
            F.b(true);
        }
        return F.h();
    }

    private static boolean b(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof x) && ((x) obj).a());
    }

    private static boolean c(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof x) && ((x) obj).b());
    }

    private static long d(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        i.a("getInt64 received non-Number");
        return 0;
    }
}
