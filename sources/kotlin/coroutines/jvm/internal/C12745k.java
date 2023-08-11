package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12767j;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: kotlin.coroutines.jvm.internal.k */
/* compiled from: ContinuationImpl.kt */
public abstract class C12745k extends C12744j implements C12767j<Object> {
    private final int arity;

    public C12745k(int i, C12074d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String i = C12764h0.m28593i(this);
        C12775o.m28638h(i, "renderLambdaToString(this)");
        return i;
    }

    public C12745k(int i) {
        this(i, (C12074d<Object>) null);
    }
}
