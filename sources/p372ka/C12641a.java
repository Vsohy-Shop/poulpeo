package p372ka;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p114h9.C8031a;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;

/* renamed from: ka.a */
/* compiled from: CommentController */
public class C12641a extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20311d = new ProxyActionsPool();

    /* renamed from: ka.a$a */
    /* compiled from: CommentController */
    public static class C12642a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20312d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f20313e;

        public C12642a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull String str) {
            super(contextContainer, logoutListener);
            this.f20312d = dVar;
            this.f20313e = str;
        }
    }

    public C12641a(@NonNull C12643b bVar, @NonNull C12642a aVar) {
        super(bVar, aVar);
    }

    @NonNull
    /* renamed from: o2 */
    private C12643b m28100o2() {
        return (C12643b) this.f16655b;
    }

    @NonNull
    /* renamed from: t2 */
    private C12642a m28101t2() {
        return (C12642a) this.f16656c;
    }

    /* renamed from: n2 */
    public void mo50392n2() {
        this.f20311d.cancelAndRemoveAllActions();
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            if (status != ProxyBundleOutput.ProxyOutputStatus.OK) {
                m28100o2().mo50338W0(C13396a.m30473a(proxyBundleOutput, m28101t2().f20312d, m28101t2().f20312d.mo53009a(C13397b.f21459c, (String) null)));
                return;
            }
            m28100o2().mo46480r0();
        }
    }

    /* renamed from: q2 */
    public void mo50394q2() {
        this.f20311d.cancelAndRemoveAllActions();
    }

    /* renamed from: u2 */
    public void mo50397u2(String str) {
        this.f20311d.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_SUGGEST, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.SUGGESTION, str);
        String j = new C8031a(mo45820l2()).mo41861j(getClass());
        if (!TextUtils.isEmpty(j)) {
            proxyBundleInput.addParamValue(PLPMethodParameters.OPEN_DATA, j);
        }
        proxyBundleInput.addParamValue(PLPMethodParameters.USER_SUGGEST_SOURCE, m28101t2().f20313e);
        this.f20311d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: p2 */
    public void mo50393p2() {
    }

    /* renamed from: r2 */
    public void mo50395r2() {
    }

    /* renamed from: s2 */
    public void mo50396s2() {
    }
}
