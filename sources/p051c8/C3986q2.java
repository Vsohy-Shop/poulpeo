package p051c8;

import android.os.Bundle;
import com.google.firebase.C6922c;
import java.util.HashMap;
import java.util.Map;
import p089f8.C7611a;
import p101g8.C7796a;
import p101g8.C7802c;
import p101g8.C7809f;
import p101g8.C7814h;
import p101g8.C7817i;
import p101g8.C7818j;
import p124i8.C8213d;
import p192p6.C9063a;
import p223s7.C9513a;
import p223s7.C9518b;
import p223s7.C9545h0;
import p223s7.C9548i;
import p223s7.C9551j;
import p223s7.C9567t;

/* renamed from: c8.q2 */
/* compiled from: MetricsLoggerClient */
public class C3986q2 {

    /* renamed from: g */
    private static final Map<C9567t.C9569b, C9545h0> f3149g;

    /* renamed from: h */
    private static final Map<C9567t.C9568a, C9548i> f3150h;

    /* renamed from: a */
    private final C3988b f3151a;

    /* renamed from: b */
    private final C6922c f3152b;

    /* renamed from: c */
    private final C8213d f3153c;

    /* renamed from: d */
    private final C7611a f3154d;

    /* renamed from: e */
    private final C9063a f3155e;

    /* renamed from: f */
    private final C3996s f3156f;

