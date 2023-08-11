package p357ia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.NestedScrollView;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.InstoreCashbackActivity;
import com.poulpeo.p321ui.screens.comment.CommentActivity;
import com.poulpeo.p321ui.screens.contact_info.ContactInfoActivity;
import com.poulpeo.p321ui.screens.home.PageActivity;
import com.poulpeo.p321ui.screens.notification_admin.NotificationAdminActivity;
import com.poulpeo.p321ui.screens.poulpeo_plus.PoulpeoPlusActivity;
import com.poulpeo.p321ui.screens.sponsorship.SponsorshipActivity;
import com.poulpeo.p321ui.screens.support_ticket.SupportTicketListActivity;
import com.poulpeo.p321ui.screens.video.PLPFullScreenVideoActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PLPUserGrade;
import com.rmn.api.p322v2.poulpeo.model.UserSuggestSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p102g9.C7834c;
import p334ed.C11884a;
import p334ed.C11887b;
import p351hb.C12047o;
import p357ia.C12104a;
import p360id.C12134b;
import p360id.C12139g;
import p368jd.C12615a;
import p419ra.C13274e;
import p419ra.C13276g;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: ia.f */
/* compiled from: AccountFragment.kt */
public final class C12111f extends C12615a implements C12107b, View.OnClickListener, C13276g, C13274e {

    /* renamed from: i */
    public static final C12112a f18960i = new C12112a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f18961j = 8;

    /* renamed from: d */
    private C12104a f18962d;

    /* renamed from: e */
    private boolean f18963e;

    /* renamed from: f */
    private boolean f18964f;

    /* renamed from: g */
    private boolean f18965g;

    /* renamed from: h */
    public Map<Integer, View> f18966h = new LinkedHashMap();

    /* renamed from: ia.f$a */
    /* compiled from: AccountFragment.kt */
    public static final class C12112a {
        private C12112a() {
        }

