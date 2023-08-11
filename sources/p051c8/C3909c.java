package p051c8;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import p192p6.C9063a;
import p223s7.C9543h;
import p257v8.C10050c;
import p268w8.C10146e;
import p341fe.C11944a;
import p341fe.C11949f;
import p341fe.C11950g;
import p341fe.C11951h;
import p376ke.C12657a;

/* renamed from: c8.c */
/* compiled from: AnalyticsEventsManager */
public class C3909c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9063a f3002a;

    /* renamed from: b */
    private final C12657a<String> f3003b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9063a.C9064a f3004c;

    /* renamed from: c8.c$a */
    /* compiled from: AnalyticsEventsManager */
    private class C3910a implements C11951h<String> {
        C3910a() {
        }

        /* renamed from: a */
        public void mo29958a(C11950g<String> gVar) {
            C3961l2.m4602a("Subscribing to analytics events.");
            C3909c cVar = C3909c.this;
            C9063a.C9064a unused = cVar.f3004c = cVar.f3002a.mo30051f("fiam", new C3943i0(gVar));
        }
    }

    public C3909c(C9063a aVar) {
        this.f3002a = aVar;
        C12657a<String> C = C11949f.m25826e(new C3910a(), C11944a.BUFFER).mo49194C();
        this.f3003b = C;
        C.mo50402K();
    }

    /* renamed from: c */
    static Set<String> m4441c(C10146e eVar) {
        HashSet hashSet = new HashSet();
        for (C10050c R : eVar.mo44743M()) {
            for (C9543h next : R.mo44633R()) {
                if (!TextUtils.isEmpty(next.mo44033J().mo44011K())) {
                    hashSet.add(next.mo44033J().mo44011K());
                }
            }
        }
        if (hashSet.size() > 50) {
            C3961l2.m4604c("Too many contextual triggers defined - limiting to 50");
        }
        return hashSet;
    }

    /* renamed from: d */
    public C12657a<String> mo29956d() {
        return this.f3003b;
    }

    /* renamed from: e */
    public void mo29957e(C10146e eVar) {
        Set<String> c = m4441c(eVar);
        C3961l2.m4602a("Updating contextual triggers for the following analytics events: " + c);
        this.f3004c.mo30053a(c);
    }
}
