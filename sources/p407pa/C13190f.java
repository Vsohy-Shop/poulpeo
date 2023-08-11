package p407pa;

import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.main_menu.MainMenuActivity;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.poulpeo.p321ui.views.ViewOffersInfo;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.screens.AnimatedActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p102g9.C7834c;
import p360id.C12136d;
import p368jd.C12615a;
import p407pa.C13186c;
import p426sb.C13380a;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13574r;
import p445vc.C13612a;
import p445vc.C13615d;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13623d;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: pa.f */
/* compiled from: InstoreCashbackFragment.kt */
public final class C13190f extends C12615a implements C13188d, View.OnClickListener {

    /* renamed from: d */
    private C13186c f21001d;

    /* renamed from: e */
    public Map<Integer, View> f21002e = new LinkedHashMap();

    /* renamed from: pa.f$a */
    /* compiled from: InstoreCashbackFragment.kt */
    public static final class C13191a extends ClickableSpan {

        /* renamed from: b */
        final /* synthetic */ C13190f f21003b;

        C13191a(C13190f fVar) {
            this.f21003b = fVar;
        }

        public void onClick(View view) {
            C12775o.m28639i(view, "p0");
            C13618g.f21930b.mo53278b("instore-cashback", "subscribe-link");
            this.f21003b.mo52814b1("https://www.poulpeo.com/cashback-en-magasin.htm");
        }
    }

    /* renamed from: q2 */
    private final void m29929q2() {
        if (!isHidden()) {
            C7834c.m15322b(this).mo50959a(mo50355M0().mo47878o2());
            new Handler().postDelayed(new C13189e(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m29930r2(C13190f fVar) {
        C12775o.m28639i(fVar, "this$0");
        fVar.m29931s2();
    }

    /* renamed from: s2 */
    private final void m29931s2() {
        String str;
        C13616e eVar = new C13616e("instore-cashback", C13617f.INSTORE_CASHBACK);
        C13186c cVar = this.f21001d;
        C13186c cVar2 = null;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        if (cVar.mo52807r2()) {
            C13612a aVar = C13612a.OPTIN_PAYLEAD;
            C13186c cVar3 = this.f21001d;
            if (cVar3 == null) {
                C12775o.m28656z("controller");
                cVar3 = null;
            }
            String str2 = "yes";
            if (cVar3.mo52808s2()) {
                str = str2;
            } else {
                str = "no";
            }
            C13615d b = eVar.mo53271b(aVar, str);
            C13612a aVar2 = C13612a.PAYLEAD_CONNECTION_ERROR;
            C13186c cVar4 = this.f21001d;
            if (cVar4 == null) {
                C12775o.m28656z("controller");
            } else {
                cVar2 = cVar4;
            }
            if (!cVar2.mo52806q2()) {
                str2 = "no";
            }
            b.mo53271b(aVar2, str2);
        }
        C13618g.f21930b.mo53280e(eVar);
    }

    /* renamed from: G */
    public void mo52813G(List<? extends Merchant> list) {
        C12775o.m28639i(list, "merchants");
        int i = C13865f.gridLayoutMerchants;
        if (((GridLayout) mo52818p2(i)) != null) {
            ((GridLayout) mo52818p2(i)).removeAllViews();
            for (Merchant c : list) {
                C13380a aVar = new C13380a(mo50355M0());
                aVar.setOnClickListener(this);
                aVar.mo53001c(c);
                int e = C12136d.m26463e(mo50355M0(), (C12136d.m26466h(mo50355M0(), C13623d.m31106f(new ContextContainer(mo50355M0())).f21950a) - 32) / 3);
                aVar.setLayoutParams(new FrameLayout.LayoutParams(e, e));
                ((GridLayout) mo52818p2(C13865f.gridLayoutMerchants)).addView(aVar);
            }
        }
    }

    /* renamed from: b1 */
    public void mo52814b1(String str) {
        C12775o.m28639i(str, "url");
        WebActivity.f17745z.mo46532k(mo50355M0(), str);
    }

    /* renamed from: f */
    public void mo52815f(boolean z, boolean z2) {
        MainMenuActivity mainMenuActivity;
        AnimatedActivity M0 = mo50355M0();
        if (M0 instanceof MainMenuActivity) {
            mainMenuActivity = (MainMenuActivity) M0;
        } else {
            mainMenuActivity = null;
        }
        if (mainMenuActivity != null) {
            mainMenuActivity.mo46318f(z, z2);
        }
    }

    public void onClick(View view) {
        Merchant merchant;
        if ((view instanceof C13380a) && (merchant = ((C13380a) view).getMerchant()) != null) {
            C13186c cVar = this.f21001d;
            if (cVar == null) {
                C12775o.m28656z("controller");
                cVar = null;
            }
            cVar.mo52811x2(merchant);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_instore_cashback, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C13186c cVar = this.f21001d;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo52810w2();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m29929q2();
    }

    public void onPause() {
        super.onPause();
        C13186c cVar = this.f21001d;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo52812z2();
    }

    public void onResume() {
        super.onResume();
        C13186c cVar = this.f21001d;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo52805A2();
        m29929q2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50361l2("InstoreCashbackFragment", false);
        mo50355M0().setTitle((int) R.string.instore_cashback_title);
        ActionBar m2 = mo50352m2();
        if (m2 != null) {
            m2.setDisplayHomeAsUpEnabled(false);
        }
        C13186c cVar = new C13186c(this, new C13186c.C13187a(mo50355M0().mo47878o2(), new C13689a(mo50355M0().mo47878o2()), new C13558g((ProgressBar) mo52818p2(C13865f.progressBarLoader)), new C13574r((GridLayout) mo52818p2(C13865f.gridLayoutMerchants)), new C13548a((Button) mo52818p2(C13865f.buttonInstoreSubscribe)), new C13548a((Button) mo52818p2(C13865f.buttonInstoreActivated)), new C13548a((Button) mo52818p2(C13865f.buttonInstoreWarning)), new C13574r((LinearLayout) mo52818p2(C13865f.layoutInstoreActivated)), new C13574r((LinearLayout) mo52818p2(C13865f.layoutInstoreWarning)), new C13548a((Button) mo52818p2(C13865f.buttonQuestions))));
        this.f21001d = cVar;
        cVar.mo52809v2();
        String string = getString(R.string.instore_link);
        C12775o.m28638h(string, "getString(R.string.instore_link)");
        SpannableString spannableString = new SpannableString(getString(R.string.instore_infos, string));
        int W = C13755w.m31571W(spannableString, string, 0, false, 6, (Object) null);
        spannableString.setSpan(new C13191a(this), W, string.length() + W, 33);
        int i = C13865f.textClickable;
        ((TextView) mo52818p2(i)).setText(spannableString);
        ((TextView) mo52818p2(i)).setMovementMethod(LinkMovementMethod.getInstance());
        View p2 = mo52818p2(C13865f.offerRanked);
        C12775o.m28637g(p2, "null cannot be cast to non-null type com.poulpeo.ui.views.ViewOffersInfo");
        ((ViewOffersInfo) p2).setColorAtBlue(false);
    }

    /* renamed from: p2 */
    public View mo52818p2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f21002e;
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
}
