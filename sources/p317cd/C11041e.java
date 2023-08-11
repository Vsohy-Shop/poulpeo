package p317cd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p445vc.C13618g;

/* renamed from: cd.e */
/* compiled from: ResetPasswordController */
public class C11041e extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    protected final ProxyActionsPool f17122d = new ProxyActionsPool();

    /* renamed from: e */
    private int f17123e = 0;

    /* renamed from: cd.e$a */
    /* compiled from: ResetPasswordController */
    public static class C11042a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final IProxyMethodType f17124d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final RMNMethodParam f17125e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13399d f17126f;

        public C11042a(@NonNull ContextContainer contextContainer, @NonNull IProxyMethodType iProxyMethodType, @NonNull RMNMethodParam rMNMethodParam, @NonNull C13399d dVar) {
            this(contextContainer, (LogoutListener) null, iProxyMethodType, rMNMethodParam, dVar);
        }

        public C11042a(@NonNull ContextContainer contextContainer, @Nullable LogoutListener logoutListener, @NonNull IProxyMethodType iProxyMethodType, @NonNull RMNMethodParam rMNMethodParam, @NonNull C13399d dVar) {
            super(contextContainer, logoutListener);
            this.f17124d = iProxyMethodType;
            this.f17125e = rMNMethodParam;
            this.f17126f = dVar;
        }
    }

    public C11041e(@Nullable C11043f fVar, @NonNull C11042a aVar) {
        super(fVar, aVar);
    }

    /* renamed from: r2 */
    private void m23805r2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        C11043f n2 = mo46119n2();
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            mo46125z0();
            if (n2 != null) {
                n2.mo46127z0();
                return;
            }
            return;
        }
        String a = C13396a.m30473a(proxyBundleOutput, m23806t2().f17126f, m23806t2().f17126f.mo53009a(C13397b.f21459c, ""));
        mo46118Z(a);
        if (n2 != null) {
            n2.mo46126Z(a);
        }
    }

    @NonNull
    /* renamed from: t2 */
    private C11042a m23806t2() {
        return (C11042a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: n2 */
    public C11043f mo46119n2() {
        return (C11043f) this.f16655b;
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED && proxyBundleInput.getProxyMethod() == m23806t2().f17124d) {
            m23805r2(proxyBundleOutput);
        }
    }

    /* renamed from: p2 */
    public void mo46121p2() {
        this.f17122d.cancelAndRemoveAllActions();
    }

    /* renamed from: u2 */
    public void mo46124u2(@NonNull String str) {
        int i = this.f17123e + 1;
        this.f17123e = i;
        C13618g.f21930b.mo53279c("reset-password", "send", String.valueOf(i));
        this.f17122d.cancelAndRemoveAllActionsWithMethod(m23806t2().f17124d);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), m23806t2().f17124d, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(m23806t2().f17125e, str);
        this.f17122d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: o2 */
    public void mo46120o2() {
    }

    /* renamed from: q2 */
    public void mo46122q2() {
    }

    /* renamed from: s2 */
    public void mo46123s2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo46125z0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo46118Z(@NonNull String str) {
    }
}
