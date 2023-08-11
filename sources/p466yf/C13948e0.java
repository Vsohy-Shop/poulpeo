package p466yf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,67:1\n61#2,2:68\n61#2,2:70\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n21#1:68,2\n27#1:70,2\n*E\n"})
/* renamed from: yf.e0 */
/* compiled from: CompletionState.kt */
public final class C13948e0 {
    /* renamed from: a */
    public static final <T> Object m32250a(Object obj, C12074d<? super T> dVar) {
        if (!(obj instanceof C13932b0)) {
            return C11907m.m25696a(obj);
        }
        C11907m.C11908a aVar = C11907m.f18600b;
        return C11907m.m25696a(C11910n.m25700a(((C13932b0) obj).f22850a));
    }

    /* renamed from: b */
    public static final <T> Object m32251b(Object obj, Function1<? super Throwable, C11921v> function1) {
        Throwable b = C11907m.m25697b(obj);
        if (b != null) {
            return new C13932b0(b, false, 2, (DefaultConstructorMarker) null);
        }
        if (function1 != null) {
            return new C13937c0(obj, function1);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m32252c(Object obj, C14002n<?> nVar) {
        Throwable b = C11907m.m25697b(obj);
        if (b == null) {
            return obj;
        }
        return new C13932b0(b, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m32253d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m32251b(obj, function1);
    }
}
