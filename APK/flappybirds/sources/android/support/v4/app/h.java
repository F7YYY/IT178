package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.e;

class h extends Handler {
    final /* synthetic */ FragmentActivity a;

    h(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case e.MapAttrs_cameraBearing /*1*/:
                if (this.a.f) {
                    this.a.a(false);
                    return;
                }
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                this.a.a();
                this.a.b.e();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