    /* renamed from: c8.q2$a */
    /* compiled from: MetricsLoggerClient */
    static /* synthetic */ class C3987a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3157a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.firebase.inappmessaging.model.MessageType[] r0 = com.google.firebase.inappmessaging.model.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3157a = r0
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.CARD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3157a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3157a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3157a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.inappmessaging.model.MessageType r1 = com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051c8.C3986q2.C3987a.<clinit>():void");
        }
    }

    /* renamed from: c8.q2$b */
    /* compiled from: MetricsLoggerClient */
    public interface C3988b {
        /* renamed from: a */
        void mo30008a(byte[] bArr);
    }

    static {
        HashMap hashMap = new HashMap();
        f3149g = hashMap;
        HashMap hashMap2 = new HashMap();
        f3150h = hashMap2;
        hashMap.put(C9567t.C9569b.UNSPECIFIED_RENDER_ERROR, C9545h0.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(C9567t.C9569b.IMAGE_FETCH_ERROR, C9545h0.IMAGE_FETCH_ERROR);
        hashMap.put(C9567t.C9569b.IMAGE_DISPLAY_ERROR, C9545h0.IMAGE_DISPLAY_ERROR);
        hashMap.put(C9567t.C9569b.IMAGE_UNSUPPORTED_FORMAT, C9545h0.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(C9567t.C9568a.AUTO, C9548i.AUTO);
        hashMap2.put(C9567t.C9568a.CLICK, C9548i.CLICK);
        hashMap2.put(C9567t.C9568a.SWIPE, C9548i.SWIPE);
        hashMap2.put(C9567t.C9568a.UNKNOWN_DISMISS_TYPE, C9548i.UNKNOWN_DISMISS_TYPE);
    }

    public C3986q2(C3988b bVar, C9063a aVar, C6922c cVar, C8213d dVar, C7611a aVar2, C3996s sVar) {
        this.f3151a = bVar;
        this.f3155e = aVar;
        this.f3152b = cVar;
        this.f3153c = dVar;
        this.f3154d = aVar2;
        this.f3156f = sVar;
    }

    /* renamed from: f */
    private C9513a.C9515b m4656f(C7817i iVar, String str) {
        return C9513a.m19722T().mo43979F("20.1.1").mo43980H(this.f3152b.mo39769k().mo39786d()).mo43982z(iVar.mo41514a().mo41483a()).mo43975B(C9518b.m19754L().mo43991B(this.f3152b.mo39769k().mo39785c()).mo43992z(str)).mo43976C(this.f3154d.mo41355a());
    }

    /* renamed from: g */
    private C9513a m4657g(C7817i iVar, String str, C9548i iVar2) {
        return (C9513a) m4656f(iVar, str).mo43977D(iVar2).build();
    }

    /* renamed from: h */
    private C9513a m4658h(C7817i iVar, String str, C9551j jVar) {
        return (C9513a) m4656f(iVar, str).mo43978E(jVar).build();
    }

    /* renamed from: i */
    private C9513a m4659i(C7817i iVar, String str, C9545h0 h0Var) {
        return (C9513a) m4656f(iVar, str).mo43981I(h0Var).build();
    }

    /* renamed from: j */
    private boolean m4660j(C7817i iVar) {
        int i = C3987a.f3157a[iVar.mo41515c().ordinal()];
        if (i == 1) {
            C7809f fVar = (C7809f) iVar;
            boolean z = !m4662l(fVar.mo41492i());
            boolean z2 = !m4662l(fVar.mo41493j());
            if (!z || !z2) {
                return false;
            }
            return true;
        } else if (i == 2) {
            return !m4662l(((C7818j) iVar).mo41516e());
        } else {
            if (i == 3) {
                return !m4662l(((C7802c) iVar).mo41464e());
            }
            if (i == 4) {
                return !m4662l(((C7814h) iVar).mo41508e());
            }
            C3961l2.m4603b("Unable to determine if impression should be counted as conversion.");
            return false;
        }
    }

    /* renamed from: k */
    private boolean m4661k(C7817i iVar) {
        return iVar.mo41514a().mo41485c();
    }

    /* renamed from: l */
    private boolean m4662l(C7796a aVar) {
        if (aVar == null || aVar.mo41446b() == null || aVar.mo41446b().isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m4663m(C7817i iVar, C9567t.C9568a aVar, String str) {
        this.f3151a.mo30008a(m4657g(iVar, str, f3150h.get(aVar)).mo40151g());
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m4664n(C7817i iVar, String str) {
        this.f3151a.mo30008a(m4658h(iVar, str, C9551j.IMPRESSION_EVENT_TYPE).mo40151g());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m4665o(C7817i iVar, String str) {
        this.f3151a.mo30008a(m4658h(iVar, str, C9551j.CLICK_EVENT_TYPE).mo40151g());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m4666p(C7817i iVar, C9567t.C9569b bVar, String str) {
        this.f3151a.mo30008a(m4659i(iVar, str, f3149g.get(bVar)).mo40151g());
    }

    /* renamed from: r */
    private void m4667r(C7817i iVar, String str, boolean z) {
        String a = iVar.mo41514a().mo41483a();
        Bundle e = mo30003e(iVar.mo41514a().mo41484b(), a);
        C3961l2.m4602a("Sending event=" + str + " params=" + e);
        C9063a aVar = this.f3155e;
        if (aVar != null) {
            aVar.mo30047c("fiam", str, e);
            if (z) {
                C9063a aVar2 = this.f3155e;
                aVar2.mo30052g("fiam", "_ln", "fiam:" + a);
                return;
            }
            return;
        }
        C3961l2.m4605d("Unable to log event: analytics library is missing");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bundle mo30003e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str);
        try {
            bundle.putInt("_ndt", (int) (this.f3154d.mo41355a() / 1000));
        } catch (NumberFormatException e) {
            C3961l2.m4605d("Error while parsing use_device_time in FIAM event: " + e.getMessage());
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo30004q(C7817i iVar, C9567t.C9568a aVar) {
        if (!m4661k(iVar)) {
            this.f3153c.getId().mo35456g(new C3976o2(this, iVar, aVar));
            m4667r(iVar, "fiam_dismiss", false);
        }
        this.f3156f.mo30023l(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo30005s(C7817i iVar) {
        if (!m4661k(iVar)) {
            this.f3153c.getId().mo35456g(new C3966m2(this, iVar));
            m4667r(iVar, "fiam_impression", m4660j(iVar));
        }
        this.f3156f.mo30021f(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo30006t(C7817i iVar, C7796a aVar) {
        if (!m4661k(iVar)) {
            this.f3153c.getId().mo35456g(new C3971n2(this, iVar));
            m4667r(iVar, "fiam_action", true);
        }
        this.f3156f.mo30022k(iVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo30007u(C7817i iVar, C9567t.C9569b bVar) {
        if (!m4661k(iVar)) {
            this.f3153c.getId().mo35456g(new C3981p2(this, iVar, bVar));
        }
        this.f3156f.mo30020e(iVar, bVar);
    }
}
