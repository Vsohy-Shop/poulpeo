package p381lb;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsSupportTicket;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketHelp;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;
import p440ud.C13548a;
import p440ud.C13574r;
import p446vd.C13630k;

/* renamed from: lb.g */
/* compiled from: SupportTicketHelpController */
public class C12804g extends C10865d {

    /* renamed from: lb.g$a */
    /* compiled from: SupportTicketHelpController */
    class C12805a implements C13574r.C13576b {
        C12805a() {
        }

        /* renamed from: E */
        public void mo49068E(C13574r rVar) {
            C12804g.this.m28707o2().mo46508Z0(C13630k.m31138c("https://www.poulpeo.com/support.htm?a=new"));
        }
    }

    /* renamed from: lb.g$b */
    /* compiled from: SupportTicketHelpController */
    class C12806b implements ICacheListenerGet {
        C12806b() {
        }

        public void onCacheActionGetExecuted(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
            SupportTicketHelp supportTicketHelp;
            RMNResponseObjectImmutable retrievedCachedObject = cacheBundleOutput.getRetrievedCachedObject(PLPMethodReturns.SUPPORT_TICKET_HELP);
            if (retrievedCachedObject != null && (supportTicketHelp = (SupportTicketHelp) retrievedCachedObject.getRetrievedObject()) != null && supportTicketHelp.getHelp() != null) {
                C12804g.this.m28707o2().mo46509l1(supportTicketHelp);
            }
        }
    }

    /* renamed from: lb.g$c */
    /* compiled from: SupportTicketHelpController */
    public static class C12807c extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public C13548a f20473d;

        public C12807c(@NonNull ContextContainer contextContainer, @NonNull C13548a aVar) {
            super(contextContainer);
            this.f20473d = aVar;
        }
    }

    public C12804g(@NonNull C12808h hVar, @NonNull C12807c cVar) {
        super(hVar, cVar);
        cVar.f20473d.mo53229f(new C12805a());
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: o2 */
    public C12808h m28707o2() {
        return (C12808h) this.f16655b;
    }

    /* renamed from: p2 */
    public void mo50706p2() {
        CacheBundleInputGet cacheBundleInputGet = new CacheBundleInputGet(mo45820l2(), CacheMethodsSupportTicket.SUPPORT_TICKET_HELP_GET_DETAILS);
        cacheBundleInputGet.getMethodType().getCache(mo45820l2()).executeCacheActionGet(new C12806b(), cacheBundleInputGet);
    }

    /* renamed from: q2 */
    public void mo50707q2() {
    }

    /* renamed from: r2 */
    public void mo50708r2() {
    }

    /* renamed from: s2 */
    public void mo50709s2() {
    }
}
