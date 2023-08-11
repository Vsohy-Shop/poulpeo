package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import p021a3.C2190s;
import p198q2.C9138d0;
import p198q2.C9143e;
import p198q2.C9187r;
import p198q2.C9196w;

public class CustomTabMainActivity extends Activity {

    /* renamed from: d */
    public static final String f4082d;

    /* renamed from: e */
    public static final String f4083e;

    /* renamed from: f */
    public static final String f4084f;

    /* renamed from: g */
    public static final String f4085g;

    /* renamed from: h */
    public static final String f4086h;

    /* renamed from: i */
    public static final String f4087i;

    /* renamed from: j */
    public static final String f4088j;

    /* renamed from: b */
    private boolean f4089b = true;

    /* renamed from: c */
    private BroadcastReceiver f4090c;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    class C4491a extends BroadcastReceiver {
        C4491a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f4087i);
            String str = CustomTabMainActivity.f4085g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    /* renamed from: com.facebook.CustomTabMainActivity$b */
    static /* synthetic */ class C4492b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4092a;

        static {
            int[] iArr = new int[C2190s.values().length];
            f4092a = iArr;
            try {
                iArr[C2190s.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        sb.append(cls.getSimpleName());
        sb.append(".extra_action");
        f4082d = sb.toString();
        f4083e = cls.getSimpleName() + ".extra_params";
        f4084f = cls.getSimpleName() + ".extra_chromePackage";
        f4085g = cls.getSimpleName() + ".extra_url";
        f4086h = cls.getSimpleName() + ".extra_targetApp";
        f4087i = cls.getSimpleName() + ".action_refresh";
        f4088j = cls.getSimpleName() + ".no_activity_exception";
    }

    /* renamed from: a */
    private static Bundle m5494a(String str) {
        Uri parse = Uri.parse(str);
        Bundle f0 = C9138d0.m18636f0(parse.getQuery());
        f0.putAll(C9138d0.m18636f0(parse.getFragment()));
        return f0;
    }

    /* renamed from: b */
    private void m5495b(int i, Intent intent) {
        Bundle bundle;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f4090c);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f4085g);
            if (stringExtra != null) {
                bundle = m5494a(stringExtra);
            } else {
                bundle = new Bundle();
            }
            Intent o = C9196w.m18858o(getIntent(), bundle, (FacebookException) null);
            if (o != null) {
                intent = o;
            }
            setResult(i, intent);
        } else {
            setResult(i, C9196w.m18858o(getIntent(), (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C9143e eVar;
        super.onCreate(bundle);
        String str = CustomTabActivity.f4078c;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f4082d);
            Bundle bundleExtra = getIntent().getBundleExtra(f4083e);
            String stringExtra2 = getIntent().getStringExtra(f4084f);
            if (C4492b.f4092a[C2190s.m1727a(getIntent().getStringExtra(f4086h)).ordinal()] != 1) {
                eVar = new C9143e(stringExtra, bundleExtra);
            } else {
                eVar = new C9187r(stringExtra, bundleExtra);
            }
            boolean b = eVar.mo43400b(this, stringExtra2);
            this.f4089b = false;
            if (!b) {
                setResult(0, getIntent().putExtra(f4088j, true));
                finish();
                return;
            }
            this.f4090c = new C4491a();
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f4090c, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f4087i.equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(CustomTabActivity.f4079d));
            m5495b(-1, intent);
        } else if (CustomTabActivity.f4078c.equals(intent.getAction())) {
            m5495b(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f4089b) {
            m5495b(0, (Intent) null);
        }
        this.f4089b = true;
    }
}
