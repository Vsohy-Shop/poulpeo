package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class CustomTabActivity extends Activity {

    /* renamed from: c */
    public static final String f4078c;

    /* renamed from: d */
    public static final String f4079d;

    /* renamed from: b */
    private BroadcastReceiver f4080b;

    /* renamed from: com.facebook.CustomTabActivity$a */
    class C4490a extends BroadcastReceiver {
        C4490a() {
        }

        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Class<CustomTabActivity> cls = CustomTabActivity.class;
        sb.append(cls.getSimpleName());
        sb.append(".action_customTabRedirect");
        f4078c = sb.toString();
        f4079d = cls.getSimpleName() + ".action_destroy";
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f4078c);
            intent2.putExtra(CustomTabMainActivity.f4085g, getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            this.f4080b = new C4490a();
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f4080b, new IntentFilter(f4079d));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f4078c);
        intent.putExtra(CustomTabMainActivity.f4085g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f4080b);
        super.onDestroy();
    }
}
