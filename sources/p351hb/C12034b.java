package p351hb;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import p445vc.C13618g;
import p446vd.C13621b;
import p446vd.C13636q;

/* renamed from: hb.b */
/* compiled from: RatingController */
public class C12034b implements IProxyListener {
    @NonNull

    /* renamed from: h */
    private static final C12034b f18814h = new C12034b();
    @Nullable

    /* renamed from: b */
    private ContextContainer f18815b;
    @NonNull

    /* renamed from: c */
    private Set<IListener<Boolean>> f18816c = new HashSet();
    @NonNull

    /* renamed from: d */
    private ProxyActionsPool f18817d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f18818e;

    /* renamed from: f */
    private double f18819f = -1.0d;

    /* renamed from: g */
    private double f18820g = -1.0d;

    private C12034b() {
    }

    /* renamed from: b */
    private boolean m26137b() {
        C12035c m;
        if (new Date().getTime() < mo49469k() + 2592000000L || (m = mo49471m()) == C12035c.DEFINITELY || m == C12035c.UNTIL_APP_UPDATE) {
            return false;
        }
        if ((m != C12035c.UNTIL_NEW_EARNINGS || this.f18819f >= mo49470l() + 5.0d) && this.f18819f > 0.0d && this.f18820g > 5.0d) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: c */
    private ContextContainer m26138c() {
        ContextContainer contextContainer = this.f18815b;
        if (contextContainer != null) {
            return contextContainer;
        }
        throw new IllegalStateException("You must call ratingController.init(contextContainer) before using it");
    }

    @NonNull
    /* renamed from: d */
    public static C12034b m26139d() {
        return f18814h;
    }

    /* renamed from: e */
    public static String m26140e(@NonNull String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = "auto-";
        } else {
            str2 = "click-";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m26141h(Boolean bool) {
        if (this.f18818e && this.f18819f < mo49470l()) {
            mo49474p();
        }
    }

    /* renamed from: i */
    private void m26142i(boolean z) {
        HashSet<IListener> hashSet = new HashSet<>(this.f18816c);
        this.f18816c.clear();
        for (IListener J0 : hashSet) {
            J0.mo40744J0(Boolean.valueOf(z));
        }
    }

    /* renamed from: y */
    private void m26143y(@NonNull String str, @NonNull String str2) {
        String str3;
        String str4;
        String str5;
        C12035c m = mo49471m();
        String str6 = "";
        if (m != null) {
            str3 = m.f18825b;
        } else {
            str3 = str6;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        if (this.f18818e) {
            str5 = numberInstance.format(this.f18819f);
            str4 = numberInstance.format(this.f18820g);
        } else {
            str5 = str6;
            str4 = str5;
        }
        double l = mo49470l();
        if (l >= 0.0d) {
            str6 = numberInstance.format(l);
        }
        C13618g.f21930b.mo53279c("app-rating-" + str, str2, "deactivate=" + str3 + "|amount=" + str5 + "|total=" + str4 + "|last=" + str6 + "|auto-show=" + mo49473o(true) + "|click-show=" + mo49473o(false));
    }

    /* renamed from: A */
    public void mo49463A(@NonNull String str) {
        m26143y(str, "show");
    }

    /* renamed from: B */
    public void mo49464B(@NonNull String str) {
        m26143y(str, "show-attempt-failed");
    }

    /* renamed from: C */
    public void mo49465C(@NonNull String str) {
        m26143y(str, "show-attempt-success");
    }

    /* renamed from: f */
    public void mo49466f(boolean z) {
        mo49478t(z, mo49473o(z) + 1);
    }

    /* renamed from: g */
    public void mo49467g(@NonNull ContextContainer contextContainer) {
        this.f18815b = contextContainer;
        if (C13621b.m31093g(contextContainer, mo49468j()) && mo49471m() == C12035c.UNTIL_APP_UPDATE) {
            mo49477s((C12035c) null);
        }
        mo49475q(C13621b.m31090d(contextContainer));
        mo49472n(new C12033a(this));
    }

    @NonNull
    /* renamed from: j */
    public String mo49468j() {
        String i = C13636q.m31181b(m26138c()).mo53298i("rating_appVersion", "");
        if (TextUtils.isEmpty(i)) {
            return C13621b.m31090d(this.f18815b);
        }
        return i;
    }

    /* renamed from: k */
    public long mo49469k() {
        return C13636q.m31181b(m26138c()).mo53297h("rating_lastTimeShown", 0);
    }

    /* renamed from: l */
    public double mo49470l() {
        return C13636q.m31181b(m26138c()).mo53295f("rating_lastUserAmount", -1.0d);
    }

    @Nullable
    /* renamed from: m */
    public C12035c mo49471m() {
        return C12035c.m26165a(C13636q.m31181b(m26138c()).mo53298i("rating_deactivatedStatus", ""));
    }

    /* renamed from: n */
    public void mo49472n(@Nullable IListener<Boolean> iListener) {
        this.f18816c.add(iListener);
        ProxyActionsPool proxyActionsPool = this.f18817d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f18817d.executeProxyAction(this, new ProxyBundleInput(this.f18815b, iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null));
    }

    /* renamed from: o */
    public int mo49473o(boolean z) {
        String str;
        if (z) {
            str = "rating_showCountAuto";
        } else {
            str = "rating_showCountClick";
        }
        return C13636q.m31181b(m26138c()).mo53296g(str, 0);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
                m26142i(false);
                return;
            }
            PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
            if (pLPUser == null) {
                m26142i(false);
                return;
            }
            EarningAmount earningAmount = pLPUser.getEarningAmount();
            if (earningAmount == null) {
                m26142i(false);
                return;
            }
            this.f18818e = true;
            double total = earningAmount.getTotal();
            this.f18819f = total;
            this.f18820g = total + earningAmount.getTotalPaid();
            m26142i(m26137b());
        }
    }

    /* renamed from: p */
    public void mo49474p() {
        mo49476r(this.f18819f);
    }

    /* renamed from: q */
    public void mo49475q(@NonNull String str) {
        C13636q.m31181b(m26138c()).mo53303n("rating_appVersion", str);
    }

    /* renamed from: r */
    public void mo49476r(double d) {
        C13636q.m31181b(m26138c()).mo53300k("rating_lastUserAmount", d);
    }

    /* renamed from: s */
    public void mo49477s(@Nullable C12035c cVar) {
        if (cVar == null) {
            C13636q.m31181b(m26138c()).mo53293d("rating_deactivatedStatus");
        } else {
            C13636q.m31181b(m26138c()).mo53303n("rating_deactivatedStatus", cVar.f18825b);
        }
    }

    /* renamed from: t */
    public void mo49478t(boolean z, int i) {
        String str;
        if (z) {
            str = "rating_showCountAuto";
        } else {
            str = "rating_showCountClick";
        }
        C13636q.m31181b(m26138c()).mo53301l(str, i);
    }

    /* renamed from: u */
    public void mo49479u(@NonNull String str) {
        m26143y(str, "close");
    }

    /* renamed from: v */
    public void mo49480v(@NonNull String str) {
        m26143y(str, "open-native-rating");
    }

    /* renamed from: w */
    public void mo49481w(@NonNull String str) {
        m26143y(str, "rate-bad");
    }

    /* renamed from: x */
    public void mo49482x(@NonNull String str) {
        m26143y(str, "rate-good");
    }

    /* renamed from: z */
    public void mo49483z(@NonNull String str) {
        m26143y(str, "redirect-store");
    }
}
