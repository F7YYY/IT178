package com.google.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.analytics.tracking.android.CampaignTrackingService;

public final class InstallReferrerService extends IntentService {
    CampaignTrackingService a;
    Context b;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    private void a(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new CampaignTrackingService();
        }
        this.a.a(context, intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.b != null ? this.b : getApplicationContext();
        h.a(applicationContext, stringExtra);
        a(applicationContext, intent);
    }
}
