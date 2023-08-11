package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* compiled from: ActualAndroid.android.kt */
final class DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 implements Choreographer.FrameCallback {
    final /* synthetic */ C14002n<R> $co;
    final /* synthetic */ Function1<Long, R> $onFrame;

    DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(C14002n<? super R> nVar, Function1<? super Long, ? extends R> function1) {
        this.$co = nVar;
        this.$onFrame = function1;
    }

    public final void doFrame(long j) {
        Object obj;
        C14002n<R> nVar = this.$co;
        DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
        Function1<Long, R> function1 = this.$onFrame;
        try {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11907m.m25696a(function1.invoke(Long.valueOf(j)));
        } catch (Throwable th) {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = C11907m.m25696a(C11910n.m25700a(th));
        }
        nVar.resumeWith(obj);
    }
}
