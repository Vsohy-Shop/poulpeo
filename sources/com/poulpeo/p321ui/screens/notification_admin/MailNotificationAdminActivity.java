package com.poulpeo.p321ui.screens.notification_admin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;
import p438ub.C13542a;
import p440ud.C13568n;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;
import p467za.C14065c;
import p467za.C14068d;
import p467za.C14076k;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.notification_admin.MailNotificationAdminActivity */
/* compiled from: MailNotificationAdminActivity.kt */
public final class MailNotificationAdminActivity extends C11190a {

    /* renamed from: v */
    public static final C11184a f17583v = new C11184a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17584w = 8;

    /* renamed from: r */
    private final int f17585r = R.layout.activity_mail_notification_admin;

    /* renamed from: s */
    private final int f17586s = R.string.notification_admin_mail;

    /* renamed from: t */
    private final Lazy f17587t = C11901h.m25690b(new C11185b(this));

    /* renamed from: u */
    public Map<Integer, View> f17588u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.notification_admin.MailNotificationAdminActivity$a */
    /* compiled from: MailNotificationAdminActivity.kt */
    public static final class C11184a {
        private C11184a() {
        }

        public /* synthetic */ C11184a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46418a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, MailNotificationAdminActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.notification_admin.MailNotificationAdminActivity$b */
    /* compiled from: MailNotificationAdminActivity.kt */
    static final class C11185b extends C12777p implements C13074a<C14068d> {

        /* renamed from: g */
        final /* synthetic */ MailNotificationAdminActivity f17589g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11185b(MailNotificationAdminActivity mailNotificationAdminActivity) {
            super(0);
            this.f17589g = mailNotificationAdminActivity;
        }

        /* renamed from: b */
        public final C14068d invoke() {
            List n = C12726w.m28527n(new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutCashbackPending)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchCashbackPending)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_CASHBACK_PENDING, PLPMethodReturns.PLP_MAIL_NOTIFICATION_CASHBACK_PENDING, "email|pot-monitoring", "registered-cashback"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutCashbackAccepted)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchCashbackAccepted)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED, PLPMethodReturns.PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED, "email|pot-monitoring", "validated-cashback"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutSponsorship)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchSponsorship)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_SPONSORSHIP, PLPMethodReturns.PLP_MAIL_NOTIFICATION_SPONSORSHIP, "email|pot-monitoring", "sponsorship"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutReview)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchReview)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_REVIEW, PLPMethodReturns.PLP_MAIL_NOTIFICATION_REVIEW, "email|pot-monitoring", "reviews"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutMonthly)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchMonthly)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_MONTHLY, PLPMethodReturns.PLP_MAIL_NOTIFICATION_MONTHLY, "email|pot-monitoring", "monthly-reports"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutNewsletterCashbackIncrease)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchNewsletterCashbackIncrease)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE, PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE, "email|promo-offers", "cashback-increase"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutNewsletterBestOf)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchNewsletterBestOf)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF, PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF, "email|promo-offers", "best-offers"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutNewsletterPartners)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchNewsletterPartners)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS, PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS, "email|promo-offers", "partners"), new C14076k(new C13574r((LinearLayout) this.f17589g.mo46417G2(C13865f.layoutNewsletterRelational)), new C13568n((Switch) this.f17589g.mo46417G2(C13865f.switchNewsletterRelational)), PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL, PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL, "email|promo-offers", "relational"));
            MailNotificationAdminActivity mailNotificationAdminActivity = this.f17589g;
            return new C14068d(mailNotificationAdminActivity, new C14065c.C14067b(mailNotificationAdminActivity.mo47878o2(), new C13689a(this.f17589g.mo47878o2()), n, new C13574r((RelativeLayout) this.f17589g.mo46417G2(C13865f.layoutProgressView)), new C13574r((ScrollView) this.f17589g.mo46417G2(C13865f.scrollViewContent)), C13542a.f21790p.mo53187a(this.f17589g).mo53179d()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public C14065c mo46415C2() {
        return (C14065c) this.f17587t.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public int mo46416D2() {
        return this.f17585r;
    }

    /* renamed from: G2 */
    public View mo46417G2(int i) {
        Map<Integer, View> map = this.f17588u;
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
        mo50358x2("MailNotificationAdminActivity", true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17586s;
    }
}
