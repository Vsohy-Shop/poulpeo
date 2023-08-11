package p466yf;

import kotlin.jvm.functions.Function1;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: yf.a */
/* compiled from: AbstractCoroutine.kt */
public abstract class C13926a<T> extends C13956f2 implements C12074d<T>, C13995l0 {

    /* renamed from: d */
    private final C12079g f22840d;

    public C13926a(C12079g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo53709Z((C14054y1) gVar.get(C14054y1.f22970b0));
        }
        this.f22840d = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo53664C() {
        return C14015p0.m32518a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo48980H0(Object obj) {
        mo48982t(obj);
    }

    /* renamed from: K0 */
    public final <R> void mo53665K0(C14004n0 n0Var, R r, C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar) {
        n0Var.mo53783b(oVar, r, this);
    }

    /* renamed from: W */
    public final void mo53666W(Throwable th) {
        C13986j0.m32424a(this.f22840d, th);
    }

    /* renamed from: a */
    public boolean mo45937a() {
        return super.mo45937a();
    }

    public final C12079g getContext() {
        return this.f22840d;
    }

    public C12079g getCoroutineContext() {
        return this.f22840d;
    }

    /* renamed from: l0 */
    public String mo53667l0() {
        String b = C13964g0.m32353b(this.f22840d);
        if (b == null) {
            return super.mo53667l0();
        }
        return '\"' + b + "\":" + super.mo53667l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final void mo53668r0(Object obj) {
        if (obj instanceof C13932b0) {
            C13932b0 b0Var = (C13932b0) obj;
            mo45934I0(b0Var.f22850a, b0Var.mo53681a());
            return;
        }
        mo45935J0(obj);
    }

    public final void resumeWith(Object obj) {
        Object h0 = mo53715h0(C13948e0.m32253d(obj, (Function1) null, 1, (Object) null));
        if (h0 != C13969g2.f22896b) {
            mo48980H0(h0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo45935J0(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo45934I0(Throwable th, boolean z) {
    }
}