        public /* synthetic */ C12112a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: s2 */
    private final void m26350s2(boolean z) {
        C13618g.f21930b.mo53278b("profile", "sponsorship");
        Intent a = SponsorshipActivity.f17717p.mo46494a(mo50355M0());
        if (z) {
            startActivity(a);
        } else {
            mo50355M0().mo47883t2(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m26351t2(C12111f fVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(fVar, "this$0");
        C12104a aVar = fVar.f18962d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo49552y2();
        C13618g.f21930b.mo53278b("disconnect", "validate");
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m26352u2(DialogInterface dialogInterface, int i) {
        C13618g.f21930b.mo53278b("disconnect", "cancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m26353v2(C12111f fVar, View view) {
        C12775o.m28639i(fVar, "this$0");
        fVar.startActivity(WebActivity.f17745z.mo46527f(fVar.mo50355M0()));
    }

    /* renamed from: w2 */
    private final void m26354w2() {
        if (!isHidden()) {
            C7834c.m15322b(this).mo50959a(mo50355M0().mo47878o2());
            C13618g.f21930b.mo53280e(new C13616e("home-profile", C13617f.PROFILE));
        }
    }

    /* renamed from: B1 */
    public void mo46312B1(String str) {
        C12775o.m28639i(str, "appVersion");
        if (!TextUtils.isEmpty(str)) {
            int i = C13865f.textViewVersion;
            ((TextView) mo49560r2(i)).setText(mo50355M0().getString(R.string.account_version, new Object[]{str}));
            ((TextView) mo49560r2(i)).setOnClickListener(new C12110e(this));
            return;
        }
        TextView textView = (TextView) mo49560r2(C13865f.textViewVersion);
        C12775o.m28638h(textView, "textViewVersion");
        C12139g.m26475d(textView, false, 0, 2, (Object) null);
    }

    /* renamed from: E */
    public void mo49556E() {
        this.f18965g = true;
    }

    /* renamed from: H1 */
    public void mo46314H1(PLPUser pLPUser, String str, String str2, String str3, String str4, String str5, PLPUserGrade pLPUserGrade, boolean z) {
        boolean z2;
        boolean z3;
        C12775o.m28639i(pLPUser, "user");
        C12775o.m28639i(str, "initials");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(str3, NotificationCompat.CATEGORY_EMAIL);
        C12775o.m28639i(str4, "date");
        C12775o.m28639i(str5, "totalAmount");
        if (!mo50355M0().isFinishing() && !mo50355M0().isDestroyed() && getView() != null) {
            ImageView imageView = (ImageView) mo49560r2(C13865f.imageViewPoulpeoPlus);
            C12775o.m28638h(imageView, "imageViewPoulpeoPlus");
            if (pLPUserGrade == PLPUserGrade.POULPEO_PLUS) {
                z2 = true;
            } else {
                z2 = false;
            }
            C12139g.m26475d(imageView, z2, 0, 2, (Object) null);
            TextView textView = (TextView) mo49560r2(C13865f.textViewDebugEng);
            C12775o.m28638h(textView, "textViewDebugEng");
            C12139g.m26475d(textView, pLPUser.isAdmin(), 0, 2, (Object) null);
            ((TextView) mo49560r2(C13865f.textViewInitials)).setText(str);
            ((TextView) mo49560r2(C13865f.textViewName)).setText(str2);
            ((TextView) mo49560r2(C13865f.textViewEmail)).setText(str3);
            ((TextView) mo49560r2(C13865f.textViewDate)).setText(mo50355M0().getString(R.string.account_date, new Object[]{str4}));
            if (str5.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((TextView) mo49560r2(C13865f.textViewAmount)).setText("");
                return;
            }
            ((TextView) mo49560r2(C13865f.textViewAmount)).setText(mo50355M0().getString(R.string.account_amount, new Object[]{str5}));
        }
    }

    /* renamed from: J0 */
    public void mo49557J0() {
        this.f18964f = true;
    }

    /* renamed from: Q0 */
    public void mo46316Q0() {
        C11884a.f18565e.mo49090c(mo50355M0(), "TAG_UPDATE_OVERLAY_FRAGMENT", new C11887b());
    }

    /* renamed from: a */
    public void mo49558a() {
        ((NestedScrollView) mo49560r2(C13865f.nestedScrollView)).smoothScrollTo(0, 0);
    }

    /* renamed from: h1 */
    public void mo46319h1() {
        this.f18963e = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1337) {
            C12104a aVar = this.f18962d;
            if (aVar == null) {
                C12775o.m28656z("controller");
                aVar = null;
            }
            aVar.mo49551x2(false);
        }
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!this.f18963e) {
            if (C12775o.m28634d(view, (ImageView) mo49560r2(C13865f.imageViewPoulpeoPlus))) {
                startActivity(PoulpeoPlusActivity.f17634o.mo46445a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewAddress))) {
                C13618g.f21930b.mo53278b("profile", "contact-details");
                startActivity(ContactInfoActivity.f17274p.mo46211a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewSponsorship))) {
                m26350s2(true);
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewNotification))) {
                C13618g.f21930b.mo53278b("profile", "notification");
                startActivity(NotificationAdminActivity.f17590p.mo46421a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewHowItWorks))) {
                C13618g.f21930b.mo53278b("profile", "how-it-works");
                startActivity(PLPFullScreenVideoActivity.f17741v.mo46518a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewInstoreCashback))) {
                C13618g.f21930b.mo53278b("profile", "instore-cashback");
                startActivity(InstoreCashbackActivity.f17224p.mo46180a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewAbout))) {
                C13618g.f21930b.mo53278b("profile", "faq");
                WebActivity.f17745z.mo46529h(mo50355M0());
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewSupport))) {
                C13618g.f21930b.mo53278b("profile", "support");
                startActivity(SupportTicketListActivity.f17735p.mo46516a(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewComment))) {
                C13618g.f21930b.mo53278b("profile", "comment");
                startActivity(CommentActivity.f17250v.mo46200g(mo50355M0(), (String) null, (String) null, UserSuggestSource.COMMENT));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewRating))) {
                C13618g.f21930b.mo53278b("profile", "rating");
                C12047o.C12048a.m26210k(C12047o.f18841k, mo50355M0(), "account", (Function1) null, 4, (Object) null);
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewConditions))) {
                C13618g.f21930b.mo53278b("profile", "terms");
                startActivity(WebActivity.f17745z.mo46526e(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewConfidentiality))) {
                C13618g.f21930b.mo53278b("profile", "privacy-policy");
                startActivity(WebActivity.f17745z.mo46524c(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewLegal))) {
                C13618g.f21930b.mo53278b("profile", "legal");
                WebActivity.f17745z.mo46531j(mo50355M0());
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewOffersInfo))) {
                C13618g.f21930b.mo53278b("profile", "offersInfo");
                startActivity(WebActivity.f17745z.mo46523b(mo50355M0()));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewDebugEng))) {
                startActivity(PageActivity.f17333q.mo46270e(mo50355M0(), "Page de recettage ENG", "7140"));
            } else if (C12775o.m28634d(view, (TextView) mo49560r2(C13865f.textViewLogout))) {
                AlertDialog.Builder negativeButton = new AlertDialog.Builder(mo50355M0()).setTitle((int) R.string.account_logout_dialog_title).setMessage((int) R.string.account_logout_dialog_message).setPositiveButton((int) R.string.account_logout_dialog_positive_button_text, (DialogInterface.OnClickListener) new C12108c(this)).setNegativeButton((int) R.string.account_logout_dialog_negative_button_text, (DialogInterface.OnClickListener) new C12109d());
                C12775o.m28638h(negativeButton, "Builder(retainedActivity…      )\n                }");
                C12134b.m26457c(negativeButton, mo50355M0(), (Function1) null, 2, (Object) null);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_account, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C12104a aVar = this.f18962d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo49547r2();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m26354w2();
        if (!z && this.f18964f) {
            C12104a aVar = this.f18962d;
            if (aVar == null) {
                C12775o.m28656z("controller");
                aVar = null;
            }
            aVar.mo49550w2(true);
            this.f18964f = false;
        }
    }

    public void onPause() {
        super.onPause();
        C12104a aVar = this.f18962d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo49548s2();
    }

    public void onResume() {
        super.onResume();
        C12104a aVar = this.f18962d;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo49549t2();
        m26354w2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50361l2("AccountFragment", false);
        mo50355M0().setTitle((int) R.string.account_title);
        ActionBar m2 = mo50352m2();
        if (m2 != null) {
            m2.setDisplayHomeAsUpEnabled(false);
        }
        ((ImageView) mo49560r2(C13865f.imageViewPoulpeoPlus)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewAddress)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewSponsorship)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewNotification)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewHowItWorks)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewInstoreCashback)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewAbout)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewSupport)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewComment)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewRating)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewConditions)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewConfidentiality)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewLegal)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewOffersInfo)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewLogout)).setOnClickListener(this);
        ((TextView) mo49560r2(C13865f.textViewDebugEng)).setOnClickListener(this);
        C12104a aVar = new C12104a(this, new C12104a.C12106b(mo50355M0().mo47878o2(), new C13689a(mo50355M0().mo47878o2()), this.f18965g));
        this.f18962d = aVar;
        aVar.mo49546q2();
    }

    /* renamed from: r2 */
    public View mo49560r2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f18966h;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: x */
    public void mo46322x() {
        C11884a.f18565e.mo49089a(mo50355M0(), "TAG_UPDATE_OVERLAY_FRAGMENT");
    }
}
