package kotlin.jvm.internal;

import p442uf.C13590b;
import p442uf.C13593e;

/* renamed from: kotlin.jvm.internal.k */
/* compiled from: FunctionReference */
public class C12769k extends C12753d implements C12767j, C13593e {
    private final int arity;
    private final int flags;

    public C12769k(int i) {
        this(i, C12753d.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C13590b computeReflected() {
        return C12764h0.m28585a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12769k) {
            C12769k kVar = (C12769k) obj;
            if (!getName().equals(kVar.getName()) || !getSignature().equals(kVar.getSignature()) || this.flags != kVar.flags || this.arity != kVar.arity || !C12775o.m28634d(getBoundReceiver(), kVar.getBoundReceiver()) || !C12775o.m28634d(getOwner(), kVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C13593e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C13590b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C12769k(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C13593e getReflected() {
        return (C13593e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12769k(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
