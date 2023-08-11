package p466yf;

import p331dg.C11847o;

/* renamed from: yf.j2 */
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class C13988j2 extends C13971h0 {
    public C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        return this;
    }

    /* renamed from: t0 */
    public abstract C13988j2 mo49059t0();

    public String toString() {
        String u0 = mo53773u0();
        if (u0 != null) {
            return u0;
        }
        return C14015p0.m32518a(this) + '@' + C14015p0.m32519b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final String mo53773u0() {
        C13988j2 j2Var;
        C13988j2 c = C13933b1.m32212c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            j2Var = c.mo49059t0();
        } catch (UnsupportedOperationException unused) {
            j2Var = null;
        }
        if (this == j2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
