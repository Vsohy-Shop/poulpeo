package p375kd;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import p305ad.C10865d;
import p382lc.C12822d;
import p440ud.C13548a;
import p440ud.C13574r;

/* renamed from: kd.a */
/* compiled from: BaseTermsConsentController */
public abstract class C12652a extends C10865d implements C13574r.C13576b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AndroidOsHandler f20326d;

    /* renamed from: kd.a$a */
    /* compiled from: BaseTermsConsentController */
    class C12653a implements C12822d {
        C12653a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            C12652a.this.m28146p2().mo46204i();
            return false;
        }
    }

    /* renamed from: kd.a$b */
    /* compiled from: BaseTermsConsentController */
    class C12654b implements IProxyListener {
        C12654b() {
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            boolean z = false;
            C12652a.this.f20326d.mo47874i(0);
            C12652a.this.m28146p2().mo46205r();
            if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.ERROR && proxyBundleOutput.getErrorCode() == 1101) {
                z = true;
            }
            C12652a.this.m28146p2().mo46203L0(z);
        }
    }

    /* renamed from: kd.a$c */
    /* compiled from: BaseTermsConsentController */
    public static class C12655c extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f20329d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C13548a f20330e;

        public C12655c(@NonNull ContextContainer contextContainer, int i, @NonNull C13548a aVar) {
            super(contextContainer);
            this.f20329d = i;
            this.f20330e = aVar;
        }
    }

    public C12652a(@NonNull C12656b bVar, @NonNull C12655c cVar) {
        super(bVar, cVar);
        cVar.f20330e.mo53229f(this);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: p2 */
    public C12656b m28146p2() {
        return (C12656b) this.f16655b;
    }

    @NonNull
    /* renamed from: t2 */
    private C12655c m28147t2() {
        return (C12655c) this.f16656c;
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        if (rVar == m28147t2().f20330e) {
            m28147t2().f20330e.mo53247e(false);
            AndroidOsHandler androidOsHandler = new AndroidOsHandler((C12822d) new C12653a());
            this.f20326d = androidOsHandler;
            androidOsHandler.mo47875j(0, 700);
            mo50399q2().executeProxyAction(new C12654b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public abstract ProxyBundleInput mo50399q2();

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public int mo50400r2() {
        return m28147t2().f20329d;
    }

    /* renamed from: s2 */
    public void mo50401s2() {
    }
}
