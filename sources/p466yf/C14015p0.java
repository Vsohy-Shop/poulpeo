package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11831i;
import p336ef.C11907m;
import p336ef.C11910n;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: yf.p0 */
/* compiled from: DebugStrings.kt */
public final class C14015p0 {
    /* renamed from: a */
    public static final String m32518a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m32519b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m32520c(C12074d<?> dVar) {
        Object obj;
        if (dVar instanceof C11831i) {
            return dVar.toString();
        }
        try {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11907m.m25696a(dVar + '@' + m32519b(dVar));
        } catch (Throwable th) {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = C11907m.m25696a(C11910n.m25700a(th));
        }
        Throwable b = C11907m.m25697b(obj);
        String str = obj;
        if (b != null) {
            str = dVar.getClass().getName() + '@' + m32519b(dVar);
        }
        return (String) str;
    }
}
