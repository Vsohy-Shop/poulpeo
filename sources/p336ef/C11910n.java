package p336ef;

import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;

/* renamed from: ef.n */
/* compiled from: Result.kt */
public final class C11910n {
    /* renamed from: a */
    public static final Object m25700a(Throwable th) {
        C12775o.m28639i(th, "exception");
        return new C11907m.C11909b(th);
    }

    /* renamed from: b */
    public static final void m25701b(Object obj) {
        if (obj instanceof C11907m.C11909b) {
            throw ((C11907m.C11909b) obj).f18601b;
        }
    }
}
