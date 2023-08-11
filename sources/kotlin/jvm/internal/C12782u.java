package kotlin.jvm.internal;

import p442uf.C13590b;
import p442uf.C13596h;
import p442uf.C13601k;

/* renamed from: kotlin.jvm.internal.u */
/* compiled from: MutablePropertyReference2 */
public abstract class C12782u extends C12784w implements C13596h {
    public C12782u(Class cls, String str, String str2, int i) {
        super(C12753d.NO_RECEIVER, cls, str, str2, i);
    }

    /* access modifiers changed from: protected */
    public C13590b computeReflected() {
        return C12764h0.m28590f(this);
    }

    public C13601k.C13602a getGetter() {
        ((C13596h) getReflected()).getGetter();
        return null;
    }

    public Object invoke(Object obj, Object obj2) {
        return mo50682k(obj, obj2);
    }
}
