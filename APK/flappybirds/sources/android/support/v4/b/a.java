package android.support.v4.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a extends l implements Map {
    f a;

    private f b() {
        if (this.a == null) {
            this.a = new b(this);
        }
        return this.a;
    }

    public Set entrySet() {
        return b().d();
    }

    public Set keySet() {
        return b().e();
    }

    public void putAll(Map map) {
        a(this.h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return b().f();
    }
}
