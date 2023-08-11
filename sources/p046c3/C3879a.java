package p046c3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import p021a3.C2139b;
import p198q2.C9138d0;
import p198q2.C9143e;
import p198q2.C9145f;

/* renamed from: c3.a */
/* compiled from: ReferralClient */
class C3879a {

    /* renamed from: a */
    private Fragment f2962a;

    /* renamed from: b */
    private String f2963b;

    /* renamed from: c */
    protected String f2964c;

    C3879a(Fragment fragment) {
        this.f2962a = fragment;
    }

    /* renamed from: a */
    private void m4361a(int i, Intent intent) {
        FragmentActivity activity;
        if (this.f2962a.isAdded() && (activity = this.f2962a.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: b */
    private String m4362b() {
        if (this.f2963b == null) {
            this.f2963b = C9145f.m18694a();
        }
        return this.f2963b;
    }

    /* renamed from: c */
    static String m4363c() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize";
    }

    /* renamed from: d */
    private Bundle m4364d() {
        Bundle bundle = new Bundle();
        this.f2964c = C9138d0.m18655p(20);
        bundle.putString("redirect_uri", C9145f.m18696c(m4363c()));
        bundle.putString("app_id", FacebookSdk.getApplicationId());
        bundle.putString("state", this.f2964c);
        return bundle;
    }

    /* renamed from: e */
    private boolean m4365e() {
        if (m4362b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m4366h() {
        if (this.f2962a.getActivity() == null || this.f2962a.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || !m4365e()) {
            return false;
        }
        Bundle d = m4364d();
        if (FacebookSdk.hasCustomTabsPrefetching) {
            C2139b.m1513b(C9143e.m18680a("share_referral", d));
        }
        Intent intent = new Intent(this.f2962a.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f4082d, "share_referral");
        intent.putExtra(CustomTabMainActivity.f4083e, d);
        intent.putExtra(CustomTabMainActivity.f4084f, m4362b());
        this.f2962a.startActivityForResult(intent, 1);
        return true;
    }

    /* renamed from: i */
    private boolean m4367i(Bundle bundle) {
        if (this.f2964c == null) {
            return true;
        }
        boolean equals = this.f2964c.equals(bundle.getString("state"));
        this.f2964c = null;
        return equals;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo29924f(int i, int i2, Intent intent) {
        String stringExtra;
        if (i == 1) {
            if (!(intent == null || (stringExtra = intent.getStringExtra(CustomTabMainActivity.f4085g)) == null || !stringExtra.startsWith(C9145f.m18696c(m4363c())))) {
                Bundle f0 = C9138d0.m18636f0(Uri.parse(stringExtra).getQuery());
                if (m4367i(f0)) {
                    intent.putExtras(f0);
                } else {
                    intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                    i2 = 0;
                }
            }
            m4361a(i2, intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo29925g() {
        if (!m4366h()) {
            Intent intent = new Intent();
            intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            m4361a(0, intent);
        }
    }
}
