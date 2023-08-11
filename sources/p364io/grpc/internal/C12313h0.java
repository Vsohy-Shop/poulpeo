package p364io.grpc.internal;

import java.io.InputStream;
import p111h6.C8003j;
import p364io.grpc.C12594t;
import p458xd.C13809k;
import p458xd.C13819p;
import p458xd.C13824r;

/* renamed from: io.grpc.internal.h0 */
/* compiled from: ForwardingClientStream */
abstract class C12313h0 implements C12398q {
    C12313h0() {
    }

    /* renamed from: a */
    public void mo49660a(C12594t tVar) {
        mo49927m().mo49660a(tVar);
    }

    /* renamed from: b */
    public void mo49716b(int i) {
        mo49927m().mo49716b(i);
    }

    /* renamed from: c */
    public void mo49661c(int i) {
        mo49927m().mo49661c(i);
    }

    /* renamed from: d */
    public void mo49662d(int i) {
        mo49927m().mo49662d(i);
    }

    /* renamed from: e */
    public void mo49717e(C13809k kVar) {
        mo49927m().mo49717e(kVar);
    }

    /* renamed from: f */
    public void mo49663f(C13819p pVar) {
        mo49927m().mo49663f(pVar);
    }

    public void flush() {
        mo49927m().flush();
    }

    /* renamed from: g */
    public void mo49719g(String str) {
        mo49927m().mo49719g(str);
    }

    /* renamed from: h */
    public void mo49664h(C12460x0 x0Var) {
        mo49927m().mo49664h(x0Var);
    }

    /* renamed from: i */
    public void mo49665i() {
        mo49927m().mo49665i();
    }

    public boolean isReady() {
        return mo49927m().isReady();
    }

    /* renamed from: j */
    public void mo49667j(C12402r rVar) {
        mo49927m().mo49667j(rVar);
    }

    /* renamed from: k */
    public void mo49720k(InputStream inputStream) {
        mo49927m().mo49720k(inputStream);
    }

    /* renamed from: l */
    public void mo49721l() {
        mo49927m().mo49721l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C12398q mo49927m();

    /* renamed from: n */
    public void mo49669n(C13824r rVar) {
        mo49927m().mo49669n(rVar);
    }

    /* renamed from: o */
    public void mo49670o(boolean z) {
        mo49927m().mo49670o(z);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", mo49927m()).toString();
    }
}
