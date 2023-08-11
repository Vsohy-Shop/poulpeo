package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.p */
/* compiled from: Lambda.kt */
public abstract class C12777p<R> implements C12767j<R>, Serializable {
    private final int arity;

    public C12777p(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j = C12764h0.m28594j(this);
        C12775o.m28638h(j, "renderLambdaToString(this)");
        return j;
    }
}
