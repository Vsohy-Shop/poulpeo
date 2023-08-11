package kotlin.jvm.internal;

import p442uf.C13590b;
import p442uf.C13599j;

/* renamed from: kotlin.jvm.internal.a0 */
/* compiled from: PropertyReference1 */
public abstract class C12748a0 extends C12752c0 implements C13599j {
    public C12748a0() {
    }

    /* access modifiers changed from: protected */
    public C13590b computeReflected() {
        return C12764h0.m28592h(this);
    }

    public Object getDelegate(Object obj) {
        return ((C13599j) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C12748a0(Object obj) {
        super(obj);
    }

    public C13599j.C13600a getGetter() {
        ((C13599j) getReflected()).getGetter();
        return null;
    }

    public C12748a0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
