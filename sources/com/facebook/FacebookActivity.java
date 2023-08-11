package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p021a3.C2177n;
import p046c3.C3880b;
import p060d3.C7252a;
import p072e3.C7455a;
import p178o2.C8953b;
import p178o2.C8954c;
import p198q2.C9138d0;
import p198q2.C9157g;
import p198q2.C9196w;
import p251v2.C9925a;
import p284y2.C10656b;

public class FacebookActivity extends FragmentActivity {

    /* renamed from: c */
    public static String f4093c = "PassThrough";

    /* renamed from: d */
    private static String f4094d = "SingleFragment";

    /* renamed from: e */
    private static final String f4095e = "com.facebook.FacebookActivity";

    /* renamed from: b */
    private Fragment f4096b;

    /* renamed from: o2 */
    private void m5496o2() {
        setResult(0, C9196w.m18858o(getIntent(), (Bundle) null, C9196w.m18862s(C9196w.m18866w(getIntent()))));
        finish();
    }

    public void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C10656b.m22624h(str, printWriter, strArr)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: m2 */
    public Fragment mo31475m2() {
        return this.f4096b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Fragment mo31476n2() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(f4094d);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C9157g gVar = new C9157g();
            gVar.setRetainInstance(true);
            gVar.show(supportFragmentManager, f4094d);
            return gVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            C7252a aVar = new C7252a();
            aVar.setRetainInstance(true);
            aVar.mo40817r2((C7455a) intent.getParcelableExtra("content"));
            aVar.show(supportFragmentManager, f4094d);
            return aVar;
        } else if ("ReferralFragment".equals(intent.getAction())) {
            C3880b bVar = new C3880b();
            bVar.setRetainInstance(true);
            supportFragmentManager.beginTransaction().add(C8953b.f12991c, (Fragment) bVar, f4094d).commit();
            return bVar;
        } else {
            C2177n nVar = new C2177n();
            nVar.setRetainInstance(true);
            supportFragmentManager.beginTransaction().add(C8953b.f12991c, (Fragment) nVar, f4094d).commit();
            return nVar;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f4096b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.isInitialized()) {
            C9138d0.m18626a0(f4095e, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            FacebookSdk.sdkInitialize(getApplicationContext());
        }
        setContentView(C8954c.f12995a);
        if (f4093c.equals(intent.getAction())) {
            m5496o2();
        } else {
            this.f4096b = mo31476n2();
        }
    }
}
