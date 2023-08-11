package p331dg;

import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;

@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: dg.l */
/* compiled from: FastServiceLoader.kt */
public final class C11840l {

    /* renamed from: a */
    private static final boolean f18492a;

    static {
        Object obj;
        try {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11907m.m25696a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = C11907m.m25696a(C11910n.m25700a(th));
        }
        f18492a = C11907m.m25699d(obj);
    }

    /* renamed from: a */
    public static final boolean m25503a() {
        return f18492a;
    }
}
