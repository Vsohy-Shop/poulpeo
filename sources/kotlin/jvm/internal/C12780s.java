package kotlin.jvm.internal;

import p442uf.C13590b;
import p442uf.C13595g;
import p442uf.C13599j;

/* renamed from: kotlin.jvm.internal.s */
/* compiled from: MutablePropertyReference1 */
public abstract class C12780s extends C12784w implements C13595g {
    public C12780s(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C13590b computeReflected() {
        return C12764h0.m28589e(this);
    }

    public Object getDelegate(Object obj) {
        return ((C13595g) getReflected()).getDelegate(obj);
    }

    public C13599j.C13600a getGetter() {
        ((C13595g) getReflected()).getGetter();
        return null;
    }

    public Object invoke(Object obj) {
        return get(obj);
    }
}
