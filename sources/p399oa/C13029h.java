package p399oa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyCall;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.methods.PageApi;
import com.rmn.apiclient.impl.api.models.Page;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionJumbotron;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.ArrayList;
import java.util.List;
import p258v9.C10056a;
import p258v9.C10057b;
import p258v9.C10058c;
import p305ad.C10861a;
import p311bd.C10930a;
import p446vd.C13633n;

/* renamed from: oa.h */
/* compiled from: PageController */
public class C13029h extends C10861a {
    @NonNull

    /* renamed from: f */
    private final CallManager f20827f = new CallManager(mo45820l2());

    /* renamed from: oa.h$a */
    /* compiled from: PageController */
    public static class C13030a extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f20828f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C10058c f20829g;

        public C13030a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str, @NonNull C10058c cVar2) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f20828f = str;
            this.f20829g = cVar2;
        }
    }

    public C13029h(@NonNull C13031i iVar, @NonNull C13030a aVar) {
        super(iVar, aVar);
    }

    /* renamed from: B2 */
    private void m29410B2(StrategyChain strategyChain) {
        m29417z2(m29413G2().f20828f, strategyChain, this.f20827f).onFailure(new C13027f(this)).onSuccess(new C13028g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m29411C2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        m29414d();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void m29412D2(ProxyOutput proxyOutput) {
        if (proxyOutput.hasDocument()) {
            m29413G2().f20829g.mo44642d();
            List<BasePageSection> components = ((Page) proxyOutput.getDocument().optFirstModel()).getComponents();
            mo50934F2(components);
            mo45811n2().mo45965m2(components, 0, components.size());
            return;
        }
        m29414d();
    }

    @NonNull
    /* renamed from: G2 */
    private C13030a m29413G2() {
        return (C13030a) this.f16656c;
    }

    /* renamed from: d */
    private void m29414d() {
        ArrayList arrayList = new ArrayList();
        mo50933E2(arrayList);
        mo45811n2().mo45965m2(arrayList, 0, arrayList.size());
    }

    @NonNull
    /* renamed from: z2 */
    public static ProxyCall m29417z2(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain, @NonNull CallManager callManager) {
        callManager.cancelAllForMethod(PageApi.GetPage.DESCRIPTOR);
        return new PageApi.GetPage(str, strategyChain).call(callManager);
    }

    @NonNull
    /* renamed from: A2 */
    public CallManager mo50943A2() {
        return this.f20827f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public void mo50934F2(List<Object> list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof PageSectionJumbotron) {
                list.add(1, new C10057b());
            } else {
                list.add(0, new C10057b());
            }
        }
    }

    /* renamed from: H2 */
    public void mo50944H2() {
        mo45811n2().mo45951I2();
        mo45811n2().mo45956N2();
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        m29410B2(ProxyStrategy.callService().thenAddInCache());
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        if (obj instanceof C10056a) {
            mo50944H2();
        }
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        m29410B2(ProxyStrategy.getFromCache().orThenCallService().thenAddInCache());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        m29410B2(ProxyStrategy.getFromCache().orThenCallService().thenAddInCache());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        mo45811n2().mo45962T2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public void mo45815r2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo45817t2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public void mo50933E2(List<Object> list) {
    }

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }
}
