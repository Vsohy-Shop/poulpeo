package p066d9;

import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.p321ui.screens.InstoreCashbackActivity;
import com.poulpeo.p321ui.screens.account.AccountActivity;
import com.poulpeo.p321ui.screens.home.PageActivity;
import com.poulpeo.p321ui.screens.login.PLPMainSignUpActivity;
import com.poulpeo.p321ui.screens.main_menu.MainMenuActivity;
import com.poulpeo.p321ui.screens.marketing_events.activity.BoostedCashbackActivity;
import com.poulpeo.p321ui.screens.marketing_events.activity.HappyHoursActivity;
import com.poulpeo.p321ui.screens.marketing_events.activity.SuperCashbackActivity;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantCampaignsGridActivity;
import com.poulpeo.p321ui.screens.merchant_grid.MerchantListGridActivity;
import com.poulpeo.p321ui.screens.onboarding.OnboardingActivity;
import com.poulpeo.p321ui.screens.poulpeo_plus.PoulpeoPlusActivity;
import com.poulpeo.p321ui.screens.sponsorship.SponsorshipActivity;
import com.poulpeo.p321ui.screens.support_ticket.SupportTicketListActivity;
import com.poulpeo.p321ui.screens.video.PLPFullScreenVideoActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p440ud.C13566l;

@StabilityInferred(parameters = 0)
/* renamed from: d9.d */
/* compiled from: PLPDeepLinkScreenOpener.kt */
public final class C7312d implements C7309a {

    /* renamed from: a */
    public static final C7313a f10129a = new C7313a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C7312d f10130b = new C7312d();

    /* renamed from: d9.d$a */
    /* compiled from: PLPDeepLinkScreenOpener.kt */
    public static final class C7313a {
        private C7313a() {
        }

        public /* synthetic */ C7313a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7312d mo40931a() {
            return C7312d.f10130b;
        }
    }

    private C7312d() {
    }

    /* renamed from: u */
    private final Intent m14228u(Intent intent) {
        intent.setFlags(268468224);
        return intent;
    }

    /* renamed from: a */
    public void mo40896a(C13566l lVar, String str) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "sponsorCode");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(OnboardingActivity.f17619s.mo46440c(a))).addNextIntentWithParentStack(PLPMainSignUpActivity.f17354f0.mo46281c(a, str)).startActivities();
        }
    }

    /* renamed from: b */
    public void mo40897b(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(AccountActivity.f17242p.mo46185a(a)).addNextIntentWithParentStack(SupportTicketListActivity.f17735p.mo46516a(a)).startActivities();
        }
    }

    /* renamed from: c */
    public void mo40898c(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            a.startActivity(m14228u(MainMenuActivity.f17407w.mo46323f(a)));
        }
    }

    /* renamed from: d */
    public void mo40899d(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            a.startActivity(m14228u(MainMenuActivity.f17407w.mo46324g(a)));
        }
    }

    /* renamed from: e */
    public void mo40900e(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(AccountActivity.f17242p.mo46185a(a)).addNextIntentWithParentStack(SponsorshipActivity.f17717p.mo46494a(a)).startActivities();
        }
    }

    /* renamed from: f */
    public void mo40901f(C13566l lVar, String str) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "techName");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(MerchantCampaignsGridActivity.f17518v.mo46384c(a, "", str)).startActivities();
        }
    }

    /* renamed from: g */
    public void mo40902g(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(PLPFullScreenVideoActivity.f17741v.mo46518a(a)).startActivities();
        }
    }

    /* renamed from: h */
    public void mo40903h(C13566l lVar, String str, boolean z) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "merchantId");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(MerchantActivity.f17469w.mo46357h(a, str, true, (String) null)).startActivities();
        }
    }

    /* renamed from: i */
    public void mo40904i(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(AccountActivity.f17242p.mo46185a(a)).addNextIntentWithParentStack(InstoreCashbackActivity.f17224p.mo46180a(a));
        }
    }

    /* renamed from: j */
    public void mo40905j(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            WebActivity.f17745z.mo46529h(a);
        }
    }

    /* renamed from: k */
    public void mo40906k(C13566l lVar, String str, String str2) {
        boolean z;
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "merchantId");
        C12775o.m28639i(str2, "offerId");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder addNextIntent = TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a)));
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                addNextIntent.addNextIntentWithParentStack(MerchantActivity.f17469w.mo46357h(a, str, true, str2));
            }
            addNextIntent.startActivities();
        }
    }

    /* renamed from: l */
    public void mo40907l(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(HappyHoursActivity.f17433v.mo46337a(a)).startActivities();
        }
    }

    /* renamed from: m */
    public void mo40908m(C13566l lVar, String str) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "techName");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(MerchantListGridActivity.f17524v.mo46385c(a, "", str)).startActivities();
        }
    }

    /* renamed from: n */
    public void mo40909n(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(SuperCashbackActivity.f17442v.mo46338a(a)).startActivities();
        }
    }

    /* renamed from: o */
    public void mo40910o(C13566l lVar, String str) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "url");
        Activity a = lVar.mo53218a();
        if (a != null) {
            WebActivity.f17745z.mo46532k(a, str);
        }
    }

    /* renamed from: p */
    public void mo40911p(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(PoulpeoPlusActivity.f17634o.mo46445a(a)).startActivities();
        }
    }

    /* renamed from: q */
    public void mo40912q(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            a.startActivity(m14228u(MainMenuActivity.f17407w.mo46325h(a)));
        }
    }

    /* renamed from: r */
    public void mo40913r(C13566l lVar, String str) {
        C12775o.m28639i(lVar, "previousScreen");
        C12775o.m28639i(str, "pageId");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(PageActivity.f17333q.mo46270e(a, "", str)).startActivities();
        }
    }

    /* renamed from: s */
    public void mo40914s(C13566l lVar) {
        C12775o.m28639i(lVar, "previousScreen");
        Activity a = lVar.mo53218a();
        if (a != null) {
            TaskStackBuilder.create(a).addNextIntent(m14228u(MainMenuActivity.f17407w.mo46323f(a))).addNextIntentWithParentStack(BoostedCashbackActivity.f17424v.mo46335a(a)).startActivities();
        }
    }
}
