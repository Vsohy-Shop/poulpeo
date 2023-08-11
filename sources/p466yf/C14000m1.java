package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* renamed from: yf.m1 */
/* compiled from: Exceptions.kt */
public final class C14000m1 {
    /* renamed from: a */
    public static final CancellationException m32454a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
