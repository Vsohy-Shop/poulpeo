package p343fg;

import java.util.concurrent.Executor;
import p355hf.C12079g;
import p466yf.C14006n1;

/* renamed from: fg.f */
/* compiled from: Dispatcher.kt */
public class C11996f extends C14006n1 {

    /* renamed from: c */
    private final int f18745c;

    /* renamed from: d */
    private final int f18746d;

    /* renamed from: e */
    private final long f18747e;

    /* renamed from: f */
    private final String f18748f;

    /* renamed from: g */
    private C11987a f18749g = m26059u0();

    public C11996f(int i, int i2, long j, String str) {
        this.f18745c = i;
        this.f18746d = i2;
        this.f18747e = j;
        this.f18748f = str;
    }

    /* renamed from: u0 */
    private final C11987a m26059u0() {
        return new C11987a(this.f18745c, this.f18746d, this.f18747e, this.f18748f);
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        C11987a.m26015O(this.f18749g, runnable, (C11999i) null, false, 6, (Object) null);
    }

    public void dispatchYield(C12079g gVar, Runnable runnable) {
        C11987a.m26015O(this.f18749g, runnable, (C11999i) null, true, 2, (Object) null);
    }

    /* renamed from: t0 */
    public Executor mo49424t0() {
        return this.f18749g;
    }

    /* renamed from: v0 */
    public final void mo49427v0(Runnable runnable, C11999i iVar, boolean z) {
        this.f18749g.mo49403G(runnable, iVar, z);
    }
}
