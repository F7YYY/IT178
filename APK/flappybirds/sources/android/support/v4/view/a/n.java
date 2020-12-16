package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class n implements t {
    final /* synthetic */ k a;
    final /* synthetic */ m b;

    n(m mVar, k kVar) {
        this.b = mVar;
        this.a = kVar;
    }

    public Object a(int i) {
        a a2 = this.a.a(i);
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    public List a(String str, int i) {
        List a2 = this.a.a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((a) a2.get(i2)).a());
        }
        return arrayList;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
