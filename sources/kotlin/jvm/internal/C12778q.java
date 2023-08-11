package kotlin.jvm.internal;

import p442uf.C13590b;
import p442uf.C13594f;
import p442uf.C13597i;

/* renamed from: kotlin.jvm.internal.q */
/* compiled from: MutablePropertyReference0 */
public abstract class C12778q extends C12784w implements C13594f {
    public C12778q(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C13590b computeReflected() {
        return C12764h0.m28588d(this);
    }

    public C13597i.C13598a getGetter() {
        ((C13594f) getReflected()).getGetter();
        return null;
    }

    public Object invoke() {
        return get();
    }
}
