package kotlin.jvm.internal;

import java.io.Serializable;
import p442uf.C13592d;

/* renamed from: kotlin.jvm.internal.a */
/* compiled from: AdaptedFunctionReference */
public class C12747a implements C12767j, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    /* access modifiers changed from: protected */
    public final Object receiver;
    private final String signature;

    public C12747a(int i, Class cls, String str, String str2, int i2) {
        this(i, C12753d.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12747a)) {
            return false;
        }
        C12747a aVar = (C12747a) obj;
        if (this.isTopLevel != aVar.isTopLevel || this.arity != aVar.arity || this.flags != aVar.flags || !C12775o.m28634d(this.receiver, aVar.receiver) || !C12775o.m28634d(this.owner, aVar.owner) || !this.name.equals(aVar.name) || !this.signature.equals(aVar.signature)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return this.arity;
    }

    public C13592d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C12764h0.m28587c(cls);
        }
        return C12764h0.m28586b(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int hashCode = (((((i4 + i3) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return C12764h0.m28593i(this);
    }

    public C12747a(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
