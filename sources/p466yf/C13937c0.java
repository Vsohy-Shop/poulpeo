package p466yf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: yf.c0 */
/* compiled from: CompletionState.kt */
public final class C13937c0 {

    /* renamed from: a */
    public final Object f22856a;

    /* renamed from: b */
    public final Function1<Throwable, C11921v> f22857b;

    public C13937c0(Object obj, Function1<? super Throwable, C11921v> function1) {
        this.f22856a = obj;
        this.f22857b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13937c0)) {
            return false;
        }
        C13937c0 c0Var = (C13937c0) obj;
        if (C12775o.m28634d(this.f22856a, c0Var.f22856a) && C12775o.m28634d(this.f22857b, c0Var.f22857b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Object obj = this.f22856a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return (i * 31) + this.f22857b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f22856a + ", onCancellation=" + this.f22857b + ')';
    }
}
