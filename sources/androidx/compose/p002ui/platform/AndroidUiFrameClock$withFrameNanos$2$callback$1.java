package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1 */
/* compiled from: AndroidUiFrameClock.android.kt */
final class AndroidUiFrameClock$withFrameNanos$2$callback$1 implements Choreographer.FrameCallback {
    final /* synthetic */ C14002n<R> $co;
    final /* synthetic */ Function1<Long, R> $onFrame;
    final /* synthetic */ AndroidUiFrameClock this$0;

    AndroidUiFrameClock$withFrameNanos$2$callback$1(C14002n<? super R> nVar, AndroidUiFrameClock androidUiFrameClock, Function1<? super Long, ? extends R> function1) {
        this.$co = nVar;
        this.this$0 = androidUiFrameClock;
        this.$onFrame = function1;
    }

    public final void doFrame(long j) {
        Object obj;
        C14002n<R> nVar = this.$co;
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
