package p357ia;

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
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p305ad.C10865d;
import p382lc.C12822d;
import p446vd.C13621b;
import p446vd.C13629j;

/* renamed from: ia.a */
/* compiled from: AccountController */
public class C12104a extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f18951d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    private final SimpleDateFormat f18952e = C13629j.m31131a("dd MMM yyyy");
    @Nullable

    /* renamed from: f */
    private AndroidOsHandler f18953f;

    /* renamed from: g */
    private boolean f18954g;

    /* renamed from: h */
    private boolean f18955h;

    /* renamed from: ia.a$a */
    /* compiled from: AccountController */
    class C12105a implements C12822d {
        C12105a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            C12104a.this.m26329o2().mo46316Q0();
            return false;
        }
    }

    /* renamed from: ia.a$b */
    /* compiled from: AccountController */
    public static class C12106b extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final boolean f18957d;

        public C12106b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, boolean z) {
            super(contextContainer, logoutListener);
            this.f18957d = z;
        }
    }

    public C12104a(@NonNull C12107b bVar, @NonNull C12106b bVar2) {
        super(bVar, bVar2);
        this.f18955h = bVar2.f18957d;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: o2 */
    public C12107b m26329o2() {
        return (C12107b) this.f16655b;
    }

    /* renamed from: p2 */
    private void m26330p2(ProxyBundleInput.ProxySourcesOption proxySourcesOption) {
        ProxyActionsPool proxyActionsPool = this.f18951d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f18951d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
    }

    /* renamed from: u2 */
    private void m26331u2(ProxyBundleOutput proxyBundleOutput) {
        String str;
        double d;
        String str2;
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            this.f18954g = false;
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        if (pLPUser == null) {
            this.f18954g = false;
            return;
        }
        if (pLPUser.getDateAdd() != null) {
            str = this.f18952e.format(pLPUser.getDateAdd());
        } else {
            str = " - ";
        }
        String str3 = str;
        EarningAmount earningAmount = pLPUser.getEarningAmount();
        if (earningAmount != null) {
            d = earningAmount.getTotalPaid() + earningAmount.getTotal();
        } else {
            d = 0.0d;
        }
        C12107b o2 = m26329o2();
        String initials = pLPUser.getInitials();
        String completeName = pLPUser.getCompleteName();
        String email = pLPUser.getEmail();
        if (d > 0.0d) {
            str2 = String.format(Locale.FRANCE, "%.2f€", new Object[]{Double.valueOf(d)});
        } else {
            str2 = "";
        }
        o2.mo46314H1(pLPUser, initials, completeName, email, str3, str2, pLPUser.getGrade(), this.f18954g);
        this.f18954g = false;
    }

    /* renamed from: v2 */
    private void m26332v2(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            AndroidOsHandler androidOsHandler = this.f18953f;
            if (androidOsHandler != null) {
                androidOsHandler.mo47874i(0);
                this.f18953f = null;
            }
            m26329o2().mo46322x();
            mo45821m2().onLogout(false);
        }
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        IProxyMethodType methodType = proxyBundleOutput.getMethodType();
        if (methodType == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            m26331u2(proxyBundleOutput);
        } else if (methodType == ProxyMethodsPLPUser.PLP_USER_LOGOUT) {
            m26332v2(proxyBundleOutput);
        }
    }

    /* renamed from: q2 */
    public void mo49546q2() {
        m26329o2().mo46312B1(C13621b.m31090d(mo45820l2()));
    }

    /* renamed from: r2 */
    public void mo49547r2() {
        this.f18951d.cancelAndRemoveAllActions();
    }

    /* renamed from: t2 */
    public void mo49549t2() {
        ProxyBundleInput.ProxySourcesOption proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK;
        if (this.f18955h) {
            proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE;
            this.f18955h = false;
        }
        m26330p2(proxySourcesOption);
    }

    /* renamed from: w2 */
    public void mo49550w2(boolean z) {
        this.f18954g = z;
        m26330p2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK);
    }

    /* renamed from: x2 */
    public void mo49551x2(boolean z) {
        this.f18954g = z;
        m26330p2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE);
    }

    /* renamed from: y2 */
    public void mo49552y2() {
        m26329o2().mo46319h1();
        AndroidOsHandler androidOsHandler = this.f18953f;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
        }
        AndroidOsHandler androidOsHandler2 = new AndroidOsHandler((C12822d) new C12105a());
        this.f18953f = androidOsHandler2;
        androidOsHandler2.mo47875j(0, 200);
        this.f18951d.cancelAndRemoveAllActions();
        this.f18951d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_LOGOUT, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null));
    }

    /* renamed from: s2 */
    public void mo49548s2() {
    }
}
