package org.andengine.input.sensor.b;

import android.hardware.SensorManager;
import com.google.android.gms.e;
import java.util.Arrays;
import org.andengine.input.sensor.a;

public class b extends a {
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private int g;

    private void a() {
        SensorManager.getRotationMatrix(this.f, (float[]) null, this.d, this.e);
        switch (this.c) {
            case e.MapAttrs_cameraBearing:
                SensorManager.remapCoordinateSystem(this.f, 2, 129, this.f);
                break;
        }
        float[] fArr = this.a;
        SensorManager.getOrientation(this.f, fArr);
        for (int length = fArr.length - 1; length >= 0; length--) {
            fArr[length] = fArr[length] * 57.295776f;
        }
    }

    @Deprecated
    public void a(int i) {
        super.a(i);
    }

    @Deprecated
    public void a(float[] fArr) {
        super.a(fArr);
    }

    public void b(int i) {
        super.a(i);
    }

    public void b(float[] fArr) {
        System.arraycopy(fArr, 0, this.d, 0, fArr.length);
        a();
    }

    public void c(int i) {
        this.g = i;
    }

    public void c(float[] fArr) {
        System.arraycopy(fArr, 0, this.e, 0, fArr.length);
        a();
    }

    public String toString() {
        return "Orientation: " + Arrays.toString(this.a);
    }
}
