package p000a;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* renamed from: a.b */
/* compiled from: CoroutineDebugging.kt */
public final class C0001b {

    /* renamed from: a */
    private static final String f0a = "_COROUTINE";

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final StackTraceElement m2b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
