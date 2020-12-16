package org.andengine.input.a.a;

import android.view.MotionEvent;
import com.google.android.gms.e;

public class f extends a {
    private void a(int i, MotionEvent motionEvent) {
        int c = c(motionEvent);
        int pointerId = motionEvent.getPointerId(c);
        a(motionEvent.getX(c), motionEvent.getY(c), i, pointerId, motionEvent);
    }

    private void b(MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount() - 1; pointerCount >= 0; pointerCount--) {
            a(motionEvent.getX(pointerCount), motionEvent.getY(pointerCount), 2, motionEvent.getPointerId(pointerCount), motionEvent);
        }
    }

    private static int c(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case e.MapAttrs_mapType:
            case e.MapAttrs_cameraZoom:
                a(0, motionEvent);
                return;
            case e.MapAttrs_cameraBearing:
            case e.MapAttrs_uiCompass:
                a(1, motionEvent);
                return;
            case e.MapAttrs_cameraTargetLat:
                b(motionEvent);
                return;
            case e.MapAttrs_cameraTargetLng:
            case e.MapAttrs_cameraTilt:
                a(action, motionEvent);
                return;
            default:
                throw new IllegalArgumentException("Invalid Action detected: " + action);
        }
    }
}
