package p051c8;

import android.app.Application;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p089f8.C7611a;
import p268w8.C10146e;
import p341fe.C11945b;
import p341fe.C11953j;

/* renamed from: c8.k */
/* compiled from: CampaignCacheClient */
public class C3953k {

    /* renamed from: a */
    private final C4013u2 f3091a;

    /* renamed from: b */
    private final Application f3092b;

    /* renamed from: c */
    private final C7611a f3093c;

    /* renamed from: d */
    private C10146e f3094d;

    C3953k(C4013u2 u2Var, Application application, C7611a aVar) {
        this.f3091a = u2Var;
        this.f3092b = application;
        this.f3093c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m4585g(C10146e eVar) {
        long L = eVar.mo44742L();
        long a = this.f3093c.mo41355a();
        File file = new File(this.f3092b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (L != 0) {
            if (a < L) {
                return true;
            }
            return false;
        } else if (!file.exists()) {
            return true;
        } else {
            if (a < file.lastModified() + TimeUnit.DAYS.toMillis(1)) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C10146e m4586h() {
        return this.f3094d;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m4587i(C10146e eVar) {
        this.f3094d = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m4588j(Throwable th) {
        this.f3094d = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m4589k(C10146e eVar) {
        this.f3094d = eVar;
    }

    /* renamed from: f */
    public C11953j<C10146e> mo29979f() {
        return C11953j.m25867l(new C3927f(this)).mo49239x(this.f3091a.mo30035e(C10146e.m21381P()).mo49224f(new C3932g(this))).mo49225h(new C3937h(this)).mo49223e(new C3942i(this));
    }

    /* renamed from: l */
    public C11945b mo29980l(C10146e eVar) {
        return this.f3091a.mo30036f(eVar).mo49180g(new C3948j(this, eVar));
    }
}
