package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
/* compiled from: MonotonicFrameClock.kt */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(C12079g gVar) {
        C12775o.m28639i(gVar, "<this>");
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(function1), dVar);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(function1);
        C12773m.m28630c(0);
        Object withFrameNanos = monotonicFrameClock.withFrameNanos(monotonicFrameClockKt$withFrameMillis$2, dVar);
        C12773m.m28630c(1);
        return withFrameNanos;
    }

    public static final <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(function1, dVar);
    }

    public static final <R> Object withFrameMillis(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(function1), dVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(C12079g gVar) {
    }
}
