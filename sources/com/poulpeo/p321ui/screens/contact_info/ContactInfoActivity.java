package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p368jd.C12616b;
import p387ma.C12862a;
import p387ma.C12864b;
import p387ma.C12866c;
import p387ma.C12868d;
import p387ma.C12871e;
import p440ud.C13572p;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.ContactInfoActivity */
/* compiled from: ContactInfoActivity.kt */
public final class ContactInfoActivity extends C12616b {

    /* renamed from: p */
    public static final C11112a f17274p = new C11112a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17275q = 8;

    /* renamed from: m */
    private final int f17276m = R.string.contact_info_title;

    /* renamed from: n */
    private C12871e f17277n;

    /* renamed from: o */
    public Map<Integer, View> f17278o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.ContactInfoActivity$a */
    /* compiled from: ContactInfoActivity.kt */
    public static final class C11112a {
        private C11112a() {
        }

        public /* synthetic */ C11112a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46211a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, ContactInfoActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m23978F2(ContactInfoActivity contactInfoActivity, View view) {
        C12775o.m28639i(contactInfoActivity, "this$0");
        contactInfoActivity.startActivity(UpdateLoginInfoActivity.f17303p.mo46242a(contactInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m23979G2(ContactInfoActivity contactInfoActivity, View view) {
        C12775o.m28639i(contactInfoActivity, "this$0");
        contactInfoActivity.startActivity(UpdatePasswordActivity.f17308p.mo46248a(contactInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m23980H2(ContactInfoActivity contactInfoActivity, View view) {
        C12775o.m28639i(contactInfoActivity, "this$0");
        contactInfoActivity.startActivity(UpdatePaymentInfoActivity.f17313p.mo46258a(contactInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m23981I2(ContactInfoActivity contactInfoActivity, View view) {
        C12775o.m28639i(contactInfoActivity, "this$0");
        contactInfoActivity.startActivity(UnregisterActivity.f17292p.mo46229a(contactInfoActivity));
    }

    /* renamed from: E2 */
    public View mo46210E2(int i) {
        Map<Integer, View> map = this.f17278o;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contact_info);
        mo50358x2("ContactInfoActivity", true);
        ((TextView) mo46210E2(C13865f.textViewLoginInfo)).setOnClickListener(new C12862a(this));
        ((TextView) mo46210E2(C13865f.textViewUpdatePassword)).setOnClickListener(new C12864b(this));
        ((LinearLayout) mo46210E2(C13865f.layoutUpdatePaymentInfo)).setOnClickListener(new C12866c(this));
        ((TextView) mo46210E2(C13865f.textViewUnregister)).setOnClickListener(new C12868d(this));
        C12871e eVar = new C12871e(new C12871e.C12873b(mo47878o2(), new C13572p((TextView) mo46210E2(C13865f.textViewMissingPayment))));
        this.f17277n = eVar;
        eVar.mo50790o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12871e eVar = this.f17277n;
        if (eVar == null) {
            C12775o.m28656z("controller");
            eVar = null;
        }
        eVar.mo50791p2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12871e eVar = this.f17277n;
        if (eVar == null) {
            C12775o.m28656z("controller");
            eVar = null;
        }
        eVar.mo50792q2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12871e eVar = this.f17277n;
        if (eVar == null) {
            C12775o.m28656z("controller");
            eVar = null;
        }
        eVar.mo50793r2();
        C13618g.f21930b.mo53280e(new C13616e("contact-details", C13617f.PROFILE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17276m;
    }
}
