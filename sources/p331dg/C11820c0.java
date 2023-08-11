package p331dg;

import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13926a;
import p466yf.C13948e0;

/* renamed from: dg.c0 */
/* compiled from: Scopes.kt */
public class C11820c0<T> extends C13926a<T> implements C12738e {

    /* renamed from: e */
    public final C12074d<T> f18464e;

    public C11820c0(C12079g gVar, C12074d<? super T> dVar) {
        super(gVar, true, true);
        this.f18464e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo48980H0(Object obj) {
        C12074d<T> dVar = this.f18464e;
        dVar.resumeWith(C13948e0.m32250a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final boolean mo48981b0() {
        return true;
    }

    public final C12738e getCallerFrame() {
        C12074d<T> dVar = this.f18464e;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo48982t(Object obj) {
        C11833j.m25483c(C12147c.m26491b(this.f18464e), C13948e0.m32250a(obj, this.f18464e), (Function1) null, 2, (Object) null);
    }
}
