package p331dg;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C13988j2;

@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: dg.w */
/* compiled from: MainDispatchers.kt */
public final class C11860w {

    /* renamed from: a */
    private static final boolean f18526a = true;

    /* renamed from: a */
    private static final C11861x m25574a(Throwable th, String str) {
        if (f18526a) {
            return new C11861x(th, str);
        }
        if (th != null) {
            throw th;
        }
        m25577d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    static /* synthetic */ C11861x m25575b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m25574a(th, str);
    }

    /* renamed from: c */
    public static final boolean m25576c(C13988j2 j2Var) {
        return j2Var.mo49059t0() instanceof C11861x;
    }

    /* renamed from: d */
    public static final Void m25577d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C13988j2 m25578e(C11858u uVar, List<? extends C11858u> list) {
        try {
            return uVar.mo49057b(list);
        } catch (Throwable th) {
            return m25574a(th, uVar.mo49056a());
        }
    }
}
