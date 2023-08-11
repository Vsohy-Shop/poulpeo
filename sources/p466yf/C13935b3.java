package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11820c0;
import p331dg.C11836k0;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,311:1\n1#2:312\n107#3,13:313\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:313,13\n*E\n"})
/* renamed from: yf.b3 */
/* compiled from: CoroutineContext.kt */
public final class C13935b3<T> extends C11820c0<T> {

    /* renamed from: f */
    private final ThreadLocal<C11906l<C12079g, Object>> f22855f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13935b3(p355hf.C12079g r3, p355hf.C12074d<? super T> r4) {
        /*
            r2 = this;
            yf.c3 r0 = p466yf.C13940c3.f22859b
            hf.g$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            hf.g r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f22855f = r0
            hf.g r4 = r4.getContext()
            hf.e$b r0 = p355hf.C12075e.f18913W
            hf.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof p466yf.C13971h0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = p331dg.C11836k0.m25499c(r3, r4)
            p331dg.C11836k0.m25497a(r3, r4)
            r2.mo53685M0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13935b3.<init>(hf.g, hf.d):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo48980H0(Object obj) {
        if (this.threadLocalIsSet) {
            C11906l lVar = this.f22855f.get();
            if (lVar != null) {
                C11836k0.m25497a((C12079g) lVar.mo49109a(), lVar.mo49110b());
            }
            this.f22855f.remove();
        }
        Object a = C13948e0.m32250a(obj, this.f18464e);
        C12074d<T> dVar = this.f18464e;
        C12079g context = dVar.getContext();
        C13935b3<?> b3Var = null;
        Object c = C11836k0.m25499c(context, b3Var);
        if (c != C11836k0.f18485a) {
            b3Var = C13964g0.m32358g(dVar, context, c);
        }
        try {
            this.f18464e.resumeWith(a);
            C11921v vVar = C11921v.f18618a;
        } finally {
            if (b3Var == null || b3Var.mo53684L0()) {
                C11836k0.m25497a(context, c);
            }
        }
    }

    /* renamed from: L0 */
    public final boolean mo53684L0() {
        boolean z;
        if (!this.threadLocalIsSet || this.f22855f.get() != null) {
            z = false;
        } else {
            z = true;
        }
        this.f22855f.remove();
        return !z;
    }

    /* renamed from: M0 */
    public final void mo53685M0(C12079g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f22855f.set(C11915r.m25707a(gVar, obj));
    }
}
