package p466yf;

import kotlin.jvm.internal.C12775o;

/* renamed from: yf.e2 */
/* compiled from: JobSupport.kt */
public abstract class C13950e2 extends C13942d0 implements C13943d1, C14028s1 {

    /* renamed from: e */
    public C13956f2 f22865e;

    /* renamed from: a */
    public boolean mo53693a() {
        return true;
    }

    /* renamed from: c */
    public C13993k2 mo53694c() {
        return null;
    }

    public void dispose() {
        mo53695t().mo53724v0(this);
    }

    /* renamed from: t */
    public final C13956f2 mo53695t() {
        C13956f2 f2Var = this.f22865e;
        if (f2Var != null) {
            return f2Var;
        }
        C12775o.m28656z("job");
        return null;
    }

    public String toString() {
        return C14015p0.m32518a(this) + '@' + C14015p0.m32519b(this) + "[job@" + C14015p0.m32519b(mo53695t()) + ']';
    }

    /* renamed from: u */
    public final void mo53696u(C13956f2 f2Var) {
        this.f22865e = f2Var;
    }
}
