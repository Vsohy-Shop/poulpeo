package p466yf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* renamed from: yf.a2 */
/* compiled from: JobSupport.kt */
public class C13929a2 extends C13956f2 implements C14058z {

    /* renamed from: d */
    private final boolean f22847d = m32204H0();

    public C13929a2(C14054y1 y1Var) {
        super(true);
        mo53709Z(y1Var);
    }

    /* renamed from: H0 */
    private final boolean m32204H0() {
        C14034u uVar;
        C13956f2 t;
        C14034u uVar2;
        C14030t S = mo53706S();
        if (S instanceof C14034u) {
            uVar = (C14034u) S;
        } else {
            uVar = null;
        }
        if (!(uVar == null || (t = uVar.mo53695t()) == null)) {
            while (!t.mo53677M()) {
                C14030t S2 = t.mo53706S();
                if (S2 instanceof C14034u) {
                    uVar2 = (C14034u) S2;
                } else {
                    uVar2 = null;
                }
                if (uVar2 != null) {
                    t = uVar2.mo53695t();
                    if (t == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public boolean mo53677M() {
        return this.f22847d;
    }

    /* renamed from: N */
    public boolean mo53678N() {
        return true;
    }

    /* renamed from: V */
    public boolean mo53679V(Throwable th) {
        return mo53712g0(new C13932b0(th, false, 2, (DefaultConstructorMarker) null));
    }

    public boolean complete() {
        return mo53712g0(C11921v.f18618a);
    }
}
