package p051c8;

import com.google.firebase.C6911a;
import com.google.firebase.C6922c;
import java.util.concurrent.atomic.AtomicBoolean;
import p193p7.C9071a;
import p193p7.C9074d;

/* renamed from: c8.n */
/* compiled from: DataCollectionHelper */
public class C3968n {

    /* renamed from: a */
    private C3989q3 f3115a;

    /* renamed from: b */
    private AtomicBoolean f3116b;

    public C3968n(C6922c cVar, C3989q3 q3Var, C9074d dVar) {
        this.f3115a = q3Var;
        this.f3116b = new AtomicBoolean(cVar.mo39771q());
        dVar.mo43285c(C6911a.class, new C3963m(this));
    }

    /* renamed from: c */
    private boolean m4637c() {
        return this.f3115a.mo30012d("firebase_inapp_messaging_auto_data_collection_enabled");
    }

    /* renamed from: d */
    private boolean m4638d() {
        return this.f3115a.mo30013e("auto_init");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m4639e(C9071a aVar) {
        this.f3116b.set(((C6911a) aVar.mo43280a()).f9107a);
    }

    /* renamed from: b */
    public boolean mo29995b() {
        if (m4638d()) {
            return this.f3115a.mo30011c("auto_init", true);
        }
        if (m4637c()) {
            return this.f3115a.mo30010b("firebase_inapp_messaging_auto_data_collection_enabled", true);
        }
        return this.f3116b.get();
    }
}
