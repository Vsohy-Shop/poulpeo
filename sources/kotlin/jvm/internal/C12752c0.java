package kotlin.jvm.internal;

import kotlin.reflect.KProperty;
import p442uf.C13590b;

/* renamed from: kotlin.jvm.internal.c0 */
/* compiled from: PropertyReference */
public abstract class C12752c0 extends C12753d implements KProperty {
    public C12752c0() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12752c0) {
            C12752c0 c0Var = (C12752c0) obj;
            if (!getOwner().equals(c0Var.getOwner()) || !getName().equals(c0Var.getName()) || !getSignature().equals(c0Var.getSignature()) || !C12775o.m28634d(getBoundReceiver(), c0Var.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C13590b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public C12752c0(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12752c0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }
}
