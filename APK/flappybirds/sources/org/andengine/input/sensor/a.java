package org.andengine.input.sensor;

import java.util.Arrays;

public class a {
    protected final float[] a;
    protected int b;
    protected int c;

    public void a(int i) {
        this.b = i;
    }

    public void a(float[] fArr) {
        System.arraycopy(fArr, 0, this.a, 0, fArr.length);
    }

    public String toString() {
        return "Values: " + Arrays.toString(this.a);
    }
}
