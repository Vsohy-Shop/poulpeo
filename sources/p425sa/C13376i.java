package p425sa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p305ad.C10864c;
import p305ad.C10865d;
import p382lc.C12823e;
import p440ud.C13558g;
import p440ud.C13566l;
import p440ud.C13572p;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13633n;

/* renamed from: sa.i */
/* compiled from: MarketingEventsController */
public class C13376i extends C10865d {

    /* renamed from: d */
    private final CallManager f21430d = new CallManager(mo45820l2());

    /* renamed from: e */
    private boolean f21431e = false;

    /* renamed from: f */
    private boolean f21432f = false;

    /* renamed from: sa.i$a */
    /* compiled from: MarketingEventsController */
    public static class C13377a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13558g f21433d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f21434e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f21435f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final String f21436g;
        @NonNull

        /* renamed from: h */
        private final C13574r f21437h;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: i */
        public final C13572p f21438i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13572p f21439j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13572p f21440k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13566l f21441l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final ResourceStringWrapper f21442m;

        public C13377a(@NonNull ContextContainer contextContainer, @NonNull String str, boolean z, @NonNull String str2, @NonNull C13558g gVar, @NonNull C13574r rVar, @Nullable C13572p pVar, @NonNull C13572p pVar2, @NonNull C13572p pVar3, @NonNull C13566l lVar, @NonNull ResourceStringWrapper resourceStringWrapper) {
            super(contextContainer);
            this.f21433d = gVar;
            this.f21434e = str;
            this.f21435f = z;
            this.f21436g = str2;
            this.f21437h = rVar;
            this.f21438i = pVar;
            this.f21439j = pVar2;
            this.f21440k = pVar3;
            this.f21441l = lVar;
            this.f21442m = resourceStringWrapper;
        }
    }

    public C13376i(@Nullable C10864c cVar, @NonNull C13377a aVar) {
        super(cVar, aVar);
    }

    @NonNull
    /* renamed from: A2 */
    private C13377a m30421A2() {
        return (C13377a) this.f16656c;
    }

    /* renamed from: B2 */
    private void m30422B2() {
        C12823e eVar = new C12823e(m30421A2().f21441l);
        eVar.mo50725c(new C13373f(this, eVar, TimeModel.ZERO_LEADING_NUMBER_FORMAT), 0, 1000);
    }

    /* renamed from: d */
    private void m30423d() {
        m30421A2().f21433d.mo53205l();
        if (!this.f21431e && !this.f21432f) {
            this.f21432f = true;
            m30428r2().mo52990J1();
        }
    }

    @NonNull
    /* renamed from: q2 */
    private static Map<TimeUnit, Long> m30427q2(@NonNull Date date, @NonNull Date date2) {
        long time = date2.getTime() - date.getTime();
        ArrayList<TimeUnit> arrayList = new ArrayList<>(EnumSet.allOf(TimeUnit.class));
        Collections.reverse(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TimeUnit timeUnit : arrayList) {
            long convert = timeUnit.convert(time, TimeUnit.MILLISECONDS);
            time -= timeUnit.toMillis(convert);
            linkedHashMap.put(timeUnit, Long.valueOf(convert));
        }
        return linkedHashMap;
    }

    @NonNull
    /* renamed from: r2 */
    private C13378j m30428r2() {
        return (C13378j) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m30429t2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        m30423d();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m30430u2(ProxyOutput proxyOutput) {
        m30421A2().f21433d.mo53205l();
        try {
            Collection<IModel> optModels = proxyOutput.getDocument().optModels();
            ArrayList arrayList = new ArrayList();
            for (IModel iModel : optModels) {
                if (iModel instanceof Merchant) {
                    Merchant merchant = (Merchant) iModel;
                    if (m30428r2().mo46334U(merchant)) {
                        arrayList.add(merchant);
                    }
                }
            }
            m30428r2().mo52993g2(arrayList);
        } catch (Exception e) {
            C13633n.m31150f(this, "ERROR", e);
            m30423d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void m30431v2(C12823e eVar, String str) {
        Calendar instance = Calendar.getInstance();
        if (instance.get(7) != 5 || instance.get(11) < 17) {
            C13572p h = m30421A2().f21439j;
            C13573q qVar = C13573q.INVISIBLE;
            h.mo53230g(qVar);
            m30421A2().f21440k.mo53230g(qVar);
            m30428r2().mo52994z();
            this.f21431e = true;
            eVar.mo50723a();
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 24);
        instance2.set(12, 0);
        instance2.set(13, 0);
        Map<TimeUnit, Long> q2 = m30427q2(instance.getTime(), instance2.getTime());
        Long l = q2.get(TimeUnit.HOURS);
        Objects.requireNonNull(l);
        Long l2 = q2.get(TimeUnit.MINUTES);
        Objects.requireNonNull(l2);
        Long l3 = q2.get(TimeUnit.SECONDS);
        Objects.requireNonNull(l3);
        m30421A2().f21440k.mo53241l(m30421A2().f21442m.mo47913b(mo45820l2(), String.valueOf(l), String.format(str, new Object[]{l2}), String.format(str, new Object[]{l3})));
    }

    /* renamed from: s2 */
    public void mo52995s2() {
        this.f21432f = false;
        m30421A2().f21433d.mo53203j();
        this.f21430d.cancelAllForMethod(ContainerApi.GetContainerContent.DESCRIPTOR);
        ((ContainerApi.GetContainerContent) new ContainerApi.GetContainerContent(m30421A2().f21434e, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f21430d).onFailure(new C13374g(this)).onSuccess(new C13375h(this));
    }

    /* renamed from: w2 */
    public void mo52996w2() {
        if (m30421A2().f21435f) {
            m30422B2();
        } else {
            if (m30421A2().f21438i != null) {
                m30421A2().f21438i.mo53248h(false);
            }
            C13572p h = m30421A2().f21439j;
            C13573q qVar = C13573q.INVISIBLE;
            h.mo53230g(qVar);
            m30421A2().f21440k.mo53230g(qVar);
        }
        mo52995s2();
    }

    /* renamed from: z2 */
    public void mo52999z2() {
        C13618g.f21930b.mo53280e(new C13616e(m30421A2().f21436g, C13617f.MERCHANT_LIST));
    }

    /* renamed from: x2 */
    public void mo52997x2() {
    }

    /* renamed from: y2 */
    public void mo52998y2() {
    }
}
